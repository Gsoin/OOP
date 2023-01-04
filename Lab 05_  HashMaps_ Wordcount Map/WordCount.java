import java.util.HashMap;

/**
 * This class has a word list that is used to store the words. It provides some
 * functionality such as to add
 * a word to the list, count a number of time a word that is in the list, and
 * remove all
 * words in the list.
 */
public class WordCount {

    // HashMap collection to store words
    private HashMap<String, Integer> wordList;

    /**
     * This constructor initializes the wordList
     */
    public WordCount() {
        wordList = new HashMap<>();

    }

    /**
     * This constructor initializes the word list to the words in the string,
     * separated by spaces.if String words is null or empty, initialize wordList
     * to be empty HashMap.
     * 
     * @param a String of words
     */
    public WordCount(String words) {
        if (words != null) {
            String[] space = words.split(" ");

            wordList = new HashMap<>();

            for (String t : space) {

                if (wordList.containsKey(t)) {

                    int count = wordList.get(t);
                    wordList.replace(t, ++count);

                } else {

                    wordList.put(t, 1);

                }
            }
        }
    }

    /**
     * This method adds a word to the list of words stored by the object. If
     * String toAdd is null or empty, do not add to the word list.
     * 
     * @param toAdd
     */
    public void addWord(String toAdd) {
        // if toAdd is empty
        if (toAdd != null) {
            if (!toAdd.isEmpty()) {

                if (wordList.containsKey(toAdd)) {

                    int count = wordList.get(toAdd);
                    wordList.replace(toAdd, ++count);

                } else {

                    wordList.put(toAdd, 1);

                }
            }
        }
    }

    /**
     * This method removes all words from the list of words stored by the object
     */
    public void startOver() {

        wordList.clear();// clear

    }

    /**
     * This method returns an integer representing the number of times that a word
     * is
     * in the list of words stored by the object. If the String word is null or
     * empty return 0
     * 
     * @param the word to be checked for number of time that in the list of words
     * @return the number of times a word is in the list
     */
    public int countWord(String word) {

        if (wordList.containsKey(word)) {

            return wordList.get(word);

        } else {
            return 0;
        }
    }
}
