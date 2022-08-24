import java.util.Scanner;

public class Figuras {

  public static void main(String[] args) {

    Scanner leer = new Scanner(System.in);
    int opcion;
    Double areaCuadrado, perimetroCuadrado;
    Double areaTriangulo, perimetroTriangulo;
    Double areaCirculo, perimetroCirculo;
    Double areaEsfera, perimetroEsfera;
    Double areaCubo, perimetroCubo;

    do{

      System.out.println("\n\t\t\tFiguras Geometricas");
      System.out.println("1. Cuadrado");
      System.out.println("2. Triangulo");
      System.out.println("3. Circulo");
      System.out.println("4. Cubo");
      System.out.println("5. Esfera");
      System.out.println("0. Salir");

      System.out.println("\nSelecciona una opcion");
      opcion=leer.nextInt();

      Double L, b, h, r, AL, R;

      switch(opcion) {

        case 1:
          System.out.println("\nIngresa el valor para el area y perimetro");
          L=leer.nextDouble();

          areaCuadrado = L*L;
          perimetroCuadrado = L*4;

          System.out.println("\nEl Area del Cuadrado es: " + areaCuadrado);
          System.out.println("El Perimetro del Cuadrado es: " + perimetroCuadrado);

          break;

          case 2:
            System.out.println("\nIngresa el valor para la base: ");
            b=leer.nextDouble();
            System.out.println("Ingresa el valor para la altura: ");
            h=leer.nextDouble();

            areaTriangulo = b*h/2;
            perimetroTriangulo = b+b+b;

            System.out.println("\nEl Area del Triangulo es: " + areaTriangulo);
            System.out.println("El Perimetro del Triangulo es: " + perimetroTriangulo);

            break;

            case 3:
              System.out.println("\nIngresa el valor para el radio: ");
              r=leer.nextDouble();

              areaCirculo = Math.PI*(Math.pow(r,2));
              perimetroCirculo = 2 * Math.PI * r;

              System.out.println("\nEl Area del Circulo es: " + areaCirculo);
              System.out.println("El Perimetro del Circulo es: " + perimetroCirculo);

              break;

              case 4:
                System.out.println("\nIngresa el valor para la arista : ");
                AL=leer.nextDouble();

                areaCubo = 6 * Math.pow(AL, 2);
                perimetroCubo = Math.pow(AL, 3);

                System.out.println("\nEl Area del Circulo es: " + areaCubo);
                System.out.println("El Volumen del Circulo es: " + perimetroCubo);

                break;

                case 5:
                  System.out.println("\nIngresa el valor para el radio : ");
                  R=leer.nextDouble();

                  areaEsfera = 4* Math.PI * Math.pow(R, 2);
                  perimetroEsfera = 4* Math.PI * Math.pow(R, 3) / 3;

                  System.out.println("\nEl Area del Esfera es: " + areaEsfera);
                  System.out.println("El Volumen del Esfera es: " + perimetroEsfera);

                  break;

                case 0:
                  System.out.println(" Fin del Programa");
                  break;

        default :
          System.out.println("\nSeleccione una Opcion Valida");
          break;
      }
    } while (opcion != 0);
  }
}
