import java.util.Scanner ;

public class Driver {
	
	static int choice ;
	static boolean x = true ;
	static String name ;
	static int id ;
	static MyLinkedList list = new MyLinkedList() ;

	public static void main(String[] args) {
	
		while (x){
		
		Scanner scan = new Scanner(System.in) ;
		
		
		
		System.out.println("\nWhat would you like to do?\n"
				+ "Press 1 to add an item\n"
				+ "Press 2 to print the list\n"
				+ "Press 3 to search the list\n"
				+ "Press 4 to delete an item\n"
				+ "Press 5 to clear the whole list\n"
				+ "Press -1 to exit");
		
		 choice = scan.nextInt() ;
		
		
		switch(choice){
		case 1:
			scan.nextLine() ;
			System.out.println("Please enter the name.");
			name = scan.nextLine() ;
			System.out.println("Please enter the ID number.");
			id = scan.nextInt() ;
			list.add(new Node(new Student(name, id)));
			break ;
		case 2:
			list.print();
			break ;
			
		case 3:
			System.out.println("Please enter the name you are searching for.");
			scan.next() ;
			String searched = scan.nextLine() ;
			list.search(searched);
			break ;
			
		case 4:
			System.out.println("Please enter the name you are removing.");
			String removed = scan.nextLine() ;
			list.remove(removed) ;
			
		case 5:
			list.getSize();
			list.clear();
			
		case -1:
			x = false ;
			
		default:
			break ;
			
		}
		
		
		
		
			
		}
		
		
		
	}
	

}
