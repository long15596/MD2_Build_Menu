package services;

public interface GeneralManager<O, N> {
    void add(O o);
    void showAll();
    O findById(N n);
    void deleteById(N n);
    void edit(N n, O o);
}
