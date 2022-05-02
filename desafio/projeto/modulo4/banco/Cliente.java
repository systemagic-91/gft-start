package desafio.projeto.modulo4.banco;

public class Cliente {

    public String nome;
    public String profissao;
    public Endereco endereco;
    public Telefone telefone;


    public Cliente(String nome, String profissao, Endereco endereco, Telefone telefone){
        this.nome = nome;
        this.profissao = profissao;
        this.endereco = endereco;
        this.telefone = telefone;
    }
}
