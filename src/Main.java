import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*RAMA DE COLABORADOR 3 - Cesar*/
        Scanner teclado = new Scanner(System.in);

        switch (opcion){
            case 1:
                int suma=num1+num2;
                System.out.println("El resultado de la suma es" + suma);
                break;
            case 2:
                int resta=num1+num2;
                System.out.println("El resultado de la resta es" + resta);
                break;
            case 1:
                int multiplicacion=num1+num2;
                System.out.println("El resultado de la multiplicación es" + multiplicacion);
                break;
            case 4:

                if (num2!=0) {
                    int division=num1/num2;
                    System.out.println("El resultado de la división es:" + division);
                }else{
                    System.out.println("Error no se puede dividir para 0");

                }
                break;
            default:
                System.out.println("Opción no valida :(");

        }
         teclado.close();

    }
}