

public class Main {
  public static void main(String[] args) {
    int resultado = suma(5, 13, 2);
    System.out.println(resultado);

    Coche miCoche = new Coche();
    miCoche.masPuertas();
    System.out.println("miCoche tiene " + miCoche.puertas + " puertas");

  }

  public static int suma(int a, int b, int c) {
    return a + b + c;
  }

}



