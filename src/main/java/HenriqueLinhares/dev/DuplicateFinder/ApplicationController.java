package HenriqueLinhares.dev.DuplicateFinder;

public class ApplicationController {
	
	ConsoleInterface CI = new ConsoleInterface();
	
	public void startApplication(){
		System.out.println(CI.getRootFolder().getAbsolutePath());
	}
	
}
