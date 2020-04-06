import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class PossibleWordsPhoneNumber {


    /***
     *
     * 1             2 ABC       3 DEF
     * 4 GHI         5 JKL       6 MNO
     * 7 PQRS        8 TUV       9 WXYZ
     * *             0           #
     *
     * Given a keypad similar to phone AS ABOVE, and a n digit number, list all words which are possible by pressing these numbers.
     * For example if input number is 234, possible words which can be formed are (Alphabetical order):
     * adg adh adi aeg aeh aei afg afh afi bdg bdh bdi beg beh bei bfg bfh bfi cdg cdh cdi ceg ceh cei cfg cfh cfi
     * @return
     */
    public List wordCombinationFromPhoneNumber(int[] number) {

        List list = new ArrayList();
        Queue<String> queue = new LinkedList();
        queue.add("");

        // table[i] stores all characters that
        // corresponds to ith digit in phone
        String[] table = { "0", "1", "abc", "def", "ghi", "jkl",
                "mno", "pqrs", "tuv", "wxyz" };

        while (!queue.isEmpty()) {
            String s = queue.remove();
            if(s.length() == number.length) {
                list.add(s);
            } else {
                String letter = table[number[s.length()]];
                for(int i=0; i< letter.length(); i++) {
                    queue.add(s + letter.charAt(i));
                }
            }
        }

        System.out.println(list);
        return list;
        
    }
}
