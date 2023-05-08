package Gauss.GaussSeidel;

public class Main {
    public static void main(String[] args) {
        //Ax = b
      //double[][] A = {{5, 1, 1},
      //        {3, 4, 1},
      //        {3, 3, 6} };
      //double[] b = { 5, 6, 0};
      //double[] x = { 0, 0, 0 };

       double[][] A = {{1, -3, 2},
               {-2, 8, -1},
               {4, -6, 5} };
       double[] b = { 11, -15, 29};
       double[] x = { 0, 0, 0 };

      //double[][] A = {{4, 2, 1, -2},
      //        {-3, -3, -1, -1},
      //        {3, -5, 1, 1},
      //        {1, -1, -1, 4}};
      //double[] b = { 3, 2, 0, -2};
      //double[] x = { 0, 0, 0 };


        GaussSeidel gaussSeidel = new GaussSeidel(A, b, x);
        gaussSeidel.iteracao();

    }
}