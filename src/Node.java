
public class Node {
	
	private Node next ;
	private Student myStudent ;
	
	public Node(Student a){
		myStudent = a ;
		next = null ;
	}
	
	public void setNext(Node n){
		next = n ;
		
	}

	public Node getNext(){
		return next ;
	}
	
	public String toString(){
		return "Name: " + myStudent.getName() + "\nID: " + myStudent.getId() ;
	}
	
	public String getName(){
		return myStudent.getName() ;
	}
	
	public int getId(){
		return myStudent.getId();
	}

	


		

	
}
