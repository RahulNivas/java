package datastructure.sort;

public class BubbleSortDemo {
	static void bubbleSort(int arr[],int n) {
		int i,j,temp;
		boolean swapped;
		for(i=0;i<n-1;i++) {
			swapped=false;
			for(j=0;j<n-i-1;j++){
				if(arr[j]>arr[j+1]){
				  temp =arr[j];
				  arr[j]=arr[j+1];
				  arr[j+1]=temp;
				  swapped=true;
				}
			}
			if(swapped==false)
				break;
		}
	}
	static void printArray(int arr[],int size) {
		int i;
		for(i=0;i<size;i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {6,34,25,12,22,11,90};
		int n =arr.length;
		bubbleSort(arr,n);
		System.out.println("Sorted array is:");
		printArray(arr,n);
		
		

	}

}
