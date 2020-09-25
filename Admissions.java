    // git push --set-upstream origin master
    import java.util.Scanner;
    public class Admissions {
        public static void main( String[] args ) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter first name: ");
            String firstname = scan.next();

            System.out.println("Enter last name: ");
            String lastname = scan.next();
            String required = "Padjen";

            System.out.println("Enter SAT score: ");
            int SATscore = scan.nextInt();

            System.out.println("Enter class ranking: ");
            int rank = scan.nextInt();

            System.out.println("Enter amount of awards: ");
            int awards = scan.nextInt();

            System.out.println("Enter location of residence:");
            String residence = scan.next();

            int lastnamecheck = 0, satcheck = 0, rankcheck = 0, awardcheck = 0, residencecheck = 0;
            boolean accepted = false;
            // 0 = none, 1 = acceptable, 2 = strong, 3 = elite, 4 = last name Padjen
            if (lastname == required) {
                accepted = true;
                lastnamecheck = 4;
            }
            
            if (SATscore >= 1500) {
                satcheck = 3;
                accepted = true;
            } else if (SATscore >= 1400){
                satcheck = 2;
            } else if (SATscore >= 1200){
                satcheck = 1;
            } else {
                satcheck = 0;
            }

            if (rank >= 95) {
                rankcheck = 3;
                accepted = true;
            } else if (rank >= 90){
                satcheck = 2;
            } else if (rank >= 85){
                satcheck = 1;
            } else {
                satcheck = 0;
            }


            scan.close();
        }
    }