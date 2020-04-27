package com.fengzhiwei.common.utils;

import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Random;

public class RondomUtils {

	//方法1：返回min-max之间的随机整数（包含min和max值），例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。 (5分)
	public static int random(int min, int max){
		if (max < min) {
			throw new RuntimeException("请输入合适的数字");
		}
		Random r = new Random();
		int i = r.nextInt(max - min + 1)+min;
		return i;
	} 
	//方法2：在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。 (8分)
	public static int[] subRandom (int min, int max, int subs){
		int[] sub = new int[subs];
		HashSet<Integer> set = new HashSet<Integer>();
		while(set.size()!=subs) {
			set.add(random(min, max));
		}
		int i = 0;
		for (Integer integer : set) {
			sub[i]=integer;
			i++;
		}
		return sub;
	}
	//方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
	public static char randomCharacter (){
		String str="123456789abcdefghijklmnopqrstuvwsyzABCDEFGHIJKLMNOPQRSTUVWSYZ";
		return str.charAt(random(0, str.length()-1));
	}
	//方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
	public static String randomString (int length){
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < length; i++) {
			buffer.append(randomCharacter());
		}
		return buffer.toString();
	}
	//方法1：获得指定范围的随机小数,精度scale表示小数点后位数，举例min为25400.56,max为67078.94,返回小数点后2位的min和max之间的数，比如48545.87（8分）
	public static double getValue(final double min, final double max,final int scale){
		String num1 = String.valueOf(min);
		String[] split1 = num1.split("\\.");
		String num2 = String.valueOf(max);
		String[] split2 = num2.split("\\.");
		String p1=split1[1];
		Integer integer1 = Integer.valueOf(p1);
		String p2=split2[1];
		Integer integer2 = Integer.valueOf(p2);
		int i = RondomUtils.random(integer1, integer2);
		Double string = Double.valueOf(i);
		return string;
	}
}
