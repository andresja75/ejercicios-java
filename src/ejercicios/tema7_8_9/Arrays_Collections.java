package ejercicios.tema7_8_9;

import java.util.ArrayList;

public class Arrays_Collections {
    public static void main(String[] args) {

        String cadenas[] = {"juan", "pepe", "maria", "lucia", "lucas", "sabrina"};
        int numeros[][] = new int[3][3];
        ArrayList<Empleado> lista_empleados = new ArrayList<Empleado>();

        numeros[0][0] = -1;
        numeros[0][1] = -53;
        numeros[0][2] = 31;
        numeros[1][0] = 2;
        numeros[1][1] = -2;
        numeros[1][2] = 90;
        numeros[2][0] = -34;
        numeros[2][1] = -687;
        numeros[2][2] = 567;

        lista_empleados.add(new Empleado("Juan", 23400));
        lista_empleados.add(new Empleado("Patricia"));
        lista_empleados.add(new Empleado("Jorge", 13241));
        lista_empleados.add(new Empleado("Luka", 12345));
        lista_empleados.add(new Empleado("Juana", 90911));

        for(String nombre: cadenas)
        {
            System.out.println(nombre);
        }

        for(int i = 0; i < numeros.length; i++)
        {
            for(int j = 0; j < 3; j++)
                System.out.println("Pos:[" + i + "]["+ j + "]: " + numeros[i][j]);
        }

        for(Empleado e: lista_empleados){
            System.out.println(e);
        }
        System.out.println("--------------------------------");
        //Delete 2 and 3 pos
        lista_empleados.remove(2);
        lista_empleados.remove(3);

        for(Empleado e: lista_empleados)
        {
            System.out.println(e);
        }
    }

}
