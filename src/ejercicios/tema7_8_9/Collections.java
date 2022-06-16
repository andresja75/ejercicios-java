package ejercicios.tema7_8_9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Collections {

    public static void main(String[] args) {

        ArrayList<String> marcas_moviles  = new ArrayList<String>();
        LinkedList<String> lk_moviles = new LinkedList<String>();
        ArrayList<Integer> numeros = new ArrayList<Integer>();


        marcas_moviles.add("Samsung");
        marcas_moviles.add("Apple");
        marcas_moviles.add("Xiaomi");
        marcas_moviles.add("Huawei");

        for(String marcas: marcas_moviles)
            lk_moviles.add(marcas);

        for(String marca: marcas_moviles)
            System.out.println(marca);

        System.out.println("----------------------");

        for(String marcalk: lk_moviles)
            System.out.println(marcalk);

        for(int i = 1; i <= 10; i++)
            numeros.add(i);

        //---------------------------------------------------
        ListIterator<Integer> it = numeros.listIterator();
        while(it.hasNext() == true)
        {
            if(it.next() % 2 == 0)
            {
                it.previous();
                it.remove();
            }
        }

        for(int numero: numeros)
            System.out.println(numero);
    }
}
