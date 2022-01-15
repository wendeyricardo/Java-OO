package BackEndPOO2.src.model;

import BackEndPOO2.src.interfaces.ICamareira;
import BackEndPOO2.src.interfaces.IRecepcionista;

public class Gerente extends Pessoa  implements ICamareira, IRecepcionista{

    public Gerente(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
        
    }

    @Override
    public void atenderOTelefone() {
        System.out.println("sei atender o telefone mais ou menos");
        System.out.println();
        
    }

    @Override
    public void falarIngles() {        
        System.out.println("sei falar muito bem o inglês");
        System.out.println();
    }

    @Override
    public void arrumarACama() {
        System.out.println("Sei arrumar a cama mais ou menos");
        System.out.println();
        
    }

    @Override
    public void limparQuarto() {
        System.out.println("Sei limpar o quarto mais ou menos");
        System.out.println();
    }
    
}
