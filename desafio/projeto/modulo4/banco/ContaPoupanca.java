package desafio.projeto.modulo4.banco;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void extrato(){
        System.out.println("=== EXTRATO CONTA POUPANÇA ===");
        super.informacoesExtrato();
    }
}
