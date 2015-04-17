import java.util.Arrays;




public class ArraynString {

	public static String reverseIterate(String s){
		char[] temp = s.toCharArray();
		StringBuilder reversed = new StringBuilder();
		for (int i=temp.length-1;i>=0;i--){
			reversed.append(temp[i]);
		}		
		return reversed.toString();
	}
	
	public static String reverseBuffer(String s){
		StringBuffer sb = new StringBuffer(s);
		return sb.reverse().toString();		
	}
	
	public static String reverseRecursive(String s){
		if(s.length() < 2){
			return s;
		}
		return reverseRecursive(s.substring(1)) + s.charAt(0);
	}
	
	public static void bubbleSort (int[] a){
		for (int i=0; i < a.length - 1; i++){
			for (int j=1; j < a.length; j++){
				if (a[j-1] > a[j]){
					a[j-1] = a[j-1] + a[j];
					a[j] = a[j-1] - a[j];
					a[j-1] = a[j-1] - a[j];
				}
			}
			System.out.println(Arrays.toString(a));
		}
	}
	
	public static void pass(int[] a){
		a = new int[] {1,2,3,4};
	}
}
