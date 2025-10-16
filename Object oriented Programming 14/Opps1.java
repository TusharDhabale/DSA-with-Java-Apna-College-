public class Opps1 {

    public static void main(String args[]) {
        Student s1 = new Student();
        Student s2 = new Student("Tushar");
        Student s3 = new Student(124);
        // Student s4 = new Student("Tushar", 567);
    }
}
class Student {
    String name;
    int roll;

    Student() {
        System.out.println("constructor is called..");
    }
    Student(String name){
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;
    }
}