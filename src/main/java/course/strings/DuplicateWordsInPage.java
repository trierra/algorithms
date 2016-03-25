package course.strings;

/**
 * @author trierra
 * @date 3/10/16.
 */
public class DuplicateWordsInPage {

    static void findDuplicatesBruteForce(String page) {
        int count = 1;
        String[] words = page.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals("-1")) {
                for (int j = i+1; j < words.length; j++) {
                    if (words[i].equals(words[j])) {
                        count++;
                        words[j] = "-1";
                    }
                }
                System.out.println(words[i] + " amount is " + count);
                count = 1;
            } else {
                continue;
            }
        }
    }

    public static void main(String[] args) {
        findDuplicatesBruteForce("All of the game’s levels (apart from level one) are locked when the game is first played. Every time a player finishes a level, that level is unlocked for all players on the device. The LevelTracker structure uses type properties and methods to keep track of which levels of the game have been unlocked. It also tracks the current level for an individual player.");
    }
}
