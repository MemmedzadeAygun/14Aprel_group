package file;

//import java.io.File;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		
		File folder = new File("C:\\myJavafiles");
		
		if (!folder.exists()) {
			folder.mkdir();
			System.out.println("Folder cretaed successfully!");
		}
		
//		File file = new File("test.txt");
		File file = new File("C:\\myJavafiles\\test.txt");
		
		if (!file.exists()) {
			file.createNewFile();
			System.out.println("File created successfully!");
		}else {
			if (file.isFile()) {
				
				System.out.println("This is a file and the file already exists!");
			}else if(file.isDirectory()) {
				System.out.println("This is a folder");
			}
		}
		
		String value = "Java programming language";
		
		FileWriter fWriter = new FileWriter(file, false);
		BufferedWriter bWriter = new BufferedWriter(fWriter);
		bWriter.write(value);
		bWriter.newLine();
		bWriter.write("yesterday weather was bad!");
		bWriter.close();
		
		
		String line;
		
		FileReader fReader = new FileReader(file);
		BufferedReader bReader = new BufferedReader(fReader);
		while ((line = bReader.readLine()) != null) {
			System.out.println(line);
		}
		
		System.out.println(file.length());
		
	}
}
