package Entidades;

public class Array {

    private double A[];
    private double B[];

    public Array() {
        A = new double[50];
        B = new double[20];
    }

    public Array(double[] A, double[] B) {
        this.A = A;
        this.B = B;
    }

    public double[] getA() {
        return A;
    }

    public void setA(double[] A) {
        this.A = A;
    }

    public double[] getB() {
        return B;
    }

    public void setB(double[] B) {
        this.B = B;
    }

}
