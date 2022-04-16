package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FreqOfAChar {
    public static void main(String[] args){
        String str = "aaabbcaaaaaccccddeee";
        System.out.print(getMax(str));
    }
    public static char getMax(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0 ; i<str.length() ; i++){
            char cc = str.charAt(i);
            if(map.containsKey(cc)){
                // Deleting previous key and updating it
                int ov = map.get(cc);
                int nv = ov + 1;
                map.put(cc,nv);
            }else{

                map.put(cc,1);
            }
        }
        char maxChar = '\0';
        int max = 0;
        Set<Map.Entry<Character,Integer>> entries = map.entrySet();

        for(Map.Entry<Character,Integer> entry:entries){
            if(entry.getValue()>max){
                max = entry.getValue();
                maxChar = entry.getKey();
            }
        }
    return maxChar;
    }
}
