import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filmeFav = leitura.nextLine();
        System.out.println("Qual o ano de lançamento? ");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Diga sua avaliação do filme ");
        double avaliacao = leitura.nextDouble();

        System.out.println(filmeFav);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);

    }
}
