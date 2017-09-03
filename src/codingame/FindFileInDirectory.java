package codingame;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class FindFileInDirectory {

	public static void main(String[] args) {

		System.out.println("herre: " +findFile2("iTunes Library.itl", "/Users/khaitq/"));
		
//		System.out.println("herre: " +findFile("iTunes Library.itl", "/Users/khaitq/"));

	}
	
	private static String findFile(String fileName, String directory){
		
		boolean found = false;
		String name = "";
		File[] files = new File(directory).listFiles();
		
//		System.out.println("--------");
		for (File file : files){
			if (file.getName().equals(fileName)){
				found = true;
				name = file.getParent();
				System.out.println("--------" + name);
				break;
			}
		}
		if (!found) {
			for (File file : files){
				if (file.isDirectory()){
					if (name.isEmpty()){
						name = findFile(fileName, file.getPath());
					}
//					found =  (found || !findFile(fileName, file.getPath()).isEmpty() );
				}
			}
		}
		
//		System.out.println("--------");
		return name;
	}
	
	private static String findFile2(String fileName, String directory){
		
		List<File> all = new LinkedList<File>();
		
		all.add(new File(directory));
		
		while (all.size() > 0) {
			
			File current = 	all.remove(all.size() - 1);
			if (current.isFile() &&  current.getName().equals(fileName)){
				return current.getParent();
			}
			
			if(current.isDirectory()) {
				for (File file : current.listFiles()){
					all.add(file);
				}
			}

		}
		return "KO";
	}

}
