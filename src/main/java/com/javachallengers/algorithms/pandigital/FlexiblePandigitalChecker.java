package com.javachallengers.algorithms.pandigital;

public class FlexiblePandigitalChecker {

  public static boolean isPandigital(String input, int m, int n) {
    if (m > n || input == null || input.length() != (n - m + 1)) {
      return false;
    }

    boolean[] seenDigits = new boolean[input.length()];
    // time complexity O(n)
    // space complexity O(n)
    for (var eachNumber : input.toCharArray()) {
      int digit = eachNumber - '0';

      if (digit >= m && digit <= n) {
        int index = digit - m;
        if (seenDigits[index]) {
          return false;
        }

        seenDigits[index] = true;
      } else {
        return false;
      }
    }

    return true;
  }

  public static void main(String[] args) {
//    System.out.println("4678 is not pandigital from 4 to 8: " + isPandigital("4678", 4, 8)); // False - missing 5
//    System.out.println("1234 is pandigital from 1 to 4: " + isPandigital("1234", 1, 4)); // True
//    System.out.println("8642 is not pandigital from 2 to 6: " + isPandigital("8642", 2, 6)); // False, missing '5' and '3'
    System.out.println("24365 is not pandigital from 1 to 6: " + isPandigital("24365", 2, 6)); // False, missing '5' and '3'
  }
}
