package desafio.projeto.modulo4.banco;

public class Banco {
    private String nome;
    private Conta [] contas;

    public String getNome(){
        return nome;
    }

    public Conta[] getContas() {
        return contas;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setContas(Conta[] contas) {
        this.contas = contas;
    }

    public void listaClientes(){
        for (Conta conta : contas) {
            System.out.println(conta.getCliente().getNome());            
        }
    }
}
