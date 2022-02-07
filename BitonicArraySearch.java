package Leetcode;

public class BitonicArraySearch {
    public static void main(String[] args) {
       int[] array = {1,2,3,4,5,3,1};
       int target = 3;
       int ans=search(array,target);
       System.out.println(ans);


    }
   static  int search(int []arr,int target)
   {
       int peak=peakElementIndex(arr);
       int firstTry=OrderAgnosticBs(arr,target,0,peak);
       if(firstTry!=-1)
       {
           return firstTry;
       }
       return OrderAgnosticBs(arr,target,peak+1,arr.length-1);
   }
    static int peakElementIndex(int []arr)
    {
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            int mid= start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
            {
                end=mid;
            }
            else
            {
                start=mid+1;
            }
        }
        return end;
    }
    static int OrderAgnosticBs(int []arr,int target,int start,int end)
    {
        boolean isAsc=arr[start]<arr[end];
        while(start<=end)
        {
            int mid= start+(end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            if(isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else  {
                    end = mid - 1;
                }
            }
            else
            {
                if (target > arr[mid]) {
                    end= mid -1;
                } else {
                    start= mid + 1;
                }

            }
        }
        return -1;
    }
    }

