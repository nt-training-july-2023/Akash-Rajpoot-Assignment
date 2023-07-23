class PalindromeNumber {
  public static void main(String[] args) {
    
    int num = 3553, reversedNum = 0, remainder;
    int originalNum = num;
    while (num != 0) {
      remainder = num % 10;
      reversedNum = reversedNum * 10 + remainder;
      num /= 10;
    }
    // CHECK IF BOTH REVERSED AND ORIGINAL MATCH IF MATCH THEN ITS A PALINDROME
    if (originalNum == reversedNum) {
      System.out.println(originalNum + " is Palindrome.");
    }
    else {
      System.out.println(originalNum + " is not Palindrome.");
    }
  }
}