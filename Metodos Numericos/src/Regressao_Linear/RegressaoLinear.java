package Regressao_Linear;
public class RegressaoLinear {
        private double[] x;
        private double[] y;
        private double B1;
        private double B0;

        public RegressaoLinear(double[] x, double[] y) {
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
        }
        public double Yi(double x) {
            System.out.println("Yi = "+B0+" + "+B1+" * X");
            return B1 * x + B0;
        }
    }
