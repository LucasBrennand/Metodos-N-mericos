package GaussJacobi.Atv1;

public class GaussJacobi {
    private double[][] A;
    private double[] b;
    private final double[] x;
    private double c;
    private double X1;
    private double X2;
    private double X3;
    private int k;
    private int iteraocoesMax = 1;

    public GaussJacobi(double[][] A, double[] b, double[] x) {
        this.A = A;
        this.b = b;
        this.x = x;
    }

    public void iteracao() {
        X1 = x[0];
        X2 = x[1];
        X3 = x[2];
        //x1 = (-x2 - x3)/x1 + b1/x1
        //x2 = (-x2 - x3)/x2 + b2/x2
        //x3 = (-x1 - x2)/x3 + b3/x3
        // {5, 1, 1}
        // {3, 4, 1}
        // {3, 3, 6}
        while (iteraocoesMax < 16) {
            //X1 = ((-1 * 0 -1 * 0)/5 + (double) 5/5) = 1;
            X1 = ((-A[0][1] * x[1] - A[0][2] * x[2]) / A[0][0]) + b[0] / A[0][0];
            //X2 = ((-3 * 0 - 1 * 0)/4 + (double) 6/4) = 1,5;
            X2 = ((-A[1][0] * x[0] - A[1][2] * x[2]) / A[1][1]) + (double) b[1] / A[1][1];
            //X3 = ((-3 * 0 - 3 * 0)/6 + (double) 0/6) = 0;
            X3 = ((-A[2][0] * x[0] - A[2][1] * x[1]) / A[2][2]) + (double) b[2] / A[2][2];
            x[0] = X1;
            x[1] = X2;
            x[2] = X3;
            System.out.println(
                    "\n"+
                            "Valor de X1("+iteraocoesMax+"): "+X1+
                            "\nValor de X2("+iteraocoesMax+"): "+X2+
                            "\nValor de X3("+iteraocoesMax+"): "+X3);;
            iteraocoesMax++;
        }
    }
}



