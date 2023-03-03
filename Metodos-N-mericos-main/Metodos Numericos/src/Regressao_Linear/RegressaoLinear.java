package Regressao_Linear;

import java.util.Arrays;

public class RegressaoLinear {
        private int[] x;
        private double[] y;
        private double B1;
        private double B0;
        private double R2;

        public RegressaoLinear(int[] x, double[] y) {
            this.x = x;
            this.y = y;
            coordenadas();
        }

        private void coordenadas() {
            int n = x.length;
            double X = 0;
            double Y = 0;
            double X2 = 0;
            double Y2 = 0;
            double XY = 0;

            for (int i = 0; i < n; i++) {
                X = X + x[i];
                Y = Y + y[i];
                XY = XY + x[i] * y[i];
                X2 = X2 + Math.pow(x[i], 2);
                Y2 = Y2 + Math.pow(y[i], 2);
            }
            B1 = ((n * XY) - (X * Y)) / (((n * X2) - Math.pow(X, 2)));
            System.out.println("B1 = "+B1+" (Coeficiente Angular)");
            B0 = (Y - B1 * X) / n;
            System.out.println("B0 = "+B0+" (Intercepto)");
            System.out.println("R2 = "+R2+" (Coeficiente de Determinação");
        }
        public double Yi(double x) {
            System.out.println("Yi = "+B0+" + "+B1+" * X (Equação da reta)");
            return B0 + B1 * x;
        }

    @Override
    public String toString() {
        return "Tabela: {" +
                " Meses = " + Arrays.toString(x) +
                ", Altura = " + Arrays.toString(y);
    }
}
