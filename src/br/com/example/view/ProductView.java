package br.com.example.view;

import java.util.Scanner;

import br.com.example.model.Product;

public class ProductView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type the product name");
        String name = sc.next() + sc.nextLine();
        System.out.println("Type the product price");
        double price = sc.nextDouble();

        Product product = new Product(name, price);

        System.out.println("Chose a discount type:" +
                "\n1-Discount in dollars" +
                "\n2-Percentage" +
                "\n3-Coupon" +
                "\n4-Custom value");
        int op = sc.nextInt();

        switch(op) {
            case 1:
                System.out.println("Type the discount value:");
                double discount = sc.nextDouble();
                System.out.println("Value with discount: " + product.calculateDiscount(discount));
                break;
            case 2:
                System.out.println("Type a percentage value: ");
                int percentage = sc.nextInt();
                System.out.println("Value with discount: " + product.calculateDiscount(percentage));
                break;
            case 3:
                System.out.println("Type a coupon discount");
                String coupon = sc.next() + sc.nextLine();
                System.out.println("The value with discount is: " + product.calculateDiscount(coupon));
                break;
            default:
                System.out.println("Invalid option. Try again.");
            }
            sc.close();
        }

    }

