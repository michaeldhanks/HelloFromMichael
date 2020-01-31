import java.util.Scanner;
public class Testing {
    public static void main(String[] args) {
        System.out.println("Hello, my name is Your name");
        System.out.println("Your name is my name?... We are one");
        Scanner prompt = new Scanner(System.in);
        System.out.println("Who is dumb? ");
        String dumb = prompt.nextLine(); 
        System.out.println("Wrong! You are dumb!");   
    }
}
