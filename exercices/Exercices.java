package exercices;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Exercices {
    

    public static void main(String[] args) {
        Exercices exo = new Exercices();

        String sentence = "don't stop makiNg efforTs, it    going to pay on DAY"; 
        System.out.println(exo.firstUpperCase(sentence));
        // System.out.println(exo.longestWord(sentence));
        exo.longestWord(sentence);

        System.out.println(LocalDate.now());
        System.out.println("Avant formatage " + LocalDateTime.now());
        //Define a format date
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss");
        System.out.println("Après formatage " + (LocalDateTime.now()).format(myFormat));
        System.out.println(LocalTime.now());

        exo.classAvarage();
    }

    //Exercice I
    public String firstUpperCase(String str) {
        String newWord = "";
        String[] toSplit =  str.split("\\s+");
        // System.out.println(Arrays.toString(toSplit));
        for(String word : toSplit) {
            //Convert each word into lowerCase
            String toLow = word.toLowerCase();
            //Use the class Character so as to have acces to the upperCase method on the char
            char firstLetter = Character.toUpperCase(toLow.charAt(0));
            //To now print out the new sentence
            newWord += firstLetter + toLow.substring(1) + " ";
            
        }
        return newWord;

    }

    //Exercice II
    public void longestWord(String str) {
        String[] toSplit =  str.split("\\s+");
        String lengthString = "";
        String longWord = "";

        for(String word : toSplit) {
            //To get the length of each word
            lengthString += word.length() + " ";
        }

        String[] toSplitLengthString = lengthString.split(" ");
        Integer[] numLength = new Integer[toSplitLengthString.length];

        for(int i = 0; i < toSplitLengthString.length; i++) {
            numLength[i] = Integer.parseInt(toSplitLengthString[i]);
        }

        Arrays.sort(numLength, Collections.reverseOrder());

        System.out.println(Arrays.toString(numLength));

        int highest = numLength[0];

        for(int i = 0; i < toSplit.length; i++) {
            if(toSplit[i].length() == highest) {
                longWord += toSplit[i];
                break;
            }
        }

        System.out.println("Le mot le plus long de cette phrase est " + longWord + " et sa longueur est " + highest);

    }

    public void classAvarage() {
        Scanner scan = new Scanner(System.in);
        double noteSum = 0;
        
        System.out.println("Entrez le total des étudiants");
        
        int totalStudent = scan.nextInt();
        
        double[] noteArray = new double[totalStudent];

        for(int i = 0; i < noteArray.length; i++) {
            System.out.println("Entrez la note pour l'étudiant " + (i+1));
            double studentNote = scan.nextDouble();
            noteSum += studentNote;
        }

        System.out.println(noteArray);
        System.out.println(noteSum / totalStudent);

        
    }


   
}
