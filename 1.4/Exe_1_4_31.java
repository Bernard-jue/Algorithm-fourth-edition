package com.tongji.test_1_4;

import edu.princeton.cs.algs4.Stack;

public class Exe_1_4_31<Item>
{
	/*
	  ����ջ�ֱ�����Ϊ������,���ջ���Ҳ�ջ����ģ����У�

	������˫����У���ջ����ջ��Ƶ���ĵ�����ȥ�����ÿ�ζ�ֻ��һ���Ԫ�ؿ�����Ч���ٿ�����

	��һ��ջΪ��ʱ����һ��ջ���ϰ벿�����ƶ����м�ջ�У��°벿�ֵ�����һ��ջ��ٴ��м�ջ�û��ϰ벿��Ԫ�ء�*/
	Stack<Item> left=new Stack<>();
	Stack<Item> middle=new Stack<>();
	Stack<Item> right=new Stack<>();
	
	public void pushLeft(Item item)
	{
		left.push(item);
	}
	public void pushRight(Item item)
	{
			right.push(item);
	}
	public boolean isEmpty()
	{
		return left.isEmpty()&&middle.isEmpty()&&right.isEmpty();
	}
	public Item popLeft()
	{
		if(isEmpty())
			throw new RuntimeException();
		if(left.isEmpty())
		{
			move(right, left);
		}
		return left.pop();
	}
	public Item popRight()
	{
		if(right.isEmpty())
			move(left, right);
		return right.pop();
	}
	private void move(Stack<Item> from,Stack<Item> to)
	{
		//ֻ��һ��Ź�ȥ,ȷ�����ҵ�ջʱ����һֱŲ��Ųȥ
		int N=from.size();
		for (int i = 0; i <N/2 ; i++) 
		{
			middle.push(from.pop());
		}
		while(!from.isEmpty())
		{
			to.push(from.pop());
		}
		while(!middle.isEmpty())
		{
			from.push(middle.pop());
		}
	}
	
}
