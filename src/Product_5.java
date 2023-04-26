import java.time.LocalDateTime;
import java.util.List;

public class Product_5 {

    private String type;
    private double price;
    private boolean discount;
    private LocalDateTime dateAdded;

    public Product_5(String type, double price, boolean discount, LocalDateTime dateAdded) {
        this.type = type;
        this.price = price;
        this.discount = discount;
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

    public static double calculateTotalCost(List<Product_5> productList) {
        return productList.stream()
                .filter(p -> p.getType().equals("Book") && p.getPrice() <= 75 && p.getDateAdded().getYear() == LocalDateTime.now().getYear())
                .mapToDouble(Product_5::getPrice)
                .sum();
    }

}
