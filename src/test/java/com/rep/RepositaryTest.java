package com.rep;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseTest;

public class RepositaryTest extends BaseTest {

public RepositaryTest() {
PageFactory.initElements(driver, this);
}
	
@FindBy(xpath="//input[@id='username']")
private WebElement userName;

public WebElement getUserName() {
	return userName;
}

public void setUserName(WebElement userName) {
	this.userName = userName;
}

public WebElement getPassWord() {
	return passWord;
}

public void setPassWord(WebElement passWord) {
	this.passWord = passWord;
}

public WebElement getSubmitButton() {
	return submitButton;
}

public void setSubmitButton(WebElement submitButton) {
	this.submitButton = submitButton;
}

public WebElement getBookIcon() {
	return bookIcon;
}

public void setBookIcon(WebElement bookIcon) {
	this.bookIcon = bookIcon;
}

public WebElement getNextPage() {
	return nextPage;
}

public void setNextPage(WebElement nextPage) {
	this.nextPage = nextPage;
}

public WebElement getPreviousPage() {
	return previousPage;
}

public void setPreviousPage(WebElement previousPage) {
	this.previousPage = previousPage;
}

public WebElement getPageField() {
	return pageField;
}

public void setPageField(WebElement pageField) {
	this.pageField = pageField;
}

@FindBy(xpath="//input[@id='password']")
private WebElement passWord;

@FindBy(xpath="//button[@type='submit']")
private WebElement submitButton;

@FindBy(xpath="//span[text()='Calcul intégral ENRICHIE']")
private WebElement bookIcon;

@FindBy(xpath="//button[@aria-label='next page']")
private WebElement nextPage;

@FindBy(xpath="//button[@aria-label='previous page']")
private WebElement previousPage;

@FindBy(xpath="//input[@id='goToPageTextField']")
private WebElement pageField;
}
