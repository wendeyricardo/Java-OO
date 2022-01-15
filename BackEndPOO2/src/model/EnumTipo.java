package BackEndPOO2.src.model;

public enum EnumTipo {
    
    BASICO("Básico"),
    MASTER("MASTER"), 
    PRESIDENCIAL("Suite Presidencial");

    private String valor;

    private EnumTipo(String valor){
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}
