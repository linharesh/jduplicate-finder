import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileMd5Calculator {

	public static String calculateMd5(File file){
		String md5 = "";
		try {
			FileInputStream fileInputStream = new FileInputStream(file);
			md5 = org.apache.commons.codec.digest.DigestUtils.md2Hex(fileInputStream);
			fileInputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return md5;
	}
	
	
}
