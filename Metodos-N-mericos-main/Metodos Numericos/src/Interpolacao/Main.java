package Interpolacao;

public class Main {
    public static void main(String[] args) {
        //Ax = b
        double[] X = {0.1, 0.6, 0.8};
        double[] Y = {1.221, 3.32, 4.953};
        double P = 0.2;

        Lagrange lagrange = new Lagrange(X, Y, P);
        lagrange.iteracao();

    }
}

