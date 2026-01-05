// Given an array arr[] of n integers and a target value, check if there exists a pair whose sum equals the target. This is a variation of the 2-Sum problem.

// Examples: 

// Input: arr[] = [0, -1, 2, -3, 1], target = -2
// Output: true
// Explanation: There is a pair (1, -3) with the sum equal to given target, 1 + (-3) = -2.

// Input: arr[] = [1, -2, 1, 0, 5], target = 0
// Output: false
// Explanation: There is no pair with sum equals to given target.




function twoSum(arr, target) {
    let n = arr.length;

    for (let i = 0; i < n; i++) {
    
        // For each element arr[i], check every
        // other element arr[j] that comes after it
        for (let j = i + 1; j < n; j++) {
        
            // Check if the sum of the current pair
            // equals the target
            if (arr[i] + arr[j] === target) {
                return true;
            }
        }
    }
    // If no pair is found after checking
    // all possibilities
    return false;
}

// Driver Code
let arr = [0, -1, 2, -3, 1];
let target = -2;

if (twoSum(arr, target))
    console.log("true");
else 
    console.log("false");


    // ******Dart version************
    //bool twoSum(List<int> arr, int target) {
//   int n = arr.length;

//   for (int i = 0; i < n; i++) {
//     for (int j = i + 1; j < n; j++) {
//       if (arr[i] + arr[j] == target) {
//         return true;
//       }
//     }
//   }

//   // If no pair found
//   return false;
// }

// bool twoSum1(List<int> arr, int target) {
//   // Outer loop: element 'a'
//   for (int a in arr) {
//     // Inner loop: element 'b'
//     for (int b in arr) {
//       // Make sure we're not adding the same element to itself
//       if (a != b && a + b == target) {
//         return true;
//       }
//     }
//   }
//   return false;
// }

// void main() {
//   List<int> arr = [0, -1, 2, -3, 1];
//   int target = -2;

//   if (twoSum(arr, target)) {
//     print("true");
//   } else {
//     print("false");
//   }
// }
