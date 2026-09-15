import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        
        Map<Integer,Integer> mp = new HashMap<>();

        for(int i=0;i<n;i++)
        {
            mp.put(arr[i],mp.getOrDefault(arr[i], 0)+1);
        }

        for(int key:mp.keySet())
        {
            System.out.println(key+" -> "+mp.get(key));
        }
    }
}