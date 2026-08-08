class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];

        for(int i = 0; i<n-1; i++){
            ans[i] = arr[i+1];
            for(int j = i+1; j<n; j++){
                if(ans[i]<arr[j]){
                    ans[i] = arr[j];
                }
            }
        }
        ans[n-1] = -1;
        return ans;
    }
}