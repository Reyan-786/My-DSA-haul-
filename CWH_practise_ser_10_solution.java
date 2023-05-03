class circle{
    int radius;
    circle(){
        System.out.println("helo");
    }
public int  getRadius(){
    return radius;
}
public void setRadius(int a){
    this.radius=a;
}
}
class cylinder extends circle{
    int height ;
}
public class CWH_practise_ser_10_solution {
    public static void main(String[] args) {
        circle c = new circle();
        // c.setRadius(10);
        // int d = c.getRadius();
        // System.out.println(d);
    }
    
}
