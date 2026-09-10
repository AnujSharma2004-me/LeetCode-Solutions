class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        int[] a = new int[26];
        int[] b = new int[26];

        for (int i = 0; i < p.length(); i++) {
            a[p.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {

            b[s.charAt(i) - 'a']++;

            if (i >= p.length()) {
                b[s.charAt(i - p.length()) -'a']--;
            }

            if (i >= p.length() - 1) {
                if (java.util.Arrays.equals(a, b))
                    ans.add(i - p.length() + 1);
            }
        }

        return ans;
    }
}