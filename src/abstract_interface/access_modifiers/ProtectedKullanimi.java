package abstract_interface.access_modifiers;

public class ProtectedKullanimi {
    protected int sayi;
    protected void protectedMetot() {
    }


    protected class InnerProtectedsinif {
    }
}

class G extends ProtectedKullanimi {
    @Override
    protected void protectedMetot() {
        super.protectedMetot();
        System.out.println(sayi);
    }
}