package service;

import java.util.List;

<<<<<<< HEAD
public interface IGenericService<T> {
    List<T> findAll();
    T findById(int id);
    void save(T t);
    void  deleteById(int id);
    void  editById(int id);

    void dispById(int id);
    void dispAll();
=======
public interface IGenericService <T>{

    void save(T t);

    void edit (int index, T t);

    boolean delete (String id, T t);

    List<T> findAll();
    T findById (String id);

    void displayById(String id);
    void displayALl();
>>>>>>> 6ba14ee (Exercise)
}
