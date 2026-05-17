void main() {
    System.out.println("Digite um numero entre 0 e 100");
    Scanner numberInput = new Scanner(System.in);
    int numberDigit = 0;
    numberDigit = numberInput.nextInt();
    int tries = 1;
    int maxTries = 5;
    int numberGenerator = new Random().nextInt(100);
        while (numberDigit != numberGenerator) {
            if (tries == maxTries) {
                System.out.println("Voce esgotou as tentativas, o numero era " + numberGenerator);
                break;
            }
            if((numberDigit > 100) || (numberDigit < 0)){
                System.out.println("Por favor. Digite um numero entre 0 e 100");
                numberDigit = numberInput.nextInt();
                tries++;
                continue;
            }
            if (numberDigit < numberGenerator) {
                System.out.println("Seu numero é maior do que esse");
                numberInput.nextInt();
                tries++;
                continue;
            }
            if (numberDigit > numberGenerator) {
                System.out.println("Seu numero é menor que esse");
                numberDigit = numberInput.nextInt();
                tries++;
                continue;
            }
            if (numberDigit == numberGenerator) {
                System.out.println("Voce acertou!");
                break;
            }
        }
    }
