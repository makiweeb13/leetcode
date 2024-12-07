/**
 * @param {number} n
 * @return {number}
 */
var climbStairs = function(n) {

    let k, x = 0, y = 1

    while (n > 0) {
        k = x + y
        x = y
        y = k
        n--
    }

    return k
};