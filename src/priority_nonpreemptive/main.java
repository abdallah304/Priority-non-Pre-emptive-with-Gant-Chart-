/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priority_nonpreemptive;

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class main {
        public float[] preemptive(int name){
        ArrayList<Integer> temp0 = new ArrayList<>();
        ArrayList<Integer> temp1 = new ArrayList<>();
        ArrayList<Integer> temp2 = new ArrayList<>();
        ArrayList<Integer> temp3 = new ArrayList<>();
        int sburst=0,proc=0;
        float waiting=0;
        int twaiting=0;
        Number read0 = new Number();
        Arive read1 = new Arive();
        Burst read2 = new Burst();
        Priority read3 = new Priority();
        temp0 = read0.ReadFile();
        temp1 = read1.ReadFile();
        temp2 = read2.ReadFile();
        temp3 = read3.ReadFile();
        
        Integer []num = new Integer[temp0.size()];
        temp0.toArray(num); 
        //num=1.2.3.4.5
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
        int []S = new int[arive.length];
        int []E = new int[arive.length];
        float []thereturn = new float[arive.length];
        int []sort = new int[arive.length];
        float top = arive.length;
        for(int i=0;i<priority.length;i++){
            stack[i]=i;
            temp[i]=arive[i];
            sburst = burst[i]+sburst;
        }
        int k=0;

  
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
            S[proc] = wait[proc]+arive[proc];
            waiting=waiting+(twaiting);
            burst[proc]=burst[proc]-1;
            /*
            
            i=0 1 2
            proc=0
            temp[0]=3
            burst[0]=0
            */
        if(burst[proc]==0)
        {
            
               sort[k]=num[proc]; 
            
            
            turnaround[proc]=(i+1)-(arive[proc]);
            E[proc] = turnaround[proc] + arive[proc];
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
        k++;
        }
        
        }

        for(int j =0; j<E.length; j++)
        {
            int min = min=E[j];
            int index_min = j ;
            for(int i =j; i<E.length; i++)
            {
                if(E[i]<min)
                {
                    min=E[i];
                    index_min = i;
                }
            }
            int tem = E[j];
            E[j] = E[index_min];
            E[index_min] = tem;
        }
        if(name==12345)
        {
            for(int i=0;i<num.length;i++)
            {
                thereturn[i]=sort[i];
            }
        }
        if(name==0)
        {
           for(int i=0;i<arive.length;i++)
           {
               thereturn[i]=i+1;
           }
        }
        if(name==1 || name==2)
        {
            for(int i=0;i<arive.length;i++)
            {
                thereturn[i]=wait[i];
            }
            
        }
        
        if(name==3)
        {
            for(int i=0;i<priority.length;i++)
            {
                thereturn[i]=turnaround[i];
            }
            
        }
        if(name==4)
        {
            for(int i=0;i<3;i++)
            {
                if(i==0){
                thereturn[i]=waiting/priority.length;}
                if(i==1){
                    float tu=(sburst+waiting)/arive.length;
                    thereturn[i]=tu;}
                if(i==2){
                    thereturn[i]=waiting/priority.length;}
                
            }
            
        }
        if(name==5)
        {
            for(int i=0;i<arive.length;i++)
            {
                thereturn[i]=S[i];
            }  
        }
        if(name==6)
        {
            for(int i=0;i<priority.length;i++)
            {
                thereturn[i]=E[i];
            }
        }
        return thereturn;
        }
}
