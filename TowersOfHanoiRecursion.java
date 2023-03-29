import java.util.*;

/**
 * Towers of Hanoi using recursion
 */

public class TowersOfHanoiRecursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Towers of Hanoi \uD83D\uDDFC - Recursion Method");
        System.out.print("Enter number of disks: ");
        int nDisks = in.nextInt();

        //checks the time complexity
        double startTime = System.currentTimeMillis();

        //calls the function
        String recursion = hanoiRecursion(nDisks, 'L', 'R', 'M');
        System.out.println("\n-Solution-");
        System.out.println(recursion);

        double endTime = System.currentTimeMillis();
        double totalTime = endTime - startTime;

        System.out.println("Run time = " + totalTime + " ms.");
    }

    public static String hanoiRecursion(int n, char startPeg, char destPeg, char tempPeg) {
        //Base case scenario
        if (n==1) {
            return "Move disk 1 from peg " + startPeg + " to peg " + destPeg + "\n";
        } else { //Recursive step
            return hanoiRecursion(n - 1, startPeg, tempPeg, destPeg)
                    + "Move disk " + n + " from peg " + startPeg + " to peg " + destPeg + "\n"
                    + hanoiRecursion(n - 1, tempPeg, destPeg, startPeg);
        }
    }
}

