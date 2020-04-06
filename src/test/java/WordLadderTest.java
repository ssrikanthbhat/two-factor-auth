import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordLadderTest {

    @Test
    public void testNumberOfStepsWithEmptyInput() {
        WordLadder wordLadder = new WordLadder();
        int numberOfSteps = wordLadder.numberOfSteps("", "", new ArrayList<String>());
        Assertions.assertTrue(numberOfSteps == 0);
    }

    @Test
    public void testNumberOfStepsWithNull() {
        WordLadder wordLadder = new WordLadder();
        int numberOfSteps = wordLadder.numberOfSteps("", "", null);
        Assertions.assertTrue(numberOfSteps == 0);

    }

    @Test
    public void testNumberOfStepsWithEndWordMissingInTheList() {
        WordLadder wordLadder = new WordLadder();
        List list = new ArrayList<String>();
        list.add("hot");
        list.add("dot");
        list.add("dog");
        list.add("lot");
        list.add("log");
        list.add("cog");
        int numberOfSteps = wordLadder.numberOfSteps("hit", "cag", list);
        Assertions.assertTrue(numberOfSteps == 0);

    }

    @Test
    public void testNumberOfStepsWithValidInput() {
        WordLadder wordLadder = new WordLadder();

        List list = new ArrayList<String>();
        list.add("hot");
        list.add("dot");
        list.add("dog");
        list.add("lot");
        list.add("log");
        list.add("cog");
        int numberOfSteps1 = wordLadder.numberOfSteps("hit", "cog", list);
        Assertions.assertTrue(numberOfSteps1 == 5);
    }
}
