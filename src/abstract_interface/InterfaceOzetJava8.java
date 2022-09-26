package abstract_interface;

public class InterfaceOzetJava8 {

    public static void main(String[] args) {

        SinifA a = new SinifA();
        a.metotA();
        InterfaceA.staticMetot();
    }

}

interface InterfaceA {

    void metotA();

    default void defaultMetot() {
        System.out.println("Ben default bir metodum.");
    }

    int sayi = 10; //Interface içine tanımlı sabitler zaten static ve final olarak oluşturuluyor burada.

    static void staticMetot() {
        System.out.println("Ben statik metodum.");
    }

}

class SinifA implements InterfaceA {

    @Override
    public void metotA() {
        defaultMetot();
    }

    @Override
    public void defaultMetot() {
        System.out.println("Ben A sınıfındaki default metodum.");
    }
}
