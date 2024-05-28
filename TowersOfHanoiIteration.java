import java.util.*;

/**
 * Towers of Hanoi using iteration
 */

public class TowersOfHanoiIteration {
    public static void main(String args[]) {
        new TowersOfHanoiIteration();
    }

    teest 
    TowersOfHanoiIteration() {
        System.out.println("Towers of Hanoi \uD83D\uDDFC - Iteration Method");
        System.out.print("Enter the number of disks: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        A1 = new int[n];
        A2 = new int[n];
        A3 = new int[n];

        //Fill first array completely
        for(int i = n-1; i >= 0; i --) {
            A1[i] = i+1;
        }

        //Show initial arrays
        System.out.print("\n-Initial Configuration-");
        printTowers();

        int count = 0;
        System.out.print("\n\n-Solution-");

        //Checks the time complexity
        double startTime = System.currentTimeMillis();

        while(true) {
            if (n%2 == 0) {
                moveBetween(A1, A2);
                count ++;
                if(Solved(A1, A2) || Solved(A1, A3)) {
                    break;
                }

                moveBetween(A1, A3);
                count ++;
                if(Solved(A1, A2) || Solved(A1, A3)) {
                    break;
                }

                moveBetween(A3, A2);
                count ++;
                if(Solved(A1, A2) || Solved(A1, A3)) {
                    break;
                }
            }

            moveBetween(A1, A3);
            count ++;
            if(Solved(A1, A2) || Solved(A1, A3)) {
                break;
            }

            moveBetween(A1, A2);
            count ++;
            if(Solved(A1, A2) || Solved(A1, A3)) {
                break;
            }

            moveBetween(A2, A3);
            count ++;
            if(Solved(A1, A2) || Solved(A1, A3)) {
                break;
            }
        }
        System.out.println("\n\nTotal steps: " + (count));

        double endTime = System.currentTimeMillis();
        double totalTime = endTime - startTime;

        System.out.println("\nRun time = " + totalTime + " ms.");
    }

    //Visualization of the disks and pegs
    void printTowers() {
        System.out.println();

        for(int i = 0; i < A1.length; i ++) {
            System.out.println();
            for(int j = 0; j < 3; j ++) {
                switch(j) {
                    case 0:
                        System.out.printf("%-3s", A1[i]);
                        break;
                    case 1:
                        System.out.printf("%-3s", A2[i]);
                        break;
                    case 2:
                        System.out.printf("%-3s", A3[i]);
                        break;
                }
            }
        }
    }

    //Finds the topmost disk in an array
    int numInA(int[] Array) {
        int numInA = 0;
        for(int i = Array.length - 1; i > 0; i --) {
            if(Array[i] != 0) {
                numInA = Array[i];
            }
        }
        return numInA;
    }

    void moveBetween(int[] A1, int[] A2) {
        if (numInA(A1) == 0) {
            decidePegs(A2, A1);
        } else {
            decidePegs(A1, A2);
        }
    }

    //Decide which pegs to move the disk from and to
    void decidePegs(int[] A1, int[] A2) {
        //Get the top numbers in A1 and A2
        int numInA1 = numInA(A1);
        int numInA2 = numInA(A2);
        if(numInA2 > numInA1 || numInA2 == 0) {
            moveDisks(A1, A2);
        }
        else if(numInA1 > numInA2 || numInA1 == 0) {
            moveDisks(A2, A1);
        }
        printTowers();
    }

    //Move the disks from one array to another
    void moveDisks(int[] A1, int[] A2) {
        int diskToMove = 0;

        //Removes a disk from the top
        for(int i = 0; i < A1.length; i ++) {
            if(A1[i] != 0) {
                diskToMove = A1[i];
                A1[i] = 0;
                break;
            }
        }

        //Add it to second array
        for(int i = 0; i < A2.length; i ++) {
            if (i == A2.length -1 || A2[i+1] != 0) {
                A2[i] = diskToMove;
                break;
            }
        }
    }

    //Checks if all disks have been moved to A3
    boolean Solved (int[] A1, int[] A2) {
        int length = A1.length-1;
        return (A1[length] == 0 && A2[length] == 0);
    }
}
