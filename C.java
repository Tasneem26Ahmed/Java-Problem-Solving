public class C{
	public static void main (String [] args){

		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[2]);


		if (args[1].charAt(0) == '+'){
			System.out.println(n1 + n2);
		}
		else if (args[1].charAt(0) == '-' ){
			/*if(n1 < n2){
				int temp = n1;
				n1 = n2;
				n2 = temp;
			}*/
			System.out.println(Math.abs(n1) - Math.abs(n2));
		}
		else if (args[1].equals("'*'")){

			System.out.println(n1 * n2);
		}
		else {
			if (n2 != 0)
				System.out.println(n1 / n2);
			else
				System.out.println("Can not divide by / Zero");
		}
	}

}