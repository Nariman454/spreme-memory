package day10_loopreview;

public class task_6_browserLookUp {

	public static void main(String[] args) {
		String browser = "TECHCIRCLE";
		   if (browser == "chrome" ) {
	            System.out.println("CHROME BROWSER IS SELECTED");
	        } else if (browser == "firefox") {
	            System.out.println("FIREFOX BROWSER IS SELECTED");
	        } else if (browser== "opera") {
	            System.out.println("OPERA BROWSER IS SELECTED");
	        } else if (browser == "safari") {
	            System.out.println("SAFARI BROWSER IS SELECTED");
	        } else if (browser == "edge") {
	            System.out.println("EDGE BROWSER IS SELECTED");
	        } else if (browser == "ie") {
	            System.out.println("INTERNET EXPLORER BROWSER IS SELECTED");
	        }else {
	        	System.out.println("INVALID BROWSER");
	        
	        }
		   switch(browser) {
		   case"CHROME":System.out.println("CHROME BROWSER IS SELECTED");
		   case"FIREFOX":System.out.println("FIREFOX BROWSER IS SELECTED");
		   case"OPERA":System.out.println("OPERA BROWSER IS SELECTED");
		   case"SAFARI":System.out.println("SAFARI BROWSER IS SELECTED");
		   case"EDGE":System.out.println("EDGE BROWSER IS SELECTED");
		   case"IE":System.out.println("INTERNET EXPLORER BROWSER IS SELECTED");
		   break;
		   default:System.out.println("INVALID BROWSER");
		   }
		}

	}


