package BackEndPOO2.src.model;

import BackEndPOO2.src.interfaces.ICamareira;

public class Camareira extends Pessoa implements ICamareira {

    public Camareira(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
        
    }

    @Override
    public void arrumarACama() {
        System.out.println("Sei arrumar a cama");
        System.out.println();
        
    }

    @Override
    public void limparQuarto() {
        System.out.println("Sei limpar o quarto");
        System.out.println();
    }
    
}
