import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;




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
		}
	}
	
	public static void pass(int[] a){
		a = new int[] {1,2,3,4};
	}
	
	public static Set<Integer> findDuplicates(int[] a){
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		Set<Integer> dups = new HashSet<Integer>();
		for (Integer i : a){
			if (hm.get(i) == null){
				hm.put(i, 1);
			}
			else{
				dups.add(i);
			}
		}
		return dups;		
	}
	
	public static int fibonacciRecursive(int n){
		if(n <= 2){
			return 1;			
		}
		else{
			return fibonacciRecursive(--n) + fibonacciRecursive(--n);
		}
	}
	
	public static int fibonacci(int n){
		if (n <= 2){
			return 1;
		}
		int f = 1, pf = 1, temp = 1;
		for (int i=3; i <=n; i++){
			temp = f;
			f += pf;
			pf = temp;
		}
		return f;
	}
	
	public static int reverseInt (int i){
		int r = 0;
		while (i > 0){
			r = r * 10 + i % 10;
			i = i/10;
		}
		return r;
	}
	
}
