class LinkedList{
	Node head;
	
	static class Node{
		Node prev;
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
			prev = null;
		}
	}
	
	void insert(int d){
		Node new_node = new Node(d);
		if(head == null){
			head = new_node;
			return;
		}
		new_node.next = head;
		head.prev = new_node;
		head = new_node;
	}
	
	void append(int d){
		Node new_node = new Node(d);
		if (head == null){
			head = new_node;
			return;
		}
		Node n = head;
		while(n.next != null){
			n = n.next;
		}
		n.next = new_node;
		new_node.prev = n;
		
	}
	
	int count(){
		Node n = head;
		int c = 0;
		while(n != null){
			n = n.next;
			c++;
		}
		return c;
	}
	
	void Reverse(){
		Node n = head;
		Node p = n;
		while(n != null){
			p = n;
			n = n.next;
		}
		System.out.println("output:");
		while(p != null){
			System.out.print(p.data+" ");
			p = p.prev;
		}
	}
	
	public static void main(String []args){
/* 		LinkedList l = new LinkedList();
		l.insert(1);
		l.append(2);
		l.append(3);
		l.append(4);
		l.append(5);
		
		System.out.println("Testcase 1 :");
		
		l.Reverse();
		System.out.println(""); */
		
		
		LinkedList l1 = new LinkedList();
		l1.insert(3);
		l1.append(4);
		l1.append(2);
		l1.append(5);				
		System.out.println("Testcase 2 :");
		l1.Reverse(); 
	} 
}