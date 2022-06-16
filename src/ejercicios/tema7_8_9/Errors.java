package ejercicios.tema7_8_9;

import java.util.ListIterator;

public class Errors {

    public static void main(String[] args) {

        try {
            System.out.println(DividePorCero(-3,0));
        }catch (Exception e)
        {
            System.out.println("Ha habido un error: " + e.getMessage());
        }

    }

    private static int DividePorCero(int num, int den) throws ArithmeticException
    {

        if(den == 0)
            throw (new ArithmeticException("Error Division by Zero!!!"));

        return (num / den);
    }
}
