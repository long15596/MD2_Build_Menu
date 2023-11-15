package services;

public interface IManager {
    void showAll();
    void add(Object obj);
    void delete(int id);
    Object findByName(String name);
}
