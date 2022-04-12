package src;

import src.model.ContaCorrente;
import src.model.ContaPoupanca;
import src.model.Movimentacao;
import src.utils.DataUtil;

public class App {
    
    public static void main(String[] args) {
        System.out.println("Criando nosso Banco Digital\n");

        ContaCorrente conta = new ContaCorrente("0001", "7542", 5, 100.00);

        System.out.println("Saldo: R$" +conta.getSaldo() + "\n");

        conta.depositar(250.00);
        System.out.println("Saldo: R$" +conta.getSaldo() + "\n");

        Double saque = conta.sacar(150.00);
        System.out.println("Saldo: R$" +conta.getSaldo() + "\n");
        
        ContaPoupanca conta2 = new ContaPoupanca("0001", "7546", 7, 200.00);
        
        conta2.transferir(100.00, conta);
        System.out.println("Saldo da conta destino de R$" +conta2.getSaldo() + "\n");
        
        System.out.println("Saldo atual de R$" +conta.getSaldo() + "\n");
        
        String formatado = DataUtil.converterDateParaDateEHora(conta2.getDataAbertura());
        System.out.println(formatado + "\n");

        //Extrato bancário é composto por movimentações bancárias
        //Ter algo que possa ser a movimentação
        //Ter uma lista de movimentações

        conta.imprimirExtrato();
        conta2.imprimirExtrato();
    }
}
