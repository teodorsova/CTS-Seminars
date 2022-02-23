package ro.ase.classes;

public class Utils {
	public static int aparitiiMin(int[] vector) {
		int min = vector[0], nrAparitii = 0;
		for(int i = 0; i < vector.length; i++) {
			if(vector[i] == min) {
				nrAparitii++;
			} else if(min > vector[i]) {
				min = vector[i];
				nrAparitii = 1;
			}
		}
		
		return nrAparitii;
	}
}
