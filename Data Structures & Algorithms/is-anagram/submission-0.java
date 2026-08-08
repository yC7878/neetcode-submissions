
class Solution {
    public boolean isAnagram(String s, String t) {

        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        java.util.Arrays.sort(sChar);
        java.util.Arrays.sort(tChar);

        String sortS = new String(sChar);
        String sortT = new String(tChar);

        return(sortS.equals(sortT));
    }
}
