package Regressao_Linear.Atv2;

public class RegressaoLinear {
    private double[] x;
    private double[] y;
    private double B1;
    private double B0;
    private double R;
    private double R2;
    private double AIC;
    private double SQR;
    private double SQT;
    private double Yi;

    public RegressaoLinear(double[] x, double[] y) {
        this.x = x;
        this.y = y;
        coordenadas();
    }

    private void coordenadas() {
        int n = x.length;
        double X = 0, Y = 0, X2 = 0, Y2 = 0, XY = 0;

        for (int i = 0; i < n; i++) {
            X = X + x[i];
            Y = Y + y[i];
            XY = XY + x[i] * y[i];
            X2 = X2 + Math.pow(x[i], 2);
            Y2 = Y2 + Math.pow(y[i], 2);
        }
        B1 = ((n * XY) - (X * Y)) / (((n * X2) - Math.pow(X, 2)));
        B0 = (Y - B1 * X) / n;
        for (int i = 0; i < n; i++) {
            Yi = B0 + B1 * x[i];
            SQR = SQR + Math.pow(y[i] - Yi, 2);
            R = ((n * XY) - (X * Y)) / (Math.sqrt((n * X2 - Math.pow(X, 2))) * Math.sqrt(n * Y2 - Math.pow(Y, 2)));
            R2 = (1 - SQR) / ((Math.pow(y[i] / n, 2)));
            AIC = n * Math.log(SQR / n) + 2 * 2 * (n / (n - 2 - 1)); //p = 2
        }
        System.out.println("B1 = " + B1 + " (Coeficiente Angular)");
        System.out.println("B0 = " + B0 + " (Intercepto)");
        System.out.println("SQR = " + SQR + " ");
        System.out.println("R = " + R + " (Coeficiente de Correlação)");
        System.out.println("R2 = " + R2 + " (Coeficiente de Determinação)");
        System.out.println("AIC = " + AIC + " (Critério de Akaike)");
    }
    public double Yi(double Xi) {
        System.out.println("Yi = "+B0+" + "+B1+" * X (Equação da reta)");
        return B0 + B1 * Xi;
    }

}
