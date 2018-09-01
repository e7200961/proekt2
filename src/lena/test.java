package lena;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;



public class test {

	public static void main(String[] args) {
	ArrayList <String> strings= new ArrayList<>();
	LinkedList<String> linString =new LinkedList <>();
	linString.add("классИ");
	linString.add("классТ");
	linString.add("классС");
	String com =linString.get(1);
	System.out.println(com);
	linString.remove("классТ");
	

	System.out.println(linString);
	
	
	
	Set<Integer> set = new TreeSet<>();
	set.add(12);
	set.add(1);
	set.add(2);
	set.add(15);
	set.add(10);
	set.add(9);
	set.add(2);
	set.add(22);
	set.add(32);
	set.add(8);
	System.out.println(set);
	Map<Integer,String> nam = new TreeMap<>();
	nam.put(1, "Апельсин");
	nam.put(2, "Арбуз");
	nam.put(3, "Азбука");
	nam.put(5, "Машина");
	String result= nam.get(3);
	System.out.println(result);
	boolean result1 = nam.containsKey(2);
	System.out.println(result1);
	boolean result2= nam.containsValue("Машина");
	
	}

}
