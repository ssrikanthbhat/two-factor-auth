import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PossibleWordsPhoneNumberTest {

    @Test
    public void testCombination() {
        PossibleWordsPhoneNumber possibleWordsPhoneNumber = new PossibleWordsPhoneNumber();
        List list = possibleWordsPhoneNumber.wordCombinationFromPhoneNumber(new int[]{2, 3});
        Assertions.assertTrue(!list.isEmpty());
    }

    @Test
    public void testCombinationWithResults() {
        PossibleWordsPhoneNumber possibleWordsPhoneNumber = new PossibleWordsPhoneNumber();
        List list = possibleWordsPhoneNumber.wordCombinationFromPhoneNumber(new int[]{2, 3, 4});

        List list1 = new ArrayList();
        /**
         *
         * adg adh adi aeg aeh aei afg afh afi bdg bdh bdi beg beh bei bfg bfh bfi cdg cdh cdi ceg ceh cei cfg cfh cfi
         */
        list.add("adg");
        list.add("adh");
        list.add("adi");
        list.add("aeg");
        list.add("aeh");
        list.add("aei");

        list.add("afg");
        list.add("afh");
        list.add("afi");
        list.add("bdg");
        list.add("bdh");
        list.add("bdi");
        list.add("beg");
        list.add("beh");
        list.add("bei");
        list.add("bfg");
        list.add("bfh");
        list.add("bfi");
        list.add("cdg");
        list.add("cdh");
        list.add("cdi");
        list.add("ceg");
        list.add("ceh");
        list.add("cei");
        list.add("cfg");
        list.add("cfh");
        list.add("cfi");
        Assertions.assertFalse(list.size() == list1.size());
    }
}
