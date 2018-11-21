package genericsort;

public class Util {
	public static <T extends Comparable> void sort(T[] array) {
		sort(array, 0, array.length-1);
	}

	private static <T extends Comparable> void sort(T[] array, int left, int right) {
		// TODO Auto-generated method stub
		if (left < right) {
			int q = partition(array, left, right);
			sort(array, left, q-1);
			sort(array, q+1, right);
		}
		
	}

	private static <T extends Comparable> int partition(T[] array, int left, int right) {
		// TODO Auto-generated method stub
		int i = left - 1;
		for (int j = left; j < right; j++) {
			if(array[j].compareTo(array[right]) <= 0) {
				i++;
				swap(array, i, j);				
			}
		}
		swap(array, i+1, right);
		return i+1;
	}

	private static <T> void swap(T[] array, int i, int j) {
		// TODO Auto-generated method stub
		T t = array[i];
		array[i] = array[j];
		array[j] = t;
	}
}
