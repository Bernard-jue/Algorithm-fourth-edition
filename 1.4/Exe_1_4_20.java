package com.tongji.test_1_4;

public class Exe_1_4_20
{
	public static void main(String[] args)
	{
		int [] a= {1,2,3,4,10,9,8,7};
		int key=10;
		//˫����,��Ҫ���ҵ�ת�۵�,��ת�۵��Ȼֻ��һ��,��Exe_1_4_18��֪ʶ,����ע�����Ҿֲ������
		int i=find(a);
		//����߲���
		int left=rankLeft(key, a, 0, i);
		//���ұ߲���
		int right=rankRight(key, a, i+1, a.length-1);
		if(left==-1 && right==-1)//���Ҷ�û�����Ԫ��
			System.out.println("not contain");
		else
			System.out.println("contain");
	}
	public static int find(int [] a)
	{
		return find(a,0,a.length-1);
	}
	public static int find(int [] a,int lo,int hi)
	{
		int mid=lo+(hi-lo)/2;
		if(a[mid]>a[mid-1]&&a[mid]>a[mid+1])
			return mid;
		//�ڽϴ�(��)������Ԫ�صİ���м������� (���Ǻܶ�Ϊʲô)
		if(a[mid-1]>a[mid+1])
			return find(a,lo,mid-1);
		else 
			return find(a,mid+1,hi);
	}
	public static int rankLeft(int key,int [] a,int lo,int hi)
	{
		//��������ǵ�����
		if(hi<lo)
			return -1;
		int mid=lo+(hi-lo)/2;
		if(a[mid]<key)
			return rankLeft(key, a, mid+1, hi);
		else if(a[mid]>key)
			return rankLeft(key, a, lo, mid-1);
		else
			return mid;
	}
	public static int rankRight(int key,int [] a,int lo,int hi)
	{
		//�ұ������ǵݼ���
				if(hi<lo)
					return -1;
				int mid=lo+(hi-lo)/2;
				if(a[mid]<key)
					return rankLeft(key, a, lo, mid-1);
				else if(a[mid]>key)
					return rankLeft(key, a, mid+1, hi);
				else
					return mid;
	}
}
