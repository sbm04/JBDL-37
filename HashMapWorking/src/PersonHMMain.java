import java.util.HashMap;

public class PersonHMMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, Person> hm = new HashMap<>();
		
		Person p = new Person(1, "John");
		
		hm.put(p.id, p);
		
		System.out.println(hm.get(1));
		
		HashMap<Person, Integer > hmTest = new HashMap<>();
		hmTest.put(p, 1);
		
		Person p1 = new Person(1, "John");
		
		System.out.println(hmTest.get(p1));
	}

}
