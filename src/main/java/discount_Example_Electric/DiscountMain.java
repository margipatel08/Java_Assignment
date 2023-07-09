package discount_Example_Electric;


import java.util.ArrayList;
import java.util.List;


public class DiscountMain {
    public static void main(String[] args) {
        // Create test data
        List<Discount> products = new ArrayList<>();
        products.add(new Discount("TV", "P001", "ELECTRIC", "Smart TV", 500.0));
        products.add(new Discount("Shirt", "P002", "CLOTH", "Men's shirt", 50.0));
        products.add(new Discount("Mobile", "P003", "ELECTRIC", "Smartphone", 800.0));
        products.add(new Discount("Jeans", "P004", "CLOTH", "Men's jeans", 70.0));
        products.add(new Discount("Laptop", "P005", "ELECTRIC", "Notebook", 1000.0));
        products.add(new Discount("Computer", "P006", "ELeCTRIC", "Macbook", 2005.0));

        // Apply discounts using streams and lambda expressions
		/*
		 * products.stream() .filter(p -> p.getCategory().equalsIgnoreCase("Electric"))
		 * .forEach(p -> p.setDiscount(p.getPrice() * 0.1));
		 */
        
        for (Discount product : products) {
            if (product.getCategory().equalsIgnoreCase("Electric")) {
                product.setDiscount(product.getPrice() * 0.1);
            }
        }

        products.stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("Cloth"))
                .forEach(p -> p.setDiscount(p.getPrice() * 0.2));

        // Calculate final amount
        double finalAmount = products.stream()
                .mapToDouble(p -> p.getPrice() - p.getDiscount())
                .sum();

        // Print the products with discounts
        products.forEach(System.out::println);

        // Print the final amount to pay by the customer
        System.out.println("Final amount: " + finalAmount);
    }
}
