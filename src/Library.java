import com.sun.org.apache.bcel.internal.generic.SWITCH;

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

        switch(currentState){
            case SELECT_ACTIONS:
                System.out.println("Select actions");
                break;
            case SHOW_AVAILABLE_COMIC_BOOKS:
                System.out.println("SHOW_AVAILABLE_COMIC_BOOKS");
                break;
            case SHOW_COMIC_BOOK_CHARACTERS:
                System.out.println("SHOW_COMIC_BOOK_CHARACTERS");
                break;
            case ADD_COMIC_BOOK:
                System.out.println("ADD_COMIC_BOOK");
                break;
            case DELETE_COMIC_BOOK:
                System.out.println("DELETE_COMIC_BOOK");
                break;
            default:
                System.out.println("Sorry, the option you have entered is invalid");
                break;
        }
    }

    private static void handleSelectActions(){
        System.out.println("Welcome to the comic book library. Please choose from the following options ():");
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