package BackEndPOO2;

import java.util.ArrayList;

import BackEndPOO2.src.model.Camareira;
import BackEndPOO2.src.model.Cliente;
import BackEndPOO2.src.model.EnumTipo;
import BackEndPOO2.src.model.Gerente;
import BackEndPOO2.src.model.Quarto;
import BackEndPOO2.src.model.Recepcionista;

public class App2 {
    public static void main(String[] args) {
        System.out.println("Hotel Java");
        System.out.println();


       /* Recepcionista recepcionista1 = new Recepcionista("valeria", "1919-1919","987654321");

        recepcionista1.atenderOTelefone();
        recepcionista1.falarIngles();


        Camareira camareira1 = new Camareira("Joana", "2197787547","4563571592");
        
        camareira1.arrumarACama();
        camareira1.limparQuarto();

        Gerente gerente1 = new Gerente("fabricio", "15689421", "557996112");

        gerente1.atenderOTelefone();
        gerente1.falarIngles();

        Quarto quarto1 = new Quarto();
        quarto1.setNumero("206A");
        quarto1.setValor(100.0);
        quarto1.setTipo(EnumTipo.BASICO);

        Quarto quarto2 = new Quarto();
        quarto2.setNumero("306A");
        quarto2.setValor(200.0);
        quarto2.setTipo(EnumTipo.PRESIDENCIAL);


        System.out.println(quarto2.getTipo());
        System.out.println(quarto2.getTipo().getValor());

        */

        Cliente cliente1 = new Cliente("manoel da silva", "9191-9191", "1234567889", 42);
        Cliente cliente2 = new Cliente("fulano de tal", "9178-81865", "6788912345", 21);
        Cliente cliente3 = new Cliente("ciclano rodrigues", "0340-5978", "6788912345", 36);
        Cliente cliente4 = new Cliente("beltrano ", "5978-0340", "852647836", 56);

        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        clientes.add(cliente1); // 0
        clientes.add(cliente2); // 1
        clientes.add(cliente3); // 2
        clientes.add(cliente4); // 3

        // retorna a quantidade de elementos presentes em uma steam
        clientes.stream().count();
        clientes.size();

       clientes.stream()
       .limit(2)
       .forEach(c->System.out.println(c.getNome()));  

       clientes.stream()
       .skip(2)
       .forEach(c->System.out.println(c.getNome())); 
       

        //var resultado3 = clientes.stream().sorted();

        //clientes.stream().sorted(comparing(Cliente::getIdade));

        clientes.stream()
        .filter(c -> c.getIdade()>25 )
        .forEach(c->System.out.println(c.getNome())); 

        clientes.stream()
        .filter(c -> c.getNome().contains("rodrigues") )
        .forEach(c->System.out.println(c.getNome()));

        clientes.stream()
        .filter(c -> c.getNome().startsWith("b") )
        .forEach(c->System.out.println(c.getNome()));

        clientes.stream().map(c->c.getNome()); // ou clientes.stream().map(Cliente::getNome);
        

    }
}
