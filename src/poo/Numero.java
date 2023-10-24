package poo;

public class Numero {
    private double x;

    private double getX() {
        return x;
    }

    private void setX(double x) {
        this.x = x;
    }

    // esse comados a baixo serve para fazer as operaçãoes basicas da calculadaora 

    public double soma(double x, double y) {
        setX(x + y);
        return getX();
    }

     public double subtracao(double x, double y) {
        setX(x - y);
        return getX();
    }

     public double mutiplicacao (double x, double y) {
        setX(x * y);
        return getX();
    }

     public double divisao(double x, double y) {
        setX(x / y);
        return getX();
    }

}
