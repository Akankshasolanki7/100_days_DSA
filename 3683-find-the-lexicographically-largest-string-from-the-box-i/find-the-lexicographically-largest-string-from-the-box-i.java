class Solution {

    public int beststartingpoint(String word, int n) {
        int i = 0; // best starting point
        int j = 1; // keep moving to find the best starting point

        while (j < n) {
            int k = 0;

            // skipping equal characters
            while (j + k < n && word.charAt(i + k) == word.charAt(j + k)) {
                k++;
            }

            if (j + k < n && word.charAt(j + k) > word.charAt(i + k)) {
                i = j; // updating best starting point
                j = j + 1;
            } else {
                j = j + k + 1; // skipping already checked characters
            }
        }

        return i;
    }

    public String answerString(String word, int numFriends) {
        int n=word.length();
        if(numFriends==1){
            return word;
        }
        int i=beststartingpoint(word,n);
        int longestPossiblelength=n-(numFriends-1);
        int cantakeposs=Math.min(longestPossiblelength,n-i);
                return word.substring(i, i + cantakeposs);

    }
}