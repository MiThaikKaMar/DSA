
/* Maximum Subarray Sum - Kadane's Algorithm
Last Updated : 22 Jul, 2025
Given an integer array arr[], find the subarray (containing at least one element) which has the maximum possible sum, and return that sum.
Note: A subarray is a continuous part of an array.

Examples:

Input: arr[] = [2, 3, -8, 7, -1, 2, 3]
Output: 11
Explanation: The subarray [7, -1, 2, 3] has the largest sum 11.

Input: arr[] = [-2, -4]
Output: -2
Explanation: The subarray [-2] has the largest sum -2.

Input: arr[] = [5, 4, 1, 7, 8]
Output: 25
Explanation: The subarray [5, 4, 1, 7, 8] has the largest sum 25.*/


//The idea is to run two nested loops to iterate over all possible subarrays and find the maximum sum. The outer loop will mark the starting point of a subarray and inner loop will mark the ending point of the subarray.

class GfG{
  
  static int maxSubarraySum(int[] arr){
    int l = arr.length;
    int res = arr[0];
    
    
    // outer loop for starting point of subarray
    for(int i=0; i < l; i++){
      int currSum = 0;
      // inner loop for ending point of subarray
      for(int j = i ; j < l; j++){
        currSum += arr[j];
        
        res = Math.max(res, currSum);
      }
      
      
      
      
    }
    return res;
    
  }
  
  
  
  public static void main(String[] args){
    int[] arr = {2, 3, -8, 7, -1, 2, 3};
    
    System.out.print(maxSubarraySum(arr));
  }
}




//********* Dart */

// import 'dart:math';

// int maxSubarraySum(List<int> arr){

// int l = arr.length;
//   int res = arr[0];
  
//   for(int i=0; i<l; i++){
//     int currSum = 0;
//     for(int j = i; j<l; j++){
//       currSum += arr[j];
      
//       res = max(res,currSum);
//     }
    
//   }
  

// return res;
// }




// void main(){
  
//   List<int> arr = [2, 3, -8, 7, -1, 2, 3];
  
//   print(maxSubarraySum(arr));
  
// }