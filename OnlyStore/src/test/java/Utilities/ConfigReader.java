package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	private Properties prop = new Properties();

	public Properties init_prop() {

		try {
			FileInputStream ip = new FileInputStream("C:\\Users\\taimur.hassan\\eclipse-workspace\\OnlyStore\\config\\config.proeprties");
				prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return prop;
	}

}
