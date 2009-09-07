package org.dolphin.game.api.components;

public class ErrorHandler {
	public static boolean error_occurred =false;
	public static String error_last="";
	public static boolean Debug=false;//debug mode?
	
	public static void showError(Exception e,boolean serious){
		if (Debug)
		{
			error_occurred=true;
			error_last=e.getMessage();
			e.printStackTrace();
		}
	}
}
