package collections;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList_Pgm1 {

	public static void main(String[] args) throws IOException {
		
		ArrayList<String> al = new ArrayList<String>();

			al.add("A");
			al.add("T");
			al.add("L");
			al.add("A");
			al.add("B");
			
			System.out.println(al);
			Collections.sort(al);
			System.out.println(al);
			
			Iterator itr = al.iterator();
			while(itr.hasNext())
			{
				System.out.print(" " +itr.next());
			}
			System.out.println();
			
//			for(String a : al)
//			{
//				System.out.print(" "+a);
//			}
			
			
			al.set(2,"Z");
			for(String a : al)
				{
					System.out.print(" "+a);
				}
			
			try {
				FileOutputStream fos = new FileOutputStream("./ExcelSheets/Test.txt");
				ObjectOutputStream oo = new ObjectOutputStream(fos);
				oo.writeObject(al.toString());
				fos.close();
				oo.close();	
			} 
			catch (FileNotFoundException e) 
			{
				
				e.printStackTrace();
			}
			
			
			

	}
	

}
