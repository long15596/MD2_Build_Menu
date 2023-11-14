package models;

public class RoomB extends Room{
    public RoomB() {
        super("B", 300);
    }

    @Override
    public String toString() {
        return "Room\n" +
                "Category: " + getCategory() + "\n" +
                "Priced: " + getPrice();
    }
}
