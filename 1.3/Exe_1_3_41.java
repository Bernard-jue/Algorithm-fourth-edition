package com.tongji.test_1_3;

import edu.princeton.cs.algs4.Queue;

public class Exe_1_3_41
{
	//���豾����Queue��,������ʵ��һ����
	public Queue (Queue<Item> queue)
	{
		for(Item item:queue)
		{
			this.enqueue(item);
		}
	}
}
