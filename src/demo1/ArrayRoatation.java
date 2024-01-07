package demo1;

public class ArrayRoatation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 2, 3, 4, 5, 6, 8};
        int steps = 5;

        rightRotateArray(array, steps);

        // Print the rotated array
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    private static void rightRotateArray(int[] arr, int steps) {
        int length = arr.length;

        // Perform right rotation
        for (int i = 0; i < steps; i++) {
            int lastElement = arr[length - 1];

            for (int j = length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }

            arr[0] = lastElement;
        }
    }


	


	}


