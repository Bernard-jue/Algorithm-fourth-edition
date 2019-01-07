package com.tongji.algorithms_2_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exe_2_5_2
{
	public static void main(String[] args)
	{
		String [] strings="after thought afterthought ab cd abcd a a aaa aa aa".split(" ");
		Set<String> set=combination(strings);
		//Ϊ�˲�����ͬ��,������set
		//�����㷨,û�뵽�õķ���
		for(String s:set)
		{
			System.out.print(s+" ");
		}
	}
	public static Set<String> combination(String [] strings)
	{
		Set<String> set=new HashSet<>();
		int N=strings.length;
		for (int i = 0; i <N ; i++) 
		{
			String stringFirst=strings[i];
			for (int j = i+1; j <N ; j++) 
			{
				String stringSecond=strings[j];
				for (int k = 0; k <N ; k++) 
				{
					if((stringFirst+stringSecond).equals(strings[k]) || (stringSecond+stringFirst).equals(strings[k]))
						set.add(strings[k]);
				}
			}
		}
		return set;
	}
}



