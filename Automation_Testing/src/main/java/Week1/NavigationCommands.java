package Week1;

public class NavigationCommands extends Base{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigationCommands navCommands = new NavigationCommands();
		navCommands.browserInitialisation();
		navCommands.navigationCommands();

	}
	public void navigationCommands() {
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}
