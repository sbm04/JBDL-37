import java.util.HashMap;

public class HMMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hm = new HashMap<>();
		
		hm.put("John", 100);
		hm.put("Rocky", 85);
		hm.put("Johnn", 90);
		hm.put("John", 1);
		hm.put("Vicky", 45);
		
		System.out.println("HashMap size:"+hm.size());
		
		
		System.out.println(hm.containsKey("Aditya"));
		
		if(hm.containsKey("John")) {
			System.out.println("The value for John is"+hm.get("John"));
			
		}
		
	}

}
