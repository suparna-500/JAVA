import java.util.Scanner;
class Cpu{
    int price;
    public Cpu(int price){
        this.price=price;
    }
    public void displaycpu(){
        System.out.println("price of cpu is: "+ price);
    }
class Processor{
    int cores;
    String manufacturer;
    public  Processor(int c,String ma)
    {
        cores=c;
        manufacturer=ma;
    }
    public void display(){
        System.out.println(" cores: "+cores+ " Manufactures: "+manufacturer);

    }
}
    static class Ram{
        String memory;
        String manufactured;
        public Ram(String m,String m1){
            memory=m;
            manufactured=m1;
        }
        public void displayram(){
            System.out.println(" Memory: "+ memory+"manufactured by: "+manufactured);
        }
    }
}

public class CpuDemo{
    public static void main(String[]args){
        Cpu c=new Cpu(1000);
        Cpu.Processor p=c.new Processor(3,"Intel");
        Cpu.Ram r=new Cpu .Ram("16GB","asus");
        c.displaycpu();
        p.display();
        r.displayram();
    
    }
} 