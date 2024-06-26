import java.util.*;
import java.io.*; 

class node { 
	node prev; 
	int data; 
	node next; 
 
	node(int value) 
	{ 
 
		prev = null; 

		data = value; 

		next = null; 
	} 
} 

class Doublyll { 
	static node head = null; 
	static node tail = null; 
	static void insert(int data) 
	{ 
		node temp = new node(data); 
		if (tail == null) { 
			head = temp; 
			tail = temp; 
		} 
		else { 
			tail.next = temp; 
			temp.prev = tail; 
			tail = temp; 
		} 
	}

	static void delete(int val) 
	{ 
		if (head == null) { 
			return; 
		} 

		node current = head;

		while (current != null ) { 
		    if(current.data==val){
                current.prev.next= current.next; 
                current.next.prev=current.prev; 
		    }
			current = current.next; 
			; 
		
		} 
	} 

	static void display(node head) 
	{ 
		node temp = head; 
		while (temp != null) { 
			System.out.print(temp.data + " --> "); 
			temp = temp.next; 
		} 
		System.out.println("NULL"); 
	} 

	public static void main(String[] args) 
	{ 
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter number of elements : "); 
	    int n=sc.nextInt();
        System.out.print("Enter element : ");
	    for(int i=0;i<n;i++){
	        int dat=sc.nextInt();
	        insert(dat);
	    }
        System.out.print("Enter element to be deleted : "); 
	    int d=sc.nextInt();
        System.out.print( "List1:  ");
        display(head); 
	    delete(d);
		System.out.print( "List:  "); 
		display(head); 
	} 
}

