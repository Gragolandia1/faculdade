package desTransportadora;
import java.util.Scanner;

public class Transportadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int taxaRastreamento = 0;

        double valorFretePecas = 0;

        double precoCombustivel = 6.13;

        System.out.println("DESEJA UTILIZAR O RASTREAMENTO?");
        System.out.println("S = Sim");
        System.out.println("N = Nao");
        System.out.println("SERA COBRADO UMA TAXA DE R$200 CASO UTILIZE");
        String rastreamento = scanner.next();
        if (rastreamento.equals("S")) {
            taxaRastreamento = 200;
        }else if (rastreamento.equals("N")) {
            taxaRastreamento = 0;
        } else {
            System.out.println("DIGITE NOVAMENTE");
            return;
        }

        System.out.println("ESCOLHA A SUA REGIAO");
        System.out.println("1 - SUL");
        System.out.println("2 - SUDESTE");
        System.out.println("3 - CENTRO-OESTE");
        String escRegiao = scanner.next();

        System.out.println("INFORME O NUMERO DE PEÇAS QUE SERÃO ENVIADAS");
        int numPecas = scanner.nextInt();
        if (numPecas < 1000 & escRegiao.equals("1")) {
            valorFretePecas = numPecas;
        } else if (numPecas > 1000 & escRegiao.equals("1")) {
            valorFretePecas = ((numPecas - 1000) * 0.90 + 1000);
        } else if (numPecas < 1000 & escRegiao.equals("2")) {
            valorFretePecas = numPecas * 1.20;
        } else if (numPecas > 1000 & escRegiao.equals("2")) {
            valorFretePecas = ((numPecas - 1000) * 1.056 + (1000 * 1.20));
        } else if (numPecas < 1000 & escRegiao.equals("3")) {
            valorFretePecas = numPecas * 1.30;
        } else if (numPecas > 1000 & escRegiao.equals("3")) {
            valorFretePecas = ((numPecas - 1000) * 1.131 + (1000 * 1.30));
        } else {
            System.out.println("DIGITE NOVAMENTE");
            return;
        }

        System.out.println("INFORME A DISTANCIA");
        double freteQuilometro = scanner.nextInt();
        freteQuilometro = freteQuilometro * precoCombustivel;

        System.out.println("Taxa do rastreamento R$" +taxaRastreamento);
        System.out.println("Valor do frete pelas peças R$" +valorFretePecas);
        System.out.println("Valor do frete por quilometro R$" + freteQuilometro);
        double total = taxaRastreamento + valorFretePecas + freteQuilometro;
        System.out.println("O valor total do frete é de R$" +total);
    }
}
