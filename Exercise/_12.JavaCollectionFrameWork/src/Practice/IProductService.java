package Practice;

import java.util.ArrayList;

public interface IProductService {
    void addProduct(Product product);
    Product editNameProductById(int id,String nameProduct);
    void removeProductById(int id);
    void displayProduct();
    Product findProductById(int id);
    void sortProductList();

}
