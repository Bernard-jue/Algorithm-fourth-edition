package com.tongji.test_1_4;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdRandom;

public class Exe_2_3_17
{
	//�и�С����,��������Ҳ�Ԫ����ô������
	//����:�ڴ����ڲ��������ʱ������������������Ԫ�ؿ�����Ϊ���������ұ߽���ڱ�
	//��ʵ�������i++��hi+1ʱ,��ʵ�͵����з�Ԫ��j������,�϶����з�Ԫ��С!
	public static void sort(Comparable [] a)
	{
		StdRandom.shuffle(a);
		int temp=0;
		for (int i = 1; i <a.length ; i++) 
		{
			if(less(a[i],a[temp]))
				temp=i;
		}
		exch(a, temp, a.length-1);
		sort(a,0,a.length-1);
	}
	private static void sort(Comparable [] a,int lo,int hi)
	{
		if(hi<=lo)
			return;
		int j=partition(a, lo, hi);
		sort(a,lo,j-1);
		sort(a,j+1,hi);
	}
	
	private static int partition(Comparable [] a,int lo,int hi)
	{
		int i=lo;
		int j=hi+1;
		Comparable v=a[lo];
		while(true)
		{
			while(less(a[++i], v));
			while(less(v,a[--j]));
			if(j>i)
				exch(a, i, j);
			else
				break;
		}
		exch(a, lo, j);
		return j;
	}

	private static boolean less(Comparable v,Comparable w)
	{
		return v.compareTo(w)<0;
	}
	private static void exch(Comparable [] a,int i,int j)
	{
		Comparable t=a[i];
		a[i]=a[j];
		a[j]=t;
	}
	private static void show(Comparable [] a)
	{
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static boolean isSorted(Comparable [] a)
	{
		for (int i = 1; i <a.length ; i++) 
		{
			if(less(a[i], a[i-1]))
				return false;
		}
		return true;
	}
	public static void main(String[] args)
	{
		String [] a=In.readStrings();
		sort(a);
		assert isSorted(a);
		show(a);
	}
}

