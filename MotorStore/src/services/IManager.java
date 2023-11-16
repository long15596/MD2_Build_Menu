package services;

public interface IManager<O, T, N> {
    void showAll();
    void add(O o);
    void delete(N i);
    O findByName(T n);
}
