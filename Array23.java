//optimal Solution 1
class Array23{
	int missingNumber(int a[],int N){
		int sum=(N*(N+1))/2;
		int s=0;
		for(int i=0;i<N-1;i++){
			s+=a[i];
		}
		return sum-s;
	}
}
class Run{
	public static void main(String[] arg){
		Array23 ad=new Array23();
		int N=5;
		int ar[]={1,2,4,5};
	    int ans = ad.missingNumber(ar, N);
        System.out.println("The missing number is: " + ans);
	}
}