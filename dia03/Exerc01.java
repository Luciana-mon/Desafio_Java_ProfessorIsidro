import java.util.Scanner;

public class Exerc01{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int a, b;

        a = teclado.nextInt();
        b = teclado.nextInt();

        if ( a > b){
            System.out.println("Numero maior = " + a);
        }
        else {
            System.out.println("Numero maior = " + b);
        }
    }
}