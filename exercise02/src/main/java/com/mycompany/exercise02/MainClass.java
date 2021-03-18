
package com.mycompany.exercise02;



public class MainClass {
	
	public static void main(String[] args){
		Person customer01 = new Person("Kiwi");
		customer01.getShoppingList().addItemToList("Milk");
		customer01.getShoppingList().addItemToList("Bread");
		customer01.display();
		
		Person customer02 = new Person("Symone");
		customer02.getShoppingList().addItemToList("Apples");
		customer02.getShoppingList().addItemToList("Water");
		customer02.display();
	}
	
}
