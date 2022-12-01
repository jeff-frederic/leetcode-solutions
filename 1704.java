class Solution {
    public boolean halvesAreAlike(String s) {
        // Capitalize string
        s = s.toUpperCase();

        // Get half index
        int half = s.length()/2;

        // Split string into halves
        String a = s.substring(0, half);
        String b = s.substring(half, s.length());

        // Save all CAPS values into array
        Set<Character> vowels = Set.of('A', 'E', 'I', 'O', 'U');

        // Keep track of vowels in each half
        int countA = 0; 
        int countB = 0; 
        
        // Iterate through both strings (since they are the same length)
        for(int i=0; i<half; i++){

            // Check if vowels are contained for each
            //  then add to counters
            if(vowels.contains(a.charAt(i)))countA++;   
            if(vowels.contains(b.charAt(i)))countB++;
        }

        // boolean | check if they have the same num of vowels
        return countA == countB;
    }
}
