import java.util.Random;

public class SenhaLetrasMaiusculasMinusculasNumeros implements SenhaGenerator {
    @Override
    public String gerarSenha(int tamanho) {
        Random random = new Random();
        StringBuilder senha = new StringBuilder();
        String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        for (int i = 0; i < tamanho; i++) {
            char letra = caracteres.charAt(random.nextInt(caracteres.length()));
            senha.append(letra);
        }
        return senha.toString();
    }
}
