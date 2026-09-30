public class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] count = new int[26];
        for (char c : chars.toCharArray()) {
            count[c - 'a']++;
        }

        int[] org = count.clone();
        int res = 0;

        for (String w : words) {
            boolean good = true;
            for (int i = 0; i < w.length(); i++) {
                int j = w.charAt(i) - 'a';
                count[j]--;
                if (count[j] < 0) {
                    good = false;
                    break;
                }
            }
            if (good) {
                res += w.length();
            }
            for (int i = 0; i < 26; i++) {
                count[i] = org[i];
            }
        }
        return res;
    }
}