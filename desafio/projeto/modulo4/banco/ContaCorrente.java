package desafio.projeto.modulo4.banco;

public class ContaCorrente extends Conta{

    @Override
    public void extrato(){
        System.out.println("=== EXTRATO CONTA CORRENTE ===");
        super.informacoesExtrato();
    }
}
