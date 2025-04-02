package Collection;

public class Learner implements Comparable<Learner> {
    int id;
    String name;
    int marks;
    int rank;

    public Learner(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int compareTo(Learner other) {
        // Sort by marks in descending order
        return Integer.compare(other.marks, this.marks);
    }

    
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Marks: " + marks + ", Rank: " + rank;
    }
}

