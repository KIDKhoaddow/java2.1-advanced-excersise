package Practice;

import java.util.Comparator;

public class IdComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if(o1.getIdProduct() > o2.getIdProduct()){
            return 1;
        }else if(o1.getIdProduct() == o2.getIdProduct()){
            return 0;
        }else{
            return -1;
        }
    }


}
