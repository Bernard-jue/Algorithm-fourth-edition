package com.tongji.algorithms_1_5;

import edu.princeton.cs.algs4.MinPQ;

public class Exe_2_4_25 implements Comparable<Exe_2_4_25>
{
	private final int sum;
	private final int i;
	private final int j;
	
	public Exe_2_4_25(int i,int j)
	{
		this.sum=i*i*i+j*j*j;
		this.i=i;
		this.j=j;
	}
	public int compareTo(Exe_2_4_25 that)
	{
		if(this.sum<that.sum)
			return -1;
		if(this.sum>that.sum)
			return +1;
		return 0;
	}
	public String toString()
	{
		return sum+" = "+i+"^3"+" + "+j+"^3";
	}
	public static void main(String[] args)
	{
		int N=5;
		MinPQ<Exe_2_4_25> pq=new MinPQ<>();
		for (int i = 0; i <=N ; i++) 
		{
			pq.insert(new Exe_2_4_25(i, i));
		}
		while(!pq.isEmpty())
		{
			Exe_2_4_25 s=pq.delMin();
			System.out.println(s);
			//��Ϊi��ͬ,j��ͬʱ,jԽ������Խ��,�����ȶ���ͬ��j(��ʼΪ0),��ͬ��i���бȽ�
			//Ȼ��һ��(i,j)����,�ڼ������i����һ��j
			if(s.j<N)
				pq.insert(new Exe_2_4_25(s.i, s.j+1));
		}
	}
}



