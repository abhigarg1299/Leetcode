package Leetcode;
/*
ques no.852
Peak Index In a Mountaion

Let's call an array arr a mountain if the following properties hold:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... arr[i-1] < arr[i]
arr[i] > arr[i+1] > ... > arr[arr.length - 1]
Given an integer array arr that is guaranteed to be a mountain, return any i such that arr[0] < arr[1] < ... arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].



Example 1:

Input: arr = [0,1,0]
Output: 1
Example 2:

Input: arr = [0,2,1,0]
Output: 1
Example 3:

Input: arr = [0,10,5,2]
Output: 1


Constraints:

3 <= arr.length <= 104
0 <= arr[i] <= 106
arr is guaranteed to be a mountain array.

 */

public class MountainIndexMax {
    public static void main(String[] args) {
    int [] arr={0,2,1,0};
    int ans=peakIndexInMountainArray(arr);
    System.out.println(ans);
    }
    static int peakIndexInMountainArray(int [] arr)
    {
        int start=0;
        int end= arr.length-1;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
            {
                //you are in dec part of array
                // this may be the ans, but look at left
                //this is why end!=mid-1
                end=mid;
            }
            else
            {
                //you are in ascending part of array
                start=mid+1;// beacuse mid+1 element>mid element
            }
        }
        //in the end start== end and pointing to largest number because of 2 checks above
        //start and end are always trying to find max in the above 2 checks
        //hence when they are pointing to just one element , that is the max one
          return arr[start];// return start or end
    }
}
