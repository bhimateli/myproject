
import java.util.HashMap;
import java.util.Map;

public class ArraySortingExample {
	static int arr[] = {1,3,4,5,6,7,8,9,1,3,4,5,2,2,1,1,5,2,5};
	public static void printMostNumberOfArray() {
		
		sortArray();
		
		Map<Integer,Integer>map = new HashMap<Integer,Integer>();
		Map<Integer,Integer>mapHolder = new HashMap<Integer,Integer>();
		for(int i =0;i<arr.length-1;i++) {
			
			if(map.containsKey(arr[i])) {
				map.put(arr[i],map.get(arr[i])+1);
			}else
				map.put(arr[i],1);
		}
		
		System.out.println("Print the values for map"+map);
		int min=0;
		int placeHolder=0;
		
		for(Map.Entry<Integer,Integer>entry:map.entrySet()) {
			
			if(entry.getValue() >min) {
				mapHolder = new HashMap<Integer,Integer>();
				placeHolder=entry.getValue();
				min=placeHolder;
				mapHolder.put(entry.getKey(), entry.getValue());
			}else if(entry.getValue() == min) {
				
				placeHolder=entry.getValue();
				min=placeHolder;
				mapHolder.put(entry.getKey(), entry.getValue());
			}
			
		}
		System.out.println("Print the values for map"+mapHolder);
		
		System.out.println("Top Keys are");
		
		for(Map.Entry<Integer,Integer>entry:mapHolder.entrySet()) {
			for(int i =0;i<entry.getValue();i++)
				System.out.println(entry.getKey());
		}
		
	}
	public static void sortArray() {
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
				     arr[j]=arr[j+1];
				     arr[j+1]=temp;
				}
			}
			
		}
		for(int i =0;i<arr.length-1;i++)
			System.out.println(arr[i]);
	}
	public static void main(String []args) {
		printMostNumberOfArray();
		
	}
}

