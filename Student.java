import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    int rollNo,admno;
    String name;
    Student(String name,int rollNo,int admno){
        this.name = name;
        this.rollNo = rollNo;
        this.admno = admno;
    }
    public static void main(String[] args) {
        ArrayList<Student> studarry = new ArrayList<Student>();
        boolean flag = true;
        while (flag) {
            System.out.println("***MENU***\n" +
                    "Enter Option:\n" +
                    "1.Add Student \n" +
                    "2.View all Students \n" +
                    "3.Search Student \n" +
                    "4.Delete Student \n" +
                    "0.Exit");
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter student name:");
                    String name = sc.next();
                    System.out.println("Enter roll no:");
                    int rollNo = sc.nextInt();
                    System.out.println("Enter admno");
                    int admno = sc.nextInt();
                    Student s = new Student(name,rollNo,admno);
                    studarry.add(s);
                    break;
                case 2:
                    for (Student stud:studarry) {
                        System.out.println(stud.name);
                        System.out.println(stud.admno);
                        System.out.println(stud.rollNo);
                    }
                    break;
                case 3:
                    System.out.println("Enter the student Admno");
                    int stid = sc.nextInt();
                    boolean value = false;
                    for (Student st : studarry) {
                        if (stid == st.admno){
                            value = true;
                            System.out.println(st.name);
                            System.out.println(st.rollNo);
                            break;
                        }
                    }
                    if(!value){
                        System.out.println("Not found");
                    }
                    break;
                case 4:
                    System.out.println("Enter the Student admno:");
                    int admiss = sc.nextInt();
                    for (Student st : studarry){
                        if (admiss == st.admno){
                            studarry.remove(st);
                            break;
                        }
                    }
                    break;
                case 0:
                    flag = false;
                default:
                    System.out.println("Invalid option");

            }
        }
    }
}
