import java.util.Comparator;
import java.util.List;
import java.util.Optional;
public class Product_3 {

    private String type;
    private double price;
    private boolean discount;

    public Product_3(String type, double price, boolean discount) {
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

    public static Product_3 findCheapestBook(List<Product_3> products) throws Exception {
        Optional<Product_3> cheapestBook = products.stream()
                .filter(p -> p.getType().equals("Book"))
                .min(Comparator.comparingDouble(Product_3::getPrice));
        if (cheapestBook.isPresent()) {
            return cheapestBook.get();
        } else {
            throw new Exception("The item [the type is: Book] is not found.");
        }
    }
}
