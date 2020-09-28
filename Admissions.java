import java.util.Scanner;
public class Admissions {
    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter last name: ");
        String lastname = scan.next();
        System.out.println("Enter SAT score: ");
        int SATscore = scan.nextInt();
        System.out.println("Enter class ranking: ");
        int rank = scan.nextInt();
        System.out.println("Enter amount of awards: ");
        int awards = scan.nextInt();
        System.out.println("Enter location of residence:");
        String residence = scan.next();
        scan.close();

        int satcheck = 0, rankcheck = 0, awardcheck = 0, residencecheck = 0;
        boolean accepted = false, acceptedd = false, padjen = false, failed = false;
        if (lastname.equals("Padjen")) {
            padjen = true;
        }
        if (SATscore >= 1500) {
            accepted = true;
        } else if (SATscore >= 1400){
            satcheck = 2;
        } else if (SATscore >= 1200){
            satcheck = 1;
        } else {
            failed = true;
        }
        if (rank >= 95) {
            accepted = true;
        } else if (rank >= 90){
            satcheck = 2;
        } else if (rank >= 85){
            satcheck = 1;
        } else {
            failed = true;
        }
        if (awards >= 10) {
            accepted = true;
        } else if (awards >= 8){
            awardcheck = 2;
        } else if (awards >= 3){
            awardcheck = 1;
        } else {
            failed = true;
        }
        if (residence.equals("Colorado")) {
            accepted = true;
        } else if (!residence.equals("Florida")) {
            residencecheck = 1;
        } else {
            failed = true;
        }
    }
}