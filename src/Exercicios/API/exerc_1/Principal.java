package Exercicios.API.exerc_1;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;


public class Principal {
    static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o nome do livro");

        String tituloLivro = leitura.nextLine();
        String chave = "e3103847";
        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + tituloLivro + "&apikey" + chave;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}



//Scanner leitura = new Scanner(System.in);
//        System.out.println("Digite um livro para buscar ");
//var tituloLivro = leitura.nextLine();
//
//String chave = "e3103847";
//String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + tituloLivro + "&apikey=" + chave;