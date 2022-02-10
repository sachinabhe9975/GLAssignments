import java.util.*;

         public class Main
             {

 
       public void checkPalindrome(int n1) 
 
            {
     
               int r,sum=0,temp;    
  
               temp=n1;  
  
               while(n1>0)

            {    
               r=n1%10;   
 
               sum=(sum*10)+r;    

               n1=n1/10;    
            } 
   
               if(temp==sum)   
 
               System.out.println("palindrome number ");    
               
               else  
  
              System.out.println("not palindrome");    
          } 
 
            


 
       public void printPattern(int n2) 

       {
           int i, j ;

           for(i=n2-1;i>=0;i--)

         {
           for(j=0;j<=i;j++)

        {
          System.out.print("*" +" ");
        }
          
          System.out.println();        
        }

      }




       public void checkPrimeNumber(int n3)

       {
    
          boolean Result = false;

          for (int i=2; i<=n3/2; i++)

         {
     
          if(n3%i == 0) 

         {
    
           Result = true;

           break;
         }

         }

          if(Result==false)

          System.out.println(n3+ " is a prime number.");

          else

          System.out.println(n3+ " is not a prime number.");
     }


         

       public void printFibonacciSeries(int n4) 

       {

         int first = 0, second = 1 ,temp;

         System.out.println("The Fibonacci series of above number is : ");

         System.out.print(first+" "+second);

         for(int i=2;i<n4;i++)
        {

         temp=first+second;

         System.out.print(" "+temp);

         first=second;

         second=temp;
        }

    }


            


      public static void main(String[] args) 
   
      {

                Main obj = new Main();

                int choice;

                Scanner sc = new Scanner(System.in);
      
                System.out.println(" Please enter a number :");
                
                int n= sc.nextInt();

                System.out.println("Following are the list of choices...");

         do
 
         {

                 System.out.println("\n Enter your choice from below list.\n" + "\n 1. Find palindrome of number.\n"

                 + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

                 + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

                 System.out.println();

 

                choice = sc.nextInt();

          switch (choice) 
  
          {

 
                case 0:

                choice = 0;

                break;

 

                case 1:  obj.checkPalindrome(n);


                          break;

 

                case 2: obj.printPattern(n);


                          break;

 

                case 3: obj.checkPrimeNumber(n);



                         break;

 

                case 4: obj.printFibonacciSeries(n);



                         break;

 

                default: System.out.println("Invalid choice. Enter a valid no.\n");

}

 

} while (choice != 0);

System.out.println("Exited Successfully!!!");

sc.close();

}

 

}


