package week12d03;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberStat {
   private final List<Integer> numbers = new ArrayList<>();

   public int findSmallestUnique() {
       if (numbers.isEmpty()) {
           throw new IllegalStateException("Empty list");
       }
       if(numbers.size() == 1) {
           return numbers.get(0);
       }
       List<Integer> sortedNumbers = new ArrayList<>(numbers);
       Collections.sort(sortedNumbers);

       if(sortedNumbers.get(0) != sortedNumbers.get(1)) {
           return sortedNumbers.get(0);
       }
       for (int i = 1; i < sortedNumbers.size() - 1; i++) {
           if(sortedNumbers.get(i-1) != sortedNumbers.get(i) && sortedNumbers.get(i+1) != sortedNumbers.get(i)) {
              return sortedNumbers.get(i);
           }
       }
       if(sortedNumbers.get(sortedNumbers.size()-1)!=sortedNumbers.get(sortedNumbers.size()-2)) {
           return sortedNumbers.get(sortedNumbers.size()-1);
       }
       throw new IllegalStateException("Wrong list");
   }

   public void readFromFile(String fileName) {
        Path path = Path.of(fileName);
        try(BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            while((line=br.readLine())!=null) {
                String[] temp = line.split(",");
                addLine(temp);
            }

        } catch(NoSuchFileException nsfe) {
            throw new IllegalArgumentException("Cannot load file!");
        } catch (IOException e) {
            throw new IllegalStateException("Something went wrong");
        }
   }
   private void addLine(String[] temp) {
       for(String s : temp) {
           numbers.add(Integer.parseInt(s));
       }
   }

    public static void main(String[] args) {
        NumberStat numberStat = new NumberStat();
        numberStat.readFromFile("test.txt");
        System.out.println(numberStat.findSmallestUnique());
    }
}
