public class Conta {
    private int Numero;
    private String Agencia;
    private String Nome;
    private String Slado;

    public Conta(int numero, String agencia, String nome, String slado) {
        Numero = numero;
        Agencia = agencia;
        Nome = nome;
        Slado = slado;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

    public String getAgencia() {
        return Agencia;
    }

    public void setAgencia(String agencia) {
        Agencia = agencia;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getSlado() {
        return Slado;
    }

    public void setSlado(String slado) {
        Slado = slado;
    }

}
