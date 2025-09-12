class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        StringBuilder ans = new StringBuilder();

        for (int i = str.length - 1; i >= 0; i--) {
            if (!str[i].isEmpty()) { // skip multiple spaces
          ans.append(str[i]).append(" ");
            }
        }

        return ans.toString().trim(); // remove extra space at end
    }
}
