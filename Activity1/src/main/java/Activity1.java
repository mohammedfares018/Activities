import java.util.Arrays;
import java.util.HashMap;
public class Activity1 {
	public String compute(int n,int m,int[] arr){
		if(n<2)
			throw new IllegalArgumentException("Number less than two");
		int[] ans1=checkForSum2(arr,m);
		int ans2=checkForSum3(arr,m);
		if(ans1[0]==-1 && ans2==0){
			return "No pairs or triplets sum to "+m;
		}
		if(ans1[0]==-1)
			return "No two elements sum to "+m;
		if(ans2==0)
			return "No triplets sum to "+m;
		return "Result exists";		
	}
	
	public int[] checkForSum2(int []arr,int m){
		int n=arr.length;
		HashMap<Integer,Integer> h=new HashMap<>();
        int ans[]=new int[3];
        for(int i=0;i<n;i++){
            if(!h.containsKey(arr[i])){
                h.put(m-arr[i],i);
            }
            else{
            	ans[0]=1;
                ans[1]=m-arr[i];
                ans[2]=arr[i];
                return ans;
            }
        }
        ans[0]=-1;
        return ans;
	}
	public int checkForSum3(int []arr,int m){
		Arrays.sort(arr);
		int n=arr.length;
		int count=0;
		int j,k,remsum;
		for(int i=0;i<n-2;i++){
			j=i+1;
			k=n-1;
			remsum=m-arr[i];
			while(j<k){
				int temp=arr[j]+arr[k];
				if(temp==remsum){
					count++;
					break;
				}
				else if(temp<remsum)
					j++;
				else
					k--;
			}
		}
		return count;		
	}
}