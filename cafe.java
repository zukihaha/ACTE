/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author CL2~PC36
 */
public class cafe {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         System.out.println("Snacks");
     System.out.println("[1] - Piattos");
     System.out.println("[2] - Nova");

     System.out.println("Enter your choice:");
     int ch2 = input.nextInt();

     // 2nd if condition
     if (ch2 == 1) 
     {
         System.out.println("Piattos 20.00");
         int pia,nova;
             pia = 20;
             nova = 22;

         System.out.println("Gusto mo drinks? [1] yes [2] no:");
         int ch3 = input.nextInt();

         if (ch3 == 1) 
         {
             System.out.println("Drinks");
             System.out.println("[1] = Coke");
             System.out.println("[2] = Water");

             System.out.println("Enter your choice:");
             int ch4 = input.nextInt();

             if (ch4 == 1) 
             {
                 System.out.println("Coke 21.00");
                 int coke,water;
                 coke = 21;
                 water = 27;

                 int tot = pia + coke;
                 System.out.println("Total is :" + tot);
                 System.out.println("Enter your cash:");
                 int csh = input.nextInt();

                 while (csh < tot) 
                 {
                     System.out.println("Invalid Amount");
                     System.out.println("Enter your cash:");
                     csh = input.nextInt();
                 }

                 int chnge = csh - tot;
                 System.out.println("Change is :" + chnge);

             } 

             //piattos and water
              if (ch4 == 2) 
              {
                 System.out.println("Water 27.00");
                 int coke,water;
                 coke = 21;
                 water = 27;

                 int tot = pia + water;
                 System.out.println("Total is :" + tot);
                 System.out.println("Enter your cash:");
                 int csh = input.nextInt();

                 while (csh < tot) 
                 {
                     System.out.println("Invalid Amount");
                     System.out.println("Enter your cash:");
                     csh = input.nextInt();
                 }

                 int chnge = csh - tot;
                 System.out.println("Change is :" + chnge);
             }
         } 
             else if (ch3 == 2) 
             {
                 int tot = pia;
                 System.out.println("Total is :" + tot);
                 System.out.println("Enter your cash:");
                 int csh = input.nextInt();

                 while (csh < tot) 
                 {
                     System.out.println("Invalid Amount");
                     System.out.println("Enter your cash:");
                     csh = input.nextInt();
                 }

                 int chnge = csh - tot;
                 System.out.println("Change is :" + chnge);
             }

     }
           //nova combination nova + coke , nova + water
             if (ch2 == 2) 
         {
         System.out.println("Nova 22.00");
         int pia,nova;
         pia = 20;
         nova = 22;

         System.out.println("Gusto mo drinks? [1] yes [2] no:");
         int ch3 = input.nextInt();

             if (ch3 == 1) 
             {
             System.out.println("Drinks");
             System.out.println("[1] = Coke");
             System.out.println("[2] = Water");

                 System.out.println("Enter your choice:");
                 int ch4 = input.nextInt();

                         if (ch4 == 1) 
                         {
                         System.out.println("Coke 21.00");
                         int coke,water;
                         coke = 21;
                         water = 27;

                         int tot = nova + coke;
                         System.out.println("Total is :" + tot);
                         System.out.println("Enter your cash:");
                         int csh = input.nextInt();

                             while (csh < tot) 
                             {
                                 System.out.println("Invalid Amount");
                                 System.out.println("Enter your cash:");
                                 csh = input.nextInt();
                             }

                             int chnge = csh - tot;
                             System.out.println("Change is :" + chnge);

                         } 
                         if (ch4 == 2) 
                         {
                             System.out.println("Water 27.00");
                             int coke, water;
                             coke = 21;
                             water = 27;

                             int tot = nova + water;
                             System.out.println("Total is :" + tot);
                             System.out.println("Enter your cash:");
                             int csh = input.nextInt();

                         while (csh < tot) 
                         {
                             System.out.println("Invalid Amount");
                             System.out.println("Enter your cash:");
                             csh = input.nextInt();
                         }

                         int chnge = csh - tot;
                         System.out.println("Change is :" + chnge);
                         }            
             } 

                         else if (ch3 == 2) 
                         {
                             int tot = nova;
                             System.out.println("Total is :" + tot);
                             System.out.println("Enter your cash:");
                             int csh = input.nextInt();

                             while (csh < tot) 
                             {
                             System.out.println("Invalid Amount");
                             System.out.println("Enter your cash:");
                             csh = input.nextInt();
                             }

                             int chnge = csh - tot;
                             System.out.println("Change is :" + chnge);
                         }
         }
                         //validation
                         if (ch2 >= 3) 
                         {
                             System.out.println("Invalid snack choice.");
                         }

 } 

     // drinks
     if (ch1 == 2) 
     {
     System.out.println("Drinks");
     System.out.println("[1] - Coke");
     System.out.println("[2] - Water");

     System.out.println("Enter your choice:");
     int ch2 = input.nextInt();
     //2nd if condition
         if (ch2 == 1) 
         {
             System.out.println("Coke 21.00");
             int coke,water;
             coke = 21;
             water = 27;

             System.out.println("Gusto mo snacks? [1] yes [2] no:");
             int ch3 = input.nextInt();

                 if (ch3 == 1) 
                 {
                 System.out.println("Snacks");
                 System.out.println("[1] = Piattos");
                 System.out.println("[2] = Nova");

                     System.out.println("Enter your choice:");
                     int ch4 = input.nextInt();

                         if (ch4 == 1) 
                         {
                             System.out.println("Piattos 20.00");
                             int pia = 20;

                             int tot = pia + coke;
                             System.out.println("Total is :" + tot);
                             System.out.println("Enter your cash:");
                             int csh = input.nextInt();

                                 while (csh < tot) 
                                 {
                                     System.out.println("Invalid Amount");
                                     System.out.println("Enter your cash:");
                                     csh = input.nextInt();
                                 }

                                 int chnge = csh - tot;
                                 System.out.println("Change is :" + chnge);
             } 
                         else if (ch4 == 2) 
                         {
                         System.out.println("Nova 22.00");
                         int nova = 22;
                         int tot = coke + nova;
                         System.out.println("Total is :" + tot);
                         System.out.println("Enter your cash:");
                         int csh = input.nextInt();

                             while (csh < tot) 
                             {
                                 System.out.println("Invalid Amount");
                                 System.out.println("Enter your cash:");
                                 csh = input.nextInt();
                             }

                             int chnge = csh - tot;
                             System.out.println("Change is :" + chnge);
                         }
         } 
                         else if (ch3 == 2) 
                         {
                         int tot = coke;
                         System.out.println("Total is :" + tot);
                         System.out.println("Enter your cash:");
                         int csh = input.nextInt();

                             while (csh < tot) 
                             {
                                 System.out.println("Invalid Amount");
                                 System.out.println("Enter your cash:");
                                 csh = input.nextInt();
                             }

                             int chnge = csh - tot;
                             System.out.println("Change is :" + chnge);
                         }
     } 
         //water pia
         if (ch2 == 2) 
         {
         System.out.println("Water 27.00");
         int water = 27;

         System.out.println("Gusto mo snacks? [1] yes [2] no:");
         int ch3 = input.nextInt();

         if (ch3 == 1) 
         {
             System.out.println("Snacks");
             System.out.println("[1] = Piattos");
             System.out.println("[2] = Nova");

             System.out.println("Enter your choice:");
             int ch4 = input.nextInt();

             if (ch4 == 1) 
             {
                 System.out.println("Piattos 20.00");
                 int pia = 20;
                 int tot = water + pia;
                 System.out.println("Total is :" + tot);
                 System.out.println("Enter your cash:");
                 int csh = input.nextInt();

                 while (csh < tot) 
                 {
                     System.out.println("Invalid Amount");
                     System.out.println("Enter your cash:");
                     csh = input.nextInt();
                 }

                 int chnge = csh - tot;
                 System.out.println("Change is :" + chnge);
             } 

             //water nova
         if (ch4 == 2) 
             {
                 System.out.println("Nova 22.00");
                 int nova = 22;
                 int tot = water + nova;
                 System.out.println("Total is :" + tot);
                 System.out.println("Enter your cash:");
                 int csh = input.nextInt();

                 while (csh < tot) 
                 {
                     System.out.println("Invalid Amount");
                     System.out.println("Enter your cash:");
                     csh = input.nextInt();
                 }

                 int chnge = csh - tot;
                 System.out.println("Change is :" + chnge);
             }
         } 

                 else if (ch3 == 2) 
                 {
                 int tot = water;
                 System.out.println("Total is :" + tot);
                 System.out.println("Enter your cash:");
                 int csh = input.nextInt();

                 while (csh < tot) 
                 {
                     System.out.println("Invalid Amount");
                     System.out.println("Enter your cash:");
                     csh = input.nextInt();
                 }

                 int chnge = csh - tot;
                 System.out.println("Change is :" + chnge);
                 }
         } 

         else if (ch2 >= 3) 
         {
         System.out.println("Invalid drink choice.");
         }
     } 
         else if (ch1 >= 3) 
         {
         System.out.println("Invalid choice.");
         }
    }
}
