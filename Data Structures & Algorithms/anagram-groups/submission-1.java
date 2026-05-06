class Solution {
    public List<List<String>> groupAnagrams(String[] strs){
        int i;
        Map<String, List<String>> groups = new HashMap<>();
        for(String str:strs){
            String key = calc(str);
            groups.putIfAbsent(key, new ArrayList<>());
            groups.get(key).add(str);
        }
        return new ArrayList<>(groups.values());
    }  
    public String calc(String str){
        int[] T = new int[26];
        for(char chr:str.toCharArray()){
            T[(int) chr - 'a']++;
        }
        return Arrays.toString(T);
    }
}
    