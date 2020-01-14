package datastructure;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

		ArrayList<String>stName=new ArrayList<>();
		stName.add(" Alex");
		stName.add("Joseph");
		stName.add("Jaman");
		stName.add(" Rakib");
		stName.add(" Jihan");
		stName.add(" Rasel");
		stName.add("Mitu");

		stName.remove("Rakib");// remove Rakib
		stName.remove(2);// remove element of index 2 
		System.out.println(stName.get(3));

		System.out.println("**********");

		System.out.println(" Using for each loop to retrieve data");

		for(String s: stName){
			System.out.println(s);
		}

		System.out.println("*******");
		System.out.println(" Using While loop with iterator");
    Iterator iterator = stName.iterator();
    while (iterator.hasNext()){
		System.out.println(iterator.next());
	}


	}

}
