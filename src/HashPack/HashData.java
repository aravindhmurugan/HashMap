package HashPack;

import java.util.HashMap;

public class HashData {
	
	public static HashMap<String,String> getUserLoginInfo() {
		HashMap<String,String> userMap = new HashMap<String,String>();
		userMap.put("unpwd", "aravindhmurugan_welcome1");
		return userMap;
	}

	public static HashMap<Integer,String> getmonthmap() {
		
		HashMap<Integer,String> Monthmap = new HashMap<Integer,String>();
		
		Monthmap.put(1,"January");
		Monthmap.put(2,"February");
		Monthmap.put(3,"March");
		Monthmap.put(4,"April");
		Monthmap.put(5,"May");
		Monthmap.put(6,"June");
		Monthmap.put(7,"July");
		Monthmap.put(8,"August");
		Monthmap.put(9,"September");
		Monthmap.put(10,"October");
		Monthmap.put(11,"November");
		Monthmap.put(12,"December");
		return Monthmap;

	}
}

