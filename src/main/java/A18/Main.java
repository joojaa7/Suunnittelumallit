package A18;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        ArrayList<Recommendation> recs = new ArrayList<>();

        Recommendation adult = new Recommendation("Adult");
        Book nineteenninetyfour = new Book("Geroge Orwell", "1984", "Generic book example");
        Book heat = new Book("Mike Lupica", "Heat", "Not for adults");
        adult.addBook(nineteenninetyfour);
        adult.addBook(heat);

        Recommendation kid = new Recommendation("Kid");
        Book moomin = new Book("Tove Jansson", "Moomin", "Kids");
        Book donaldDuck = new Book("Mickey Mouse", "Donald Duck", "Kids");
        kid.addBook(moomin);
        kid.addBook(donaldDuck);

        recs.add(adult);
        recs.add(kid);

        System.out.println("Here are our book recommendations");
        System.out.println(adult);
        System.out.println(kid);

        String input = "";

        while (!input.equalsIgnoreCase("q")){
            System.out.println("What would you like to do?");
            System.out.println("1. Create a new recommendation from an existing source");
            System.out.println("2. Delete from an existing recommendation.");
            System.out.println("3. Add a book and add it to a recommendation.");
            System.out.println("4. See all recommendations.");
            System.out.println("5. Create a new recommendation.");
            System.out.println("Q to quit.");
            input = scanner.nextLine();
            switch (input){
                case "1":
                    for (int i = 0; i < recs.size(); i++){
                        System.out.println((i + 1) + ". " + recs.get(i));
                    }
                    System.out.println("Select a collection.");
                    int selection = Integer.parseInt(scanner.nextLine()) - 1;
                    Recommendation cloned = recs.get(selection).clone();
                    System.out.println("Input book title to add: ");
                    String title = scanner.nextLine();
                    System.out.println("Input book author to add: ");
                    String author = scanner.nextLine();
                    System.out.println("Input book genre to add: ");
                    String genre = scanner.nextLine();
                    Book book = new Book(author, title, genre);
                    cloned.addBook(book);
                    recs.add(cloned);
                    System.out.println("Book added successfully.");
                    System.out.println(cloned);
                    break;
                case "2":
                    for (int i = 0; i < recs.size(); i++){
                        System.out.println((i + 1) + ". " + recs.get(i));
                    }
                    System.out.println("Select a collection.");
                    int selectionCaseTwo = Integer.parseInt(scanner.nextLine()) - 1;
                    Recommendation recToMod = recs.get(selectionCaseTwo);
                    for (int i = 0; i < recToMod.getBooks().size(); i++){
                        System.out.println((i + 1) + ". " + recToMod.getBooks().get(i).toString());
                    }
                    System.out.println("Select a book to remove");
                    int selectedBook = Integer.parseInt(scanner.nextLine());
                    recToMod.deleteBook(selectedBook);
                    System.out.println("Book removed.");
                    break;
                case "3":
                    for (int i = 0; i < recs.size(); i++){
                        System.out.println((i + 1) + ". " + recs.get(i));
                    }
                    System.out.println("Select a collection.");
                    for (int i = 0; i < recs.size(); i++){
                        System.out.println((i + 1) + ". " + recs.get(i));
                    }
                    int selectionCaseThree = Integer.parseInt(scanner.nextLine()) - 1;
                    Recommendation recToModThree = recs.get(selectionCaseThree);
                    System.out.println("Input book title to add: ");
                    String title3 = scanner.nextLine();
                    System.out.println("Input book author to add: ");
                    String author3 = scanner.nextLine();
                    System.out.println("Input book genre to add: ");
                    String genre3 = scanner.nextLine();
                    Book book3 = new Book(author3, title3, genre3);
                    recToModThree.addBook(book3);
                    break;
                case "4":
                    for (int i = 0; i < recs.size(); i++){
                        System.out.println((i + 1) + ". " + recs.get(i));
                    }
                    break;
                case "5":
                    System.out.println("Enter collection target audience: ");
                    String recName = scanner.nextLine();
                    Recommendation createdRec = new Recommendation(recName);
                    recs.add(createdRec);
                    for (int i = 0; i < recs.size(); i++){
                        System.out.println((i + 1) + ". " + recs.get(i));
                    }
                    break;
                default:
                    System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            }
        }



    }

}
