package src.model;

import src.interfaces.IRecepcionista;

public class Recepcionista extends Pessoa implements IRecepcionista{

    public Recepcionista(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
    }

    @Override
    public void atenderTelefone() {
        System.out.println("Bem-vindo ao Hotel California!\n");
        
    }

    @Override
    public void falarIngles() {
        System.out.println("Welcome to the Hotel California!\n");
        
    }
    
}
