package comparatorZadanie2;
//W mainie stwórz kilka instancji klasy OfertaSprzedaży i dodaj je do Listy.
// Po dodaniu posortuj listę i na ekran wypisz  wynik przed sortowaniem, oraz po
// sortowaniu. Spróbuj również sortowania 'w drugą stronę'.

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<OfertaSprzedazy> ofertaSprzedazies = new ArrayList<>(Arrays.asList(
                new OfertaSprzedazy("ksiazka", 20.0),
                new OfertaSprzedazy("plyta", 50.0),
                new OfertaSprzedazy("buty", 150.0)
        ));
        Collections.sort(ofertaSprzedazies, new OfertaSprzedazyComparator());
        System.out.println(ofertaSprzedazies);


    }
}
