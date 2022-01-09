public class App{
    public static void main(String[] args) {
        System.out.println("Aprendendo POO com java");

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