package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static  void main(String []args) {
		Set<String> hashSet = new HashSet<>();
		hashSet.add("E");
		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("D");
		hashSet.add("A");
		System.out.println("Set :"+hashSet);
		System.out.println(hashSet.contains("A"));
		
		Set<String> treeSet =new TreeSet<>(hashSet);
		//int i = 3;
		//treeSet.add(i);
		
		for(String s: treeSet) {
			System.out.println("TreeSet: "+ s);
		}
	}
	
}
