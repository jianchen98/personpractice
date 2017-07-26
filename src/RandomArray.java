import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class RandomArray {
	    public static int[] random(int length){
	        if (length <= 0) {
	            return new int[0];
	        }
	        List<Integer> list = new ArrayList<Integer>(length);
	        for (int i = 0; i < length; i++) {
	            list.add(i);
	        }
	        int[] array = new int[length];
	        for (int i = 0; i < length; i++) {
	            array[i] = list.remove(new Random().nextInt(length - i));
	        }
	        return array;
	    }
	    
	    public static void main(String[] args) {
	    	System.out.println(new Random().nextInt(10));
//	        int[] array = RandomArray.random(10);
//	        System.out.print("[");
//	        for (int i = 0; i < array.length; i++) {
//	            if (i < array.length - 1) {
//	                System.out.print(array[i] + ",");
//	            } else {
//	                System.out.print(array[i]);
//	            }
//	        }
//	        System.out.print("]");
	    }
	    
	}

