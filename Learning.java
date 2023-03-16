import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Learning {

    public static void main(String[] args) {
        // String pays = JOptionPane.showInputDialog("Entrez un pays");  
        // JOptionPane.showMessageDialog(null, pays);

        // swap(5, 10);

        // int[] myArray = {4, 2, 9, 1, 0};
        // orderArray(myArray);

        // String myStr = "1 5 9 7 4 1 -6 -9 -1 485 200";
        // getHighest(myStr);

        calculate();
    }


    //The method take two args and at the end each one take oder's value
    public static void swap(int a, int b) {
        int[] x = {a, b}; 
        a = x[1];   
        b = x[0];     
        System.out.println("a = " + a + " b = " + b);
    }


    //This method sort a array element 
    /*
     * Arrays is a class which has many methods that we can perform on an array
     */
    public static void orderArray(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //Get a string of number, sort it and print the highest value 
    public static void getHighest(String str) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez une serie de chiffre separée par un espace");
        str = scan.nextLine();
        //Take the string number and split up on white space
        String[] strArray = str.split(" ");
        //Create an empty array(have to give the length)
        int[] numArray = new int[strArray.length];
        //loop through strArray
        for(int i = 0; i < strArray.length; i++) {
            //To convert the string to number and assign it to the array
            numArray[i] = Integer.parseInt(strArray[i]);
        }

        System.out.println(Arrays.toString(numArray));
        Arrays.sort(numArray);
        System.out.println(Arrays.toString(numArray));
        System.out.println(numArray[(numArray.length - 1)]);
    }


    //Get inputs from user and perform a calculation
    public static void calculate() {
        Double nb1;
        Double nb2;

        Scanner scan = new Scanner(System.in);
        // System.out.println("Entrez un premier nombre");
        // nb1 = Double.parseDouble(scan.next());
        // String line = scan.next();

        try {
            // System.out.println("Entrez un premier nombre");
            // nb1 = Double.parseDouble(scan.next());
            
            do {
                System.out.println("Entrez un premier nombre");
                nb1 = Double.parseDouble(scan.next());
                // String line = scan.next();
    
    
            } while (Double.isNaN(nb1));
    

        } catch (NumberFormatException e) {
            // TODO: handle exception
            System.out.println("Le nombre entré est invalide");
        }

        // if(Double.isNaN(nb1)) {
        //     System.out.println("Le nombre entré est invalide");
        //     String line = scan.next();
        //     break;
        // }
        // System.out.println("Entrez un operateur");
        // String ope = scan.next();
        // String line = scan.next();
        // System.out.println("Entrez un second nombre");
        
        // try {
        //     // System.out.println("Entrez un premier nombre");
        //     // nb2 = Double.parseDouble(scan.next());

        //     do {
        //         System.out.println("Entrez un second nombre");
        //         // System.out.println("Le nombre entré est invalide");
        //         nb2 = Double.parseDouble(scan.next());
        //         // scan.next();
    
        //     } while (Double.isNaN(nb2));
    
    

        // } catch (NumberFormatException e) {
        //     // TODO: handle exception
        //     System.out.println("Le nombre entré est invalide");
        // }

            
    //     switch(ope) {
    //         case "+":
    //             System.out.println("operation " + nb1 + ope + nb2 + " = " + (nb1 + nb2));
    //             break;
    //         case "-":
    //             System.out.println("operation " + nb1 + ope + nb2 + " = " + (nb1 - nb2));
    //             break;
    //         case "*":
    //             System.out.println("operation " + nb1 + ope + nb2 + " = " + (nb1 * nb2));
    //             break;
    //         case "%":
    //             System.out.println("operation " + nb1 + ope + nb2 + " = " + (nb1 % nb2));
    //             break;
    //         default:
    //             System.out.println("operation invalide");
    //             break;
    
    //     }
    }
    

};