package org.fbpage;

import org.common.commonmethod;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fbuser extends commonmethod
{
public fbuser()
{
	PageFactory.initElements(driver, this);
}
@FindBy(id="email")
private WebElement email;
@FindBy(id="pass")
private WebElement pass;
@FindBy(id="u_0_2")
private WebElement loginid;



public WebElement getEmail() {
	return email;
}
public void setEmail(WebElement email) {
	this.email = email;
}
public WebElement getPass() {
	return pass;
}
public void setPass(WebElement pass) {
	this.pass = pass;
}
public WebElement getLoginid() {
	return loginid;
}
public void setLoginid(WebElement loginid) {
	this.loginid = loginid;
}
}