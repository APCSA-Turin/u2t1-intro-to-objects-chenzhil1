package U2T1_Objects;

public class StudentRunner {
    public static void main(String[] args) {
        Student stu1 = new Student("Jack", "BTHS", 11, 95.4);
        Student stu2 = new Student("John", "BTHS", 9, 85.6);
        stu1.printInfo();
        stu2.printInfo();
    }
}
