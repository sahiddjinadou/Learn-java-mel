package ooppackage;

import java.util.Scanner;

public class Etudiants {
    private String name;
    private int birthYear = 1990; 
    private String city;

    Etudiants(String uname, int bYear, String rcity) {
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
        LearnOop student;

        for(int i = 1; i<=3; i++) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Entrez votre nom");
            String userName = scan.nextLine();
            System.out.println("Entrez votre année de naissance");
            int userYear = scan.nextInt();
            scan.nextLine();
            System.out.println("Entrez votre ville de residence");
            String userResid = scan.nextLine();

            student = new LearnOop(userName, userYear, userResid);
            student.introducePers();
            System.out.println(student.getBthd());
            student.setBthd(2001);
            System.out.println(student.getBthd());
        }

        


    }
    
}
