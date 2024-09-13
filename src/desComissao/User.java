package desComissao;
import java.util.Scanner;

//Um calculo de comissão com base no valor total de vendas.

public class User extends Comissao {
    public static void main(String[] args) {
        User user = new User();

        Scanner scanner = new Scanner(System.in);

        user.setSalario(2000);

        System.out.println("Digite o valor total de vendas realizadas no mês");
        user.setComissao(scanner.nextInt());
        if (user.getComissao() < 55000) {
            user.setSalario(user.getSalario() + 100);
            System.out.println("O seu salario é R$" + user.getSalario());
        }else if (user.getComissao() >= 55000 && user.getComissao() <= 100000) {
            user.setComissao(0.02 * user.getComissao());
            user.setTotal(user.getSalario() + user.getComissao());
            System.out.println("O seu salario é R$" +user.getTotal()+ ", sendo R$ " +user.getComissao()+ " de comissão.");
        }
        if (user.getComissao() > 100000) {
            user.setSalario(user.getSalario() + 5000);
            System.out.println("O seu salario é R$" + user.getSalario());
        }

    }
}
