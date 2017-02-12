import java.io.File;

public class IndexedFile {
	
	private File file;
	private String md5Hex;
	
	public IndexedFile(File file){
		this.file = file;
		this.md5Hex = FileMd5Calculator.calculateMd5(file);
	}
	
	public String toString(){
		return this.file.getName();
	}
	
	public String getmd5Hex(){
		return this.md5Hex;
	}

}
