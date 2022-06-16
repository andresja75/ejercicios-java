package ejercicios.tema7_8_9;

import java.io.*;

public class Archivos {

    private static final String infile = "texto.txt";
    private static final String outfile = "";

    public static void main(String[] args) {

        File fdin = new File("C:\\Users\\andresja\\IdeaProjects\\java_exercises\\src\\ejercicios\\tema7_8_9\\texto.txt");
        InputStream in = null;
        File fdout = new File(".\\prueba.txt");
        PrintStream out = null;

        try{
            in = new FileInputStream(fdin);
            out = new PrintStream(fdout);
        }catch (FileNotFoundException e)
        {
            System.out.println("El archivo no ha sido encontrado: " + e.getMessage());
        }

        int b;
        b = 0;

        try
        {
            b = in.read();
        }catch (IOException error)
        {
            System.out.println("Error IO: " + error.getMessage());
        }
        while(b != -1)
        {
            try {
                out.print((char)b);
                b = in.read();
            }catch (IOException error)
            {
                System.out.println("Error IO: " + error.getMessage());
            }

        }
    }
}
