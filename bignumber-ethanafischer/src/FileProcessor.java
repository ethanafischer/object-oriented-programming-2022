import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileProcessor {

    /**
     * Processes arithmetic expressions line-by-line in the given file.
     *
     * @param filePath Path to a file containing arithmetic expressions.
     */
    public static void processFile(String filePath) {
        File infile = new File(filePath);

        try (Scanner scan = new Scanner(infile)) {
            while (scan.hasNext()) {
                // TODO: Process each line of the input file here.
                String line = scan.nextLine();
                LinkedList num1 = new LinkedList();
                LinkedList num2 = new LinkedList();
                LinkedList ans = new LinkedList();
                char op = ' ';
                boolean isFirstNum = true;

                for (int i = line.length() - 1; i >= 0; i--) {
                    char d = line.charAt(i);
                    if (Character.isDigit(d)) {
                        if (isFirstNum) {
                            num2.insert(d-48);
                        } else {
                            num1.insert(d-48);
                        }
                    } else {
                        if (isFirstNum) {
                            isFirstNum = false;
                        }
                        if (d == '+' || d == '*' || d == '^'){
                            op = d;

                        }
                    }
                }
                if (op == '+') ans = Calculations.addition(num1, num2, false);
                if (op == '*'){
                    LinkedList temp1 = num1;
                    LinkedList temp2 = num2;
                    if (num2.size() > num1.size()){
                        temp1 = num2;
                        temp2 = num1;
                    }
                    ans = Calculations.multiply(temp1, temp2);

                }
                if (op == '^') ans = Calculations.exponentiate(num1, num2);
                if (!line.isEmpty()) System.out.println(printLine(num1, num2, ans, op));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + infile.getPath());
        }
    }
    private static String printLine(LinkedList num1, LinkedList num2, LinkedList ans, char op){
        return num1.toString() + " " + op + " " + num2.toString() + " = " + ans.toString();
    }
}
