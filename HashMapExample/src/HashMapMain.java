import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm = new HashMap<>();
		
		hm.put(1, "Aditya");
		hm.put(2, "NareshIT");
		hm.put(8, "Shaik");
		hm.put(15,"Maya");
		
		System.out.println("Size of the map: "+hm.size());
		
		hm.put(7,"David");
		hm.put(1, "Younus");
		System.out.println("Size of the map: "+hm.size());
		
		System.out.println("Value of id : 1 is:"+hm.get(1));
		
		System.out.println("Checking if value exists:"+hm.containsKey(100));

		hm.remove(15);
		System.out.println("Size of the map: "+hm.size());
		
		System.out.println(hm);
		
		for(Map.Entry<Integer, String> e:hm.entrySet()) {
			System.out.println("The key is :"+e.getKey()+" the value is:"+e.getValue());
		}

 	}

}
