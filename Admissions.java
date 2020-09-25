    // git push --set-upstream origin master
    import java.util.Scanner;
    public class Admissions {
        public static void main( String[] args ) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter first name: ");
            String firstname = scan.next();
            System.out.println("Enter last name: ");
            String lastname = scan.next();
            System.out.println("Enter SAT score: ");
            int SATscore = scan.nextInt();
            System.out.println("Enter class ranking: ");
            int rank = scan.nextInt();
            System.out.println("Enter amount of awards: ");
            int awards = scan.nextInt();
            System.out.println("Enter location of residence:");
            String Residence = scan.next();

            scan.close();
        }
    }