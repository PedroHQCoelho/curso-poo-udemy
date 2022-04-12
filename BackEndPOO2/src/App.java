package src;

import java.util.ArrayList;

// import src.model.Camareira;
import src.model.Cliente;
// import src.model.EnumTipo;
// import src.model.Gerente;
// import src.model.Quarto;
// import src.model.Recepcionista;

public class App {
    public static void main(String[] args) {
        System.out.println("Hotel California\n");

        // Recepcionista recepcionista1 = new Recepcionista("Simone", "21948564358", "23456829547");
        

        // recepcionista1.atenderTelefone();
        // recepcionista1.falarIngles();

        // Camareira camareira1 = new Camareira("Joana", "21977882233", "12345678910");

        // camareira1.arrumarCama();
        // camareira1.limparQuarto();

        // //Deu piriri na recepcionista
        // Gerente gerente1 = new Gerente("André", "21984584268", "13613680000");

        // gerente1.atenderTelefone();
        // gerente1.falarIngles();
        // gerente1.arrumarCama();
        // gerente1.limparQuarto();

        // Quarto quarto1 = new Quarto();
        // quarto1.setNumero("206A");
        // quarto1.setValor(100.00);
        // quarto1.setTipo(EnumTipo.MASTER);

        // Quarto quarto2 = new Quarto();
        // quarto2.setNumero("306A");
        // quarto2.setValor(200.00);
        // quarto2.setTipo(EnumTipo.PRESIDENCIAL);

        // System.out.println(quarto1.getTipo());
        // System.out.println(quarto1.getTipo().getValor());

        Cliente cliente1 = new Cliente("Nilton Babaquinha", "21986720289", "49745352171", 63);
        Cliente cliente2 = new Cliente("Homem Horrível", "21986720298", "49745352177", 69);
        Cliente cliente3 = new Cliente("Vovô Peidorreiro", "21986720290", "49745352175", 64);
        Cliente cliente4 = new Cliente("Mulher que Grita", "21984584269", "49745352179", 66);
        Cliente cliente5 = new Cliente("Garoto Horrível", "21984585145", "49745352177", 32);
        Cliente cliente6 = new Cliente("Ada Horrível", "21986720069", "10987654321", 31);

        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);
        clientes.add(cliente5);
        clientes.add(cliente6);

        //Retorna a quantidade de elementos presentes em uma stream
        clientes.stream().count();
        clientes.size();

        System.out.println();        
        clientes.stream()
        .limit(2)
        .forEach(c -> System.out.println(c.getNome()));

        System.out.println();
        clientes.stream()
        .skip(2)
        .forEach(c -> System.out.println(c.getNome()));

        // clientes.stream()
        // .sorted()
        // .forEach(c -> System.out.println(c.getNome()));
        System.out.println();
        clientes.stream()
        .filter(c -> c.getIdade() > 65)
        .forEach(c -> System.out.println(c.getNome()));

        System.out.println();
        clientes.stream()
        .filter(c -> c.getNome().contains("Horrível"))
        .forEach(c -> System.out.println(c.getNome()));

        System.out.println();
        clientes.stream()
        .filter(c -> c.getNome().startsWith("N"))
        .forEach(c -> System.out.println(c.getNome()));
        
        System.out.println();
        clientes.stream()
        .map(c -> c.getNome());       
    }
}
