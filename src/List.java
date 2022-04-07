public class List {
    private final String[] listB = new String[37];
    private final String[] listM = new String[37];

    public void addListBItem(String newItem, int itemPos) {
        listB[itemPos] = newItem;
    }
    public void addListMItem(String newItem, int itemPos) {
        listM[itemPos] = newItem;
    }

    public String translating(String input){

        StringBuilder finalTranslation = new StringBuilder(" ");
        String letter;

        for (int i = 0; i < input.length(); i++){
            letter = String.valueOf(input.charAt(i));
            for (int k = 0; k < listB.length; k ++){
                if (listB[k].equalsIgnoreCase(letter)){
                    finalTranslation.append(listM[k]);
                }
            }
            if (letter.equalsIgnoreCase("|")){
                finalTranslation.append("| ");
            }
            else {
                finalTranslation.append(" ");
            }
        }
        return finalTranslation.toString();
    }
}
