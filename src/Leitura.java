import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String nomeDoFilme = leitura.nextLine();

        System.out.println("Digite o ano de lançamento");
        int anoDeLancamento = leitura.nextInt();

        System.out.println("Digite uma nota para esse filme");
        double notaDoFilme = leitura.nextDouble();

        System.out.println(nomeDoFilme + "\n" + anoDeLancamento + "\n" + notaDoFilme);
    }
}
