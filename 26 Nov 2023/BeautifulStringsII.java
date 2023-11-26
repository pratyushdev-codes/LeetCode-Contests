// 100132. Count Beautiful Substrings II
// User Accepted:285
// User Tried:2099
// Total Accepted:320
// Total Submissions:4095
// Difficulty:Hard
// You are given a string s and a positive integer k.

// Let vowels and consonants be the number of vowels and consonants in a string.

// A string is beautiful if:

// vowels == consonants.
// (vowels * consonants) % k == 0, in other terms the multiplication of vowels and consonants is divisible by k.
// Return the number of non-empty beautiful substrings in the given string s.

// A substring is a contiguous sequence of characters in a string.

// Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.

// Consonant letters in English are every letter except vowels.




class Solution {
    public int beautifulSubstrings(String s, int k) {
        int result = 0;
        int n = s.length();
        int[] prefix = new int[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + (isVowel(s.charAt(i)) ? 1 : -1);
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                int vowels = prefix[j] - prefix[i];
                int consonants = (j - i) - vowels;

                if (vowels * consonants % k == 0 && vowels == consonants) {
                    result++;
                }
            }
        }

        return result;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
