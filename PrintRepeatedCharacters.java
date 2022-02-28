import java.util.*;
class ValueComparator implements Comparator<Character>{
    Map<Character, Integer> map;

    public ValueComparator(Map<Character, Integer> map){
        this.map = map;
    }

    @Override
    public int compare(Character a, Character b) {
        if (map.get(a) >= map.get(b)) {
            return -1;
        }
        else {
            return 1;
        } // returning 0 would merge keys
    }
};
public class PrintRepeatedCharacters {
    public static void main(String[] args){
        String str="hieveryone";
        Map<Character, Integer> map = new HashMap<>();
        for (int i=0; i<str.length();i++){
            if (!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), 1);
            }else{
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }
        }

        ValueComparator vc = new ValueComparator(map);
        Map<Character, Integer> sortedMap = new TreeMap<Character, Integer>(vc);
        sortedMap.putAll(map);

        System.out.println(sortedMap);
    }

}
