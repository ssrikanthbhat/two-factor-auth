package google;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordBreak {

  /**
   *
   * Given a non-empty string s and a dictionary wordDict containing a list of non-empty words,
   * determine if s can be segmented into a space-separated sequence of one or more dictionary words.
   *
   * Note:
   *
   * The same word in the dictionary may be reused multiple times in the segmentation.
   * You may assume the dictionary does not contain duplicate words.
   * Example 1:
   *
   * Input: s = "leetcode", wordDict = ["leet", "code"]
   * Output: true
   * Explanation: Return true because "leetcode" can be segmented as "leet code".
   * Example 2:
   *
   * Input: s = "applepenapple", wordDict = ["apple", "pen"]
   * Output: true
   * Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
   *              Note that you are allowed to reuse a dictionary word.
   * Example 3:
   *
   * Input: s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]
   * Output: false
   * @param s
   * @param wordDict
   * @return
   */
  public boolean wordBreak(String s, List<String> wordDict) {

    String temp = new String(s);

    for(String dict  : wordDict) {
      if(temp.contains(dict)) {
        temp = temp.replace(dict, "");
        for(String dicta  : wordDict) {
          if(temp.contains(dicta)) {

          }
        }

      }
      if(temp.isEmpty()) return true;
    }
    return false;

  }

  public static void main(String[] args) {
    new WordBreak().wordBreak("leetcode", Arrays.asList("leet", "code"));
    new WordBreak().wordBreak("cars", Arrays.asList("car", "ca", "rs"));
  }
}
