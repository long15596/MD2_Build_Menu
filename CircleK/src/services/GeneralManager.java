package services;

public interface GeneralManager<O> {
    void add(O obj);
    void showAll();
    O findById(int id);
    void update(int id);
    void delete(int id);
}
