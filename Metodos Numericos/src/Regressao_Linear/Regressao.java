package Regressao_Linear;

public class Regressao {
    public void B() {
        Coordenada coordenada = new Coordenada();
        //Y = B0 + B1X
        double B1 = ((coordenada.getCont() * coordenada.getCoordX()) - (coordenada.getCoordX() * coordenada.getCoordY())) / ((coordenada.getCont() * coordenada.getCoordX2()) - (Math.pow(coordenada.getCoordX(), 2)));
        System.out.println(B1);
        double B0 = (coordenada.getCoordY() - (B1 * coordenada.getCoordX())) / coordenada.getCont();
        System.out.println(B0);
        System.out.println("Y = "+B0+ " + "+B1+"X");
    }

    public class LinearRegression {
        private double[] x;
        private double[] y;
        private double slope;
        private double intercept;

        public LinearRegression(double[] x, double[] y) {
            this.x = x;
            this.y = y;
            calculate();
        }

        private void calculate() {
            int n = x.length;
            double sumX = 0.0, sumY = 0.0, sumXY = 0.0, sumX2 = 0.0;

            for (int i = 0; i < n; i++) {
                sumX += x[i];
                sumY += y[i];
                sumXY += x[i] * y[i];
                sumX2 += x[i] * x[i];
            }

            slope = (n * sumXY - sumX * sumY) / (n * sumX2 - sumX * sumX);
            intercept = (sumY - slope * sumX) / n;
        }

        public double predict(double x) {
            return slope * x + intercept;
        }
    }

    double[] x = {1, 2, 3, 4, 5};
    double[] y = {2, 4, 6, 8, 10};
    LinearRegression lr = new LinearRegression(x, y);
System.out.println(lr.predict(6)); // Output: 12.0

}
