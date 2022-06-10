package ejercicios.tema4;

public class Principal {
    public static void main(String[] args) {

        SmartDevice sd = new SmartDevice("Snap Dragon", 8);
        SmartPhone apple = new SmartPhone("iphone 7", "snap dragon", 4, 128000);
        SmartWatch samsung = new SmartWatch(true, "Snap Dragon z3", 2, 64000);

        System.out.println("SmartDevice: " + sd);
        System.out.println("SmartPhone: " + apple);
        System.out.println("SmartWatch: " + samsung);
    }
}
