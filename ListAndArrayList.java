import java.util.ArrayList;
import java.util.Scanner;

public class ListAndArrayList {
	private static Scanner scanner = new Scanner(System.in);
	private static GroceryList myList = new GroceryList();

	public static void main(String[] args) {
		boolean flag = true;
		while (flag) {

			int modifyIndex = -1;
			boolean hasNextInt = false;
			String oldName = null;
			String modifyName = null;

			System.out.println("Enter 1 To Add Items.");
			System.out.println("Enter 2 To Remove Items.");
			System.out.println("Enter 3 To Modify Items.");
			System.out.println("Enter 4 To Print The List.");
			System.out.println("Enter -1 To Exit.");

			System.out.print("Enter Your Choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {

				case 1:
					System.out.print("Enter The Item You Want To Add: ");
					String item = scanner.nextLine();
					myList.addGroceryItem(item);
					break;

				case 2:

					System.out.print("Enter The Index Or Name Of The Item You Want To Remove: ");
					hasNextInt = scanner.hasNextInt();
					if (hasNextInt) {
						modifyIndex = scanner.nextInt();
						scanner.nextLine();
						myList.removeGroceryItem(modifyIndex);
					} else {
						oldName = scanner.nextLine();
						myList.removeGroceryItem(oldName);
					}
					break;

				case 3:
					System.out.print("Enter The Index Or Name Of The Item You Want To Modify: ");
					hasNextInt = scanner.hasNextInt();
					if (hasNextInt) {
						modifyIndex = scanner.nextInt();
						scanner.nextLine();
					} else {
						oldName = scanner.nextLine();
					}
					System.out.print("What To Replace It With: ");
					modifyName = scanner.nextLine();
					if (hasNextInt) {
						myList.modifyGroceryItem(modifyIndex, modifyName);
					} else {
						myList.modifyGroceryItem(oldName, modifyName);
					}
					break;

				case 4:
					myList.printGroceryList();
					break;

				default:
					flag = false;
					break;
			}
		}
	}
}

class GroceryList {
	private ArrayList<String> groceryList = new ArrayList<String>();

	public void addGroceryItem(String item) {
		groceryList.add(item);
	}

	public void printGroceryList() {
		System.out.println("You Have " + groceryList.size() + " Items.");
		for (int i = 0; i < groceryList.size(); i++) {
			System.out.println((i + 1) + ". " + groceryList.get(i));
		}
	}

	public void modifyGroceryItem(int noOfItemOnList, String newItem) {
		if (noOfItemOnList < 1) {
			System.out.println("Enter A Correct Index.");
			return;
		}
		groceryList.set((noOfItemOnList - 1), newItem);
		System.out.println("Item No " + noOfItemOnList + " Has Been Modified.");
	}

	public void modifyGroceryItem(String oldItem, String newItem) {
		int position = findIndexOf(oldItem);
		if (position < 0) {
			System.out.println("Your List Does Not Have " + oldItem);
			return;
		} else {
			modifyGroceryItem(position + 1, newItem);
		}
	}

	public void removeGroceryItem(int noOfItemOnList) {
		if (noOfItemOnList < 1) {
			System.out.println("List Index Incorrect.");
			return;
		}
		String theItem = groceryList.get(noOfItemOnList - 1);
		groceryList.remove(noOfItemOnList - 1);
		System.out.println(theItem + " has been removed.");
	}

	public void removeGroceryItem(String itemName) {
		int position = findIndexOf(itemName);
		if (position < 0) {
			System.out.println(itemName + " Does Not Exist In Your List.");
			return;
		}
		removeGroceryItem(position + 1);
	}

	public int findIndexOf(String searchItem) {
		// boolean exists = groceryList.contains(searchItem);
		int position = groceryList.indexOf(searchItem);
		return position;
	}

	public ArrayList<String> getGroceryList() {
		return groceryList;
	}
}
