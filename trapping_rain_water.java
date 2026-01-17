
// Trapping Rain Water Problem
// Given an array arr[] of size n consisting of non-negative integers, where each element represents the height of a bar in an elevation map and the width of each bar is 1, determine the total amount of water that can be trapped between the bars after it rains.
// Examples:
// Input: arr[] = [3, 0, 1, 0, 4, 0, 2]Output: 10Explanation: The expected rainwater to be trapped is shown in the above image.Input: arr[] = [3, 0, 2, 0, 4]Output: 7Explanation: We trap 0 + 3 + 1 + 3 + 0 = 7 units.Input: arr[] = [1, 2, 3, 4]Output: 0Explanation: We cannot trap water as there is no height bound on both sides
// Traverse every array element and find the highest bars on the left and right sides. Take the smaller of two heights. The difference between the smaller height and the height of the current element is the amount of water that can be stored in this array element.

// Step-by-step explanation
// Suppose you have this elevation map:
// Index:  0 1 2 3 4 5
// Height: 3 0 0 2 0 4

// We analyze each index independently.

// Step 1: Find the tallest bar to the left
// For a position i, look at all bars from 0 to i.
// Example at index 4 (height = 0):
// Left bars: [3,0,0,2,0]
// Left max=3


// Step 2: Find the tallest bar to the right
// Look at all bars from i to the end.
// Right bars: [0,4]
// Right max=4


// Step 3: Water level is limited by the shorter side
// Waterlevel = min(left_max, right_max)
//              = min(3,4)
//              =3

// Why?
// If water goes above height 3, it spills over the left side.

// Step 4: Subtract the current bar height
// Water atindex i = waterlevel − height[i]
//                  =3 −0
//                  =3 units

// That’s how much water sits on top of this bar.

// So for very index:
// water[i] = min(max_left, max_right) − height[i]




class GfG {
  
  static int maxWater(int[] arr){
    
    int res = 0;
    
      // For every element of the array
    for(int i=1 ; i < arr.length-1 ; i++){
      
      
        // Find the maximum element on its left
      int left = arr[i];
      for(int j= 0; j < i; j++){
        left = Math.max(left, arr[j]);
      }
      
         // Find the maximum element on its right
      int right = arr[i];
      for(int j = i+1; j < arr.length; j++){
        right = Math.max(right, arr[j]);
      }
      
      
         // Update the maximum water
      res += Math.min(left, right) - arr[i];

      

    }
    return res;
    
    
  }
  
  
public static void main(String[] args){
  
  int[] arr = {2, 1, 5, 3, 1, 0, 4 };
  
  
  System.out.print(maxWater(arr));
  
}

}

// *****Dart**************


// import 'dart:math';

// int maxWater(List<int> arr){
  
//   int res = 0; 
  
  
//   for(int i = 1 ; i < arr.length-1;i++){
    
//     int left = arr[i];
    
//     for(int j = 0; j < i; j++){
//       left = max(left, arr[j]);
//     }
    
//     int right = arr[i];
//     for(int j= i+1; j < arr.length; j++){
//       right = max(right, arr[j]);
//     }
    
    
//     res += min(left, right) - arr[i];
    
//   }
  
//   return res;
  
  
// }

// void main(){
//   List<int> arr = [2, 1, 5, 3, 1, 0, 4 ];
  
//   print(maxWater(arr));
  
// }
