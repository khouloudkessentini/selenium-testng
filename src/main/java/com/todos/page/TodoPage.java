package com.todos.page;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.todos.utils.BasePage;

public class TodoPage extends BasePage {

	public TodoPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='What needs to be done?']")
	public static WebElement inputField;
	
	@FindBy(how = How.XPATH, using = "//label[normalize-space()='Adopter une bonne pratique de test']")
	public static WebElement textTodo;
	
	@FindBy(how = How.XPATH, using = "//input[@type='checkbox']")
	public static WebElement checkboxTodo;

	
	public void submiTodo(String todo) {
		inputField.clear();
		inputField.sendKeys(todo);
		inputField.sendKeys(Keys.ENTER);
	}
	
	public Boolean isElementDisplayed(WebElement element) {
		return element.isDisplayed();
	}
	
	public String checkElementContains(WebElement element) {
		return element.getText();
	}
	
	public Boolean isCheckedboxSelected(WebElement element) {
		return element.isSelected();
	}

}
