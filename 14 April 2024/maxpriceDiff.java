// You are given an integer array nums.

// Return an integer that is the maximum distance between the indices of two (not necessarily different) prime numbers in nums.

 

// Example 1:

// Input: nums = [4,2,9,5,3]

// Output: 3

// Explanation: nums[1], nums[3], and nums[4] are prime. So the answer is |4 - 1| = 3.

// Example 2:

// Input: nums = [4,8,2,8]

// Output: 0

// Explanation: nums[2] is prime. Because there is just one prime number, the answer is |2 - 2| = 0.



import java.util.HashSet;

public class maxpriceDiff {
    public static void main(String[] args) {
        
    } class Solution {
        // Helper function to check if a number is prime
        private boolean isPrime(int num) {
            if (num < 2) {
                return false;
            }
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    
        // Function to find the maximum distance between indices of two prime numbers in nums
        public int maximumPrimeDifference(int[] nums) {
            // Initialize variables to track the minimum and maximum prime indices
            int minPrimeIndex = -1;
            int maxPrimeIndex = -1;
    
            // Iterate through nums and find the minimum and maximum prime indices
            for (int i = 0; i < nums.length; i++) {
                if (isPrime(nums[i])) {
                    // Update minimum prime index if it is the first prime found
                    if (minPrimeIndex == -1) {
                        minPrimeIndex = i;
                    }
                    // Update maximum prime index
                    maxPrimeIndex = i;
                }
            }
    
            // If we haven't found at least two primes, return 0
            if (minPrimeIndex == -1 || minPrimeIndex == maxPrimeIndex) {
                return 0;
            }
    
            // Return the difference between the maximum and minimum prime indices
            return maxPrimeIndex - minPrimeIndex;
        }
    }
}    