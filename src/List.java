import java.awt.*;
import java.util.Locale;

public class List {
    private final String[] listB = new String[37];
    private final String[] listM = new String[37];

    public void addListBItem(String newItem, int itemPos) {
        listB[itemPos] = newItem;
    }
    public void addListMItem(String newItem, int itemPos) {
        listM[itemPos] = newItem;
    }


    public String getItem(String listType, int number) {
        return switch (listType) {
            case "listB" -> listB[number];
            case "listM" -> listM[number];
            default -> "programmier es bitch";
        };
    }

    public String translating(String input){

        String[] translatet = new String[input.length()];

        String finalTranslation = " ";
        String letter = "";

        for (int i = 0; i < input.length(); i++){
            letter = String.valueOf(input.charAt(i));
            for (int k = 0; k < listB.length; k ++){
                if (listB[k].equalsIgnoreCase(letter)){
                    finalTranslation = finalTranslation + listM[k];
                }
            }
            if (letter.equalsIgnoreCase("|")){
                finalTranslation = finalTranslation + "| ";
            }
            else {
                finalTranslation = finalTranslation +" ";
            }
        }
        return finalTranslation;
    }
}
