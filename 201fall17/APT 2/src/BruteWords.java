import java.util.ArrayList;
import java.util.TreeSet;

public class BruteWords {
       public int getScore(String str){
          int max = 0;
          char [] fin = str.toCharArray();
          String counter =""; 
          ArrayList<Character> looper = converter(fin); 
          for(int i=0;i<looper.size(); i++) {
          for(char a = 'A'; a<= 'Z'; a++) {
             counter = str.replace(looper.get(i), a);
             int thisMax = calculate(counter); 
             if (thisMax>max){
            	 max = thisMax; 
             }
        	  
          }
          }
           return max;
       }
       
       
       public int calculate(String a) {
    	   char [] mine = a.toCharArray(); 
    	   ArrayList<Character> returner = converter(mine); 
    	   int thisSum = 0; 
    	   for(int i=0; i<returner.size(); i++) {
    		  thisSum += Math.pow(find(mine, returner.get(i)), 2); 
    	   }
    	   
    	   return thisSum; 
       }
       
       

       public int find(char [] count, char find) {
      	 int counter = 0; 
      	 for(int i=0; i<count.length; i++) {
      		 if(count[i] == (find)) {
      			 counter ++; 
      		 }
      	 }
      	 return counter; 
       }
       
       
       
       public ArrayList<Character> converter (char [] a){
    	  TreeSet<Character> ret = new TreeSet<Character>(); 
    	   for(char b: a) {
    		   ret.add(b); 
    	   }
    	   ArrayList <Character> returner = new ArrayList<Character>();
    	   for(char c: ret) {
    		   returner.add(c); 
    	   }
    	   return returner; 
    	   
       }
   }