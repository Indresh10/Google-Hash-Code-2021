import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        PIZZAFUN a = new PIZZAFUN();
        String[] reader;
        File ins;
        FileReader fr;
        BufferedReader br;
        String inputPath = "../Input/";
        String outputPath = "../Output/";
        String[] infiles = { "a_example.bin", "b_little_bit_of_everything.in", "c_many_ingredients.in",
                "d_many_pizzas.in", "e_many_teams.in" };
        String[] outfiles = { "a_example.out", "b_little_bit_of_everything.out", "c_many_ingredients.out",
                "d_many_pizzas.out", "e_many_teams.out" };
        Integer[] T2, T3, T4;
        try {
            for (String file : infiles) {
                ins = new File(inputPath + file);
                fr = new FileReader(ins);
                br = new BufferedReader(fr);
                String line;
                line = br.readLine();
                reader = line.split(" ");
                a.teamset(Integer.parseInt(reader[0]), Integer.parseInt(reader[1]), Integer.parseInt(reader[2]),
                        Integer.parseInt(reader[3]));
                a.printer();
                int i = 0; // for setting pizza index;
                while ((line = br.readLine()) != null) {
                    reader = line.split(" ");
                    a.add(i, Integer.parseInt(reader[0]), Arrays.copyOfRange(reader, 1, reader.length));
                    i++;
                }
                fr.close();
                br.close();
            }
        } catch (FileNotFoundException fex) {
            System.out.println("File not Found");
        } catch (Exception ioe) {
            System.out.println("Input output error now exiting");
        }
        for (int i = 0; i < a.team2; i++) {
            a.compare(2, i * 2, ArrayList.copyOfRange(a.Stock, i * 2, (i + 1) * 2));
        }
        // funtion to set pizza and putt it in output file also use a.compare funtion to
        // set pizza first eliminate team of 2 then team of 3 and then team of 4
    }
}