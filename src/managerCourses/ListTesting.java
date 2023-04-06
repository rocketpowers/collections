package managerCourses;

import java.util.ArrayList;

public class ListTesting {

	public static void main(String[] args) {

		String class1 = "knowing lists";
		String class2 = "modeling class";
		String class3 = "working with courses";

		ArrayList<String> classes = new ArrayList<>();
		
		//metodo de adicicao
		classes.add(class1);
		classes.add(class2);
		classes.add(class3);
		
		System.out.println(classes);
		
		//removendo por index
		//classes.remove(0);
		
		//removendo por especifico
		//classes.remove(class1);
		
	}

}
