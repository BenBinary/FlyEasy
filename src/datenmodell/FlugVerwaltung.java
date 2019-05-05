package datenmodell;

import java.util.List;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

public class FlugVerwaltung {
	
	List<Flug> fluege = new LinkedList<Flug>();
	File file = new File("fluege.ser");
	
	
	public List<Flug> getFluege() {
		return fluege;
	}
	
	
	public void add(Flug flug) {
		
		fluege.add(flug);
	}
	
	public void remove(int i) {
		
		fluege.remove(i);
	}
	
	
	public Boolean ser() {
		
		try (FileOutputStream fos = new FileOutputStream(file); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			
			oos.writeObject(fluege);
			return true;
			
		} catch (IOException ioe) {
			
			System.out.println(ioe);
		}
		
		
		return false;
		
	}

}
