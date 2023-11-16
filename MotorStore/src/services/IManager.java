package services;

public interface IManager<O, T> {
    void showAll();
    void add(O o);
    void delete(int id);
    O findByName(T n);
}
