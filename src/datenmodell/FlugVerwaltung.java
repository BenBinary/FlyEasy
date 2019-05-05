package datenmodell;

import java.util.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

public class FlugVerwaltung {
	
	static List<Flug> fluege = new LinkedList<Flug>();
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
	
	
	public Boolean serOne() {
		
		try (FileOutputStream fos = new FileOutputStream(file); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			
			oos.writeObject(fluege.get(0));
			System.out.println("Es wurde erfolgreich gespeichert");
			return true;
			
		} catch (IOException ioe) {
			
			System.out.println(ioe);
		}
		
		
		return false;
		
	}
	
	public Boolean ser() {
		
		try (FileOutputStream fos = new FileOutputStream(file); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			
			oos.writeObject(fluege);
			System.out.println("Es wurde erfolgreich gespeichert");
			return true;
			
		} catch (IOException ioe) {
			
			System.out.println(ioe);
		}
		
		
		return false;
		
	}
	
	/*
	 * Es wird nur ein Element des ersten Serialisiert
	 */
	public Boolean deSerOne() {
		
		try (FileInputStream fis = new FileInputStream(file); ObjectInputStream ois = new ObjectInputStream(fis)) {
			
			Object o = ois.readObject();
			
			
			if (o instanceof Flug) {
				
				System.out.println("eingelesen");
				
				
				Flug f = (Flug)ois.readObject();
				
				
				System.out.println("Als Objekt eingelesen " + f);
				
			
				
			}
			
			
			
			
 		} catch (ClassNotFoundException | ClassCastException | IOException e) {
 			
 			System.out.println("Hier gab es einen Fehler");
 			e.printStackTrace();
 			
 		}
		
		return false;
	}
	
	
public Boolean deSer() {
		
		try (FileInputStream fis = new FileInputStream(file); ObjectInputStream ois = new ObjectInputStream(fis)) {
			
			Object o = ois.readObject();
			
			
			if (o instanceof Flug) {
				
				System.out.println("eingelesen");
				
				
				Flug f = (Flug)ois.readObject();
				
				
				System.out.println("Als Objekt eingelesen " + f);
				
			
				
			}
			
			
			
			
 		} catch (ClassNotFoundException | ClassCastException | IOException e) {
 			
 			System.out.println("Hier gab es einen Fehler");
 			e.printStackTrace();
 			
 		}
		
		return false;
	}
	
	

}
