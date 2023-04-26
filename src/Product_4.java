import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Product_4 {

    private String type;
    private double price;
    private boolean discount;
    private LocalDateTime dateAdded;

    public Product_4(String type, double price, boolean discountApplicable, LocalDateTime dateAdded) {
        this.type = type;
        this.price = price;
        this.discount = discountApplicable;
        this.dateAdded = dateAdded;
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

    public static List<Product_4> getLastThreeAddedProducts(List<Product_4> products) {
        List<Product_4> lastThreeAddedProducts = new ArrayList<>();
        products.stream()
                .sorted(Comparator.comparing(Product_4::getDateAdded).reversed())
                .limit(3)
                .forEach(lastThreeAddedProducts::add);
        return lastThreeAddedProducts;
    }
}
