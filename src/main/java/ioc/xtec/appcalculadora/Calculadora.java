package ioc.xtec.appcalculadora;

public class Calculadora {

    public double multiplicar(double a, double b) {
      return a * b;
   }

   public double dividir(double a, double b) {
      if (b == 0) {
         throw new IllegalArgumentException("El divisor no pot ser zero");
      }
      return a/b;
   }
}
