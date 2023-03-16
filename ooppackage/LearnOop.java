package ooppackage;

import java.util.Scanner;

public class LearnOop {
    private String name;
    private int birthYear = 1990; 
    private String city;

     LearnOop(String uname, int bYear, String rcity) {
        name = uname;
        birthYear = bYear;
        city = rcity;
    }

    public void introducePers() {

        System.out.println(name + " né(e) en " + birthYear + " à " + city);
    }

    public int getBthd() {
        return this.birthYear;
    }

    public void setBthd(int year) {
        this.birthYear = year;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez votre nom, année de naissance et ville de residence");
        String userName = scan.nextLine();
        int userYear = scan.nextInt();
        String toline = scan.nextLine();
        String userResid = scan.nextLine();

        
        LearnOop Pers = new LearnOop(userName, userYear, userResid);

        Pers.introducePers();
        System.out.println(Pers.getBthd());
        Pers.setBthd(2001);
        System.out.println(Pers.getBthd());

    }
    
}
