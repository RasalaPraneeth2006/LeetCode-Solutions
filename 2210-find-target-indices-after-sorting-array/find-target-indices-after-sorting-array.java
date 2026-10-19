class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int scount = 0, tcount = 0;
        for(int num : nums){
            if(num < target){
                scount++;
            }
            else if(num == target){
                tcount++;
            }
        }
        List<Integer> rps = new ArrayList<>();
        for(int i = 0; i < tcount; i++){
            rps.add(scount + i);
        }
        return rps;
    }
}