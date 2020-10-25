import java.util.Arrays;

public class bubble_sort {
	/**
	 * 
	 * 버블 정렬
	 * @param kykim818@naver.com
	 * 구현이 매우 간단한 정렬 기법 
	 * 다만 매번 SWAP을 하는데 교환방식이 이동작업보다 복잡하여 잘 사용되지 않는다.
	 * Point ! 한번 순환시마다 맨 마지막에 가장 큰수가 오게 된다.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,5,2,1,6,3};
		bubblesort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void bubblesort(int[] arr) {
		//  n번의 회전을 한다.
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr.length-1; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
	}
}
