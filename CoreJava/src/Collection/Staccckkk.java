package Collection;

import java.util.Stack;


//List :-- 3.Vector cha type(Stack)."Stack is subclass of vector "LIFO""


public class Staccckkk {
	
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.add(34);
		stack.push(45);
		stack.push(98);
		stack.push(12);
		stack.push(76);
		stack.push(23);
		
		System.out.println(stack);
		
		System.out.println("element by peek :"+stack.peek());
		System.out.println(stack);
		
		System.out.println("element by pop :"+stack.pop());
		System.out.println(stack);
		
		System.out.println("element bu search :"+stack.search(12));
		System.out.println(stack);
		
		System.out.println("element by remove :"+stack.remove(4));
		System.out.println(stack);
		
		
	}

}
