import java.util.List;
import java.util.stream.Collectors;

public class Product_1 {

    private String type;
    private int price;

    public Product_1(String type, int price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public static List<Product_1> getExpensiveBooks(List<Product_1> products) {
        return products.stream()
                .filter(product -> product.getType().equals("Book") && product.getPrice() > 250)
                .collect(Collectors.toList());
    }

}
