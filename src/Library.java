import java.util.ArrayList;
import java.util.Arrays;

public class Library {
    private static ArrayList<ComicBook> comicBooks;
    private static States currentState;

    public static void main(String[] args){
        comicBooks = new ArrayList<>();
        currentState = States.SELECT_ACTIONS;

        comicBooks.add(new ComicBook("The Flash", Arrays.asList("Jay Garrick", "Barry Allen", "Wally West", "Bart Allen", " Avery Ho")));
        comicBooks.add(new ComicBook("The Adventures of Tintin", Arrays.asList("Tintin", "Snowy", "Captain Haddock", "Professor Calculus")));
        comicBooks.add(new ComicBook("The Batman", Arrays.asList("Batman", "Catwoman", "The Penguin", "Jim Gordon", "Alfred Pennyworth")));

        printTheAvailableComicBooks();
    }

    private static void printTheAvailableComicBooks(){
        if(comicBooks == null || comicBooks.size() == 0){
            System.out.println("Sorry, not comic books are currently available");
        }
        else{
            System.out.println("Here are the available comic books:");
            for(int i = 0; i < comicBooks.size(); i++){
                System.out.println(i + ". " + comicBooks.get(i).getComicBookName());
            }
        }
    }
}