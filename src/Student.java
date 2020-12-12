import java.util.Objects;

public class Student {
    private int id;
    private String name_surename;

    public Student(int id, String name_surename) {
        this.id = id;
        this.name_surename = name_surename;
    }

    public Student() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                Objects.equals(name_surename, student.name_surename);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name_surename);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name_surename='" + name_surename + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName_surename() {
        return name_surename;
    }

    public void setName_surename(String name_surename) {
        this.name_surename = name_surename;
    }
}
