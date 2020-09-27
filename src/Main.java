import model.Products;
import product.ProductsManage;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        //tạo một đối tượng ProductsManage mới
        ProductsManage productsManage = new ProductsManage();

        System.out.println("----Find All-----");
        List<Products> products = new ArrayList<>();
        products = productsManage.findAll();
        ProductsManage.display(products);

        System.out.println("\n-----All Model. Products");
        Products addNew = new Products(16, "Quat", "3,000,000");
        productsManage.add(addNew);
        products = productsManage.findAll();
        ProductsManage.display(products);

        //test khi them 1 Product co Id bi trung
        addNew = new Products(16, "Lo nuong", "8,000,000");
        productsManage.add(addNew);
        //cap nhat lai danh sach
        products = productsManage.findAll();
        ProductsManage.display(products);


        System.out.println("\n----Edit Model.Products----");
        System.out.println("Enter an Id: ");
        Scanner scanner =  new Scanner(System.in);
        int id = scanner.nextInt();
        System.out.println("Input a Product name: ");
        Scanner scanner1 = new Scanner(System.in);
        String name = scanner1.nextLine();
        System.out.println("Input price: ");
        Scanner scanner2 = new Scanner(System.in);
        String price = scanner2.nextLine();

        Products editNew = new Products(id, name, price);
        productsManage.update(id, editNew);
        products = productsManage.findAll();
        ProductsManage.display(products);


        System.out.println("\n------Find By Id-----");
        System.out.println("Enter an Id: ");
        Scanner scanner3 = new Scanner(System.in);
        int id1 = scanner3.nextInt();
        productsManage.findById(id1);
    }


}
