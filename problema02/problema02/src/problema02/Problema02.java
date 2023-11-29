package problema02;

import java.util.*;

public class Problema02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int contador = 1;
        System.out.print("Ingrese unnumero par y positivo: ");
        numero = entrada.nextInt();
        if (numero % 2 == 0 && numero > 0) {
            while (contador <= numero) {
             System.out.print(contador);
             contador=contador+1;
            }
        }else{
         System.out.print("Error");   
        }
    }

}
