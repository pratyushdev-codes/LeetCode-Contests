// 100256. Latest Time You Can Obtain After Replacing Characters


// You are given a string s representing a 12-hour format time where some of the digits (possibly none) are replaced with a "?".

// 12-hour times are formatted as "HH:MM", where HH is between 00 and 11, and MM is between 00 and 59. The earliest 12-hour time is 00:00, and the latest is 11:59.

// You have to replace all the "?" characters in s with digits such that the time we obtain by the resulting string is a valid 12-hour format time and is the latest possible.

// Return the resulting string.

 

// Example 1:

// Input: s = "1?:?4"

// Output: "11:54"

// Explanation: The latest 12-hour format time we can achieve by replacing "?" characters is "11:54".

// Example 2:

// Input: s = "0?:5?"

// Output: "09:59"

// Explanation: The latest 12-hour format time we can achieve by replacing "?" characters is "09:59".




public class LatestTime {

    public static void main(String[] args) {
        
    }
    class Solution {
        public String findLatestTime(String s) {
            // Split the input string s into two parts: hour and minute using ":"
            String[] timeParts = s.split(":");
            char[] hours = timeParts[0].toCharArray();
            char[] minutes = timeParts[1].toCharArray();
    
            // Replace the missing hour digits to achieve the latest possible time
            // Replace the first digit of the hour
            if (hours[0] == '?') {
                if (hours[1] == '?' || hours[1] <= '2') {
                    hours[0] = '1'; // For hours from 10-11
                } else {
                    hours[0] = '0'; // For hours from 00-09
                }
            }
            // Replace the second digit of the hour
            if (hours[1] == '?') {
                if (hours[0] == '1') {
                    hours[1] = '9'; // For hours from 10-11
                } else {
                    hours[1] = '9'; // For hours from 00-09
                }
            }
    
            // Replace the missing minute digits to achieve the latest possible time
            // Replace the first digit of the minute
            if (minutes[0] == '?') {
                minutes[0] = '5'; // For the range 0-5 in minutes
            }
            // Replace the second digit of the minute
            if (minutes[1] == '?') {
                minutes[1] = '9'; // For the range 0-9 in minutes
            }
    
            // Combine the updated hours and minutes parts with ":" and return the resulting time
            return new String(hours) + ":" + new String(minutes);
        }
    }
}    
