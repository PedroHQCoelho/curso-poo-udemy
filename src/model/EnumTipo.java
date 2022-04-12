package src.model;

public enum EnumTipo {
    BASICO("Básico"), MASTER("Master"), PRESIDENCIAL("Presidencial");

    private String valor;

    private EnumTipo(String valor){
        this.valor = valor;
    }

    public String getValor(){
        return valor;
    }
}
