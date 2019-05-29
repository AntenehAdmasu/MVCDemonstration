import java.io.Console;
import java.util.Scanner;

/* Name - Anteneh Admasu
   ID No - ATR/2674/09
   Section - 1
 */
public class MainClass {
    public static void main(String[] args) {

        ProductModel product = getProductFromUser();
        ProductView view = new ProductView();
        ProductController productController = new ProductController(product, view);
        productController.updateView();
    }

    public static ProductModel getProductFromUser(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter product name: ");
        String name = scanner.nextLine();

        System.out.println("Enter amount: ");
        int amount = scanner.nextInt();

        System.out.println("Enter product price: ");
        double price = scanner.nextDouble();

        System.out.println("Enter product serial number: ");
        String serialNumber = scanner.next();

        ProductModel product = new ProductModel(name, amount, price, serialNumber);
        return product;
    }
}
