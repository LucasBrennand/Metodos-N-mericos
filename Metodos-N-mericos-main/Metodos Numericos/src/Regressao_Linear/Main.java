package Regressao_Linear;

public class Main {
    public static void main(String[] args) {
        int[] meses = {1, 2, 3, 4, 5}; //meses da criança
        double[] altura = {2, 4, 6, 8, 10}; //altura em cm
        int i;
        int aux;

        for (i = 0; i < meses.length; i++) {
            for (int j = 0; j < 4; j++) {
                if (meses[j] > meses[j + 1]) {
                    aux = meses[j];
                    meses[j] = meses[j + 1];
                    meses[j + 1] = aux;
                }
            }
            for (i = 0; i < altura.length; i++) {
                for (int j = 0; j < 4; j++) {
                    if (altura[j] > altura[j + 1]) {
                        aux = (int) altura[j];
                        altura[j] = altura[j + 1];
                        meses[j + 1] = aux;
                    }
                }
            }
            System.out.println("Meses:");
            for (i = 0; i < meses.length; i++) {
                System.out.println(meses[i]);
            }
            System.out.println("Altura");
            for (i = 0; i < altura.length; i++) {
                System.out.println(+altura[i]);
                }
            }
            RegressaoLinear regressaoLinear = new RegressaoLinear(meses, altura);
            System.out.println("Yi = " + regressaoLinear.Yi(2));
            }
        }
