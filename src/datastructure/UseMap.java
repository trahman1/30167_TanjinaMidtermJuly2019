package datastructure;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */


		Map<String, List<String>> list= new HashMap<String,List<String>>();

		String stName1=" Mina";
		String stName2=" Rina";
		String stName3=" Shima";
		String stName4=" Jaman";


		List<String> stInfo1 = new LinkedList<String>();
		stInfo1.add("134 Westminster Street");
		stInfo1.add("34@gmail.com");


		List<String> stInfo2 = new LinkedList<>();
       stInfo2.add("26 Ditmas Street ");
		stInfo2.add("124@gmail.com");



		List<String> stInfo3 = new LinkedList<String>();

		stInfo3.add("56 Ditmas Street ");
		stInfo3.add("shima@gmail.com");


		List<String> stInfo4 = new LinkedList<String>();
		stInfo4.add("56 Westminster Street ");
		stInfo4.add("jaman@gmail.com");

        list.put(stName1,stInfo1);
		list.put(stName2,stInfo2);
		list.put(stName3,stInfo3);
		list.put(stName4,stInfo4);

		System.out.println(" For each loop to retrieve data");
		for(Map.Entry m: list.entrySet()){
			System.out.println("Key: " + m.getKey() + " , "+ " value= " + m.getValue() );
		}


	}

}
