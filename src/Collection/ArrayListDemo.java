package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//Declaration
		ArrayList<Object>  mylist = new ArrayList<Object>();
		mylist.add(100);
		mylist.add(200);
		mylist.add("Arka");
		mylist.add(null);
		mylist.add(1.0);
		mylist.add(600);
		mylist.add(700);
		mylist.add(800);
		mylist.add(900);
		mylist.add(1000);
		mylist.add(1100);
		mylist.add(1200);
		mylist.add(1300);
		mylist.add(1400);
		mylist.add(1500);
		mylist.add(1600);
		mylist.add(1700);
		mylist.add(1800);
		mylist.add(1900);
		mylist.add(2000);
		mylist.add(2100);
		mylist.add(2200);
		System.out.println("ArryList : "+mylist.size());
		System.out.println("ArryList data : "+mylist);
		// Remove Data From The ArrayList
		mylist.remove(15);
		System.out.println("ArryList data after remove : "+mylist);
		
		// Insert Data From The ArrayList
		mylist.add(15, "Arka Mondal");
		
		// Update Data From The ArrayList
		mylist.set(12, "Soumaya Mondal");
		
		// Access Data From The ArrayList
		System.out.println("ArryList data after insert : "+mylist.get(15));
		
		// Access Data From The ArrayList
		System.out.println("ArryList data after update: "+mylist.get(12));
		
		// Using iterator
		Iterator<Object> it = mylist.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		// checkIng arrayList is empty or not
		if(mylist.isEmpty())
		{
			System.out.println("ArrayList is empty");
		}
		else
		{
			System.out.println("ArrayList is not empty");
		}
		
	}

}
