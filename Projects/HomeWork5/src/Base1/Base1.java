package Base1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Base1 {
    public static void main(String[] args) throws IOException {
        String fileName = "F:\\JAVA\\Projects\\HomeWork5\\src\\Base1\\my_first_file.txt";
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String result = "";
        while (reader.ready()){
            String line = reader.readLine();
            result += line + " ";
        }
        System.out.println(result);
        reader.close();



    }
}
