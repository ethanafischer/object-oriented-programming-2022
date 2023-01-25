import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File input = new File("positions.txt");
        File output = new File("drawMe.txt");
        FileReader reader=new FileReader(input);          //Creation of file reader object
        BufferedReader bufferedReader=new BufferedReader(reader);  //Creation of buffer reader object
        FileWriter writer= new FileWriter(output);      //Creation of file writer object
        String s=null;
        while((s=bufferedReader.readLine())!=null)             //Copying Content to the new file
        {
            writer.write(s);
            writer.write("\n");
            writer.flush();
        }
        writer.close();
    }
}