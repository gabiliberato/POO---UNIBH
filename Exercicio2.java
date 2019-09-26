package topper;

import java.util.Scanner;

public class Top {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //int i = um(teclado);
        //System.out.println("A sua média é: " + i );

        tres(teclado);
    }

    public static int um(Scanner teclado){
        int a,b,c,d,e,m;

        System.out.println("Escreva a:");
        a = teclado.nextInt();
        System.out.println("Escreva b:");
        b = teclado.nextInt();
        System.out.println("Escreva c:");
        c = teclado.nextInt();
        System.out.println("Escreva d:");
        d = teclado.nextInt();
        System.out.println("Escreva e:");
        e = teclado.nextInt();

        m = (a+b+c+d+e)/5;

        return m;
    }

    public static void dois(){
        System.out.println("Número \t Quadrado \t Cubo");
        for(int i = 0; i <= 10; i++) {
            int n = i;
            int q = (int) Math.pow(n,2);
            int c = (int) Math.pow(n,3);

            System.out.println("" + n +"\t\t\t"+ q + "\t\t\t"+ c);
        }
    }

    public static void tres(Scanner teclado){
        double tin_paint = 50.0;
        double cap_pain = 5.0;

        // cada lata 3 m^2
        System.out.println("Entre com  a altura(h): ");
        double h = teclado.nextInt();
        System.out.println("Entre com o raio(h): ");
        double r = teclado.nextInt();

        double pi = 3.14;

        double at = 2*pi*r*(h+r);

        double q_lata = at/cap_pain;
        double custo_total = q_lata*tin_paint;

        System.out.println("Quantidade de latas: " + q_lata);
        System.out.println("Custo total: " + custo_total);


    }
}
