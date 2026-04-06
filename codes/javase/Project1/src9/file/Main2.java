package file;

import java.io.IOException;
import java.nio.file.*;

public class Main2 {
	public static void main(String[] args) throws IOException {
		Path dir = Paths.get("C:\\java\\14AprelGroup");
		
		if (!Files.exists(dir)) {
//			Files.createDirectory(dir);
			Files.createDirectories(dir);
			System.out.println("Folder cereated succefully!");
		}
		
		Path file = Paths.get("C:\\java\\14AprelGroup\\task.txt");
		if (!Files.exists(file)) {
			Files.createFile(file);
			System.out.println("File created successfully!");
		}
		
		Files.writeString(file, "Java qrupunun usaqlari");
		Files.writeString(file, "\nThis computer is bad", StandardOpenOption.APPEND);
		
		String info = Files.readString(file);
		System.out.println(info);
		
		System.out.println(Files.size(file));
		
//		Files.delete(file);
		Files.deleteIfExists(file);
	}
}
