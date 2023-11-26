
// 100134. Count Beautiful Substrings I
// User Accepted:6502
// User Tried:7370
// Total Accepted:6776
// Total Submissions:11436
// Difficulty:Medium
// You are given a string s and a positive integer k.

// Let vowels and consonants be the number of vowels and consonants in a string.

// A string is beautiful if:

// vowels == consonants.
// (vowels * consonants) % k == 0, in other terms the multiplication of vowels and consonants is divisible by k.
// Return the number of non-empty beautiful substrings in the given string s.

// A substring is a contiguous sequence of characters in a string.

// Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.

// Consonant letters in English are every letter except vowels.

public class BeautifulStrings{
    public static void main(String[] args) {
        
    }class Solution {
        public int beautifulSubstrings(String s, int k) {
            int result = 0;
            int n = s.length();
    
            for (int i = 0; i < n; i++) {
                int vowels = 0;
                int consonants = 0;
    
                for (int j = i; j < n; j++) {
                    char ch = s.charAt(j);
                    if (isVowel(ch)) {
                        vowels++;
                    } else {
                        consonants++;
                    }
    
                    if (vowels == consonants && (vowels * consonants) % k == 0) {
                        result++;
                    }
                }
            }
    
            return result;
        }
    
        private boolean isVowel(char ch) {
            return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
        }
    }
    
}