import java.util.ArrayList;

public class Banco {
    private ArrayList<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void ArmazenarConta(Conta conta){
        contas.add(conta);
    }
    public ArrayList<Conta> getContas() {
        return contas;
    }
    public void CriarConta(int numero, String agencia, String nome, String slado){
        Conta user = new Conta(numero,agencia,nome,slado);
        ArmazenarConta(user);

    }
    public Conta buscarConta(int numero) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }
}

