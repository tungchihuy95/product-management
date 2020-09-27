package product;

import java.util.List;

public interface IProducts<T> {

    //thêm, sửa, xóa ....
    //tìm theo id
    //tìm theo tên
    //tìm tất cả (hiển thị)

    void add (T object);

    void update(int id, T newObject);

    void delete(int id);

    T findById(int id);

    List<T> findByProductName (String name);

    List<T> findAll();
}
