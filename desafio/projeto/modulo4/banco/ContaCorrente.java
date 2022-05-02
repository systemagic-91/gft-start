package desafio.projeto.modulo4.banco;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void extrato(){
        System.out.println("=== EXTRATO CONTA CORRENTE ===");
        super.informacoesExtrato();
    }
}
