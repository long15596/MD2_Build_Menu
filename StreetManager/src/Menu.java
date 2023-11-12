import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Street street = new Street();
    Scanner inputInt = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);
    public void showMainMenu(){
        int choice;
        do {
            System.out.println(
                    "===Menu Khu Phố===\n" +
                    "1. Thêm hộ gia đình\n" +
                    "2. Hiển thị hộ gia đình\n" +
                    "0. Thoát");
            System.out.println("Nhập lựa chọn: ");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    showMenuAddFamily();
                    break;
                case 2:
                    showAllFamily();
                    break;
            }
        } while (choice != 0);
    }
    public void showMenuAddFamily() {
        Family family = new Family();
        street.addFamily(family);
        System.out.println("Bạn đã thêm hộ gia đình thành công có id: " + family.getNumberHouse());
    }
    public void showAllFamily() {
        ArrayList<Family> families = street.getFamilies();
        System.out.println("Danh sách các nhà: ");
        for (int i = 0; i < families.size(); i++) {
            System.out.println(i + 1 + ". Nhà số " + families.get(i).getNumberHouse());
        }
        System.out.println("Chọn nhà muốn vào: ");
        int choice = inputInt.nextInt();
        showMenuPerson(families.get(choice - 1));
    }
    public void showMenuPerson(Family family) {
        int choice;
        do {
            System.out.println("=== Menu của nhà số" + family.getNumberHouse() + "=== \n" +
                    "1. Thêm người \n" +
                    "2. Hiển thị người \n" +
                    "0. Thoát \n");
            System.out.println("Nhập lựa chọn: ");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    menuAddPerson(family);
                    break;
                case 2:
                    showAllPerson(family);
                    break;
            }
        } while (choice != 0);
    }
    public void menuAddPerson(Family family) {
        System.out.println("=== Menu thêm người ===");
        System.out.println("Nhập tên: ");
        String name = inputString.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = inputInt.nextInt();
        Person person = new Person(name,age);
        family.addPerson(person);
        System.out.println("=> Thêm người thành công vào nhà" + family.getNumberHouse());
    }
    public void showAllPerson(Family family) {
        ArrayList<Person> people = family.getPeople();
        System.out.println("Danh sách người trong nhà: ");
        for (Person person: people) {
            System.out.println(person);
        }
    }
}
