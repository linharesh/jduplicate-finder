import java.io.File;
import java.util.ArrayList;

public class ApplicationController {
	
	private ConsoleInterface CI = new ConsoleInterface();
	
	public void startApplication(){
		File rootFolder = CI.getRootFolder();
		DirectoryExplorer directoryExplorer = new DirectoryExplorer();
		ArrayList<IndexedFile> indexedFiles = directoryExplorer.exploreDirectory(rootFolder, true);
		for (IndexedFile indexedFile :indexedFiles){
			System.out.println(indexedFile.getmd5Hex());
		}
		
	}
	
}
