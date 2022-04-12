package src.model;

import java.util.Date;

import src.utils.DataUtil;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(String agencia, String conta, Integer digito, Double saldoInicial) {
        // Aqui por baixo ele cria uma conta bancária
        super(agencia, conta, digito, saldoInicial);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("************************************");
        System.out.println("*********Extrato Bancário***********");
        System.out.println("**********Conta Corrente************");        
        System.out.println("************************************\n");        
        
        System.out.println("Gerado em: " + DataUtil.converterDateParaDateEHora(new Date()) + "\n");
        
        for (Movimentacao movimentacao : this.movimentacoes) {
            System.out.println(movimentacao + "\n");
        }

        System.out.println("\n************************************");
        System.out.println("************************************");
        System.out.println("************************************\n");
    }
    
}
