public class event_clash_detect {
    public static void main(String[] args) {
        String[] event1={"2:00","5:00"};
    String [] event2={"1:00","3:00"};
    int c1= event2[1].compareTo(event1[0]);
    int c2=event2[0].compareTo(event1[1]);
    System.out.println(c1);
    boolean ans= (c1<=0 && c2>=0);
    if(true){
        System.out.println("yes");
    }
    else {
        System.out.println("false ");
    }
    }    
}
