import java.util.Scanner;

public class Uri1017{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int tempoGastoHr;
        int velocidadeMediaKm;
        double litro;

        tempoGastoHr = teclado.nextInt();
        velocidadeMediaKm = teclado.nextInt();

        litro = tempoGastoHr * velocidadeMediaKm / 12;

        System.out.println(litro);
        
        

    }
}