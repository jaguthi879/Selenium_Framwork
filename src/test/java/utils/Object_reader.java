package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Object_reader {
	Properties prop;

	public Object_reader() throws IOException {
		
		String path = System.getProperty("user.dir");
		File file = new File(path + "/Objectrepository/Object.propeties");
		FileInputStream fStream = new FileInputStream(file);
		prop = new Properties();
		prop.load(fStream);
	}

	// method to get Edge key from object repository
	public String getEdgekey() {
		return prop.getProperty("Edgekey");
	}

	// method to get Edge path from object repository
	public String getEdgepath() {
		return prop.getProperty("Edgepath");
	}


	// method to get URL from object repository
	public String getURL() {
		return prop.getProperty("URL");
	}
}
	