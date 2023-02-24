package priority_nonpreemptive;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class readfile {
    private  Scanner x;
    public ArrayList<Object> ReadFile(){
        ArrayList<Object> arr = new ArrayList<>();
        try {
            x = new Scanner(new File("Arrive.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }
        while(x.hasNext()){
            int a = x.nextInt();
            arr.add(a);
        }
        x.close();
        System.out.println("Done");
        return arr;
    }
    
}
