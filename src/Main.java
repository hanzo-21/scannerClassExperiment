import javax.sql.rowset.serial.SerialStruct;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String fileName = "\\D:\\drive\\OneDrive - Everest Engineering College\\skills\\scanner experimant\\testfiel" +
                ".txt";

        LinkedList<String> names = getfile.getNames(fileName);

        System.out.println(names);



    }


}