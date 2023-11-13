package services;

import java.util.ArrayList;
import java.util.List;

public class Street implements GeneralManager{
    private List<Family> families;

    public Street() {
        this.families = new ArrayList<>();
    }

    @Override
    public void add(Object family) {
        families.add((Family) family);
    }

    @Override
    public void showAll() {
        for (Family f: families) System.out.println(f);
    }

    @Override
    public Object findById(int id) {
        for (Family f: families) {
            if (f.getHouseNumber() == id) {
                return f;
            }
        }
        return "Not Found";
    }

    @Override
    public void deleteById(int id) {
        families.removeIf(f -> f.getHouseNumber() == id);
    }
    public Object findByPersonNumber(int num){
        for (Family f: families) {
            if (f.getPersonNumber() == num) return f;
        }
        return "Not Found";
    }
}
