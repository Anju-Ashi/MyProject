package javapractise;

import java.io.File;
import java.io.IOException;

public class textfile {

	public static void main(String[] args) throws IOException {
File directoryPath = new File("Desktop");
		
		//List all files and directories
		System.out.println("------------All files------------");
		for (File file : directoryPath.listFiles()) {
			System.out.println(file.getName());
		}
		
		//List text files only
		System.out.println("\n------------Text files------------");
		File[] files=directoryPath.listFiles(new FilenameFilter() 
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".txt");
			}

	}
		]
		