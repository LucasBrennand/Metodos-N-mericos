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
    private int iteraocoesMax = 15;

    public GaussJacobi(double[][] A, double[] b, double[] x) {
        this.A = A;
        this.b = b;
        this.x = x;
    }

    public void iteracao (){
        //x1^k+1 = (-x2^k+1 - x3^k+1)/x1 + b1/x1
        for (int i = 0; i < A.length; i++){
            for (int j = 0; j < A.length; j++){
                //x[0] = ((-1 * 0 -1 * 0)/5 + (double) 5/5);
                x[0] = ((-A[0][1] * x[1] - A[0][2] * x[2])/A[0][0]) + b[0]/A[0][0];
                //x[1] = ((-3 * 0 - 1 * 0)/4 + (double) 6/4);
                x[1] = ((-A[1][0] * x[0] - A[1][2] * x[2])/A[1][1]) + (double) b[1]/A[1][1];
                System.out.println(x[0]);
                System.out.println(x[1]);
                X2 = ((-A[1][0]*X1 -A[1][2]*X3)/A[1][1]) + b[1]/A[1][1];;
            }
        }


    }


}
