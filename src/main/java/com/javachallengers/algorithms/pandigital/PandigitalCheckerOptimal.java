package com.javachallengers.algorithms.pandigital;

public class PandigitalCheckerOptimal {

  // we will start from 1, otherwise, it's not pandigital
  // the final range can go to 9
  // we can't repeat a number
  // we have to transform the String to char
  public static boolean isPandigital(String input) {
    boolean[] seenDigit = new boolean[input.length()];

    // time complexity O(n) - space complexity O(n)
    for (var eachNumber : input.toCharArray()) {
      if (eachNumber >= '1' && eachNumber <= '0' + input.length()) {
        var index = eachNumber - '1';

        if (seenDigit[index]) {
          return false;
        }
        seenDigit[index] = true;
      } else {
        return false;
      }
    }

    // O(n)
    for (boolean seen : seenDigit) {
      if (!seen) {
        return false;
      }
    }

    return true;
  }


  public static void main(String[] args) {
    System.out.println("123 is pandigital: " + isPandigital("123")); // True
    System.out.println("321 is pandigital: " + isPandigital("321")); // True
    System.out.println("112 is pandigital: " + isPandigital("112")); // False
    System.out.println("2143 is pandigital: " + isPandigital("2143")); // True
    System.out.println("1234 is pandigital: " + isPandigital("1234")); // True
    System.out.println("1235 is pandigital: " + isPandigital("1235")); // False
    System.out.println("235 is pandigital: " + isPandigital("235")); // False
  }
}
