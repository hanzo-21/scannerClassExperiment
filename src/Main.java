import javax.sql.rowset.serial.SerialStruct;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = null;
        LinkedList<String> names = new LinkedList<>();
        String fileName = "\\D:\\drive\\OneDrive - Everest Engineering College\\skills\\scanner experimant\\testfiel" +
                ".txt";

        try{
            scanner = new Scanner( new File(fileName));
            String filter ;
            scanner.useDelimiter(",");


            while (scanner.hasNext()){
                filter = scanner.next();
                filter =  filter.trim();
                names.add(filter);


            }
            System.out.println(names);


        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        scanner.close();



    }


}