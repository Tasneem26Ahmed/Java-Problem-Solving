public class B {
	public static void main (String [] args){

		System.out.println(M(new int[]{1, 2, 3, 4}));
		System.out.println(M(6, 2, 3));


	}
	public static int M(int... arr){
		return arr[0];
	}
}