import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de senha:");
        System.out.println("1. Apenas números");
        System.out.println("2. Apenas letras minúsculas");
        System.out.println("3. Letras minúsculas e números");
        System.out.println("4. Letras Maiúsculas, minúsculas e números");
        System.out.println("5. Letras Maiúsculas, minúsculas, números e símbolos");

        int opcao = scanner.nextInt();
        System.out.print("Informe o tamanho da senha: ");
        int tamanho = scanner.nextInt();

        SenhaGenerator gerador = null;

        switch (opcao) {
            case 1:
                gerador = new SenhaNumeros();
                break;
            case 2:
                gerador = new SenhaLetrasMinusculas();
                break;
            case 3:
                gerador = new SenhaLetrasMinusculasNumeros();
                break;
            case 4:
                gerador = new SenhaLetrasMaiusculasMinusculasNumeros();
                break;
            case 5:
                gerador = new SenhaCompleta();
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        String senhaGerada = gerador.gerarSenha(tamanho);
        System.out.println("Senha gerada: " + senhaGerada);

        scanner.close();
    }
}
