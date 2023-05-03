import java.util.*;
class Library{
   public String [] books;
    int no_of_books;

    Library(){
        this.books=  new String[100];
        this.no_of_books=0;
    }
    void addbook(String book){
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println("Books Has been Added.....");
    }
    void showBooks(){
        System.out.println("Available Books Are:");
        
        for (String book:books){

            if (book==null){
                continue;
            }

            else {
                System.out.println("*"+book);

            }
        }
    }
    void IssueBook(String book){
        for (int i=0;i<books.length;i++){
            if (books[i].equals(book)){
                System.out.println("book has been issued!");
                books[i]=null;
                return;
            }
            else {
                System.out.println("book not found");
            }
        }
    }
    void returnBook(String book){
        addbook(book);
    }
}
public class CWH_Exercise_4_Solution_Online_Library {
    public static void main(String[] args) {
        Library l= new Library();
        l.addbook("RICH DAD POOR DAD");
        l.addbook("AI TOOLS");
        l.addbook("DATA ANALYTICS");
        l.addbook("DSA");
        l.addbook("NEURAL NETWORKS");
        l.IssueBook("AI TOOLS");
        
        // l.IssueBook("ABC++");

        l.showBooks();  
        l.returnBook("AI TOOLS");
        l.showBooks();

        

    }
}
