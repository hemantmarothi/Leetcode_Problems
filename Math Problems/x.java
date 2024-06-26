// 883. Projection Area of 3D Shapes
// Easy
// Topics
// Companies
// You are given an n x n grid where we place some 1 x 1 x 1 cubes that are axis-aligned with the x, y, and z axes.

// Each value v = grid[i][j] represents a tower of v cubes placed on top of the cell (i, j).

// We view the projection of these cubes onto the xy, yz, and zx planes.

// A projection is like a shadow, that maps our 3-dimensional figure to a 2-dimensional plane. We are viewing the "shadow" when looking at the cubes from the top, the front, and the side.

// Return the total area of all three projections.

 

// Example 1:


// Input: grid = [[1,2],[3,4]]
// Output: 17
// Explanation: Here are the three projections ("shadows") of the shape made with each axis-aligned plane.
// Example 2:

// Input: grid = [[2]]
// Output: 5
// Example 3:

// Input: grid = [[1,0],[0,2]]
// Output: 8
 

// Constraints:

// n == grid.length == grid[i].length
// 1 <= n <= 50
// 0 <= grid[i][j] <= 50

||=====================================================================================================================================================================================||

class Solution {
    public int projectionArea(int[][] grid) {
        int n = grid.length;
        int xyArea = 0; // Projection on the xy-plane
        int yzArea = 0; // Projection on the yz-plane
        int zxArea = 0; // Projection on the zx-plane
        
        for (int i = 0; i < n; i++) {
            int maxRow = 0; // Maximum value in the current row for zx-plane
            int maxCol = 0; // Maximum value in the current column for yz-plane
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) {
                    xyArea++; // Count the non-zero values for the xy-plane
                }
                maxRow = Math.max(maxRow, grid[i][j]); // Find max in the row for zx-plane
                maxCol = Math.max(maxCol, grid[j][i]); // Find max in the column for yz-plane
            }
            zxArea += maxRow; // Add the maximum value of the row to the zx-area
            yzArea += maxCol; // Add the maximum value of the column to the yz-area
        }
        
        return xyArea + yzArea + zxArea;
    }
}
