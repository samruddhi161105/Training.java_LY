package String;
//to find vowel in given name               
public class string1 {
    public static void main(String[] args) {            
        String name = "Samruddhi";
        System.out.println("Vowels in the name are:");

        for (int i = 0; i < name.length(); i++) {
            char ch = Character.toLowerCase(name.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch);
            }
        }
    }
}

