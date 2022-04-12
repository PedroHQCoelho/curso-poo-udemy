package src.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;

public abstract class ContaBancaria {

    //#region Atributos
    protected String agencia;
    protected String conta;
    protected Integer digito;
    protected Double saldo;
    protected Date dataAbertura;
    protected ArrayList<Movimentacao> movimentacoes;
    protected Double VALOR_MINIMO_DEPOSITO = 10.00;
    //#endregion

    //#region Construtores
    public ContaBancaria(String agencia, String conta, Integer digito, Double saldoInicial) {
        this.agencia = agencia;
        this.conta = conta;
        this.digito = digito;
        this.saldo = saldoInicial;
        this.dataAbertura = new Date();

        //Se não instanciar, vai dar uma exception de nullPointerException
        this.movimentacoes = new ArrayList<Movimentacao>();

        //Criando a primeira movimentação
        Movimentacao movimentacao = new Movimentacao("Abertura de conta", saldoInicial);
        
        //Aqui estou salvando a movimentação dentro do meu array de movimentações.
        //Aqui estou iniciando o meu extrato bancário
        this.movimentacoes.add(movimentacao);
    }
    //#endregion

    //#region Getters e Setters
    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public Integer getDigito() {
        return digito;
    }

    public void setDigito(Integer digito) {
        this.digito = digito;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    //#endregion

    //#region Métodos
    public void depositar(Double valor){

        //Verifica se o valor de depósito é menor que o mínimo
        //Se for, não acontece o depósito
        if (valor < VALOR_MINIMO_DEPOSITO){
            throw new InputMismatchException("O valor mínimo de depósito é R$" +VALOR_MINIMO_DEPOSITO);
        }

        //Efetua o depósito somando o valor ao saldo
        this.saldo += valor;

        //Aqui faço uma movimentação no extrato
        Movimentacao movimentacao = new Movimentacao("Depósito", valor);
        this.movimentacoes.add(movimentacao);
    }

    public Double sacar(Double valor){
        // Verifica se o valor é maior que o saldo da conta
        //Se for, manda mensagem de saldo insuficiente
        if(valor > this.saldo){
            throw new InputMismatchException("Saldo insuficiente");
        }

        //Aqui removemos o valor do saque do saldo inicial
        this.saldo -= valor;

        //Aqui faço uma movimentação no extrato
        Movimentacao movimentacao = new Movimentacao("Saque", valor);
        this.movimentacoes.add(movimentacao);        

        //Retorna o valor sacado ao usuário
        return valor;
    }

    public void transferir (Double valor, ContaBancaria contaDestino){
        
        //Efetua um saque na conta atual
        this.sacar(valor);

        //Efetua o depósito na conta de destino
        contaDestino.depositar(valor);
    }
    //#endregion

    public abstract void imprimirExtrato();
}
