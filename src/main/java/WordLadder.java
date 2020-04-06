import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class WordLadder {
/**
 * # Example 1:
 *
 * # Input:
 * # beginWord = "hit",
 * # endWord = "cog",
 * # wordList = ["hot","dot","dog","lot","log","cog"]
 *
 * # Output: 5
 *
 * # Explanation: As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog",
 * # return its length 5.
 *
 *
 * # Example 2:
 *
 * # Input:
 * # beginWord = "hit"
 * # endWord = "cog"
 * # wordList = ["hot","dot","dog","lot","log"]
 *
 * # Output: 0
 *
 * # Explanation: The endWord "cog" is not in wordList, therefore no possible transformation.
 *
 * */

    public int numberOfSteps(String beginWord, String endword, List<String> wordList) {

      if (skipProcessing(beginWord, endword, wordList)) return 0;

      Queue<Node> queue = new LinkedList<Node>();
      queue.add(new Node(beginWord, 1));


      while (!queue.isEmpty()) {
        Node currentNode = queue.remove();
        int numSteps = currentNode.numSteps;
        String currentWord = currentNode.word;

        if (currentWord.equals(endword)) {
            return numSteps;
        }

        StringBuffer sb = new StringBuffer(currentWord);
        for (int i=0; i < sb.length(); i++) {
            char temp = sb.charAt(i);
            for ( char c= 'a'; c<= 'z'; c++) {

                if (c == temp) continue;

                sb.setCharAt(i, c);
                if (wordList.remove(sb.toString())) {
                    queue.add(new Node(sb.toString(), numSteps+1));
                }
            }

            sb.setCharAt(i, temp);
        }
      }


      return 0;
    }

    private boolean skipProcessing(String beginWord, String endword, List<String> wordList) {
        return beginWord == "" || endword == "" ||
                wordList == null || wordList.isEmpty() || !wordList.contains(endword);
    }

    private class Node {
        private String word;
        private int numSteps;

        Node(String word, int numSteps) {
            this.numSteps = numSteps;
            this.word = word;
        }
    }

}
