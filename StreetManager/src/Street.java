import java.util.ArrayList;

public class Street {
    private int id;
    private ArrayList<Family> families = new ArrayList<>();
    public void addFamily(Family family) {
        this.families.add(family);
    }
    public ArrayList<Family> getFamilies(){
        return this.families;
    }

}
