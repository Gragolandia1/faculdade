package desTransportadora;

import java.util.Scanner;

public class User extends Transportadora {
    public static void main(String[] args) {
        User user = new User();
        Scanner scanner = new Scanner(System.in);

        char rastreamento;
        int escRegiao;

        user.setPrecoCombustivel(6.13);

        do {
            System.out.println("DESEJA UTILIZAR O RASTREAMENTO?");
            System.out.println("S = Sim");
            System.out.println("N = Nao");
            System.out.println("SERA COBRADO UMA TAXA DE R$200 CASO UTILIZE");
            rastreamento = (scanner.next().charAt(0));
            if (rastreamento != 'S' && rastreamento != 'N') {
                System.out.println("DIGITE CORRETAMENTE");
            }
            if (rastreamento == 'S'){
                user.setTaxaRastreamento(200);
            } else {
                user.setTaxaRastreamento(0);
            }

        } while (rastreamento != 'S' && rastreamento != 'N');

        do {
            System.out.println("ESCOLHA A SUA REGIAO");
            System.out.println("1 - SUL");
            System.out.println("2 - SUDESTE");
            System.out.println("3 - CENTRO-OESTE");
            escRegiao = scanner.nextInt();
            if (escRegiao != 1 && escRegiao != 2 && escRegiao != 3) {
                System.out.println("DIGITE CORRETAMENTE");
            } else {
                user.setEscRegiao(escRegiao);
            }
        } while (escRegiao != 1 && escRegiao != 2 && escRegiao != 3);

        System.out.println("INFORME O NUMERO DE PEÇAS QUE SERÃO ENVIADAS");
        user.setNumeroPecas(scanner.nextInt());
        if (user.getNumeroPecas() < 1000 && user.getEscRegiao() == 1) {
            user.setValorFretePecas(user.getNumeroPecas());
        } else if (user.getNumeroPecas() > 1000 && user.getEscRegiao() == 1) {
            user.setValorFretePecas(((user.getNumeroPecas() - 1000) * 0.90 + 1000));
        } else if (user.getNumeroPecas() < 1000 && user.getEscRegiao() == 2) {
            user.setValorFretePecas(user.getNumeroPecas() * 1.20);
        } else if (user.getNumeroPecas() > 1000 && user.getEscRegiao() == 2) {
            user.setValorFretePecas(((user.getNumeroPecas() - 1000) * 1.056 + (1000 * 1.20)));
        } else if (user.getNumeroPecas() < 1000 && user.getEscRegiao() == 3) {
            user.setValorFretePecas(user.getNumeroPecas() * 1.30);
        } else if (user.getNumeroPecas() > 1000 && user.getEscRegiao() == 3) {
            user.setValorFretePecas(((user.getNumeroPecas() - 1000) * 1.131 + (1000 * 1.30)));
        } else {
            System.out.println("DIGITE NOVAMENTE");
            return;
        }

        System.out.println("INFORME A DISTANCIA");
        user.setDistancia(scanner.nextInt());

        user.setFreteQuilometro(user.getDistancia() * user.getPrecoCombustivel());
        user.setTotal(user.getTaxaRastreamento() + user.getValorFretePecas() + user.getFreteQuilometro());

        System.out.println("Taxa do rastreamento R$" +user.getTaxaRastreamento());
        System.out.println("Valor do frete pelas peças R$" +user.getValorFretePecas());
        System.out.println("Valor do frete por quilometro R$" + user.getFreteQuilometro());
        System.out.println("O valor total do frete é de R$" + user.getTotal());
    }
}
