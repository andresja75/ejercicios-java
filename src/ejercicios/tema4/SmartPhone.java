package ejercicios.tema4;

public class SmartPhone extends SmartDevice{

    String marca;

    public SmartPhone(){
        super();
        this.marca = null;
    }

    public SmartPhone(String marca)
    {
        super();
        this.marca = marca;
    }

    public SmartPhone(String marca, String procesador, int nucleos, int memoria)
    {
        super(procesador, nucleos, memoria);
        this.marca = marca;
    }

    public String getMarca()
    {
        return (this.marca);
    }

    @Override
    public String toString(){
        return(super.toString() + ", marca: " + this.getMarca());
    }
}
