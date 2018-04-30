package application;

import java.util.prefs.Preferences;

public class SaveGuiPrefs 
{
	Preferences state;
	String value;
	
	String keyValue ;
	//String KeyDouble = "0";
	//String KeyBoolean = "KEY_BOOLEAN";
	
	void Init(String nodeName)
	{
		keyValue =  "key0";
		state = Preferences.userRoot().node(nodeName);
		String preValue = state.get(keyValue, "");
		
		value = "";
	}
	
	//constructors with overloaded methods
	//constructor if no name defined
	public SaveGuiPrefs()
	{
		Init("javaFX gui prefs");
		
	}
	//constructor define a name
	public SaveGuiPrefs(String nodeName)
	{
		Init(nodeName);
	}
	public void setValue (String key, String value)
	{
		state.put(key, value);
	}
	public void setValue (String key, Double value)
	{
		state.putDouble(key, value);
	}
	public String getValue(String key) 
	{
		return state.get(key,"");
	}
	
	
	//boolean prefBoolean = state.getBoolean(KeyBoolean, true);
	
	
	//preferences.put();
//System.out.println("Stored KEY_WEB: " + prefWeb);
//	System.out.println("Stored KEY_INT: " + prefInt);
//	System.out.println("Stored KEY_BOOLEAN: " + prefBoolean);

//	System.out.println("Save something to Preferences");
	//state.putString(KeyWeb, "http://java-buddy.blogspot.com/");
	//preferences.put
//	preferences.putInt(KeyInt, 1934530);
//	preferences.putBoolean(KeyBoolean, true);
	
}
