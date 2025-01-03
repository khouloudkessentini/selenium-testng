package com.todos.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.todos.page.TodoPage;
import com.todos.utils.Setup;

public class AddTodoTest extends Setup {

	public AddTodoTest() throws IOException {
		super();
	}
	
	TodoPage todoPage;
	
	@Test
	public void iAddTodo() throws IOException {
		todoPage = new TodoPage();
		
		boolean fieldTodo = todoPage.isElementDisplayed(TodoPage.inputField);
		Assert.assertTrue(fieldTodo);
		
		todoPage.submiTodo(prop.getProperty("todo1"));
		
		String textTodo = todoPage.checkElementContains(TodoPage.textTodo);
		Assert.assertTrue(textTodo.contains(prop.getProperty("todo1")));
		
		
		boolean checkbox = todoPage.isCheckedboxSelected(TodoPage.checkboxTodo);
		Assert.assertFalse(checkbox);
	}

}
