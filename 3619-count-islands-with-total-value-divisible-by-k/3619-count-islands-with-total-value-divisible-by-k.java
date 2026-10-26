class Solution {
    int dirn[][] = {{1,0},{0,1},{-1,0},{0,-1}};
    long sum=0;
    public void countI(int grid[][], int visited[][], int r, int c){
        visited[r][c]=1;
        sum += grid[r][c];
        for(int i=0; i<4; i++){
            int n_r = dirn[i][0] + r;
            int n_c = dirn[i][1] + c;
            if(n_r>=0 && n_r<grid.length && n_c>=0 && n_c<grid[0].length && visited[n_r][n_c]==0 && grid[n_r][n_c]!=0){
                countI(grid,visited,n_r,n_c);
            }
        }
    }
    public int countIslands(int[][] grid, int k) {
        int visited[][] = new int[grid.length][grid[0].length];
        int res=0;

        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(visited[i][j]==0 && grid[i][j]!=0){
                    sum=0;
                    countI(grid,visited,i,j);
                    if(sum%k==0){
                        res++;
                    }
                }
            }
        }
        return res;
    }
}