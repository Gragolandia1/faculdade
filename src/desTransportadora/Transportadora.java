package desTransportadora;

public class Transportadora {

    private int distancia;
    private int escRegiao;
    private int numeroPecas;
    private int taxaRastreamento;

    private double valorFretePecas;
    private double precoCombustivel;
    private double freteQuilometro;
    private double total;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getFreteQuilometro() {
        return freteQuilometro;
    }

    public void setFreteQuilometro(double freteQuilometro) {
        this.freteQuilometro = freteQuilometro;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getNumeroPecas() {
        return numeroPecas;
    }

    public void setNumeroPecas(int numeroPecas) {
        this.numeroPecas = numeroPecas;
    }

    public int getEscRegiao() {
        return escRegiao;
    }

    public void setEscRegiao(int escRegiao) {
        this.escRegiao = escRegiao;
    }

    public double getPrecoCombustivel() {
        return precoCombustivel;
    }

    public void setPrecoCombustivel(double precoCombustivel) {
        this.precoCombustivel = precoCombustivel;
    }

    public double getValorFretePecas() {
        return valorFretePecas;
    }

    public void setValorFretePecas(double valorFretePecas) {
        this.valorFretePecas = valorFretePecas;
    }

    public int getTaxaRastreamento() {
        return taxaRastreamento;
    }

    public void setTaxaRastreamento(int taxaRastreamento) {
        this.taxaRastreamento = taxaRastreamento;
    }
}
