
public class MyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FileOperation.createMainFolderIfNotPresent("main");
		
		MenuOpt.printWelcomeScreen("MyAppInfo", "Sukriti Arora");
		
		ChoiceOptions.handleWelcomeScreenInput();
	}

}
