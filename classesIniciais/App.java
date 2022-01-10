package classesIniciais;
public class App{
    public static void main(String[] args) {
        System.out.println("Aprendendo POO com java");

/*
        #tipos primitivos#
        byte tipoByte = Byte.MAX_VALUE;
        Short tipShort = Short.MAX_VALUE;
        Integer tipoInteger = 2147483647;//Integer.MAX_VALUE;
        Long tipoLong = 9223372036854775807L;//Long.MAX_VALUE;
        Float tipFloat = 3.4028235E38F;//Float.MAX_VALUE;
        Double tipDouble = 1.7976931348623157E308;//Double.MAX_VALUE;
        String tipoString = "sou um texto";
        char tipoChar = 'S';
        Boolean tipBoolean = false; // false ou true
        */

        //que estou instanciando uma classe, construindo um objeto
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Fulano");
        pessoa1.setIdade(21);

        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());

        Carro carro1 = new Carro();
        carro1.setModelo("honda civic");
        carro1.setAno(2019);
        carro1.setCor("preto");

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getAno());
        System.out.println(carro1.getCor());

        Carro meuCarro = new Carro("Fiat toro", 2020, "Branco");
        System.out.println(meuCarro.getModelo());
        System.out.println(meuCarro.getAno());
        System.out.println(meuCarro.getCor());
    }
}