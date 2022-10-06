package abstract_interface.member_innerclass_ornek;

public class HesapMakinesi {

    public void carp(int i, int j) {


    }

    public class Topla {
        public int topla(int i, int j) {
            return i + j;
        }
    }

    class Cikar {
        public int cikar(int i, int j) {
            return i - j;
        }
    }

    private class Carpma {
        public int carpma(int i, int j) {
            return i * j;
        }
    }

    class Bolme {
        public String bolme(int i, int j) {
            if (j == 0) {
                System.out.println("Bölen sıfır olamaz.");
                return "";
            } else {
                int sonuc = i / j;
                return String.valueOf(sonuc);
            }

        }
    }


}
