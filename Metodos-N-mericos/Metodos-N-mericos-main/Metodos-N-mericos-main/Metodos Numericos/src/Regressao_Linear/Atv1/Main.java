package Regressao_Linear.Atv1;
public class Main {
        public static void main(String[] args) {
            int[] meses = {18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29}; //meses da criança
            double[] altura = {76.1, 77, 78.1, 78.2, 78.8, 79.7, 79.9, 81.1, 81.2, 81.8, 82.8, 83.5}; //altura em cm

            RegressaoLinear regressaoLinear = new RegressaoLinear(meses, altura);
            System.out.println("Yi = " + regressaoLinear.Yi(2));
        }
    }

