import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        List list = new List();
        FileManager fileManager = new FileManager();
        new Frame(list);
        fileManager.ReadBFile(list);
        fileManager.ReadMFile(list);
    }
}
