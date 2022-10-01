package abstract_interface.access_modifiers;

public class DefaultveyaPackage {
    int sayi = 5;
    void metot() {
    }
}

class y extends DefaultveyaPackage {

    @Override
    void metot() {
        super.metot();
        System.out.println(sayi);
    }

}