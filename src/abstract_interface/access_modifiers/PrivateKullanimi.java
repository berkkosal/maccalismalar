package abstract_interface.access_modifiers;

public class PrivateKullanimi {

    //Private, sınıf tanımlamalarında kullanılamaz.
    //private değişken ve metotlar sadece o sınıfa aittir.
    //private yapılan kurucu metot o sınıftan nesne üretilmesini engeller. O sınıftan kalıtım ile yeni sınıf da oluşturulamaz.
    //private ile inner class tanımlanabilir.
    private int a;

    private void metot() {

    }

    private PrivateKullanimi() {

    }

    private class InnerClass {

    }


}


