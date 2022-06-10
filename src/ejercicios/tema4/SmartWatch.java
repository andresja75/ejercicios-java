package ejercicios.tema4;

public class SmartWatch extends SmartDevice{

    Boolean correa;
    public SmartWatch()
    {
        super();
        this.correa = null;
    }

    public SmartWatch(boolean correa)
    {
        super();
        this.correa = correa;
    }

    public SmartWatch(boolean correa, String procesador, int nucleos, int memoria)
    {
        super(procesador, nucleos, memoria);
        this.correa = correa;
    }

    public boolean getCorrea()
    {
        return (this.correa);
    }

    @Override
    public String toString()
    {
        return (super.toString() + ", correa: " + this.getCorrea());
    }
}
