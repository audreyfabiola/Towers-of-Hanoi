# 🗼 Towers of Hanoi 🗼

### Problem

The goal is solve a classic puzzle called Towers of Hanoi" by having to move the three disks from the peg where they have been placed (largest disk on the bottom, smallest disk on the top) to one of the empty pegs, subject to the following constraints:

- Only the top disk on a peg can be moved to another peg.
- A larger disk cannot be placed on top of a smaller disk.



### Solution

This repository, contains the solution for Towers of Hanoi both recursively and iteratively. 

- Recursion method: the problem was solved by displaying a list of moves to be made. The user is prompted to input the number of disks, and the program calls a method that takes the number of disks and the three pegs (startPeg, destPeg, and tempPeg) as parameters, returning a string with the sequence of moves needed to solve the puzzle.
- Iteration method: the problem was solved by displaying the pegs and disks through an array visualization. The user is prompted to input the number of disks, and the program intializes three arrays (A1, A2, and A3) to represent the three pegs in the puzzle. The program will also calculate how many steps needed to solve the puzzle.



### Program Workflow

##### Recursive Method

```
Towers of Hanoi 🗼 - Recursion Method
Enter number of disks: 3

-Solution-
Move disk 1 from peg L to peg R
Move disk 2 from peg L to peg M
Move disk 1 from peg R to peg M
Move disk 3 from peg L to peg R
Move disk 1 from peg M to peg L
Move disk 2 from peg M to peg R
Move disk 1 from peg L to peg R

Run time = 27.0 ms.
```

##### Iteration Method

```
Towers of Hanoi 🗼 - Iteration Method
Enter the number of disks: 3
-Initial Configuration-

1  0  0  
2  0  0  
3  0  0  

-Solution-

0  0  0  
2  0  0  
3  0  1  

0  0  0  
0  0  0  
3  2  1  

0  0  0  
0  1  0  
3  2  0  

0  0  0  
0  1  0  
0  2  3  

0  0  0  
0  0  0  
1  2  3  

0  0  0  
0  0  2  
1  0  3  

0  0  1  
0  0  2  
0  0  3  

Total steps: 7

Run time = 16.0 ms.
```

