import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class DirectoryExplorer {
	
	public ArrayList<IndexedFile> exploreDirectory(File directory, boolean recursively){
		ArrayList<IndexedFile> indexedFiles = new ArrayList<IndexedFile>();
		
		ArrayList<File> fileList = new ArrayList<File>(Arrays.asList(directory.listFiles()));
		
		for (File current : fileList) {
			if (current.isFile()){
				indexedFiles.add(new IndexedFile(current));
			}
			
		}
		
		return indexedFiles;
	}
	
	

}
