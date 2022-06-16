package ejercicios.tema7_8_9;

public class Empleado {

    String nombre;
    Integer sueldo;

    public Empleado()
    {
        this.nombre = null;
        this.sueldo = null;
    }

    public Empleado(String nombre)
    {
        this.nombre = nombre;
        this.sueldo = null;
    }

    public Empleado(String nombre, int sueldo)
    {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    @Override
    public String toString()
    {
        return ("Nombre empleado: " + this.nombre + ", sueldo empleado: " + this.sueldo);
    }
}
