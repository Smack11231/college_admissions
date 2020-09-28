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
        int acceptedd = 0;
        boolean accepted = false, padjen = false, failed = false;
        if (lastname.equals("Padjen")) {
            padjen = true;
        }
        if (SATscore >= 1500) {
            accepted = true;
        } else if (SATscore >= 1400){
            acceptedd ++;
        } else if (SATscore < 1200){
            failed = true;
        }
        if (rank >= 95) {
            accepted = true;
        } else if (rank >= 90){
            acceptedd ++;
        } else if (rank < 85){
            failed = true;
        }
        if (awards >= 10) {
            accepted = true;
        } else if (awards >= 8){
            acceptedd ++;
        } else if (awards < 3){
            failed = true;
        }
        if (residence.equals("Colorado")) {
            accepted = true;
        } else if (residence.equals("Florida")) {
            failed = true;
        }
        if (failed && !padjen) {
            accepted = false;
            acceptedd = 0;
        }
        if (failed && !padjen) {
            System.out.println("You are not accepted becase you are worse than acceptable in at least one section.");
        } else if (padjen) {
            System.out.println("You are accepted because your last name is Padjen.");
        }    else if (accepted) {
            System.out.println("You are accepted because you are elite status in at least one section.");
        } else if (acceptedd >= 2) {
            System.out.println("You are accepted because you are Strong in at least two sections.");
        } else {
            System.out.println("You are not accepted because you lack enough Strong or Elite sections.");
        }
    }
}