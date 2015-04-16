package IteratorPkg;


public class DinerMenu {
	private int MAX_SIZE_MENU_ITEMS = 6;
	private int countItems = 0;
	private final MenuItem[] menuItems;

	public DinerMenu() {
		menuItems = new MenuItem[ MAX_SIZE_MENU_ITEMS ];

		addMenuItemToMenu(createNewMenuItem("Vegetarian BLT","(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99));
		addMenuItemToMenu(createNewMenuItem("BLT","Bacon with lettuce & tomato on whole wheat", false, 2.99));
		addMenuItemToMenu(createNewMenuItem("Soup of the day","Soup of the day, with a side of potato salad", false, 3.29));
		addMenuItemToMenu(createNewMenuItem("Hotdog","A hot dog, with saurkraut, relish, onions, topped with cheese",false, 3.05));
		addMenuItemToMenu(createNewMenuItem("Steamed Veggies and Brown Rice","Steamed vegetables over brown rice", true, 3.99));
		addMenuItemToMenu(createNewMenuItem("Pasta","Spaghetti with Marinara Sauce, and a slice of sourdough bread", true, 3.89));			
	}

	private boolean addMenuItemToMenu(MenuItem menuItem) {
		boolean isItemSuccessfullyAdded = false;
		
		if( menuItem != null && countItems < MAX_SIZE_MENU_ITEMS ){
			menuItems[ countItems++ ] = menuItem;
			isItemSuccessfullyAdded = true;
		}		
		
		return isItemSuccessfullyAdded;
	}

	private MenuItem createNewMenuItem(final String name, final String description, boolean isVegetable, double price) {
		MenuItem holdMenuItem = null;
		if (name != null && name.trim().length() > 0 && description != null && description.trim().length() > 0 && !(price < 0)) {
			holdMenuItem = new MenuItem(name, description, isVegetable, price);
		}

		return holdMenuItem;
	}
	
//	public MenuItem[] getMenuItems() {
//		return menuItems;
//	}	
	public Iterator<MenuItem> createIterator( ){
		return new DinerMenuIterator(menuItems);
	}
}
