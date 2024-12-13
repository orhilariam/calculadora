package ioc.xtec.appcalculadora;

import java.util.Scanner;

/**
 *
 * @author josepmaria
 */
public class AppCalculadora {

    public static void main(String[] args) {
        Calculadora c = new Calculadora();

      @SuppressWarnings("resource")
      Scanner scanner = new Scanner(System.in);

      System.out.print("Introdueix el primer número: ");
      double num1 = scanner.nextDouble();
      System.out.print("Introdueix el segon número: ");
      double num2 = scanner.nextDouble();
      System.out.print("Introdueix el tipus d'operació (+, -, *, /): ");
      String operacio = scanner.next();

      double resultat = 0;
      switch (operacio) {
         case "+":
            resultat = c.sumar((int) num1, (int) num2);
            break;
         case "-":
            resultat = c.restar((int) num1, (int) num2);
            break;
         case "*":
            resultat = c.multiplicar(num1, num2);
            break;
         case "/":
            resultat = c.dividir(num1, num2);
            break;
         default:
            System.out.println("Operació no vàlida");
            return;
      }

      System.out.println(num1 + " " + operacio + " " + num2 + " = " + resultat);
    }
    
}
