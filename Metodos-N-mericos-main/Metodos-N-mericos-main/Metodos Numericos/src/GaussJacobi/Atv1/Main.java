package GaussJacobi.Atv1;

import Regressao_Linear.Atv2.RegressaoLinear;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //Ax = b
        double[][] A = {{5, 1, 1},
                        {3, 4, 1},
                        {3, 3, 6} };
        double[] b = { 5, 6, 0};
        double[] x = { 0, 0, 0 };

        GaussJacobi gaussJacobi = new GaussJacobi(A, b, x);
        Jacobi jacobi = new Jacobi(A);
        jacobi.makeDominant();

    }
}
