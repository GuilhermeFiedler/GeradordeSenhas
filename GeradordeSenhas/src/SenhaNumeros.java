import java.util.Random;

public class SenhaNumeros implements SenhaGenerator {
    @Override
    public String gerarSenha(int tamanho) {
        Random random = new Random();
        StringBuilder senha = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            senha.append(random.nextInt(10)); // Apenas números de 0 até 9
        }
        return senha.toString();
    }
}
