import java.util.Scanner;

public class Uri1009{
    public static void main(String args []){
        Scanner teclado = new Scanner(System.in);

        String nome;
        double salarioFixo, totalVendas;
        double comissao, totalReceber, percentual;

        System.out.println("Digite primeiro nome do vendedor: ");
        nome = teclado.nextLine();
        salarioFixo = teclado.nextDouble();
        totalVendas = teclado.nextDouble();
        
        percentual = 15.0 /100.0;
        comissao = totalVendas - (percentual * totalVendas);
        totalReceber = salarioFixo + comissao;

        System.out.println("TOTAL = " + comissao);

        
    }
}