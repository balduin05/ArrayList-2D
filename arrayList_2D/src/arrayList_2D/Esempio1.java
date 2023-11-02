package arrayList_2D;

import java.util.ArrayList;

public class Esempio1 {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<String>> persone = new ArrayList();
		
		ArrayList<String> nomi = new ArrayList<String>();
		ArrayList<String> cognomi = new ArrayList<String>();
		
		nomi.add("Giovanni");
		nomi.add("Marco");
		
		cognomi.add("Balduin");
		cognomi.add("Umberti");
		
		persone.add(nomi);
		persone.add(cognomi);
		
		for(int i = 0; i < persone.size(); i++) {
			System.out.println();
			
			for(int j = 0; j < persone.get(i).size(); j++) {
				System.out.print(persone.get(i).get(j) + " ");
				
			}
		}
		
	}

}
