package classesIniciais;
public class Pessoa {
    //atributos
    private String nome;
    private Integer idade;


    //getters e setters
    public void setNome(String nome){
        //aqui pode ter validações e outros
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public Integer getIdade(){
        return this.idade;
    }

    public void setIdade(Integer idade){
        this.idade = idade;
    }    
}

/**
 * metodos acessores:
 * 
 * public: indica que qualquer um pode acessar o elemento
 * private: indica que somente a classe consegue acessar
 * protectd: indica que somente a classe e seus filhos consegue acessar
 * default: indica que somente a classe, seus filhos e as classes no mesmo packages, podem acessar
 */
