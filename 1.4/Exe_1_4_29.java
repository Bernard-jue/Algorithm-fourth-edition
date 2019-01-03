package com.tongji.test_1_4;


import edu.princeton.cs.algs4.Stack;

public class Exe_1_4_29<Item>
{
	//����ջʵ�ֵ�steque(��ջΪĿ��Ķ���) ,����push,pop,enqueue����
	//��Exe_1_4_27 ����ջʵ�ֶ��в��
	//�ܵ�˼·��:���������enqueue�����Ļ�,push��popֻ�õ���stack2
	//���enqueue��,�Ȱ�2ȫ������1��,����Ԫ��,�ٵ���2��,��֤enqueue����2����ĩ��
	private Stack<Item> stack1=new Stack<>();
	private Stack<Item> stack2=new Stack<>();
	
	public void push(Item item)
	{
		stack2.push(item);
	}
	public boolean isEmpty()
	{
		return stack1.isEmpty()&&stack2.isEmpty();
	}
	public int size()
	{
		return stack1.size()+stack2.size();
	}
	public Item pop()
	{
		return stack2.pop();
	}
	public void enqueue(Item item)
	{
		reverse2();
		stack1.push(item);
		reverse1();
	}
	//��stack1��Ԫ��ѹstack2��
	private void reverse1()
	{
		while(!stack1.isEmpty())
		{
			stack2.push(stack1.pop());
		}
	}
	//��stack2��Ԫ��ѹstack1��
	private void reverse2()
	{
		while(!stack2.isEmpty())
		{
			stack1.push(stack2.pop());
		}
	}
	public void print()
	{
		for(Item item:stack2)
		{
			System.out.print(item+" ");
		}
	}
	public static void main(String[] args)
	{
		Exe_1_4_29<Integer> e=new Exe_1_4_29<>();
		for (int i = 0; i <5 ; i++) 
		{
			e.push(i);
		}
		e.pop();
		e.enqueue(6);
		e.print();
	}
}
