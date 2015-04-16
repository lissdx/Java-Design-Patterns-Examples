package IteratorPkg;

public class Waitress {
	private final PancakeHouseMenu pancakeHouseMenu;
	private final DinerMenu dinerMenu;
	
	public Waitress( PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}
	
	public void printMenu() {
		Iterator<MenuItem> pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
		Iterator<MenuItem> dinerMenuIterator = dinerMenu.createIterator();
		System.out.println("MENU\n----\nBREAKFAST");
		printMenu( pancakeHouseMenuIterator );
		System.out.println("\nLUNCH");
		printMenu( dinerMenuIterator );
	}

	private void printMenu(Iterator<MenuItem> iterator ) {
		while (iterator.hasNext() ) {
			MenuItem menuItem = iterator.next();
			System.out.print( menuItem.getName() + ", ");
			System.out.print( menuItem.getPrice() + " -- ");
			System.out.println( menuItem.getDescription());
		}		
	}
}
