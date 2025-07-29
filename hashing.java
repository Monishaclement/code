import java.util.*;
public class hashing {
    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[]= new int[n];
        for (int idx = 0; idx < nums.length; idx++) {
           nums[idx]=sc.nextInt();
            
        }
     HashMap<Integer,Integer>freq = new HashMap<>();
     int maxfreq =0;
     int result =0;
     for(int i=0;i<nums.length;i++)
     {
        if(freq.containsKey(nums[i]))
        {
            freq.put(nums[i],freq.get(nums[i])+1);
        }
        else
        {
            freq.put(nums[i],1);
        }
        int currentfreq = freq.get(nums[i]);
        if(currentfreq>maxfreq)
        {
            maxfreq = currentfreq;
            result = nums[i];
        }
        if(currentfreq==maxfreq)
        {
            result = Math.min(result,nums[i]);
        }
        
     }
     System.out.print(result);
     
    }
    
}
