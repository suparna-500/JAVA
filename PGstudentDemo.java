import java.util.Scanner;
interface showable{
    void show();
}
class Person{
    String name,gender;
    int phoneno;
    

    public Person(String name,String gender,int phoneno){
        this.name=name;
        this.gender=gender;
        this.phoneno=phoneno;
    } 
    public void show(){
        System.out.println(" Name: "+ name + " Gender: " + gender + " Phoneno: " + phoneno);
    }
}
class Student extends Person implements showable{
        String course;
        int score;
        public Student(String course,int score,String name,String gender,int phoneno){
            super(name,gender,phoneno);
            this.course=course;
            this.score=score;
        }
        public void show(){
            super.show();
            System.out.println("course:" + course + " score:" + score);
        }  
    }
    
    class PGStudent extends Student implements showable{
        String researchArea,guide;
         public PGStudent(String researchArea,String guide,String course, int score,String name,String gender,int phoneno){
            super(course,score,name,gender,phoneno);
            this.researchArea=researchArea;
            this.guide=guide;
         }

    public void show(){
        super.show();
        System.out.println("Research Area:" + researchArea + " Guide:" + guide);
    }
}
        
public class PGstudentDemo{

    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of pg students:");
    int n=sc.nextInt();
    sc.nextLine();

    PGStudent[] students=new PGStudent[n];
    for(int i=0;i<n;i++){
        System.out.println("Enter details of student "+(i+1));
        System.out.print("Name: ");
        String name=sc.nextLine();
        System.out.print("Gender:");
        String gender=sc.nextLine();
        System.out.print("Phone:");
        int phoneno=sc.nextInt();
        sc.nextLine();
        System.out.print("Course:");
        String course=sc.nextLine();
        System.out.print("Score:");
        int score=sc.nextInt();
        sc.nextLine();
        System.out.print("Research Area:");
        String researchArea=sc.nextLine();
        System.out.print("Guide:");
        String guide=sc.nextLine();


        students[i]=new PGStudent(researchArea,guide,course,score,name,gender,phoneno);
    }
    for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            if(students[i].researchArea.compareTo(students[j].researchArea)>0){
                PGStudent temp=students[i];
                students[i]=students[j];
                students[j]=temp;
            }
            else if(students[i].researchArea.equals(students[j].researchArea)){
            if (students[i].score<students[j].score){
                PGStudent temp=students[i];
                students[i]=students[j];
                students[j]=temp;
            }
        }
    }
}
    System.out.println("\n PG students sorted by Research area and score:");
    for(PGStudent student:students){
        student.show();
        System.out.println("-------------------------------------");

    }
    sc.close();
    }
}

