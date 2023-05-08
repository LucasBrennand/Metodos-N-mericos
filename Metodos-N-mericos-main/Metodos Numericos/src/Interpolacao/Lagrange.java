package Interpolacao;

public class Lagrange {
    private double[] x;
    private double[] y;
    private double p;
    private double X0;
    private double X1;
    private double X2;
    private double Y0;
    private double Y1;
    private double Y2;

    public Lagrange (double[] x, double[] y, double p){
        this.x = x;
        this.y = y;
        this.p = p;
    }

    public void iteracao(){
        // P = L0 * Y0 + L1 * Y1 + L2 * Y2
        double L0, L1, L2, L3, L4, L5;
        double P;
        L0 = ((p - x[1]) * (p - x[2])) / ((x[0] - x[1]) * (x[0] - x[2]));
        L1 = ((p - x[0]) * (p - x[2])) / ((x[1] - x[0]) * (x[1] - x[2]));
        L2 = ((p - x[0]) * (p - x[1])) / ((x[2] - x[0]) * (x[2] - x[1]));
        P = L0 * y[0] + L1 * y[1] + L2 * y[2];
        System.out.println(L0);
        System.out.println(L1);
        System.out.println(L2);
        System.out.println(P);
    }
}
