package desafio.projeto.modulo4.banco;

public abstract class Conta implements IConta{
    
    protected int agencia;
    protected int numero;
    protected double saldo;

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    public Conta(){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    public int getAgencia(){
        return agencia;
    }

    public int getNumero(){
        return numero;
    }

    public double getSaldo(){
        return saldo;
    }

    @Override
    public void sacar(double valor){

    }

    @Override
    public void depositar(double valor){

    }

    @Override
    public void transferir(double valor, Conta destino){

    }
}