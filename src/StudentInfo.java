// https://github.com/kearanathan/COSC113_27.git

public class StudentInfo {

    String FN;
    String LN;
    int Std;
    double CGP;

    public static void main(String[] args) {

        StudentInfo student1;
        StudentInfo student2;

        student1 = new StudentInfo();
        student2 = new StudentInfo();

        student1.FN = "John";
        student1.LN = "Smith";
        student1.Std = 12345;
        student1.CGP = 3.50;

        student2.FN = "Jane";
        student2.LN = "Doe";
        student2.Std = 67890;
        student2.CGP = 3.80;

        System.out.println("Student 1");
        System.out.println("First Name: " + student1.FN);
        System.out.println("Last Name: " + student1.LN);
        System.out.println("Student ID: " + student1.Std);
        System.out.println("GPA: " + student1.CGP);

        System.out.println();

        System.out.println("Student 2");
        System.out.println("First Name: " + student2.FN);
        System.out.println("Last Name: " + student2.LN);
        System.out.println("Student ID: " + student2.Std);
        System.out.println("GPA: " + student2.CGP);
    }
}