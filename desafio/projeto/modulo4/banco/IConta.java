package desafio.projeto.modulo4.banco;

public interface IConta {
    
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, Conta destino);
}