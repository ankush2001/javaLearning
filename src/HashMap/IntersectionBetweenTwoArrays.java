package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IntersectionBetweenTwoArrays {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6};
        int arr2[] = {10,2,38,4,5,60};
        ArrayList<Integer> arrayList = intersection(arr1,arr2);
        System.out.println(arrayList);
    }
    // Compexcity
    public static ArrayList<Integer> intersection(int arr1[] , int arr2[]){
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Boolean> map = new HashMap<>();
        // O(M)
        for(int i=0 ; i < arr1.length ; i++){
            map.put(arr1[i],false);
        }
        // O(N)
        for(int j=0 ; j < arr2.length ; j++){
           if(map.containsKey(arr2[j])){
               map.put(arr2[j],true);
           }
        }
        // O(M+N)
        Set<Map.Entry<Integer,Boolean>> entries = map.entrySet();
        for(Map.Entry<Integer,Boolean> entry : entries){
            if(entry.getValue()){
                ans.add(entry.getKey());
            }
        }
        return ans;
    }

}
