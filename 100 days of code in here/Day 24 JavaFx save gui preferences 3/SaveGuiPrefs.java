package application;

import java.util.prefs.Preferences;
/*
 * key 0 is width
 * key 1 is height 
 * key10 is slider center
 */
public class SaveGuiPrefs 
{
	Preferences state;
	String value;
	
	String keyValue ;

	
	//initialize method, used by all constructors
	void Init(String nodeName)
	{
		keyValue =  "key0";
		state = Preferences.userRoot().node(nodeName);
		
		
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
	
	//overloaded methods for all value types
	public void setValue (String key, String value)
	{
		state.put(key, value);
	}
	public void setValue (String key, Double value)
	{
		state.putDouble(key, value);
	}
	public void setValue (String key, int value)
	{
		state.putInt(key, value);
	}
	public void setValue (String key, boolean value)
	{
		state.putBoolean(key, value);
	}
	public String getValue(String key) 
	{
		return state.get(key,"");
	}
	
	
}
