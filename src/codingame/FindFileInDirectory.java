package codingame;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class FindFileInDirectory {

	public static void main(String[] args) {

//		System.out.println("herre: " +findFile2("iTunes Library.itl", "/Users/khaitq/"));
		
//		System.out.println("herre: " +findFile("iTunes Library.itl", "/Users/khaitq/"));

		System.out.println(findFileUseQueue(new File("/Users/khaitq/"), "test.mv.db"));

	//	System.out.println(findFileUseStack(new File("/Users/khaitq/"), "test.mv.db"));

	}
	
	//Best choice
	private static String findFileUseQueue(File dir, String fileName) {
		
		Queue<File> queues = new LinkedList<File>();
		
		queues.add(dir);
		
		while (!queues.isEmpty()) {
			File f = queues.poll();
			if (f.isDirectory()) {
				for (File file : f.listFiles()) {
					queues.add(file);
				}
			}
			if (f.isFile() && f.getName().equals(fileName)) {
				return f.getAbsolutePath();
			}
		}
		
		return null;
	}
	
	private static String findFileUseStack(File directory, String fileName) {
		
		Stack<File> stacks = new Stack<File>();
		stacks.add(directory);
		while (!stacks.isEmpty()) {
			
			File f = stacks.pop();
			if (f.isDirectory()) {
				for (File file : f.listFiles()) {
					stacks.push(file);
				}
			}
			if (f.isFile() && f.getName().equals(fileName)) {
				return f.getAbsolutePath();
			}
		}
		return null;
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
