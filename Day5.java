/*//Find the Leaders in an Array
You are given an integer array arr of size n. An element is considered a leader if it is greater than all the elements to its right. Your task is to find all such leader elements in the array.
Input:
An integer array arr of size n.
Example : 
arr = [16, 17, 4, 3, 5, 2]
Output:
Return an array containing all the leader elements in the order in which they appear in the original array.
Example:
Leaders: [17, 5, 2]
Explanation
16 is not a leader because 17 (to its right) is greater.
17 is a leader because there is no element to its right that is greater.
4 is not a leader because 5 (to its right) is greater.
3 is not a leader because 5 (to its right) is greater.
5 is a leader because there is no element to its right that is greater.
2 is a leader because there is no element to its right.*/

code:

import java.util.Arrays;
public class LeadersInArray {

    public static int[] findLeaders(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];   
        int count = 0;             

        int maxFromRight = arr[n - 1];
        temp[count++] = maxFromRight;      
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                maxFromRight = arr[i];
                temp[count++] = maxFromRight;
            }
        }
        int[] leaders = new int[count];
        int index = 0;
        for (int i = count - 1; i >= 0; i--) {
            leaders[index++] = temp[i];
        }

        return leaders;
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int[] leaders = findLeaders(arr);
        System.out.println("Input : " + Arrays.toString(arr));
        System.out.println("Leaders: " + Arrays.toString(leaders));
    }
}




