<<<<<<< HEAD
<<<<<<< HEAD
import java.util.*;

public class M06_PalindromeClean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        int left = 0, right = s.length() - 1;
        boolean ok = true;
        while (left < right) {
            char c1 = Character.toLowerCase(s.charAt(left));
            char c2 = Character.toLowerCase(s.charAt(right));
            if (!Character.isLetter(c1)) {
                left++;
                continue;
            }
            if (!Character.isLetter(c2)) {
                right--;
                continue;
            }
            if (c1 != c2) {
                ok = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println(ok ? "Yes" : "No");
    }
}


=======
import java.util.*;

public class M06_PalindromeClean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        int left = 0, right = s.length() - 1;
        boolean ok = true;
        while (left < right) {
            char c1 = Character.toLowerCase(s.charAt(left));
            char c2 = Character.toLowerCase(s.charAt(right));
            if (!Character.isLetter(c1)) {
                left++;
                continue;
            }
            if (!Character.isLetter(c2)) {
                right--;
                continue;
            }
            if (c1 != c2) {
                ok = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println(ok ? "Yes" : "No");
    }
}


>>>>>>> 06189ddbb1b4632191b9bc6958300dc3b6ce8204
=======
import java.util.*;

public class M06_PalindromeClean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        int left = 0, right = s.length() - 1;
        boolean ok = true;
        while (left < right) {
            char c1 = Character.toLowerCase(s.charAt(left));
            char c2 = Character.toLowerCase(s.charAt(right));
            if (!Character.isLetter(c1)) {
                left++;
                continue;
            }
            if (!Character.isLetter(c2)) {
                right--;
                continue;
            }
            if (c1 != c2) {
                ok = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println(ok ? "Yes" : "No");
    }
}


>>>>>>> 06189ddbb1b4632191b9bc6958300dc3b6ce8204
