package datastructure.search;

public class LinearSearchDemo {
	
	public static int LinearSearch(int [] arr, int target) {
		
		for(int i =0; i<arr.length;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]= {5,3,6,8,4,2,7,1,9};
		int target = 5;
		int result = LinearSearch(numbers,target);
		if(result != -1){
			System.out.println("Elment found at index: " +result);
		}
		else {
			System.out.println("Element not found");
		}
		

	}

}
