import java.util.Random;

public class SenhaLetrasMinusculas implements SenhaGenerator {
    @Override
    public String gerarSenha(int tamanho) {
        Random random = new Random();
        StringBuilder senha = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            char letra = (char) ('a' + random.nextInt(26)); // Letras de 'a' até 'z'
            senha.append(letra);
        }
        return senha.toString();
    }
}
