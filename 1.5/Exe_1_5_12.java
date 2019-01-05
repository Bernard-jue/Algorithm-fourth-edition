package com.tongji.algorithms_1_5;

public class Exe_1_5_12
{
	private int [] id;
	private int count;
	
	public Exe_1_5_12(int N)
	{
		count=N;
		id=new int[N];
		for (int i = 0; i <N ; i++) 
		{
			id[i]=i;
		}
	}
	public int count()
	{
		return count;
	}
	public boolean connected(int p,int q)
	{
		return find(p)==find(q);
	}
	public int find(int p)
	{
		int root=p;
		while(root!=id[root])
			root=id[root];
		//��p�ڵ㿪ʼ,���¶��ϰ����нڵ㶼���ӵ����ڵ�
		while(p!=root)
		{
			//id[p]����p����һ���ڵ�
			int temp=id[p];
			id[p]=root;
			p=temp;
		}
		return root;
	}
	public void union(int p,int q)
	{
		int pRoot=find(p);
		int qRoot=find(q);
		if(pRoot==qRoot)
			return;
		id[pRoot]=qRoot;
		count--;
	}
}


