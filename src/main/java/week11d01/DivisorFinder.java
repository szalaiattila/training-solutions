package week11d01;

public class DivisorFinder {
    public int findDivisors(int n) {
        if (n == 0) {
            throw new IllegalStateException("Division by 0 no allowed");
        }
        int count = 0;
        String number = String.valueOf(n);
        for (int i = 0; i < number.length(); i++) {
            if (n % Integer.parseInt(String.valueOf(number.charAt(i))) == 0) {
                System.out.println("Divisor: " + number.charAt(i));
                count++;
            } else {
                System.out.println("Not divisor: " + number.charAt(i));
            }
        }
        return count;
    }
