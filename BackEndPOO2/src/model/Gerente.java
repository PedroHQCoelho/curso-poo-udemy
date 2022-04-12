package src.model;

import src.interfaces.ICamareira;
import src.interfaces.IRecepcionista;

public class Gerente extends Pessoa implements ICamareira, IRecepcionista {

    public Gerente(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
    }

    @Override
    public void atenderTelefone() {
        System.out.println("Hotel California!\n");
    }

    @Override
    public void falarIngles() {
        System.out.println("Welcome to the Hotel California");
        System.out.println("Such a lovely place (Such a lovely place)");
        System.out.println("Such a lovely face");
        System.out.println("They're livin' it up at the Hotel California");
        System.out.println("What a nice surprise (What a nice surprise)");
        System.out.println("Bring your alibis\n");
    }

    @Override
    public void arrumarCama() {
        System.out.println("Cama perfeitamente arrumada e com uma surpresa\n");
    }

    @Override
    public void limparQuarto() {
        System.out.println("Quarto um pouco limpo\n");
    }
    
}
