//optimal Solution 2
class Array24{
	int missingNumber(int a[],int N){
        int XoR1=0;
		int XoR2=0;
		for(int i=0;i<N-1;i++){
			XoR1=XoR1^i+1;
			XoR2=XoR2^a[i];
		}
		XoR1=XoR1^N;
		return XoR1^XoR2;
	}
}
class Run{
	public static void main(String[] arg){
		Array24 ad=new Array24();
		int N=6;
		int ar[]={1,2,3,4,6};
	    int ans = ad.missingNumber(ar, N);
        System.out.println("The missing number is: " + ans);
	}
}