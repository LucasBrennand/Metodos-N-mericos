package Regressao_Linear;

import java.util.Arrays;

public class RegressaoLinear {
        private double[] x;
        private double[] y;
        private double B1;
        private double B0;
        private double R;
        private double R2;
        private double AIC;
        private double SQR;

        public RegressaoLinear(double[] x, double[] y) {
            this.x = x;
            this.y = y;
            coordenadas();
        }

        public void coordenadas() {
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
            B0 = (Y - B1 * X) / n;
            //R = ((n * XY) - (X * Y)) / (Math.sqrt((n * X2 - Math.pow(X, 2))) * Math.sqrt(n * Y2 - Math.pow(Y, 2)));
            //R2 = Math.pow(R, 2);
            System.out.println("Y = "+Y);
            R2 = 1 - SQR/ Y2 - (Math.pow(Y, 2)/n);
            AIC = n * Math.log(SQR/n) + 2 * 2 * (n/(n - 2 - 1));

            System.out.println("B1 = "+B1+" (Coeficiente Angular)");
            System.out.println("B0 = "+B0+" (Intercepto)");
            //System.out.println("R = "+R+" (Coeficiente de Correlação)");
            System.out.println("R2 = "+R2+" (Coeficiente de Determinação)");
            System.out.println("SQR = "+SQR+" ");
            System.out.println("AIC = "+AIC+" (Critério de Akaike)");
            System.out.println("Yi = "+B0+" + "+B1+" * X (Equação da reta)");
        }

    public double Yi(double Xi) {
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
