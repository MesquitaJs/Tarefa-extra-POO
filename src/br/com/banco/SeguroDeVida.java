package br.com.banco;

public class SeguroDeVida implements Tributavel {
    private int apolice;
    private double valor;
    private Cliente titular;

    public SeguroDeVida(Cliente titular, int apolice, double valor) {
        this.titular = titular;
        this.setApolice(apolice);
        this.valor = valor;
    }

    public int getApolice() {
        return apolice;
    }

 
    public void setApolice(int apolice) {
        this.apolice = apolice;
    }

    public String getTipo() {
        return "Seguro de Vida";
    }
    
    public String getTitular() {
        return this.titular.toString();
    }

    //R$500 + 2% do valor do seguro
    public double getValorImposto() {
        return 500 + this.valor * 0.02;
    }

}
