package ejercicios.tema5;

public class Principal {

    public static void main(String[] args) {
        CocheCRUD coche = new CocheCRUDImp();

        coche.delete();
        coche.findAll();
        coche.save();
    }
}
