package models;

public class RoomC extends Room{
    public RoomC() {
        super("C", 100);
    }

    @Override
    public String toString() {
        return "Room\n" +
                "Category: " + getCategory() + "\n" +
                "Priced: " + getPrice();
    }
}
