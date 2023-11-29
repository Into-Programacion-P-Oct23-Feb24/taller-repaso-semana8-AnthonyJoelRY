package problema03;

import java.util.*;

public class Problema03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        int m;
        int a = 0;
        System.out.print("Ingrese el primer termino: ");
        n = entrada.nextInt();
        System.out.print("Ingrese el segundo termino: ");
        m = entrada.nextInt();
        while (m >= 1) {
            if (m % 2 == 1) {
                a = a + n;
            }
            n = n * 2;
            m = m / 2;

        }
        System.out.println("El resultado es: " + a);
    }

}
