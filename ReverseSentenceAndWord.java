import java.util.Scanner;
public class ReverseSentenceAndWord {
 
   public static void main(String args[]) {
 
       Scanner sc=new Scanner(System.in);

        System.out.println("How many first words/characters do you want to skip?");

        int skip=sc.nextInt();
 
       String str="Here is the source code of the java program";

        System.out.println("INPUT");

        System.out.println(str);
  
      String words[]=str.split(" ");
 
       String revString="";
 
       String revWord="";
 
       int len=words.length;
 
       for(int i=0;i<skip;i++){
 
           revString=revString+words[i]+" ";
 
       }
   
     for(int i=len-1;i>=skip;i--){
  
          revString=revString+words[i]+" ";
 
       }
   
     System.out.println("First Output");
 
       System.out.println(revString);

        String[] revwords=revString.split(" ");

        //========================================

         for(String word:revwords){
 
            if(word.length()<=skip){
 
                revWord=revWord+word+" ";
  
           }
   
          else{
   
              int i=0;
  
               while(i<skip){

                     revWord=revWord+word.charAt(i);

                     i++;
  
               }
    
             for(int j=word.length()-1;j>=skip;j--){
   
                  revWord=revWord+word.charAt(j);
  
               }
                 revWord=revWord+" ";
 
            }
  
       }
         
         System.out.println("Final Output");

         System.out.println(revWord);
 
   }

}