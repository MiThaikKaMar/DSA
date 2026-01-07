/* Container with Most Water
Last Updated : 12 Aug, 2025
Given an array arr[] of non-negative integers, where each element arr[i] represents the height of the vertical lines, find the maximum amount of water that can be contained between any two lines, together with the x-axis.

Examples :  

Input: arr[] = [1, 5, 4, 3]
Output: 6
Explanation: 5 and 3 are 2 distance apart. So the size of the base = 2. Height of container = min(5, 3) = 3. So total area = 3 * 2 = 6.

Input: arr[] = [3, 1, 2, 4, 5]
Output: 12
Explanation: 5 and 3 are 4 distance apart. So the size of the base = 4. Height of container = min(5, 3) = 3. So total area = 4 * 3 = 12.

Input: arr[] = [2, 1, 8, 6, 4, 6, 5, 5]
Output: 25
Explanation: 8 and 5 are 5 distance apart. So the size of the base = 5. Height of container = min(8, 5) = 5. So, total area = 5 * 5 = 25. */

// The idea is to evaluate all possible pairs of lines in the array. For each line arr[i], treat it as the left boundary, and then iterate through all lines to its right (arr[j], where j > i) to consider them as the right boundary.
//For every such pair, compute the water that can be trapped between them using the formula: min(arr[i], arr[j]) × (j - i)
//This represents the height (limited by the shorter line) multiplied by the width between the two lines. Finally, keep track of the maximum water obtained among all such pairs.



class GfG{
  
  static int maxWater(int[] arr){
    
    int l = arr.length;
    int max = 0;
    
    for(int i=0; i < l-1; i++){
      
      for(int j= i+1 ; j < l; j++){
        int water = Math.min(arr[i],arr[j]) * (j-i);
        
        max = Math.max(max, water);
      }
    }
    return max;
    
  }
  


  public static void main(String[] args){
    
    
    int[] arr = {3, 1, 2, 4, 5};
    
    System.out.print(maxWater(arr));
  }

}



/* Dart version
import 'dart:math';

int maxWater(List<int> arr){
  int l = arr.length;
  int res = 0;
  
  
  for(int i =0; i < l-1;i++){
    for(int j=i+1;j < l; j++){
      int water = min(arr[i],arr[j]) * (j-i);
      
      
      res = max(res, water);
    }
    
  }
  return res;
}





void main(){
  
  List<int> arr = [2, 1, 8, 6, 4, 6, 5, 5];
  
  
  print(maxWater(arr));
  
} */