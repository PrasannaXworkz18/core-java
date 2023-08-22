import java.util.*;
class Sorting{
public static void main(String args[]){
int array[] = {110,100,67,44,36,6};  
 for (int index=0;index<array.length ;index++){
	 
	 for(int anotherIndex = index+1;anotherIndex<array.length;anotherIndex++)
		 
		 if(array[index] > array[anotherIndex]){
			 int temp = array[index];
			 //swaping occurs
			 array[index] = array[anotherIndex];
			 array[anotherIndex] = temp;
                                                                 }	 
		                                                              }
                   System.out.println("----------------------without using sort method------------------------");
				   System.out.println(Arrays.toString(array));
				   System.out.println("---------------using sort method------------");
				   Arrays.sort(array);
				   System.out.println(Arrays.toString(array));
  }
}