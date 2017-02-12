import java.util.ArrayList;

public class DuplicateFinder {
	
	public static ArrayList<IndexedFile> findDuplicatedFiles(ArrayList<IndexedFile> allIndexedFiles){
		ArrayList<IndexedFile> duplicateds = new ArrayList<IndexedFile>();
		
		for (IndexedFile current : allIndexedFiles){
			
		}
		
		return duplicateds;
	}
	
	private static ArrayList<IndexedFile> searchDuplicatedFilesForCurrentFile(IndexedFile indexedFile, ArrayList<IndexedFile> allIndexedFiles){
		ArrayList<IndexedFile> duplicateds = new ArrayList<IndexedFile>();
		
		for (IndexedFile current : allIndexedFiles){
			if (indexedFile.getmd5Hex().equals(current.getmd5Hex()) && !indexedFile.equals(current) ){
				duplicateds.add(current);
			}
		}
		
		
		return null;
		
	}

}
