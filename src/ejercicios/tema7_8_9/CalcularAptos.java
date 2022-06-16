package ejercicios.tema7_8_9;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CalcularAptos {

    public static void main(String[] args) {

        File fd_in = new File("src/ejercicios/tema7_8_9/usuarios.txt");
        File fd_out = new File("src/ejercicios/tema7_8_9/alumnos_up_to_5.txt");
        InputStream in = null;
        PrintStream out = null;
        int b = -1;
        String nombre = "";
        String numero = "";
        int double_dots = 0;
        int first_time = 1;
        HashMap<String, Float> alumnos = new HashMap<String, Float>();
        ArrayList<String> alumnos_up_to_5 = new ArrayList<String>();
        Iterator<String> it;

        try
        {
           in = new FileInputStream(fd_in);
           out = new PrintStream(fd_out);
        }catch(FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        }

        try {
            b = in.read();
        }catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
        while(b != -1)
        {
            if(double_dots == 1 && ((char)b != ','))
            {
                numero = numero.concat(Character.toString((char)b));
            }

            if(((char)b)== ':')
            {
                double_dots = 1;
            }
            if(double_dots != 1)
            {
                nombre = nombre.concat(Character.toString((char)b));
            }

            if(((char)b) == ',') {
                if(first_time == 1)
                {
                    first_time = 0;
                }
                else {
                  nombre = nombre.substring(2, nombre.length());
                }
                numero =numero.substring(1,numero.length());
                alumnos.put(nombre, Float.parseFloat(numero));
                nombre = "";
                numero = "";
                double_dots = -1;
            }
            try {
                b = in.read();
            }catch (IOException e)
            {
                System.out.println(e.getMessage());
            }
        }
        try {
            in.close();
        }catch(IOException e) {
            System.out.println("Error al cerrar el flujo: " + e.getMessage());
        }
        for(String k: alumnos.keySet())
        {
            if(alumnos.get(k) > 5.0)
            {
                alumnos_up_to_5.add(k);
            }
        }

        it = alumnos_up_to_5.listIterator();

        while(it.hasNext() == true)
        {
            out.print(it.next());
            out.println("");
        }
    }
}
