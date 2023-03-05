public class grid {
    public static void main(String[] args) {
        int n = 4;
        int[][] grid = new int[n][n];
        int[][] maxlocal = new int[n-2][n-2];

        grid[0] = new int[]{9,9,8,1};
        grid[1] = new int[]{5,6,2,6};
        grid[2] = new int[]{8,2,6,4};
        grid[3] = new int[]{6,2,2,2};
        for (int i = 0; i < grid.length - 2; i++) {
            int k = 0;
            while(k + 2 < n){
                int num = 0;
                int max = 0;
                while(num <= 2){
                    int[] ints = grid[i+num];
                    for (int j = k; j < k + 3; j++) {
                        if(ints[j] > max){
                            max = ints[j];
                        }
                    }
                    num++;
                }
                maxlocal[i][k] = max;
                k++;
            }
        }
        for (int i = 0; i < maxlocal.length; i++) {
            for (int j = 0; j < maxlocal[i].length; j++) {
                System.out.println(maxlocal[i][j]);
            }
        }
    }
}
