package com.tongji.test_1_3;

import com.tongji.algorithms_1_3.Queue;

public class Exe_1_3_37
{
	public static void Josephus(int N,int M)
	{
		//NΪ�˵ĸ���,MΪ�����ڼ�����
		Queue<Integer> queue=new Queue<>();
		for (int i = 0; i <N ; i++) 
		{
			queue.enqueue(i);
		}
		for (int i = 0; i <N ; i++) 
		{
			//��ѭ����ʾ���ն�Ҫ��ӡN��,ֱ��queue.size()Ϊ0
			for (int j = 0; j <M-1 ; j++) 
			{
				queue.enqueue(queue.dequeue());
			}
			System.out.print(queue.dequeue()+" ");
		}
	}
	public static void main(String[] args)
	{
		Exe_1_3_37.Josephus(7, 2);
	}
}


