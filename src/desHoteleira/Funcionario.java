package desHoteleira;

public class Funcionario {
    private int codigo;
    private int horasTrabalhadas;
    private char turno;
    private char categoria;

    private double salarioMinEstadual;
    private double valorHT;
    private double auxAlimentacao;
    private double salarioInicial;
    private double salarioFinal;

    public double getSalarioFinal() {
        return salarioFinal;
    }

    public void setSalarioFinal(double salarioFinal) {
        this.salarioFinal = salarioFinal;
    }

    public double getAuxAlimentacao() {
        return auxAlimentacao;
    }

    public void setAuxAlimentacao(double auxAlimentacao) {
        this.auxAlimentacao = auxAlimentacao;
    }

    public double getSalarioMinEstadual() {
        return salarioMinEstadual;
    }

    public void setSalarioMinEstadual(double salarioMinEstadual) {
        this.salarioMinEstadual = salarioMinEstadual;
    }

    public double getSalarioInicial() {
        return salarioInicial;
    }

    public void setSalarioInicial(double salarioInicial) {
        this.salarioInicial = salarioInicial;
    }

    public double getValorHT() {
        return valorHT;
    }

    public void setValorHT(double valorHT) {
        this.valorHT = valorHT;
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public char getTurno() {
        return turno;
    }

    public void setTurno(char turno) {
        this.turno = turno;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }
}
