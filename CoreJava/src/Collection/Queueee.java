package Collection;

import java.util.PriorityQueue;
import java.util.Queue;

//Queue :-- 1.Priority Queue.(FIFO).

public class Queueee {
	
	public static void main(String[] args) {
		
		Queue<Integer> que = new PriorityQueue<Integer>();
		
		que.add(45);
		que.add(86);
		que.add(23);
		que.add(75);
		que.add(50);
		que.offer(40);
//		offer bhi use kr skte ho add ki jagah.
		
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
