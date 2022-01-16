import java.util.Scanner;

public class Uri1020{
    public static void main(String args []){

        Scanner teclado = new Scanner(System.in);
        int idadeDias;
        int anos, meses, dias, resto;

        //entrada
        idadeDias = teclado.nextInt();

        //processamento
        anos = idadeDias / 365;
        resto = idadeDias % 365;
        meses = resto / 30;
        dias = resto % 30;

        //saida
        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");


        //fechamento
        teclado.close();


    }
}