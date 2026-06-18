class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer ,Integer> freq = new HashMap<>();

        for(int num : nums){
            if (freq.containsKey(num)){
                freq.put(num, freq.get(num)+1);
            }
            else {
                freq.put(num, 1);

            
            }

    }

    int max =0;
    for(int i : nums){
    if (freq.get(i)>max){
    max= freq.get(i);
    }}

    for(Map.Entry<Integer ,Integer> entry : freq.entrySet()){
        if(Objects.equals(max , entry.getValue())){
            return entry.getKey();
        }
    }

    return 0;

    }


}