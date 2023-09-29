package Task1;

import java.util.Arrays;

public class MyArray {
	private int[] array;
	public MyArray(int[] array) {
		this.array = array;
	}
	// Phương thức in mảng theo thứ tự ngược lại
	public int[] mirror() {
		int[] result = new int[array.length*2];
		for(int i=0; i<array.length; i++) {
			result[i] = array[i];
			result[result.length-i-1] = array[i];
		}
		return result;
	}
	public int[] removeDuplicates() {
		// Sắp xếp mảng đầu vào
	    Arrays.sort(array);
	    
	 // Đếm số phần tử duy nhất
	    int index = 0;
	    for (int i = 1; i < array.length; i++) {
	        if (array[i] != array[index]) {
	            index++;
	            array[index] = array[i];
	        }
	    }

	 // Tạo một mảng mới với các phần tử duy nhất
	    int[] result = Arrays.copyOfRange(array, 0, index + 1);

	    return result;
	}
	// in ra mảng các số còn thiếu
	public int[] getMissingValues() {
		int index = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] - array[i - 1] != 1) {
				array[index] = array[i - 1] + 1;
				index++;
			}

		}

		int[] result = Arrays.copyOf(array, index);

		return result;
	}

	 public static void main(String[] args) {
		int[] array1 = {1,2,3};
		MyArray Array1 = new MyArray(array1);
		System.out.println(Arrays.toString(Array1.mirror()));
		System.out.println();
		int[] array2 = {1,3,5,1,3,7,9,8};
		MyArray Array2 = new MyArray(array2);
		System.out.println(Arrays.toString(Array2.removeDuplicates()));
		System.out.println();
		int[] array3 = {10,11,12,13,14,16,17,19,20};
		MyArray Array3 = new MyArray(array3);
		System.out.println(Arrays.toString(Array3.getMissingValues()));
	}
}

