import java.util.Scanner;

public class TrabajoClase{
  static Scanner entrada = new Scanner(System.in);
  static String[] letras ={"  q","  r","  t","  a","  j","  h","  d","  p","  f","  c"};
  static int numero = 0;
  static String le = "";
  static String ne = "";
  public static void main(String[] args) {
    for (int i = 0; i<10; i++) {
      System.out.println("Ingresa un numero");
      numero = entrada.nextInt();
      le += String.valueOf(numero);

      switch(numero){
        case 0:
          ne += letras[0];
          break;

          case 1:
            ne += letras[1];
            break;

            case 2:
              ne += letras[0];
              break;
      }
    }
    System.out.println(le);
    System.out.println(ne);
  }
}
