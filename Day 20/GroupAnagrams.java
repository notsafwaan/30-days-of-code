// https://leetcode.com/problems/group-anagrams/
public class GroupAnagrams {
    Map<String, List<String>> map = new HashMap<>();

    public List<List<String>> groupAnagrams(String[] strs) {
        for(String s : strs){
            char[] c = s.toCharArray();
            Arrays.sort(c); 
            String key = new String(c);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }

        return new ArrayList<List<String>>(map.values());
    }
}
