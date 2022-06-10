package ejercicios.tema2;
import java.util.Scanner;

public class Funciones {

    public static void main(String[] args) {

        float iva;
        float precio;

        precio = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el precio: ");
        precio = sc.nextFloat();
        System.out.println("Introduce el iva: ");
        iva = sc.nextFloat();
        precio = get_price(precio,iva);
        System.out.println("El precio final es de: " + precio);
    }

    private static float get_price(float precio, float iva)
    {
        iva = iva / 100;
        precio += (precio * iva);
        return (precio);
    }
}
