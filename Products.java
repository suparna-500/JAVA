import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class ProductList {
    private ArrayList<String> products;

    public ProductList () {
        products = new ArrayList<>();
    }

    public void addProduct(String product) {
        products.add(product);
    }

    public void sortProduct() {
        Collections.sort(products);
        System.out.println("Products sorted.");
    }

  
    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("No products to display.");
        } else {
            System.out.println("products in the list:");
            for (String product : products) {
                System.out.println(products);
            }
        }
    }
}

public class Products {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductList productList = new ProductList();
        int choice;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Name");
            System.out.println("4. Sort Names");
            System.out.println("5. Display Names");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  

            switch (choice) {
                case 1:
                    System.out.print("Enter product to add: ");
                    String addProduct = sc.nextLine();
                    productList.addProduct(addProduct);
                    System.out.println(addProduct + " has been added.");
                    break;

                case 2:
                    productList.sortProduct();
                    break;

                case 5:
                    productList.displayProducts();
                    break;

                case 6:
                    System.out.println("Exiting program.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

