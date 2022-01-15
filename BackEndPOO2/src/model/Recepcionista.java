package BackEndPOO2.src.model;

import BackEndPOO2.src.interfaces.IRecepcionista;

public class Recepcionista extends Pessoa implements IRecepcionista{

    public Recepcionista(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
        
    }

    @Override
    public void atenderOTelefone() {
        System.out.println("sei atender o telefone");
        System.out.println();
        
    }

    @Override
    public void falarIngles() {        
        System.out.println("sei falar inglês");
        System.out.println();
    }

    
}
