package Helpers;

import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
	public String ReadFile(String key, String propFilename)
	{
		try
		{
			Properties prop =new Properties();
			prop.load(this.getClass().getResourceAsStream(propFilename));
		
			String field=prop.getProperty(key);
			return field;
						
			
		}
		
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
			
	}
		

}
