package desComissao;
import java.util.Scanner;

public class Comissao {
    public static void main(String[] args) {
        int salario = 2000;
        double porcentagem = 2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor total de vendas realizadas no mês");
        double comissao = scanner.nextInt();
        if (comissao < 100000) {
            comissao = (porcentagem / 100) * comissao;
            double total = salario + comissao;
            System.out.println("O seu salario é R$" +total+ ", sendo R$ " +comissao+ " de comissão.");
        }
        if (comissao <55000) {
            salario = salario + 100;
            System.out.println("O seu salario é R$" +salario);
        }
        if (comissao >100000) {
            salario = salario + 5000;
            System.out.println("O seu salario R$" + salario);
        }
    }
}
