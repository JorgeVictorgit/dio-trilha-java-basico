import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco conta = new Banco();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Criar Conta");
            System.out.println("2. Buscar Conta");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o numero do conta: ");
                    int numero = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite a Agencia da conta: ");
                    String texto = scanner.nextLine();
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a Saldo da conta: ");
                    String saldo = scanner.nextLine();
                    conta.CriarConta(numero, texto,nome,saldo);
                    System.out.println("Conto adicionado com sucesso!\n");
                    break;

                case 2:
                    System.out.print("Digite o numero da conta a buscar: ");
                    int numeroBusca = scanner.nextInt();
                    Conta contaEncontrado = conta.buscarConta(numeroBusca);
                    if (contaEncontrado != null) {
                        System.out.println("Conta encontrado:");
                        System.out.println("Nome: " + contaEncontrado.getNome() + " - Numero: " + contaEncontrado.getNumero() + " - Agencia: "+ contaEncontrado.getAgencia() +" - Saldo: "+ contaEncontrado.getSlado());
                    } else {
                        System.out.println("Conta não encontrado.");
                    }
                    break;

                case 3:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }


    }
}