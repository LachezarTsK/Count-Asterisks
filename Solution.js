
/**
 * @param {string} inputString
 * @return {number}
 */
var countAsterisks = function (inputString) {
    let countBars = 0;
    let countAsterisks = 0;

    for (let character of inputString) {
        countBars += character === '|' ? 1 : 0;
        countAsterisks += character === '*' && countBars % 2 === 0 ? 1 : 0;
    }
    return countAsterisks;
};
