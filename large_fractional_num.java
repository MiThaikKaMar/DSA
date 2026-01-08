/* Find the Factorial of a large number
Last Updated : 23 Jul, 2025
Factorial of a non-negative integer, is the multiplication of all integers smaller than or equal to n. 

Factorial of a number
Factorial of a number
Examples: 

Input: 100
Output: 933262154439441526816992388562667004-
         907159682643816214685929638952175999-
         932299156089414639761565182862536979-
         208272237582511852109168640000000000-
         00000000000000

Input: 50
Output: 3041409320171337804361260816606476884-
         4377641568960512000000000000 */

         /* **********************
         Why normal (conventional) factorial code fails for large numbers

When you compute a factorial the usual way:

fact = 1
for i in range(2, 101):
    fact *= i
print(fact)


this works only if the computer can store that big number.

But:

5! = 120 ✅ fits easily

20! = 2,432,902,008,176,640,000 ✅ still fits in a 64-bit integer

100! has 158 digits ❌ way too large

Most programming languages (like C, C++, Java) have a fixed-size integer type (int, long, etc.), and they simply run out of space — the number “overflows”.

So, we can’t store 100! directly in a normal variable.

🧮 How to handle very large factorials

We use a big number simulation — basically storing the large number as an array of its digits, and performing manual multiplication, digit by digit (just like how you’d multiply on paper).

🧩 Example Idea

Suppose we have 5189, and we want to multiply it by 10.

We store it as:

res[] = {9, 8, 1, 5}  ← digits in reverse (for easy math)
x = 10


Now we multiply each digit one by one while keeping track of carry, just like long multiplication.

Step	i	Calculation	    res[i]	carry
1	    0	9×10 + 0 = 90	0	    9
2	    1	8×10 + 9 = 89	9	    8
3	    2	1×10 + 8 = 18	8	    1
4	    3	5×10 + 1 = 51	1	    5

Now carry = 5, so we add it as a new digit:

res = {0, 9, 8, 1, 5}


Which means the final number = 51890 ✅
          */

         /* *******************
         
         MAX Size:
         10! has approximately 7 digits.
50! has approximately 65 digits.
100! has approximately 158 digits.
200! has approximately 375 digits.
500! has approximately 1135 digits.
1000! has approximately 2568 digits.

          */

         /*
         🧠 Key concept: Arrays are passed by reference

In Java, when you pass an array (like res[]) into a method,
you’re not passing a copy — you’re passing a reference to the same memory location.

That means:

Both the caller (factorial()) and the callee (multiply()) refer to the same actual array in memory.

Any changes made to res[] inside multiply() are visible outside in factorial().
          */

         class GfG{
  
  
  static void fractional(int num){
    
    int[] res = new int[500];
    
    // Initialize result
    res[0] = 1;
    int resSize = 1;
    
    // Apply simple factorial formula
        // n! = 1 * 2 * 3 * 4...*n
    for(int i = 2 ; i <= num ; i++){
      
      resSize = multiply(i, res, resSize);
      
    }
    
    for(int i = resSize - 1 ; i >= 0; i--){
      System.out.print(res[i]);
    }
    
   
    
  }
  

      // This function multiplies x with the number
    // represented by res[]. res_size is size of res[] or
    // number of digits in the number represented by res[].
    // This function uses simple school mathematics for
    // multiplication. This function may value of res_size
    // and returns the new value of res_size
  static int multiply(int num, int res[], int resSize){
    
    
    int carry = 0;
    

    // One by one multiply n with individual
        // digits of res[]
    for(int i = 0; i < resSize ; i++){
      
      int prod = (res[i] * num) + carry;
      res[i] = prod % 10; // Store last digit of
                                // 'prod' in res[]
            carry = prod / 10; // Put rest in carry
      
    }
    
     // Put carry in res and increase result size
    while(carry != 0){
      
      res[resSize] = carry % 10;
      carry = carry / 10;
      resSize++;
      
    }
    
    return resSize;
    
  }
  
  
  
  public static void main(String[] args){
    
    fractional(100);
    
  }
  
}


/* *** Dart version******


void fractional(int num){
  
  List<int> res = List.filled(500,0);
  
  //Initialize
  res[0] = 1;
  int resSize = 1;
  
  for(int i = 2; i <= num; i++){
    resSize = multiply(i, res, resSize);
  }
  
  for(int j = resSize-1; j> 0; j--){
     print(res[j]);
  }
 
  
  
}

int multiply(int num, List<int> res, int resSize){
  
  int carry = 0;
  
  for(int i = 0; i < resSize; i++){
    int prod = (res[i] * num) + carry;
    res[i] = prod % 10;
    carry = prod ~/ 10;
    
  }
  
  while(carry != 0){
    res[resSize] = carry % 10;
    carry = carry ~/ 10;
    resSize++;
  }
  
  return resSize;
  
  
}


void main(){
  
  fractional(100);
  
}
 */