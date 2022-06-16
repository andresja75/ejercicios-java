package ejercicios.tema7_8_9;

public class reverseString {

    public static void main(String[] args) {

        String dev = reverse("hola mundo!!!");
        System.out.println("hola mundo!!!");
        System.out.println(dev);
    }

    public static String reverse(String texto)
    {
        String aux = new String("");

        for(int i = texto.length() - 1; i >= 0; i--)
        {
            aux = aux.concat(Character.toString(texto.charAt(i)));
        }
        return aux;
    }
}
