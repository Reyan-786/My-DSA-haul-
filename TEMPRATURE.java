public class temprature{
    public static void main(String[] args){
        System.out.println("Give the temprature in celcius");
        Scanner scanner= new Scanner(System.in);
        double celcius= scanner.nextDouble();
        double farhenheit=9.0/5.0 * celcius +32.0;
        System.out.println("Farhenheit"+farhenheit);

    }
}