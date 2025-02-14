import java.util.Scanner;
interface showable{
    void show();
}
class Person{
    string name,gender;
    int phoneno;
    

    public Person(string name,string gender,int phoneno){
        this.name=name;
        this.gender=gender;
        this.phoneno=phoneno;
    }
    class Student extends Person implements showable{
        string course;
        int score;
        Student(string course,int score){
            this.course=course;
            this.score=score;
        }
        @Override
        public void show(){
            System.out.println("Name: "+name+" Gender: "+gender+" Phone No: "+phoneno+ " Course "+ course + "score" + score);
        }
    }
    class PGStudent extends Student implements showable{
        string researchArea,guide;
        PGStudent(string researchArea,string guide){
            this.researchArea=researchArea;
            this.guide=guide;

    }
    @override
    public void show(){
        System.out.println("Reasercharea: "+researchArea+" Guide: "+guide);
    }


}
public class PersonDemo{

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter name:");
    String name=sc.nextLine();
    System.out.println("Enter gender:");
    String gender=sc.nextLine();
    System.out.println("Enter phone no:");
    int phoneno=sc.nextInt();
    Person p=new Person(name,gender,phoneno);


}
}
}