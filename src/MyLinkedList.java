
public class MyLinkedList {
	
	private Node first ;
	private Node last ;
	private int size ;
	
	MyLinkedList(){
		first = last = null ;
	}
	
	public void add(Node input){
		if (first == null)
		{
			first = input ;
			last = first ;
		}
		else {
			last.setNext(input) ;
			last = last.getNext();
		}
	}
	
	public void print(){
		Node iter = first ;
		while (iter != null){
			System.out.println(iter.toString());
			iter = iter.getNext();
		}
	}
	
	public boolean remove(String input){
		Node iter = first ;
		Node lag = first ;
		while(iter != null){
			
			if (input.equals(iter.toString())){			
				lag.setNext(iter.getNext());
				iter.setNext(null);
				return true ;
				
			}
			else{
				lag = iter ;
				iter = iter.getNext() ;
			}
		}
		return false;
		
	}
	
	
	public boolean search(String element){
	    Node current ;
	    if (first == null )
	    return false; 
	    
	    else{
	    	current = first ;
	   
	    	while(current!=null){
	    		
	    		if (current.getName().equals(element)) {
	    			System.out.println("Found.") ;
	    		 return true ;
	    		}
	    		current = current.getNext() ;
	    	}
	    
	
	    
	    return false ;
	    	
	    }
	
	}
	
	public int getSize() {
		
		   for(Node n = first; n.getNext() != null; n = n.getNext())
		       size++;     
		   return size;
		}
	
	public void clear(){
		
		for(int i=0;i<size;i++){
			first.setNext(null);
			}
		
	}
	
}
