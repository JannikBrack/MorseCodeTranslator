import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileManager {
    File bList = new File("C:\\Users\\janni\\IdeaProjects\\MorseUbersetzer\\src\\Buchstaben.txt");
    File mList = new File("C:\\Users\\janni\\IdeaProjects\\MorseUbersetzer\\src\\MorseCode.txt");

    public void ReadBFile(List list) throws FileNotFoundException {
        Scanner myReader = new Scanner(bList);

        while (myReader.hasNextLine()) {

            String data = myReader.nextLine();
            String[] dataArray = data.split("#");
            for (int j = 0; j < dataArray.length; j++){
                list.addListBItem(dataArray[j],j);
            }

        }
        myReader.close();
    }
    public void ReadMFile(List list) throws FileNotFoundException {
        Scanner myReader = new Scanner(mList);

        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            String[] dataArray = data.split("#");
            for (int j = 0; j < dataArray.length; j++){
                list.addListMItem(dataArray[j],j);
            }

        }
        myReader.close();
    }

}
