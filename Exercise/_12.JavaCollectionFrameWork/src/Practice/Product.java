
package Practice;

public class Product implements Comparable<Product> {
    private int idProduct;
    private String nameProduct;


    public Product() {
    }

    public Product(int idProduct, String nameProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    @Override
    public int compareTo(Product product) {
        return this.getNameProduct().compareTo(product.getNameProduct());
    }


}

