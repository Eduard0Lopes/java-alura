void main() {
    Scanner scanner = new Scanner(System.in);

    String nomeUsuario = "Luiz Eduardo";
    String tipoConta = "Corrente";
    double saldo = 0;
    int escolha = 0;

    System.out.println("***********************************");
    System.out.println("\n Usuário: " + nomeUsuario);
    System.out.println("\n Tipo de Conta: " + tipoConta);
    System.out.println("\n Saldo: R$" + saldo);
    System.out.println("***********************************");

    String menuInicial = """

            1. Consultar saldo
            2. Receber valor
            3. Transferir Valor
            4. Sair
            """;

    while (escolha != 4) {
        System.out.println(menuInicial);
        escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.println("Seu saldo é: " + saldo);
        } else if (escolha == 2) {
            System.out.println("Digite o valor que irá receber:");
            double valorReceber = scanner.nextDouble();
            saldo += valorReceber;
            System.out.println("Saldo Atualizado: R$" + saldo);

        } else if (escolha == 3) {
            System.out.println("Digite o valor que irá transferir");
            double valorTransferir = scanner.nextDouble();
            if (valorTransferir > saldo) {
                System.out.println("Saldo insuficiente");
            } else {
                saldo -= valorTransferir;
                System.out.println("Saldo Atualizado: R$" + saldo);
            }
        } else if (escolha == 4) {
            System.out.println("Saindo...");
            break;
        } else {
            System.out.println("Digite uma opçao válida.");
        }
    }
}
