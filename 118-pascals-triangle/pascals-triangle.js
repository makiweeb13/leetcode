/**
 * @param {number} numRows
 * @return {number[][]}
 */
var generate = function(numRows) {

    let tri = numRows == 1 ? [[1]] : [[1], [1,1]];
    let curr, row;

    for (let i = 2; i < numRows; i++) {
        curr = tri[i-1]
        row = [1]
        for (let j = 0; j < curr.length-1; j++) {
            row.push(curr[j] + curr[j+1])
        }
        row.push(1)
        tri.push(row)
    }
    
    return tri
};