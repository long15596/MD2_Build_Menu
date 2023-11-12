public class Person {
    private int id;
    private String name;
    private int age;
    private static int idIncrement = 1;

    public Person(String name, int age) {
        this.id = idIncrement;
        this.name = name;
        this.age = age;
        idIncrement++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Thành viên có id: " + id +
                ", tên: '" + name + '\'' +
                ", tuổi" + age;
    }
}
