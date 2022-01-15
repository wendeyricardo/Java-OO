package BackEndPOO2;

import BackEndPOO2.src.model.Camareira;
import BackEndPOO2.src.model.Cliente;
import BackEndPOO2.src.model.Gerente;
import BackEndPOO2.src.model.Recepcionista;

public class App2 {
    public static void main(String[] args) {
        System.out.println("Hotel Java");
        System.out.println();

        Cliente cliente1 = new Cliente("manoel da silva", "9191-9191", "1234567889");

        Recepcionista recepcionista1 = new Recepcionista("valeria", "1919-1919","987654321");

        recepcionista1.atenderOTelefone();
        recepcionista1.falarIngles();


        Camareira camareira1 = new Camareira("Joana", "2197787547","4563571592");
        
        camareira1.arrumarACama();
        camareira1.limparQuarto();

        Gerente gerente1 = new Gerente("fabricio", "15689421", "557996112");

        gerente1.atenderOTelefone();
        gerente1.falarIngles();
    }
}
