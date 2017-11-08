import org.testng.annotations.Test;

import com.config.Config;
import com.google.gson.Gson;

import org.testng.annotations.BeforeMethod;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class GSONSample {
	Gson gson;
	Config config;
  @Test
  public void f() throws NoSuchMethodException, SecurityException {
	  System.out.println(config.getSearchSourceSettings().getSources());
  }
  
  @BeforeClass
  public void beforeSuite() {
	  gson = new Gson();

      //Read the employee.json file
      try {
		BufferedReader br = new BufferedReader(  
		          new FileReader("D:\\WAB\\WAB\\WAB2.6\\server\\apps\\4\\configs\\NearMe\\config_NearMe.json"));
		config = gson.fromJson(br, Config.class);
      } catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
