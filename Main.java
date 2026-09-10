import java.util.*;
public class Main
{
    public static void display(int n)
    {
        if(n==0) return;
        System.out.print(n+" ");
        display(n-1); 
    }
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        display(n);
        
    }
}