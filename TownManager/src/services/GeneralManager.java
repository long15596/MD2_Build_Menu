package services;

public interface GeneralManager<T> {
    void add(T t);
    void showAll();
    Object findById(int id);
    void deleteById (int id);
}
