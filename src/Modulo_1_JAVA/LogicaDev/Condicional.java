void main() {
    int anoDeLancamento = 2022;
    boolean incluidoNoPlano = true;

    String tipoPlano = "plus";

    if (anoDeLancamento >= 2022) {
        System.out.println("Lançamentos");
    } else {
        System.out.println("Filme retrô");
    }

    if (incluidoNoPlano == true || tipoPlano.equals("plus")) {
        System.out.println("Filme Liberado");
    } else {
        System.out.println("Deve pagar locação");
    }

}
