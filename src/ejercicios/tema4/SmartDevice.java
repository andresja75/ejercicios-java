package ejercicios.tema4;

public class SmartDevice {
    String procesador;
    Integer nucleos;
    Integer memoria;//MB

    public SmartDevice()
    {
        this.procesador = null;
        this.nucleos = null;
        this.memoria = null;
    }

    public SmartDevice(String procesador)
    {
        this.procesador = procesador;
        this.nucleos = null;
        this.memoria = null;
    }

    public SmartDevice(String procesador, int nucleos)
    {
        this.procesador = procesador;
        this.nucleos = nucleos;
        this.memoria = null;
    }

    public SmartDevice(String procesador, int nucleos, int memoria)
    {
        this.procesador = procesador;
        this.nucleos = nucleos;
        this.memoria = memoria;
    }

    public String getProcesador()
    {
        return (this.procesador);
    }

    public Integer getNucleos()
    {
        return (this.nucleos);
    }
    public Integer getMemoria()
    {
        return (this.memoria);
    }

    public String toString()
    {
        return ("procesador: " + this.getProcesador() + ", nucleos: " +
                this.getNucleos() + ", memoria: " + this.getMemoria());
    }
}
