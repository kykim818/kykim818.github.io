import java.util.Arrays;

public class quick_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,4,5,2,6,1,3,3};
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	private static void quickSort(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		if(low >= high) return;
		
		int mid = partition(arr,low,high);
		quickSort(arr, low, mid-1);
		quickSort(arr, mid+1, high);
		
	}

}