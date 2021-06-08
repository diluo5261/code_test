class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        while(k > 0){
            
            int prev= grid[m -1][n -1];
            for(int i =0; i<m ; i++){
                for(int j = 0; j< n ; j++){
                    int tmp = grid[i][j];
                    grid[i][j] = prev;
                    prev = tmp;
                }
            }
            k--;
        }

        List<List<Integer>> ret = new ArrayList<>();
        for(int i = 0;i < m ; i++){
            List<Integer> list = new ArrayList<>();
            for(int j =0 ;j < n ;j++){
                list.add(grid[i][j]);
            }
            ret.add(list);
        }
        return ret;

    }
}