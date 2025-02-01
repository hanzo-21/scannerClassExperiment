import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class getfile {

    public static LinkedList<String> getNames(String fileName){
        Scanner scanner = null;
        LinkedList<String> names = new LinkedList<>();
        try{
            scanner = new Scanner( new File(fileName));
            String filter ;
            scanner.useDelimiter(",");
            while (scanner.hasNext()){
                filter = scanner.next();
                filter =  filter.trim();
                names.add(filter);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        scanner.close();
        return names;
    }

    public static LinkedList<String> Lines(String fileName){
        Scanner scanner = null;
        LinkedList<String> names = new LinkedList<>();
        try{
            scanner = new Scanner( new File(fileName));
            String filter ;
            scanner.useDelimiter(",");
            while (scanner.hasNext()){
                filter = scanner.nextLine();
                filter =  filter.trim();
                names.add(filter);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        scanner.close();
        return names;
    }
}
