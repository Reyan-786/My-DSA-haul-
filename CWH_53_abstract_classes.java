abstract class parent2{
    void sayhello(){
        System.out.println("Good Morning!");
    }
    abstract void greet();
    abstract void Greetings();
   
}
class child2 extends parent2{
void greet(){
    System.out.println("hello Reyan");
}
void Greetings(){
    System.out.println("How are You!");
}
}
class child3 extends parent2{
     void greet(){
         System.out.println("hi");
     }
     void Greetings(){
         System.out.println("Hi i am a greeting constructor");
     }

}

public class CWH_53_abstract_classes{
    public static void main(String[] args) { 
        child2 c= new child2();
        c.Greetings();
        
        
    }
}
