import java.util.ArrayList;
import java.util.List;

public class ComicBook {
    private String name;
    private ArrayList<Character> characters;

    public ComicBook(String name, List<String> characterNames){
        this.name = name;
        this.characters = new ArrayList<>();

        if (characterNames != null && characterNames.size() > 0){
            for(String characterName: characterNames){
                this.characters.add(new Character(characterName));
            }
        }

    }

    public String getComicBookName(){
        return name;
    }

    public Boolean addNewCharacter(String characterName){
        if(!checkIfCharacterAlreadyExist(characterName)){
            characters.add(new Character(characterName));
            return true;
        }
        return false;
    }

    private Boolean checkIfCharacterAlreadyExist(String characterName){
        if (characters != null && characters.size() > 0) {
            for (Character character : characters) {
                if (characterName.equalsIgnoreCase(character.getCharacterName())) {
                    return true;
                }
            }
        }
        return false;
    }

    public String toString(){
        int count = 1;
        String str = "Comic Book Name:" + "\n" + name + "\n";

        str = str + "Characters Included:" + "\n";
        if (characters != null && characters.size() > 0) {
            for (Character character : characters) {
                str = str + Integer.toString(count) + ". " + character + "\n";
            }
        }

        return str;
    }
}