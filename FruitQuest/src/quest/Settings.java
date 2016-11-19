package quest;

import org.json.simple.JSONObject;
import org.json.simple.parser.*;
import java.io.File;

public class Settings {

	public void Settings(){
		
		File settingsFile = new File("./settings.json");
		
		if(!settingsFile.exists()){
			createNewSettings();
		}
		
	}
		
	public void createNewSettings(){
		
	}
	
	private void readSettings(){
		
	}
	
	private void WriteSettings(){
		
	}

}
