import java.util.Scanner;

public class Uri1014{
    public static void main(String args []){
        Scanner teclado = new Scanner(System.in);

        int km;
        double litros, total;

        km = teclado.nextInt();
        litros = teclado.nextDouble();

        total = km / litros;

        System.out.printf("%.3f Km/l %n" , total );

        teclado.close();

    }
}