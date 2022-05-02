package desafio.projeto.modulo4.banco;

public class ContaPoupanca extends Conta{
    @Override
    public void extrato(){
        System.out.println("=== EXTRATO CONTA POUPANÇA ===");
        super.informacoesExtrato();
    }
}
