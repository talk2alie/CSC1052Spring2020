
public class Palindrome {

    public static void main(String[] args) {
        System.out.println();

        String[] phrases = {
            "232",
            "American Hero",
            "Sator Arepo Tenet Opera Rotas",
            "In girum imus nocte et consumimur igni",
            "deified", 
            "civic", 
            "radar", 
            "level",
            "avocados are weird",
            "rotor", 
            "kayak",
            "oyster is the beast", 
            "reviver", 
            "racecar", 
            "redder", 
            "madam",
            "Lolllapulosa"
        };
        for (String phrase : phrases) {
            System.out.println(isPalindrome(phrase));
        }

        System.err.println();
    }

    static boolean isPalindrome(String text) {
        if(text == null || text.length() <= 1) {
            return true;
        }

        text = text.replace(" ", "").toLowerCase();
        for(int front = 0, back = text.length() - 1; front < back; front++, back--) {
            if(text.charAt(front) != text.charAt(back)) {
                return false;
            }
        }

        return true;
    }
}