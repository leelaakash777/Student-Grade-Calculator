import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> studentList= new ArrayList<>();
        System.out.println("==================================");
        System.out.println("   STUDENT GRADE CALCULATOR");
        System.out.println("==================================");

        String choice = "yes";
        while(choice.equalsIgnoreCase("yes"))
        {
            System.out.print("Enter Student Name:");
            String name=sc.nextLine();
            int[] marks = new int[5];
            String[] subjects={"Maths", "Physics", "Chemistry", "English", "Computer"};
            for(int i=0;i<5;i++){
                System.out.print("Enter marks for "+subjects[i]+" (out of 100): ");
                int mar=sc.nextInt();
                if(mar>100) {
                    System.out.println("You entered the marks of "+mar+" it is not valid so please enter any one ");
                    mar= sc.nextInt();
                }
                marks[i]=mar;
                sc.nextLine();
            }
            Student student = new Student(name,marks);
            studentList.add(student);

            System.out.println("\nResult saved successfully");
            student.displayResult(); 
            System.out.print("\nAdd another student? (yes/no): ");
            choice = sc.nextLine();
        }
        System.out.println("\n====== ALL STUDENTS REPORT ======");
        for (Student s : studentList) {
            s.displayResult();
        }

        System.out.println("Total Students Entered: " + studentList.size());
        System.out.println("Thank you for using Student Grade Calculator!");

        sc.close();
    }
}