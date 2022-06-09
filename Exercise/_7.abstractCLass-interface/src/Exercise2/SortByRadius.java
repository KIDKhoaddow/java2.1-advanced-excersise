package Exercise2;

import java.util.Comparator;

public class SortByRadius implements Comparator<Circle> {
    @Override
    public int compare(Circle o1, Circle o2) {
        if (o1.getRadius()>o2.getRadius()){
            return 1;
        }else return -1;
    }
}
