
// Product of Array Except Self
// Last Updated : 23 Jul, 2025
// Given an array arr[] of n integers, construct a product array res[] (of the same size) such that res[i] is equal to the product of all the elements of arr[] except arr[i]. 

// Example: 

// Input: arr[] = [10, 3, 5, 6, 2]
// Output: [180, 600, 360, 300, 900]
// Explanation: 

// For i=0, res[i] = 3 * 5 * 6 * 2 is 180.
// For i = 1, res[i] = 10 * 5 * 6 * 2 is 600.
// For i = 2, res[i] = 10 * 3 * 6 * 2 is 360.
// For i = 3, res[i] = 10 * 3 * 5 * 2 is 300.
// For i = 4, res[i] = 10 * 3 * 5 * 6 is 900.
// Input: arr[] = [12, 0]
// Output: [0, 12]
// Explanation: 

// For i = 0, res[i] = 0.
// For i = 1, res[i] = 12.

//The idea is simple, for every element arr[i], we compute product of all elements except itself. To compute the product, we run an inner loop.

import java.util.Arrays;

class GfG{
  
  
  static int[] productExceptSelf(int[] arr){
    
    int l = arr.length;
    
    int[] res = new int[l];
      
      Arrays.fill(res, 1);
    
    for(int i = 0; i < l ;i++){
      
      for(int j=0; j < l; j++){
        if(i != j){
          res[i] *= arr[j];
        }
      }
      
    }
    return res;
    
  }


  public static void main(String[] args){
    
    int[] arr = {10, 3, 5, 6, 2};
    
    int[] res = productExceptSelf(arr);
    
    for(int i=0 ; i< res.length; i++){
      System.out.print(res[i]+" ");
    }
   
  }
}



// ***** Dart version*********
// List<int> productArrayExceptSelf(List<int> arr){
  
//   int l = arr.length;
//   List<int> res = List.filled(l, 1);
  
//   for(int i = 0;i<l;i++){
//     for(int j = 0 ; j< l;j++){
//       if(i != j){
//         res[i] *= arr[j];
//       }
//     }
//   }
  
//   return res;
// }


// void main(){
//   List<int> arr = [10,3,5,6,2];
  
//   print(productArrayExceptSelf(arr));
  
  
// }