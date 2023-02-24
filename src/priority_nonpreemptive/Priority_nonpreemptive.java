/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priority_nonpreemptive;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author orginal
 */
public class Priority_nonpreemptive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        /*ArrayList<Integer> temp1 = new ArrayList<>();
        ArrayList<Integer> temp2 = new ArrayList<>();
        ArrayList<Integer> temp3 = new ArrayList<>();
        int sburst=0,proc=0;
        float waiting=0;
        int twaiting=0;
        Arive read1 = new Arive();
        Burst read2 = new Burst();
        Priority read3 = new Priority();
        temp1 = read1.ReadFile();
        temp2 = read2.ReadFile();
        temp3 = read3.ReadFile();
        
        Integer []arive = new Integer[temp1.size()];
        temp1.toArray(arive);
        Integer []burst = new Integer[temp2.size()];
        temp2.toArray(burst);
        Integer []priority = new Integer[temp3.size()];
        temp3.toArray(priority);
        int []stack = new int[priority.length];
        int []temp = new int[arive.length];
        int []wait = new int[arive.length];
        int []turnaround = new int[arive.length];
        int []thereturn = new int[arive.length];
        float top = arive.length;
        for(int i=0;i<priority.length;i++){
            stack[i]=i;
            temp[i]=arive[i];
            sburst = burst[i]+sburst;
        }

  
        for(int i=0;i<sburst;i++){
        proc=stack[0];
        if(temp[proc]==i)
        {

            twaiting=0;
        }
        else
        {
            twaiting=i-(temp[proc]);
         }
            temp[proc]=i+1;;
            wait[proc]=wait[proc]+twaiting;
            //turnaround[proc]=turnaround[proc]+tturnaround;
            waiting=waiting+(twaiting);
            burst[proc]=burst[proc]-1;
            
        if(burst[proc]==0)
        {
            turnaround[proc]=(i+1)-(arive[proc]);
            for(int x=0;x<top-1;x++)
            {
                stack[x]=stack[x+1];
            }
            top=top-1;
        for(int z=0;z<top-1;z++)
        {
            if((priority[stack[0]]>priority[stack[z+1]]) && (arive[stack[z+1]] <= i+1))
            {
                   int t=stack[0];
            stack[0]=stack[z+1];
            stack[z+1]=t;
            }
                }
        }
        
        }
        if(h==1)
        {
            for(int i=0;i<arive.length;i++)
            {
                thereturn[i]=wait[i];
            }
            
        }
        if(filepath.equals("Burst.txt"))
        {
            for(int i=0;i<burst.length;i++)
            {
                thereturn[i]=wait[i];
            }
            
        }
        if(filepath.equals("Priority.txt"))
        {
            for(int i=0;i<priority.length;i++)
            {
                thereturn[i]=turnaround[i];
            }
            
        }*/
    }
        public float[] temp(int name){
        main r = new main();
        float[] arr = new float [r.preemptive(name).length];
        for(int i=0; i<r.preemptive(name).length;i++)
        {
            arr[i]=r.preemptive(name)[i];
        }
        return arr;
        }
        
        
            }
/*System.out.println("Average waiting time is: "+waiting/arive.length);
        float tu=(sburst+waiting)/arive.length;
        System.out.println("Average Response time is: "+waiting/arive.length);
        System.out.println("Average turnaround time is: "+tu);
        
        System.out.println("_______________________");
        
        System.out.println("Waiting Time for each Processes");
        for(int i=0;i<arive.length;i++){
            System.out.println("P"+(i+1)+" : "+wait[i]);
        }
        
         System.out.println("_______________________");
         
        System.out.println("response Time for each Processes");
        for(int i=0;i<arive.length;i++){
            System.out.println("P"+(i+1)+" : "+wait[i]);
        }
        
        System.out.println("_______________________");
        
        System.out.println("Turnaround Time for each Processes");
        for(int i=0;i<arive.length;i++){
            System.out.println("P"+(i+1)+" : "+turnaround[i]);
        }*/
 









































    

