class Solution {
    public int countSeniors(String[] details) {
        int count = 0;;
        for(int i=0; i<details.length; i++){
            String x = details[i].substring(11,13);
            int result = Integer.parseInt(x);
            if(result>60)
                count++;
        }
        return count;

    }
}