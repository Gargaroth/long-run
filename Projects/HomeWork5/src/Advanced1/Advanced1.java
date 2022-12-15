package Advanced1;

import javax.imageio.IIOException;
import java.io.*;
import java.util.Random;

public class Advanced1 {
    public static void main(String[] args) throws IOException {

        Random number = new Random();
        String fileName = "F:\\JAVA\\Projects\\HomeWork5\\src\\Advanced1\\report_2.txt";

        FinancialRecord financialRecord1 = new FinancialRecord(number.nextInt(1,10000), number.nextInt(1,10000));
        FinancialRecord financialRecord2 = new FinancialRecord(number.nextInt(1,10000), number.nextInt(1,10000));
        FinancialRecord financialRecord3 = new FinancialRecord(number.nextInt(1,10000), number.nextInt(1,10000));
        FinancialRecord financialRecord4 = new FinancialRecord(number.nextInt(1,10000), number.nextInt(1,10000));
        FinancialRecord financialRecord5 = new FinancialRecord(number.nextInt(1,10000), number.nextInt(1,10000));
        FinancialRecord financialRecord6 = new FinancialRecord(number.nextInt(1,10000), number.nextInt(1,10000));
        FinancialRecord financialRecord7 = new FinancialRecord(number.nextInt(1,10000), number.nextInt(1,10000));
        FinancialRecord financialRecord8 = new FinancialRecord(number.nextInt(1,10000), number.nextInt(1,10000));
        FinancialRecord financialRecord9 = new FinancialRecord(number.nextInt(1,10000), number.nextInt(1,10000));
        FinancialRecord financialRecord10 = new FinancialRecord(number.nextInt(1,10000), number.nextInt(1,10000));


        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName));

        FinancialRecord[] records = new FinancialRecord[] {financialRecord1,financialRecord2,financialRecord3,financialRecord4,financialRecord5,financialRecord6,financialRecord7,financialRecord8,financialRecord9,financialRecord10};
        for (FinancialRecord record : records) {
            fileWriter.write(record.getIncomes() + ";" + record.getOutcomes());
            fileWriter.newLine();
        }
        fileWriter.close();

        BufferedReader reader = new BufferedReader(new FileReader(fileName));


        int resultOutcome = 0;
        int resultIncome = 0;
        while (reader.ready()){
            String line = reader.readLine();
            String[] x = line.split(";");

            int outcomes = 0;
            outcomes += Integer.parseInt(x[1]);
            resultOutcome += outcomes;

            int incomes = 0;
            incomes += Integer.parseInt(x[0]);
            resultIncome += incomes;

        }
        System.out.println("Общие доходы - "+ resultIncome +", "+"Общие расходы - "+resultOutcome);



    }





}
