class GetMethod{
public static void main(String args[]){
int a[] = {110,100,67,44,36,6};
int a[]={123,745,458,957};
int a[]={635,746,87,6,7546};

get MaxandMin(int a);
get MaxandMin(int a);
get MaxandMin(int a);

                                                    }
public static void get MaxandMin(int a[]){
int max=a[0];
int min =a[5];
for(int i=1;i<a.length;i++)
  {           
    if(a[i]>max)
	  {
		max = a[i];
	  }
    else if(a[i]<min)
	  {
	    min = a[i];         
	   }
  }
                                                         }
  System.out.println("maximum number in the array is    " + max);	
  System.out.println("minimum number in the array is     " + min);