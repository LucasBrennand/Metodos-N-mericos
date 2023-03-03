package Regressao_Linear;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int op;
        Coordenada coordenada = new Coordenada();
        Regressao regressao = new Regressao();
        do {
            menu();
            op = in.nextInt();
            switch (op) {
                case 1:
                    coordenada.dados();
                    regressao.B();

            }
        } while ( op != 2);
    }

}
