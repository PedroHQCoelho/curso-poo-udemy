package src.model;

import src.interfaces.ICamareira;

public class Camareira extends Pessoa implements ICamareira {

    public Camareira(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
    }

    @Override
    public void arrumarCama() {
        System.out.println("Cama arrumada\n");
    }

    @Override
    public void limparQuarto() {
        System.out.println("Quarto limpo\n");
    }
    
}
