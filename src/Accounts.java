public class Accounts {
    public static void main(String[] args) {
        int m = 10, n =10;
        int[][] accounts = new int[m][n];
        int max = 0;
        for (int i = 0; i <= accounts.length; i++){
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (sum < max){
                max = sum;
            }
        }
    }
}
