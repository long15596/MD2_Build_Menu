package services;

public interface GeneralManager {
    void add(Object object);

    void showAll();

    Object findById(int id);

    void deleteById(int id);
}
