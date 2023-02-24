package priority_nonpreemptive;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Priority {
    private  Scanner x;
    public ArrayList<Integer> ReadFile(){
        ArrayList<Integer> arr = new ArrayList<>();
        try {
            x = new Scanner(new File("Priority.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }
        while(x.hasNext()){
            int a = x.nextInt();
            arr.add(a);
        }
        x.close();
        return arr;
    }
    
}
