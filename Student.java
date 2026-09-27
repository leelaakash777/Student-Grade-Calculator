public class Student {
    String name;
    int[] marks;
    int total;
    double percentage;
    String grade;
    Student(String name, int[] marks)
    {
        this.name=name;
        this.marks=marks;
        this.total=calculateTotal();
        this.percentage=calculatePercentage();
        this.grade=calculateGrade();
    }
    int calculateTotal()
    {
        int sum=0;
        for(int mark : marks){
            sum+=mark;
        }
        return sum;
    }
    double calculatePercentage(){
        return (total/500.0)*100;
    }
    String calculateGrade(){
        if(percentage>=90) return "A+";
        else if(percentage>=80) return "A";
        else if(percentage>=70) return "B";
        else if(percentage>=60) return "C";
        else if(percentage>=50) return "D";
        else return "F - Fail";
    }
    void displayResult() {
        System.out.println("==================================");
        System.out.println("Student Name  : " + name);
        System.out.println("Marks         : ");
        String[] subjects = {"Maths", "Physics", "Chemistry", "English", "Computer"};
        for (int i = 0; i < marks.length; i++) {
            System.out.println("  " + subjects[i] + " : " + marks[i]);
        }
        System.out.println("Total         : " + total + " / 500");
        System.out.println("Percentage    : " + percentage + " %");
        System.out.println("Grade         : " + grade);
        System.out.println("==================================");
    }
}