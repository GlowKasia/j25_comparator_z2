package comparatorZadanie2;

import java.util.Comparator;

public class OfertaSprzedazyComparator implements Comparator<OfertaSprzedazy> {

    private boolean rosnacy;

    public OfertaSprzedazyComparator(boolean rosnacy) {
        this.rosnacy = rosnacy;
    }

    @Override
    public int compare(OfertaSprzedazy o1, OfertaSprzedazy o2) {
        //    return Double.compare(o1.getCena(), o2.getCena());
        if (rosnacy) {
            if (o1.getCena() > o2.getCena()) {
                return 1;
            } else if (o1.getCena() < o2.getCena()) {
                return -1;
            }
            if (o1.getCena() > o2.getCena()) {
                return -1;
            } else if (o1.getCena() < o2.getCena()) {
                return 1;
            }
        }
        return 0;
    }
}