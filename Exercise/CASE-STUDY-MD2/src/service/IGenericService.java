package service;

import java.util.List;

public interface IGenericService<T> {
    List<T> findAll();
    T findById(int id);
    void save(T t);
    void  deleteById(int id);
    void  editById(int id);

    void dispById(int id);
    void dispAll();
}
