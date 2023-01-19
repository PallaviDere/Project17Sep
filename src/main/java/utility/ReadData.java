package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadData {
public static String readPropertyFile(String value) throws Exception 
{
	 Properties p = new Properties();
	 FileInputStream file = new FileInputStream("C:\\Users\\91702\\eclipse-workspace\\Project17Sep\\TestData\\confi.properties");
     p.load(file);
    return p.getProperty(value);
}
}
