import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }

        Map<Integer,Integer> m = new HashMap<>();

        for(int i=0;i<n;i++)
        {
            m.put(arr[i],m.getOrDefault(arr[i],0)+1);
        }

        int max=m.get(arr[0]);
        int min=m.get(arr[0]);

        int maxElement = arr[0];
        int minElement = arr[0];

        for(Map.Entry<Integer,Integer> entry : m.entrySet())
        {
            int element = entry.getKey();
            int freq = entry.getValue();

            if(freq>max)
            {
                max=freq;
                maxElement=element;
            }
            if(freq<min)
            {
                min=freq;
                minElement=element;
            }
        }

        System.out.print(maxElement+" "+minElement);
    }
}
