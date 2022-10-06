package generics;

//Sınıftaki kullanımı.

public class GenericDiziYazdir<T> {

    public void yazdir(T[] dizi) {
        for (T gecici : dizi) {
            System.out.println(gecici);
        }
    }

}
