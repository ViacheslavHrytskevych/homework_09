import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Product_6 {

    private int id;
    private String type;
    private double price;
    private boolean discount;
    private LocalDateTime dateAdded;

    public Product_6(int id, String type, double price, boolean discount, LocalDateTime dateAdded) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.dateAdded = dateAdded;
    }

    public int getId() {
        return id;
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

    public LocalDateTime getDateAdded() {
        return dateAdded;
    }

    public static Map<String, List<Product_6>> groupProductsByType(List<Product_6> products) {
        return products.stream()
                .collect(Collectors.groupingBy(Product_6::getType,
                        Collectors.mapping(product -> new Product_6(product.getId(),
                                        product.getType(),
                                        product.getPrice(),
                                        product.isDiscount(),
                                        product.getDateAdded()),
                                Collectors.toList())));
    }
}