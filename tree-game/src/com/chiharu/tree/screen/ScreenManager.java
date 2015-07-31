package com.chiharu.tree.screen;

public class ScreenManager {
	
	private static Screen currentScreen;
	
	public static void setScreen(Screen screen){
		//dispose of the current screen
		if (currentScreen != null)
			currentScreen.dispose();
		
		//set new screen
		currentScreen = screen;
		currentScreen.create();
	}
	
	public static Screen getCurrentScreen(){
		return currentScreen;
	}
}
