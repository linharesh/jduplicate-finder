

public class ApplicationController {
	
	private ConsoleInterface CI = new ConsoleInterface();
	
	public void startApplication(){
		System.out.println(CI.getRootFolder().getAbsolutePath());
	}
	
}
