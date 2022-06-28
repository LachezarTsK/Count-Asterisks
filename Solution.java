
public class Solution {

    public int countAsterisks(String inputString) {
        int countBars = 0;
        int countAsterisks = 0;

        for (int i = 0; i < inputString.length(); ++i) {
            countBars += inputString.charAt(i) == '|' ? 1 : 0;
            countAsterisks += inputString.charAt(i) == '*' && countBars % 2 == 0 ? 1 : 0;
        }
        return countAsterisks;
    }
}
