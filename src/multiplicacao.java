import java.util.Scanner;

public class multiplicacao {
    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
       System.out.print( "Digite um numero:  " );
        int numero1 = scanner.nextInt();

        System.out.println("Tabuada de " + numero1 + ":");
        for (int i =1; i<=10; i++) {
            System.out.println(numero1 + " x " + i + " = " + (numero1 * i));
        }
        scanner.close();
    }
}