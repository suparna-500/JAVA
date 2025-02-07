
    
import java.util.Scanner;

class Person {
    String name, gender, address;
    int age;
    
    public Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
    
    public void displayPerson() {
        System.out.println("Name: "+name + "\nGender: "+gender+"\nAddress: "+address+"\nAge: "+age);
    }
}

class Employee extends Person {
    int empId;
    String companyName, qualification;
    double salary;
    
    public Employee(String name, String gender, String address, int age, int empId, String companyName, String qualification, double salary) {
        super(name, gender, address, age);
        this.empId = empId;
        this.companyName = companyName;
        this.qualification = qualification;
        this.salary = salary;
    }
    
    public void displayEmployee() {
        displayPerson();
        System.out.println("Employee ID: "+empId + "\nCompany Name: "+companyName +"\nQualification: "+qualification+"\nSalary: "+salary);
    }
    }


class Teacher extends Employee {
    int teacherId;
    String subject, department;
    
    public Teacher(String name, String gender, String address, int age, int empId, String companyName, String qualification, double salary, int teacherId, String subject, String department) {
        super(name, gender, address, age, empId, companyName, qualification, salary);
        this.teacherId = teacherId;
        this.subject = subject;
        this.department = department;
    }
    
    public void displayTeacher() {
        displayEmployee();
        System.out.println("Teacher Id: "+teacherId + " \nSubject:" + subject +"\nDepartment: "+department+"\n-------------------------------------");

        
    }
}

public class TeacherDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        
        Teacher[] teachers = new Teacher[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Teacher " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Gender: ");
            String gender = sc.next();
            System.out.print("Address: ");
            String address = sc.next();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Employee ID: ");
            int empId = sc.nextInt();
            System.out.print("Company Name: ");
            String companyName = sc.next();
            System.out.print("Qualification: ");
            String qualification = sc.next();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            System.out.print("Teacher ID: ");
            int teacherId = sc.nextInt();
            System.out.print("Subject: ");
            String subject = sc.next();
            System.out.print("Department: ");
            String department = sc.next();
            
            teachers[i] = new Teacher(name, gender, address, age, empId, companyName, qualification, salary, teacherId, subject, department);
        }
        
        System.out.println("\nTeacher Details:");
        for (Teacher teacher : teachers) {
            teacher.displayTeacher();
        }
        
        sc.close();
    }
}

