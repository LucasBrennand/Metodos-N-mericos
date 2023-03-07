package Regressao_Linear;

public class Main {
    public static void main(String[] args) {
        double[] X = {0.2, 2.7, 4.5, 5.9, 7.2}; //
        double[] Y = {1.5, 1.8, 3.1, 2.6, 3.6};

        RegressaoLinear regressaoLinear = new RegressaoLinear(X, Y);
        System.out.println("Yi = " + regressaoLinear.Yi(0.2));
    }
}
