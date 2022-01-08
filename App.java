public class App{
    public static void main(String[] args) {
        System.out.println("Aprendendo POO com java");

        //que estou instanciando uma classe, construindo um objeto
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Fulano";
        pessoa1.idade = 21;

        System.out.println(pessoa1.nome);
        System.out.println(pessoa1.idade);

        Carro carro1 = new Carro();
        carro1.modelo = "jeep";
        carro1.ano = 2021;
        carro1.cor = "preto";

        System.out.println(carro1.modelo);
        System.out.println(carro1.cor);
        System.out.println(carro1.ano);

    }
}