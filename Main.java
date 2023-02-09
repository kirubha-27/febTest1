import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,4,5,6};
        int target = 6;
        int[] result = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(target-arr[i])){
                result[0] = map.get(target-arr[i])+1;
                result[1] = i+1;
                break;
            }
            map.put(arr[i],i);
        }
        System.out.println(Arrays.toString(result));
    }
}
