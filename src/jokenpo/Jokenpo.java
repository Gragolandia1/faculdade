package jokenpo;

import java.util.Random;
import java.util.Scanner;

//O jogo classico de Pedra,Papel e Tesoura contra o computador.

public class Jokenpo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random random = new Random();

        String[] options = {"Pedra", "Papel", "Tesoura"};

        while (true)
        {
            System.out.println("Escolha uma das opçoes: ");
            System.out.println("0 - Pedra");
            System.out.println("1 - Papel");
            System.out.println("2 - Tesoura");
            System.out.println("3 - Sair");

            int user = s.nextInt();
            if (user == 3) {
                System.out.println("Jogo encerrado");
                break;
            }
            if (user > 3) {
                System.out.println("Digite corretamente");
                continue;
            }
            int computer = random.nextInt(3);

            System.out.println("Usuario : " + options[user]);
            System.out.println("Computador: " + options[computer]);

            if (user == computer) {
                System.out.println("Empate!");
            }else if  ((user == 0 && computer == 2)||
                    (user == 1 && computer == 0) ||
                    (user == 2 && computer == 1)) {
                System.out.println("Voce ganhou!");
            } else {
                System.out.println("Computador ganhou");
            }
            System.out.println();
        }
        s.close();
    }
}