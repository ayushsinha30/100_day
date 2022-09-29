class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int R = matrix.length, C = matrix[0].length;
        int right = C-1, left = 0, bottom = R-1, top = 0;
      
        int[][] dir = new int[][] {
            new int[] {0, 1}, 
            new int[] {1, 0},
            new int[] {0,-1}, 
            new int[] {-1, 0} 
        };
        
        List<Integer> ans = new ArrayList<>();
        int r = 0, c = 0; 
        int d = 0; 
    
        while (ans.size() < R * C) {
            ans.add(matrix[r][c]);
            
            if (d == 0 && c == right) { top += 1; d = 1; }
            
            else if (d == 1 && r == bottom) { right -= 1; d = 2; }
            
            else if (d == 2 && c == left) { bottom -= 1; d = 3; }
            else if (d == 3 && r == top) { left += 1; d = 0; }
            
            
            r += dir[d][0];
            c += dir[d][1];
            
        }
        return ans;
    }
}
