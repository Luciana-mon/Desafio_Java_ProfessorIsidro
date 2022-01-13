import java.util.Scanner;

public class Uri1002{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        double a, n;
        double area;

        a = teclado.nextDouble();
        
        n = 3.14159;
        area = n * (a * a);
        
        System.out.println("A=" + area);

        teclado.close();
    }
}
