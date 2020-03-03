package training;

import java.io.IOException;
import java.nio.charset.MalformedInputException;

import com.google.common.base.Equivalence.Wrapper;

public class CallWrapper {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WrapperMethod wm = new WrapperMethod();
wm.launchapp("https://www.linkedin.com/");
wm.clickbyxpath("/html/body/nav/a[3]");
wm.enterbyid("username", "ghasfhag@gmail.com");
wm.enterbyid("password", "236456");
wm.clickbyxpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button");
wm.screenshot("C:\\Users\\BLTuser.BLT1222\\Desktop\\scr\\vv.jpg");

{
	
}
	}

}
