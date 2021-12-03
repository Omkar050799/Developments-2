//5. Write Java program which accept String from user and display
//below pattern.
//Input : Hello
//
//         H  #  #  #  #
//         H  e  #  #  #   
//Output : H  e  l  #  #
//         H  e  l  l  #
//         H  e  l  l  o
//         H  e  l  #  #
//         H  e  l  #  #  
//         H  e  #  #  #
//         H  #  #  #  #
//
//////////////////////////////////////////////////////////////////////////////


import java.util.*;

class Stringx
 {
    String str;

    public void Accept()
     {
      Scanner sObj = new Scanner(System.in);

      System.out.println("Enter the String : -");
      str = sObj.nextLine();
      
     }
    public void Display()
     {
      System.out.println("The Entered String : -"+str);
     } 
 }

class Pattern extends Stringx
   {
      
    public void pattern()
     {
       char Arr[];
       int i = 0, j = 0;

       Arr = str.toCharArray();

       for (i = 0;i < Arr.length ; i++ )
         {
           for (j = 0; j < Arr.length ; j++ )
             {
                if(i < j)
                   {
                      System.out.print("#\t");
                    
                   }  
                else
                   {
                       System.out.print(Arr[j]+"\t");
                   }   
             }
           System.out.print("\n");
         }

         for (i = 1;i < Arr.length ; i++ )
         {
           for (j = 0; j < Arr.length ; j++ )
             {
                if((i + j) < Arr.length)
                   {
                     
                     System.out.print(Arr[j]+"\t");
                   }  
                else
                   {
                        System.out.print("#\t");
                   }   
             }
           System.out.print("\n");
         }
      }  

   } 


class Assignment_39_5
 { 
   public static void main(String args[]) 
    {
      Pattern pObj = new Pattern();

      pObj.Accept();
      pObj.Display();
      
      pObj.pattern();

    }
 }