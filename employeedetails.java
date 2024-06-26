import java.util.Scanner;
class Employee{
    int id;
    String name;
    int age;
    String position;
    Employee(int id,String name,int age,String position){
        this.id=id;
        this.name=name;
        this.age=age;
        this.position=position;
    }
    void display(){
        System.out.println("id:"+id);
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("position:"+position);
    }

}
public class employeedetails {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("the number of employee:");
        int n=sc.nextInt();

        Employee[] e=new Employee[n];

        for(int i=0;i<n;i++){
            System.out.println(" enter id of"+(i+1)+":");
            int id=sc.nextInt();
            sc.nextLine();
            System.out.println("enter name"+(i+1)+":");
            String name=sc.nextLine();
            System.out.println("enter age"+(i+1)+":");
            int age=sc.nextInt();
            sc.nextLine();
            System.out.println("enter position"+(i+1)+":");
            String pos=sc.nextLine();
            e[i]=new Employee(id,name,age,pos);

        }
        System.out.println(" enter id ");
        int searchid=sc.nextInt();
        for(int i=0;i<n;i++){
            if(e[i].id==searchid){
                e[i].display();
            }
        } 


    }
    
}
