package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> students = new ArrayList<>();
		System.out.println("Is StudentList is empty:" +students.isEmpty());
		students.add("Ahil");
		students.add("Bhuvana");
		students.add("Deepti");
		students.add("Harish");
		
		
		ArrayList<String> newStudent = new ArrayList<>();
		newStudent.add("Anu");
		newStudent.add("Rahul");
		newStudent.add("Rishi");
		newStudent.add(null);
		students.addAll(newStudent);
	/*	for(String s:students) {
			System.out.println(s);
			
		}*/
		
		//students.retainAll(newStudent);
		
		System.out.println("Is StudentList is empty:" +students.isEmpty());
		System.out.println("Before Update: "+students.get(1));
		students.set(1, "Ahil");
		System.out.println("After Update: "+students.get(1));
		Iterator<String> iterator = students.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
