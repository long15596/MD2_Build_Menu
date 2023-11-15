package services;

public interface GeneralManager {
    void add(Object o);
    void showAll();
    Object findById(int id);
    void deleteById(int id);
}
