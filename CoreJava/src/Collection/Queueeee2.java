package Collection;

import java.util.LinkedList;
import java.util.Queue;

//linked list is parent class of queue.

public class Queueeee2 {
	
public static void main(String[] args) {
		
		Queue<Integer> que = new LinkedList<Integer>();
		
		que.add(45);
		que.add(86);
		que.add(23);
		que.add(75);
		que.add(50);
		que.add(40);
		
		System.out.println(que);
		
		
		System.out.println("size of queue: "+que.size());
		
		
		System.out.println("element by Peek: "+que.peek());
		System.out.println(que);
		
		
		System.out.println("Element by Pop: "+que.poll());
		System.out.println(que);
		
		
		System.out.println("Element by Remove: "+que.remove(50));
		System.out.println(que);
		
		
		System.out.println(que.add(69));
		System.out.println(que);
		
		

		
	}

	

}