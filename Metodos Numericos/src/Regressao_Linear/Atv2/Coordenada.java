package Regressao_Linear.Atv2;

import java.util.ArrayList;
import java.util.Scanner;

public class Coordenada{
    int cont;
    Scanner in = new Scanner(System.in);
    public void dados(){
        ArrayList<Integer>coordX = new ArrayList<Integer>();
        ArrayList<Double>coordY = new ArrayList<Double>();
        ArrayList<Integer>coordX2 = new ArrayList<Integer>();
        ArrayList<Double>coordY2 = new ArrayList<Double>();
        ArrayList<Double>coordXY = new ArrayList<Double>();

        System.out.println("Informe a quantidade de meses da criança");
        int meses = in.nextInt();
        coordX.add(meses);
        System.out.println("X: "+coordX);
        coordX2.add((int) Math.pow(meses, 2));
        System.out.println("X^2: "+coordX2);

        System.out.println("Informe a altura da criança");
        double altura = in.nextDouble();
        coordY.add(altura);
        System.out.println("Y: "+coordY);
        coordY2.add(Math.pow(altura, 2));
        System.out.println("Y^2: "+coordY2);
        coordXY.add(meses * altura);
        cont++;
        System.out.println("XY: "+coordXY);
    }

    public int getCont() {
        return cont;
    }

}
