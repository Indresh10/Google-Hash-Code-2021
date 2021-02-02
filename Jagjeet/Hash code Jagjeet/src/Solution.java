import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.Arrays;

class Solution
{
    public static void main(String[] args){
        PIZZAFUN a = new PIZZAFUN();
        File ops = null;
        String[] reader;
        try
        {
            File ins = new File(args[0]);
            ops = new File("D:\\Subbmision.op");
            FileReader fr = new FileReader(ins);
            BufferedReader br = new BufferedReader(fr);
            String line;
            line = br.readLine();
            reader = line.split(" ");
            a.teamset(Integer.parseInt(reader[0]),Integer.parseInt(reader[1]),Integer.parseInt(reader[2]),Integer.parseInt(reader[3]));
            a.printer();
            int i = 0;              //for setting pizza index;
            while((line=br.readLine())!=null)
            {
             reader = line.split(" ");
             a.add(i,Integer.parseInt(reader[0]), Arrays.copyOfRange(reader,1,reader.length));
             if(i%120==0)
             {
                 //funtion to set pizza and putt it in output file also use a.compare funtion to set pizza first eliminate team of 2 then team of 3 and then team of 4
             }
             i++;
            }
        }
        catch (Exception ioe)
        {
            System.out.print("Input output error now exiting");
        }
    }
}