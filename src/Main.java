public class Main {
    public static void main(String[] args) {
         exercicio1Media();
         exercicio2Casting();
         exercicio3Palavras();
         exercicio4Produto();
         exercicio5ConversaoDolares();
         exercicio6CalculoDesconto();
    }


    static void exercicio1Media() {
        double nota1 = 7.9;
        double nota2 = 9.5;
        double media = (nota1 + nota2) / 2;
        System.out.println("Média: " + media);
    }

    static void exercicio2Casting() {
        double numeroPonto = 2.6;
        int numeroInt = (int) numeroPonto;

        System.out.println("Valor original (double): " + numeroPonto);
        System.out.println("Valor convertido (int): " + numeroInt);
    }

    static void exercicio3Palavras() {
        char letraO = 'O';
        String palavra = "Teste";

        System.out.println(letraO + " " + palavra);
    }

    static void exercicio4Produto() {
        double precoProduto = 16.99;
        int quantidade = 8;
        double valorCompra = precoProduto * quantidade;

        String mensagem = """
                Seu carrinho possui %d itens no valor de R$ %.2f cada, totalizando R$ %.2f.
                """.formatted(quantidade, precoProduto, valorCompra);

        System.out.println(mensagem);
    }

    static void exercicio5ConversaoDolares() {
        double valorEmDolares = 10.99;
        double cotacaoDolar = 4.94;
        double valorEmReais = valorEmDolares * cotacaoDolar;

        System.out.println("Valor em dólares: $" + valorEmDolares);
        System.out.println("Valor em reais: R$ " + String.format("%.2f", valorEmReais));
    }

    static void exercicio6CalculoDesconto() {
        double precoOriginal = 23.45;
        double percentualDesconto = 50;

        double valorDesconto = precoOriginal * (percentualDesconto / 100);
        double precoComDesconto = precoOriginal - valorDesconto;

        String mensagem = """
                Preço original: R$ %.2f
                Percentual de desconto: %.0f%%
                Valor do desconto: R$ %.2f
                Preço final: R$ %.2f
                """.formatted(precoOriginal, percentualDesconto, valorDesconto, precoComDesconto);

        System.out.println(mensagem);
    }
}