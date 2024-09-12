package desHoteleira;
import java.util.Scanner;

public class User extends Funcionario {
    public static void main(String[] args) {
        User user = new User();
        Scanner scanner = new Scanner(System.in);
        char turno;
        char categoria;
        user.setSalarioMinEstadual(780);

        System.out.println("DIGITE O SEU CODIGO");
        user.setCodigo(scanner.nextInt());

        System.out.println("DIGITE O NUMERO DE HORAS TRABALHADAS NO MES");
        user.setHorasTrabalhadas(scanner.nextInt());

        do {
            System.out.println("DIGITE O SEU TURNO");
            System.out.println("M - Matutino");
            System.out.println("Z - Vespertino");
            System.out.println("N - Noturno");
            turno = (scanner.next().charAt(0));
            if (turno != 'M' && turno != 'Z' && turno != 'N') {
                System.out.println("DIGITE O TURNO CORRETAMENTE");
            }
        } while (turno != 'M' && turno != 'Z' && turno != 'N');
        user.setTurno(turno);

        do {
            System.out.println("DIGITE SUA CATEGORIA");
            System.out.println("G - Gerente");
            System.out.println("F - Funcionario");
            System.out.println("DIGITE SUA CATEGORIA");
            categoria = (scanner.next().charAt(0));
            if (categoria != 'G' && categoria != 'F') {
                System.out.println("DIGITE SUA CATEGORIA CORRETAMENTE");
            }
        } while (categoria != 'G' && categoria != 'F');
        user.setCategoria(categoria);


        if (user.getCategoria() == 'G' && user.getTurno() == 'N') {
            user.setValorHT(user.getSalarioMinEstadual() * 0.06);
        }
        if (user.getCategoria() == 'G' && user.getTurno() == 'M' || user.getTurno() == 'V') {
            user.setValorHT(user.getSalarioMinEstadual() * 0.04);
        }
        if (user.getCategoria() == 'F' && user.getTurno() == 'N'){
            user.setValorHT(user.getSalarioMinEstadual() * 0.02);
        }
        if (user.getCategoria() == 'F' && user.getTurno() == 'M' || user.getTurno() == 'V'){
            user.setValorHT(user.getSalarioMinEstadual() * 0.01);
        }

        user.setSalarioInicial(user.getHorasTrabalhadas() * user.getValorHT());

        if (user.getSalarioInicial() > 1200) {
            user.setAuxAlimentacao(user.getSalarioInicial() * 0.15);
        }
        if (user.getSalarioInicial() <= 1200) {
            user.setAuxAlimentacao(user.getSalarioInicial() * 0.20);
        }
        if (user.getSalarioInicial() <= 800) {
            user.setAuxAlimentacao(user.getSalarioInicial() * 0.25);
        }

        user.setSalarioFinal(user.getSalarioInicial() + user.getAuxAlimentacao());

        System.out.println("O seu codigo é = " + user.getCodigo());
        System.out.println("Numero de horas trabalhadas = " +user.getHorasTrabalhadas());
        System.out.println("Valor da hora trabalhada = " +user.getValorHT());
        System.out.println("Salario inicial = " +user.getSalarioInicial());
        System.out.println("Auxilio alimentacao = " +user.getAuxAlimentacao());
        System.out.println("Seu salario final = " +user.getSalarioFinal());


    }

}
