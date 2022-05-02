package desafio.projeto.modulo4.banco;

public class Endereco {
    public String logradouro;
    public String bairro;
    public String localidade;
    public String codigo_postal;
    public int numero;

    public Endereco(String log, String bai, String loc, String cep, int num){
        this.logradouro = log;
        this.bairro = bai;
        this.localidade = loc;
        this.codigo_postal = cep;
        this.numero = num;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public int getNumero() {
        return numero;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
