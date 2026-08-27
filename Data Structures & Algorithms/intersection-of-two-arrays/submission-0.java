class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> seen = new HashMap<>();
        for(int x:nums1){
            seen.put(x, 1);
        }
        List<Integer> ans = new ArrayList<>();

        for(int x:nums2){
            if(seen.getOrDefault(x, 0)==1){
                seen.put(x, 0);
                ans.add(x);
            }
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();

        
        
    }
}