package com.tongji.test_1_4;

import java.util.Arrays;

public class Exe_1_4_15_TWO
{
	public static int count(int [] a)
	{
		int cnt=0;
		int lo=0;
		int hi=a.length-1;
		//�����Ϊ����,���ұ�Ϊ����,���lo+hi<0,˵������̫��,lo+1
		while(a[lo]<=0 && a[hi]>=0 && lo<hi)//lo>0����hi<0��Ҫ����,lo>=hiҲҪ����
		{
			if(a[lo]+a[hi] <0)
				lo++;
			else if(a[lo]+a[hi] >0)
				hi--;
			else
			{
				cnt++;
				lo++;
				hi--;
			}
		}
		return cnt;
	}
	public static void main(String[] args)
	{
		int [] a= {-6,-5,-2,-1,0,0,1,2,3,4,5};
		Arrays.sort(a);
		System.out.println(count(a));

	}
}
