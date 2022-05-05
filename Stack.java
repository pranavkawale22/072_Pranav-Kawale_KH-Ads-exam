class Stack{
	int max = 10;
	int a[] = new int[max];
	int top1,top2;
	Stack(){
		top1 = -1;
		top2 = max/2;
	}	
	void push1(int x){
		if(top1 == max/2){
			System.out.println("Overflow");
		return;
		}
		a[++top1] = x;		
	}
	void push2(int x){
		if(top2 == max){
			System.out.println("Overflow");
		return;
		}
		a[++top2] = x;		
	}
	void pop1(){
		System.out.println("Popped element from stack1 is " + a[top1]);
		top1--;
	}
	
	void pop2(){
		System.out.println("Popped element from stack2 is "+ a[top2]);
		top2--;
	}
	
	public static void main(String[] args){	
		Stack s = new Stack();
		s.push1(5);
		s.push2(10);
		s.push2(15);
		s.push1(11);
		s.push2(7);
		s.push2(40);		
		s.pop1();
		s.pop2();
	}
}