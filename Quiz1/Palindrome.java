
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
        for (int i = 0; i < phrases.length; ++i) {
            System.out.println((i + 1) + ". " + isPalindrome(phrases[i]));
        }

        System.err.println();
    }

    static boolean isPalindrome(String text) {
        if (text == null || text.length() <= 1) {
            return true;
        }

        for (int front = 0, back = text.length() - 1; front < back; front++, back--) {
            char frontCharacter = text.charAt(front) != ' ' ? Character.toLowerCase(text.charAt(front))
                    : Character.toLowerCase(text.charAt(++front));
            char backCharacter = text.charAt(back) != ' ' ? Character.toLowerCase(text.charAt(back))
                    : Character.toLowerCase(text.charAt(--back));
            if (frontCharacter != backCharacter) {
                return false;
            }
        }

        return true;
    }
}