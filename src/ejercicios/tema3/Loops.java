package ejercicios.tema3;

public class Loops {

    public static void main(String[] args) {

        String strs[] = {"hola", " ","como vamos ", " esto es un", " ", "programa de pruebas"};
        String str = "";

        for(String str_actual: strs)
        {
            str = str + str_actual;
        }
        System.out.println("Cadena concatenada: " + str);
    }
}
