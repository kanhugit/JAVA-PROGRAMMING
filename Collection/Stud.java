package Collection;

public class Stud {
    int id;
    String name;
    Double marks; // Use `Double` instead of `double` to allow `compareTo()`.

    public Stud(int id, String name, Double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "\nStud [id=" + id + ", name=" + name + ", marks=" + marks + "]";
    }
}

