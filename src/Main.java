import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Sale sale1 = new Sale();

        sale1.addProduct(new Product("Laptop", 1250.00));
        sale1.addProduct(new Product("Mouse", 25.99));

        try {
            sale1.calculateTotal();
        } catch (EmptySaleException e) {
            System.out.println("Error when calculating total price: " + e.getMessage());
        }
        System.out.println("Total price of the sale: " + sale1.getTotalPrice());

        try {
            java.util.List<String> list = new ArrayList<>();
            String item = list.get(5);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: You attempted to access an out-of-bounds index.");
            System.out.println(e.getMessage());
        }
    }
}