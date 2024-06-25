package datastructure.search;

public class BinarySearchDemo {
	static int binarySearch(int arr [],int x) {
		int low =0,high=arr.length-1;
		while(low <= high) {
			int mid =low + (high-low)/2;
			System.out.println("mid is : "+mid);
			if(arr[mid] ==x)
				return mid;
			if(arr[mid]<x)
				low= mid+1;
			else
				high = mid-1;
		}
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,40,50};
		int x =40;
		int result= binarySearch(arr,x);
		if(result == -1) {
			System.out.println("Element not available in Array");
		}
		else {
			System.out.println("Element is present at: " +result);
		}
		

	}

}
