package Cinema;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        String[] filmes = new String[]{"Batman","Os Vingadores","Porto Seguro"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("****** CINE VITÓRIA ******");
        System.out.println();
        System.out.println("Seja bem vindo ao agendamento!");
        System.out.print("Informe seu nome: ");
        String nome = scanner.next();
        System.out.print("Agora informe sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Nossa programação: ");

        for (int i = 0; i < 3; i++) {
            System.out.println(i+1 + "° opção: " + filmes[i]);
        }
        for (int j = 0; j < 16; j++) {
            
            System.out.println("Escolha o filme desejado: [1] [2] [3] ");
            int opcaoFilme = scanner.nextInt();

            if (opcaoFilme == 1) {
                System.out.println("Nome: " + nome);
                System.out.println("Idade: " + idade);
                System.out.println("Filme escolhido: Batman");
            } else if (opcaoFilme == 2) {
                System.out.println("Nome: " + nome);
                System.out.println("Idade: " + idade);
                System.out.println("Filme escolhido: Os Vingadores");
            } else if (opcaoFilme == 3) {
                System.out.println("Nome: " + nome);
                System.out.println("Idade: " + idade);
                System.out.println("Filme escolhido: Porto Seguro");
            }
        }
    }

}
