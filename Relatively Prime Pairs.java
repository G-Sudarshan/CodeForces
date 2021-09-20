/*

B. Relatively Prime Pairs
time limit per test2 seconds
memory limit per test256 megabytes
inputstandard input
outputstandard output
You are given a set of all integers from 𝑙 to 𝑟 inclusive, 𝑙<𝑟, (𝑟−𝑙+1)≤3⋅105 and (𝑟−𝑙) is always odd.

You want to split these numbers into exactly 𝑟−𝑙+12 pairs in such a way that for each pair (𝑖,𝑗) the greatest common divisor of 𝑖 and 𝑗 is equal to 1. Each number should appear in exactly one of the pairs.

Print the resulting pairs or output that no solution exists. If there are multiple solutions, print any of them.

Input
The only line contains two integers 𝑙 and 𝑟 (1≤𝑙<𝑟≤1018, 𝑟−𝑙+1≤3⋅105, (𝑟−𝑙) is odd).

Output
If any solution exists, print "YES" in the first line. Each of the next 𝑟−𝑙+12 lines should contain some pair of integers. GCD of numbers in each pair should be equal to 1. All (𝑟−𝑙+1) numbers should be pairwise distinct and should have values from 𝑙 to 𝑟 inclusive.

If there are multiple solutions, print any of them.

If there exists no solution, print "NO".

Example
inputCopy
1 8
outputCopy
YES
2 7
4 1
3 8
6 5


*/


import java.lang.*;
import java.util.*;
 
public final class Solution{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long l = in.nextLong();
        long r = in.nextLong();
        System.out.println("YES");
        for(long i=l; i < r; i += 2){
            System.out.println(Long.toString(i) + ' ' + Long.toString(i+1));
        }
    }
}
