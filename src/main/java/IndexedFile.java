import java.io.File;

public class IndexedFile {
	
	private File file;
	
	public IndexedFile(File file){
		this.file = file;
	}
	
	public String toString(){
		return this.file.getName();
	}

}
