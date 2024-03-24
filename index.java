import java.io.*;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

class index {

//     ---------Sum of natural numbers---------

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the natural numbers");
//         int i = 1, sum = 0, num = sc.nextInt();
//         while (i <= num) {
//             sum += i;
//             i++;
//         }
//         System.out.println("the sum of your natural numbers is: " + sum);
//     }
// }
//     -----------Fibonacci starting from any two numbers-----------

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number");
//         int i = 1, n1 = 0, n2 = 1, n3, num = sc.nextInt();
//         while (i <= num) {
//             System.out.print(n1 + " ");
//             n3 = n1 + n2;
//             n1 = n2;
//             n2 = n3;
//             i++;
//         }
//     }
// }

//     ----------Upper to Lowercase letters--------------

//     public static void main(String[] args) {
//         String str = "My name is mohanprince";
//         StringBuffer str1 = new StringBuffer(str);
//         for (int i = 0; i < str.length(); i++) {
//             if (Character.isLowerCase(str.charAt(i))) {
//                 str1.setCharAt(i, Character.toUpperCase(str.charAt(i)));
//             } else if (Character.isUpperCase(str.charAt(i))) {
//                 str1.setCharAt(i, Character.toLowerCase(str.charAt(i)));
//             }
//         }
//         System.out.println("String after case conversion: " + str);
//     }
// }

//     ----------pascal triangle program----------

//     public int factorial(int i) {
//         if (i == 0)
//             return 1;
//         return i * factorial(i - 1);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number: ");
//         int n = sc.nextInt(),i,j;
//         index d = new index();
//             for(i=0;i<=n;i++){
//                 for(j=0;j<=n-i;j++){
//                     System.out.print(" ");
//                 }
//                 for(j=0;j<=i;j++){
//                     System.out.print(" " +d.factorial(i) / (d.factorial(i-j) * (d.factorial(j))));
//                 }
//                 System.out.println();
//             }
//      }

//     ---------LCM GCD Ex-1----------

//         public static void main(String[] args) {
//             Scanner sc = new Scanner(System.in);
//             System.out.println("Enter the value of a and b:");
//             int a = sc.nextInt(),b = sc.nextInt(), gcd = 1;
//                 for(int i = 1;i <= a && i <= b; i++) {
//                     if(a % i==0 && b % i==0)
//                         gcd = i;
//                     }
//                 int lcm = (a*b)/gcd;
//                 System.out.printf("LCM of %d and %d is %d:",a,b,lcm);
//     }

//     ----------Ex-2----------

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the number of a and b:");
//         int x = sc.nextInt(), y = sc.nextInt(), i;
//         int a = (x > y) ? x : y;
//         for (i = a; i <= x * y; i = +a) {            
//             if (i % x == 0 && i % y == 0)
//                 break;
//         }
//         System.out.println("LCM of " + x + " and " + y + " is: " + i);
//     }
// }

//     -----Prime numbers between two intervals Ex-1-------

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter any two numbers:");
//         int a = sc.nextInt(),b = sc.nextInt(),i,j,flag;
//             System.out.printf("prime numbers between %d and %d are: ",a,b);
//             for(i = a;i <= b; i++){
//                 if(i == 1 || i == 0)
//                 continue;
//             // flag variable to tell
//             // if i is prime or not
//             flag = 1;
//             for(j = 2;j <= i/2;j++){
//                 if(i % j ==0){
//                 flag = 0;
//                 break;
//             }
//         }
//         if(flag == 1)
//             System.out.print(i);
//         }
//     }

//     --------Ex-2--------

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter any two numbers:");
//         int a = sc.nextInt(), b = sc.nextInt();
//         while (a < b) {
//             boolean flag = false;
//             for (int i = 2; i <= a / 2; i++) {
//                 if (a % i == 0) {
//                     flag = true;
//                     break;
//                 }
//             }
//             if (!flag && a != 0 && a != 1)
//                 System.out.print(a + " ");
//             a++;
//         }
//     }
// }

//     ---------Factors of numbers--------------------

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number: ");
//         int num = sc.nextInt();
//         // for(int i = num;i <= Math.abs(num);i++){ // this line for factors of
//             negative num
//                 for(int i = 1;i <= num;i++){ // this line is positive num
//                 // if(i == 0){ // skips iteration for i = 0 (negative num)
//                 // continue;
//                 // }
//                 // else{
//                 if(num % i == 0){
//                     System.out.print(i+" ");
//             }
//         }
//     }

//     -------------factors of prime-----------

//     public static void primefactors(int n) {
//         while (n % 2 == 0) {
//             System.out.print(2 + " ");
//             n /= 2;
//         }
//         for (int i = 3; i <= Math.sqrt(n); i += 2) {
//             while (n % i == 0) {
//                 System.out.print(i + " ");
//                 n /= i;
//             }
//         }
//         if (n > 2) {
//             System.out.print(n);
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the prime number: ");
//         int n = sc.nextInt();
//         primefactors(n);
//     }
// }

//     ---------Binary to decimal to octal----------

//     public static void main(String[] args) {
//         long binary = 10110101;
//         int octal = convertBinarytoOctal(binary);
//         System.out.print(binary + " in binary converted to " + octal + " octal number");
//     }

//     public static int convertBinarytoOctal(long binaryNumber) {
//         int octalNumber = 0, decimalNumber = 0, i = 0;
//         while (binaryNumber != 0) {
//             decimalNumber += (binaryNumber % 10) * Math.pow(2, i);
//             i++;
//             binaryNumber /= 10;
//         }
//         i = 1;
//         while (decimalNumber != 0) {
//             octalNumber += (decimalNumber % 8) * i;
//             decimalNumber /= 8;
//             i *= 10;
//         }
//         return octalNumber;
//     }
// }

//     --------counting number of digits in integer------

//     static int countDigits(int num) {
//         int count = 0;
//         while (num != 0) {
//             num /= 10;
//             ++count;
//         }
//         return count;
//     }

//     public static void main(String[] args) {
//         int num = 241356;
//         System.out.println("the number of digits in integer is : " + countDigits(num));
//     }
// }

//     --------reverse the number-------

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the original num: ");
//         int num = sc.nextInt(), reverse = 0;
//         for (; num != 0; num /= 10) {
//             int digit = num % 10;
//             reverse = reverse * 10 + digit;
//             // num /= 10;
//         }
//         System.out.println("the reversed num is: " + reverse);
//     }
// }

//     ------------number palindrome--------------

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the palindrome number: ");
//         int n = sc.nextInt(), r, sum = 0, temp;
//         temp = n;
//         while (n > 0) {
//             r = n % 10;
//             sum = (sum * 10) + r;
//             n /= 10;
//         }
//         System.out.println((temp == sum) ? "palindrome number" : "not palindrome number");
//     }
// }

//     ---------digit summation------------

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int num = sc.nextInt(), digit, sum = 0;
//             while(num > 0){
//             digit = num % 10;
//             sum += digit;
//             num /= 10;
//             }
//         System.out.println("sum of digits "+sum);
//     }

// }

//     --------------EX-2 using for loop--------------------

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         long num = sc.nextLong(), sum;
//             for(sum = 0;num != 0;num /= 10){
//             sum += num % 10;
//             }
//         System.out.println("sum of digits "+sum);
//     }

// }

//     --------------EX-3 using for recursion--------------------

//     static int findSum(int num) {
//         return num == 0 ? 0 : num % 10 + findSum(num /= 10);
//     }

//     public static void main(String[] args) {
//         int num = 1234;
//         System.out.println("sum of digits " + findSum(num));
//     }

// }

//     // ------------armstrong number------------

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number");
//         int num = sc.nextInt(), original, remainder, result = 0;
//         original = num;
//         while (original != 0) {
//             remainder = original % 10;
//             result += Math.pow(remainder, 3);
//             original /= 10;
//         }
//         if (result == num) {
//             System.out.println(num + " is Armstrong number");
//         } else {
//             System.out.println(num + " is not Armstrong number");
//         }
//     }

// }

//     // --------Fibonacci using array--------

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number:");
//         int lenght = sc.nextInt();
//         int[] p = new int[lenght];
//         printTerms(p, lenght);
//     }

//     public static int getNTerms(int[] p, int lenght) {
//         p[1] = 0;
//         p[2] = 1;
//         int newTerm = 0;
//         if (lenght == 1)
//             return (p[1]);
//         else if (lenght == 2)
//             System.out.println(p[1] + " " + p[2]);
//         else {
//             System.out.print(p[1] + " " + p[2] + " ");
//             for (int i = 3; i <= lenght; i++) {
//                 newTerm = p[1] + p[2];
//                 System.out.print(newTerm + " ");
//                 p[1] = p[2];
//                 p[2] = newTerm;
//             }
//         }
//         return newTerm;
//     }

//     public static void printTerms(int[] p, int lenght) {
//         System.out.print(getNTerms(p, lenght));
//     }
// }

    // ---------find largest number in an array-----------

    static int largest(int arr[],int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }
    static int smallest(int arr[],int n) {
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            min = Math.min(min, arr[i]);
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 25, 34, 669, 475, 6664, 586 };
        int N = arr.length;
        System.out.println("The largest number is: " + largest(arr,N));
        System.out.println("The smallest number is: " + smallest(arr, N));
    }
}
