package main;

import java.util.Arrays;

public class QueueMain
{
	public static void main(String[] args)
	{
		QueueADT queue1 = new QueueADT();

//		TODO add method call for enqueue
		queue1.enqueue(10);
		queue1.enqueue(20);
		queue1.enqueue(30);
		queue1.enqueue(40);
		System.out.println(Arrays.toString(queue1.queue));



//		TODO add method call for dequeue

	}
}
