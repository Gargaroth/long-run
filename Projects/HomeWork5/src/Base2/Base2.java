package Base2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Base2 {
    public static void main(String[] args) throws IOException {
        FinancialRecord financialRecord = new FinancialRecord(500, 300);

        String fileName = "F:\\JAVA\\Projects\\HomeWork5\\src\\Base2\\report.txt";
        FileWriter fileWriter = new FileWriter(fileName);

        fileWriter.write("Доходы = " + (financialRecord.getIncomes()));
        fileWriter.write(" Расходы = " + (financialRecord.getOutcomes()));

        fileWriter.close();


    }

}
