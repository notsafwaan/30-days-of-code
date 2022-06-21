// https://leetcode.com/problems/matrix-diagonal-sum/
class DiagonalSum {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        if(n==1) return mat[0][0];
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=mat[i][i] + mat[i][n-i-1];            
        }
        if(n%2!=0){
            sum-=mat[n/2][n/2];
        }
        return sum;
    }
}
