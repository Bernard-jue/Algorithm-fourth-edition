package com.tongji.test_1_4;

public class Exe_1_4_23
{
	static int rank(double[] a, double key)
    {
        int lo = 0;
        int hi = a.length - 1;
        //�ж�����Ϊ ������ĸ��С��N��������֮�С��1 / (N*N)
        double temp = 1.0 / (a.length * a.length);

        while (lo <= hi)
        {
            int mid = lo + (hi - lo) / 2;
            if (Math.abs(a[mid] - key) <= temp)
            {
                return mid;
            }
            else if (a[mid] < key)
            {
                lo = mid + 1;
            }
            else
            {
                hi = mid - 1;
            }
        }
        return -1;
    }
}
