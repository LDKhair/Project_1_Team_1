package DAO;

import java.util.ArrayList;

public interface DAO <T>{
    public void insert(T t);
    public void update(T t);
    public void delete(String string);
    public ArrayList<T> select();
    public T findByID(String string);
}
