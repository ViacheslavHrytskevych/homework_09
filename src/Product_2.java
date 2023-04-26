import java.util.List;
import java.util.stream.Collectors;

public class Product_2 {

    private String type;
    private double price;
    private boolean discount;

    public Product_2(String type, double price, boolean discount) {
        this.type = type;
        this.price = price;
        this.discount = discount;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public boolean isDiscount() {
        return discount;
    }

    public List<Product_2> getDiscountedBooks(List<Product_2> products) {
        return products.stream()
                .filter(product -> product.getType().equals("Book") && product.isDiscount())
                .map(product -> new Product_2(product.getType(), product.getPrice() * 0.9, product.isDiscount()))
                .collect(Collectors.toList());
    }
}