package product;

import model.Products;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductsManage implements IProducts<Products> {

    static List<Products> products;

    static {
        //Tạo một list có sẵn các đối tượng
        products = new ArrayList<>();
        //add các đối tượng mới
        products.add(new Products(11, "TV", "20,000,000"));
        products.add(new Products(12, "Tu lanh", "35,000,000"));
        products.add(new Products(13, "May giat", "11,000,000"));
        products.add(new Products(14, "Dieu hoa", "8,000,000"));
        products.add(new Products(15, "Lo vi song", "5,000,000"));
    }
    @Override
    public void add(Products object) {
        boolean flag = true;
        for (int i = 0; i < products.size(); i++) {
            if (object.getId() == products.get(i).getId()) {
                flag = false;
                break;
            }
        }
        if (flag)
            products.add(object);
    }

    @Override
    public void update(int id, Products newObject) {
        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()){
                products.set(id, newObject);
            }
        }
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < products.size(); i++){
            if (id == products.get(i).getId()) {
                products.remove(i);
            }
        }
    }

    @Override
    public Products findById(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()) {
                return products.get(i);
            }
        }
        return null;
    }

    @Override
    public List<Products> findByProductName(String name) {
        //tao ra List de luu cac doi tuong co the trung lap
        List<Products> productsList = new ArrayList<>();
        for (int i = 0; i < products.size(); i++ ) {
            if (name == products.get(i).getName()) {
                productsList.add(products.get(i));
            }
        }
        return productsList;
    }

    @Override
    public List<Products> findAll() {
        List<Products> productsList = new ArrayList<>();
        Iterator<Products> iterator = products.iterator();
        while (iterator.hasNext()) {
            productsList.add(iterator.next());
        }
        return productsList;
    }

    public static void display(List<Products> products) {
        Iterator<Products> iterator = products.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
