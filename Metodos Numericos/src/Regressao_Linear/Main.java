package Regressao_Linear;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] meses = {1, 2, 3, 4, 5};
        double[] altura = {2, 4, 6, 8, 10};
        RegressaoLinear regressaoLinear = new RegressaoLinear(meses, altura);
        System.out.println("Yi = "+regressaoLinear.Yi(2));
    }

}
