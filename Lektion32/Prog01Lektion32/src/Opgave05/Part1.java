package Opgave05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part1 {
    public static ArrayList<Integer> int1 = new ArrayList<>();
    public static ArrayList<Integer> int2 = new ArrayList<>();

    public static int total;
    public static void main(String[] args) throws IOException {
        List<String> lines = getInput("src/Opgave05/files/lines.txt");
        List<String> rules = getInput("src/Opgave05/files/rules.txt");

        for (String rule : rules) {
            Pattern pattern = Pattern.compile("(\\d+)\\|(\\d+)");
            Matcher matcher = pattern.matcher(rule);
            while(matcher.find()){
                int1.add(Integer.parseInt(matcher.group(1)));
                int2.add(Integer.parseInt(matcher.group(2)));
            }
        }
        for (String line : lines) {
            String[] lineString = line.split(",");
            ArrayList<Integer> array = new ArrayList<>();
            for (String s : lineString) {
                array.add(Integer.parseInt(s));
            }
            checkArray(array);
        }
        System.out.println(total);
    }

    public static void checkArray(ArrayList<Integer> line){
        for (int i = 0; i < int1.size(); i++) {
            if (line.contains(int1.get(i)) && line.contains(int2.get(i))){
                if (line.indexOf(int1.get(i)) > line.indexOf(int2.get(i))){
                    return;
                }
            }
        }
        total+= line.get(line.size()/2);
    }

    public static List<String> getInput(String file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        List<String> list = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            list.add(line);
        }
        return list;
    }
}
