package org.fbexe;

import org.common.commonmethod;
import org.fbpage.fbuser;

public class fbexecution extends fbuser
{
public static void fbpage() throws InterruptedException
{
	fbuser locators=new fbuser();
	commonmethod.browserLaunchChrome();
	commonmethod.loadurl("https://www.facebook.com/");
	Thread.sleep(2000);
	commonmethod.type(locators.getEmail(),"lakshmi");
	commonmethod.type( locators.getPass(),"123456");
	commonmethod.btclick(locators.getLoginid());
}
public static void main(String[] args) throws InterruptedException
{
	fbpage();
}
}
