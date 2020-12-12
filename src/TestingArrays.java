import impl.MyArrayList;
import intf.MyList;

public class TestingArrays {
    public static void main(String[] args) {
        MyList<Student> listOfStudents = new MyArrayList<>();
        listOfStudents.add(new Student(15, "Michael"));
        listOfStudents.add(new Student(25, "Ilui"));
        listOfStudents.add(new Student(13, "Goroh"));
        listOfStudents.add(new Student(1, "Backy"));
        listOfStudents.add(new Student(2, "Sanda"));
        listOfStudents.add(new Student(123, "Elan"));
        listOfStudents.add(new Student(6, "Baclan"));
        listOfStudents.add(new Student(17, "Mesut"));
        listOfStudents.add(new Student(898, "Sasut"));
        listOfStudents.add(new Student(321, "Ozkan"));
        listOfStudents.add(new Student(432, "Owlablablaba"));
        listOfStudents.add(new Student(321, "Hiuri"));
        System.out.println(listOfStudents);
        System.out.println("The size of array is " + listOfStudents.size());
    }
}
