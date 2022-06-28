
#include <string>
using namespace std;

class Solution {
    
public:
    int countAsterisks(const string& inputString) {
        int countBars = 0;
        int countAsterisks = 0;

        for (const auto& character : inputString) {
            countBars += character == '|' ? 1 : 0;
            countAsterisks += character == '*' && countBars % 2 == 0 ? 1 : 0;
        }
        return countAsterisks;
    }
};
