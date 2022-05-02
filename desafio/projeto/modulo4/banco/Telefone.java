package desafio.projeto.modulo4.banco;

public class Telefone {
    public int ddi;
    public int ddd;
    public int numero;

    public Telefone(int ddi, int ddd, int numero){
        this.ddi = ddi;
        this.ddd = ddd;
        this.numero = numero;
    }

    public int getDdi() {
        return ddi;
    }

    public int getDdd() {
        return ddd;
    }

    public int getNumero() {
        return numero;
    }

    public void setDdi(int ddi) {
        this.ddi = ddi;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
