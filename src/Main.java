import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez votre prénom : ");
        String first_name = scanner.nextLine();
        System.out.print("Entrez votre nom de famille : ");
        String last_name = scanner.nextLine();
        System.out.print("Entrez votre âge : ");
        int age = scanner.nextInt();

        Person p1 = new Person(first_name,last_name,age);

        scanner.close();
    }
}