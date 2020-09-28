import model.Products;
import product.ProductsManage;

import java.util.*;

public class Main {



    public static void display(List<Products> products) {
        Iterator<Products> iterator = products.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        ProductsManage productsManage = new ProductsManage();
        List<Products> products = new ArrayList<>();

        while (choice != 0) {
            System.out.println("Menu: ");
            System.out.println("1. Add a new product");
            System.out.println("2. Update a product");
            System.out.println("3. Delete a product");
            System.out.println("4. Find by Id");
            System.out.println("5. Find by Name");
            System.out.println("6. Find All/Display All");
            System.out.println("0. Exit");

            System.out.println("Enter your choice: ");
            choice = input.nextInt();

                switch (choice) {
                    case 1:

                        System.out.println("-----Add Model. Products-----");
                        System.out.println("Enter an ID: ");
                        int id = input.nextInt();
                        input.nextLine();
                        System.out.println("Enter a Product name: ");
                        String name = input.nextLine();
                        System.out.println("Enter a Price: ");
                        int price = input.nextInt();
                        Products addNew = new Products(id, name, price);
                        productsManage.add(addNew);
                        products = productsManage.findAll();
                        display(products);
                        break;
//
                    case 2:
                        System.out.println("----Edit Model.Products----");
                        System.out.println("Enter an Id: ");
                        int id2 = input.nextInt();
                        input.nextLine();
                        System.out.println("Input a Product name: ");
                        String name2 = input.nextLine();
                        System.out.println("Input price: ");
                        int price2 = input.nextInt();
                        Products editNew = new Products(id2, name2, price2);
                        productsManage.update(id2, editNew);
                        products = productsManage.findAll();
                        display(products);
                        break;
//
                    case 3:
                        System.out.println("Enter an Id: ");
                        int deleteID = input.nextInt();
                        productsManage.delete(deleteID);
                        products = productsManage.findAll();
                        display(products);
                        break;

                    case 4:
                        System.out.println("------Find By Id-----");
                        System.out.println("Enter an Id: ");
                        int findId = input.nextInt();
                        System.out.println(productsManage.findById(findId));
                        break;

                    case 5:
                        System.out.println("------Find By Name------");
                        System.out.println("Enter a Name: ");
                        input.nextLine();
                        String findName = input.nextLine();
                        products = productsManage.findByProductName(findName);
                        display(products);
                        break;

                    case 6:
                        System.out.println("-----Display All-----");
                        products = productsManage.findAll();
                        Collections.sort(products);

                    case 0:
                        System.exit(0);

                    default:
                        throw new IllegalStateException("Unexpected value: " + choice);
                }
            //tạo một đối tượng ProductsManage mới


//            System.out.println("\n-----All Model. Products");
//            Products addNew = new Products(16, "Quat", "3,000,000");
//            productsManage.add(addNew);
//            products = productsManage.findAll();
//            ProductsManage.display(products);

            //test khi them 1 Product co Id bi trung
//            addNew = new Products(16, "Lo nuong", "8,000,000");
//            productsManage.add(addNew);
//            //cap nhat lai danh sach
//            products = productsManage.findAll();
//            ProductsManage.display(products);


//            System.out.println("\n----Edit Model.Products----");
//            System.out.println("Enter an Id: ");
//            Scanner scanner = new Scanner(System.in);
//            int id = scanner.nextInt();
//            System.out.println("Input a Product name: ");
//            Scanner scanner1 = new Scanner(System.in);
//            String name = scanner1.nextLine();
//            System.out.println("Input price: ");
//            Scanner scanner2 = new Scanner(System.in);
//            String price = scanner2.nextLine();
//
//            Products editNew = new Products(id, name, price);
//            productsManage.update(id, editNew);
//            products = productsManage.findAll();
//            ProductsManage.display(products);


//            System.out.println("\n------Find By Id-----");
//            System.out.println("Enter an Id: ");
//            Scanner scanner3 = new Scanner(System.in);
//            int id1 = scanner3.nextInt();
//            productsManage.findById(id1);
        }

    }
}
