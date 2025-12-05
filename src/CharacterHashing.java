public class CharacterHashing {
    public static void main(String[] args) {
        String s="sbaachabhweg";
        int[] hash = new int[26];

        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)-'a']++;
        }
        System.out.println(hash['b'-'a']);
    }
}
