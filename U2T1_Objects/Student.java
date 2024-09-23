package U2T1_Objects;

public class Student {

    private String studentName;
    private String studentSchool;
    private int studentGrade;
    private double studentGpa;
    private String comment;
    public Student(String name, String school, int grade, double gpa) {
        studentName = name;
        studentSchool = school;
        studentGrade = grade;
        studentGpa = gpa;
        if (studentGpa >= 90) {
            comment = "Wow, you are an elite student!";
        }
        else if (gpa >= 80) {
            comment = "Looks like you do well in school";
        }
        else if (gpa >= 70) {
            comment = "Woah! Be careful, you need to work on your grade!";
        }
        else if (gpa >= 65) {
            comment = "Good luck with this grade";
        }
        else {
            comment = "You are lying, right?";
        }
    }
    public void printInfo() {
        System.out.println("Name: " + studentName);
        System.out.println("School: " + studentSchool);
        System.out.println("Grade: " + studentGrade);
        System.out.println("GPA: " + studentGpa);
        System.out.println(comment);
        System.out.println();
    }
}
