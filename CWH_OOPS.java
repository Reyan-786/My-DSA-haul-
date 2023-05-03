class Employee{
int salary;
String name;
public void Getsalary(){
    System.out.println(salary);
}
public void Getname(){
    System.out.println(name);
}
public void Changename( String Changed){
    name=Changed;
    System.out.println(name);
    // return name;
}
}
public class CWH_OOPS {
public static void main(String[] args) {
//    Employee Rehan=new Employee();
//    Rehan.salary=999999999;
//    Rehan.name="Rehan";
//    Rehan.Getsalary();
//    Rehan.Getname();
   Employee harry= new Employee();
   harry.name="CWH";
   harry.Getname(); 

   harry.Changename("Code With Harry");
   harry.Getname(); 
//    harry.Changename("Reyan");
   harry.Getname(); 
   

}    
}
