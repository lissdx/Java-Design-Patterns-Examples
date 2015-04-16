package IteratorPkg;
import java.util.ArrayList;

public class PancakeHouseMenu {
	final ArrayList<MenuItem> menuItems;

	public PancakeHouseMenu() {
		menuItems = new ArrayList<>();

		addMenuItemToMenu(createNewMenuItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99));
		addMenuItemToMenu(createNewMenuItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99));
		addMenuItemToMenu(createNewMenuItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49));
		addMenuItemToMenu( createNewMenuItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59));
	}

	private boolean addMenuItemToMenu(MenuItem menuItem) {
		boolean isItemSuccessfullyAdded = false;
		
		if( menuItem != null ){
			menuItems.add( menuItem );
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
	
	public Iterator<MenuItem> createIterator( ){
		return new PancakeHouseMenuIterator(menuItems);
	}		
//	public ArrayList<MenuItem> getMenuItems() {
//		return menuItems;
//	}	
}
