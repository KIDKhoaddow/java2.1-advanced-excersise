package Practice;

import java.util.ArrayList;
import java.util.Collections;

public class ProductManagerIMPL implements IProductService {
    private ArrayList<Product> productList =new ArrayList<>();

    @Override
    public void addProduct(Product product) {
        productList.add(product);
    }

    @Override
    public Product editNameProductById(int id,String nameProduct) {
        findProductById(id).setNameProduct(nameProduct);
        return findProductById(id);
    }

    @Override
    public void removeProductById(int id) {
        System.out.println(productList.remove(productList.indexOf(findProductById(id))));

    }

    @Override
    public void displayProduct() {
        for (Product element:productList) {
            System.out.println(element);
        }
    }

    @Override
    public Product findProductById(int id) {
        for (Product element:productList) {
            if(element.getIdProduct()==id){
                return element;
            }
        }
        return null;
    }

    @Override
    public void sortProductList() {
        Collections.sort(productList);
        displayProduct();
    }
}
