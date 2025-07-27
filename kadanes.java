import java.util.Scanner;

public class kadanes {
        public static void main(String[]args)
	{
        int start =0;
        int end =0;
        int tempstart =0;
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
int maxsum = Integer.MIN_VALUE;
int currsum = 0;
for(int i=0;i<arr.length;i++)
{
	currsum += arr[i];
    maxsum = Math.max(currsum,maxsum);
	if(currsum<0)
	{
		currsum=0;
        tempstart = i+1;
	}
}
    
	

System.out.print(maxsum);

    }
}

