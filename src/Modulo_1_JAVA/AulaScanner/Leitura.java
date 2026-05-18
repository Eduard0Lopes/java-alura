import java.util.Scanner;

void main() {
    Scanner leitura = new Scanner(System.in);

    System.out.println("Digite seu filme favorito");
    String filmeDigitado = leitura.nextLine();
    System.out.println("Qual ano de lançamento");
    int anoDeLancamento = leitura.nextInt();
    System.out.println("Diga sua avaliação");
    double avaliacao = leitura.nextDouble();
    System.out.println(filmeDigitado);
    System.out.println(anoDeLancamento);
    System.out.println(avaliacao);
}
