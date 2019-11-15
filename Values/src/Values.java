import java.util.*;

public class Values {
	public static void main(String[] args) {
		Random rand = new Random();
		int[][] array = new int[3][3];
		for(int i = 0; i < 3 ; i++) {
			for(int j = 0 ; j < 3 ; j++) {
				array[i][j] = rand.nextInt(10);
			}
		}
		System.out.println(Arrays.deepToString(array));
		int[][] newArray = values(array);
		System.out.println(Arrays.deepToString(newArray));

	}
	public static int[][] values(int[][] array) {
		int[][] newArray = new int[3][3];
		for(int i = 0; i < 3 ; i++) {
			for(int j = 0 ; j < 3 ; j++) {
				newArray[j][i] = array[i][j];
			}
		}
		return newArray;
	}
}
