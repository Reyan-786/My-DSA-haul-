public class inferon_solution{
    public static void main(String[] args) {
        int t;
		Scanner sc =new Scanner(System.in);
		t= sc.nextInt();
		while(t-->0)
		{
	   	    int n,x,i,j,count=0,m1=0,m2=0,arr[];//initialization
	 n= sc.nextInt();
	x= sc.nextInt();
	arr = new int [n];
	for(i=0;i<n;i+=1)
	{
	arr[i]= sc.nextInt();// they are taking and comparing for single damage.
	if(arr[i]<x)
	m2+=1;//if hp<x then just add 1 time to  m1
 else 	if(arr[i]%x==0)// else if the health point is greater than the damage point and the health poimt is an integral multiple of damage point then just add the time obtained by dividing the numbers.
	m2+=(arr[i]/x);
	else
	m2+=(arr[i]/x+1);// else just add the whole number obtained by adding the health point and the damage point in even..//
	    
	}
	Arrays.sort(arr);// for multidamage time just sort the array and then just equate multitime to the last index of  the array because until the last point becomes zeros till then it would keep adding 1 sec.

	m1=arr[n-1];
	if(m1>m2)
	System.out.println(m2);
	else
	System.out.println(m1);
	
	
		    
		}
    }
}
