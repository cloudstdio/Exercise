package com.kui.exercise;

import static org.junit.Assert.*;

import org.junit.Test;

public class FiftyPrimaryExercises {
	@Test
	public void e() {
		
	}
	@Test
	public void e1() {
		//1.古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？		
		System.out.println("第8个月有" + rabbit(8) + "对兔子");
	}
	public int rabbit(int month)
	{		
		int sum = 0;
		if(month > 2) {
			sum = rabbit(month-1) + rabbit(month-2);
		} else {
			sum = 1;
		}
		return sum;
	}	
//	2.判断101到200之间有多少个素数？并输出所有素数。
//	算法分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除，增表明这个数不是素数，反之是素数。
	@Test
	public void e2() {
		int sum = 0;
		for(int i = 101; i < 200; i++)
		{
			boolean flag = false;
			for(int j = 2; j <= Math.sqrt(i); j++)
			{
				if(i % j != 0)
				{
					flag = true;
				} else{
					flag = false;
					break;
				}
			}
			if(flag)
			{
				sum ++;
				System.out.println(i + "是素数");				
			}
		}
		System.out.println("101-200之间共有素数" + sum + "个.");		
	}
//	3.答应出所有的水仙花数：一个三位数，其各位数字立方和等于该数本身。例如153是，因为153=1的立方+5的立方+3的立方.
	@Test
	public void e3() {
		int sum = 0;
		for(int i = 100; i <= 999; i++)
		{
			int a = i / 100;
			int b = (i - a*100) / 10;
			int c = i % 10;
			if(i == a*a*a + b*b*b +c*c*c)
			{
				sum ++;
				System.out.println(i + "是水仙花数.");
			}
		}
		System.out.println("水仙花数共有:" + sum + "个");
	}
//	4.将一个正整数分解质因数。例如：输入90，打印出90=2*3*3*5.
//	算法分析：
//	1)对n进行分解质因数应先找到一个最小的质数k，然后按一下步骤完成：
//	2)如果这个质数等于n，则说明分解质因数完成，打印出该数；
//	3)如果n不等于k，但n能被k整除，则应打印出k的值，并用n除以k的商，作为新的正整数n，重复执行第一步；
//	4)如果n不能被k整除，则用k+1作为k的值，重复执行第一步。
	@Test
	public void e4() {
		int i = 27;
		int k = 2;
		System.out.print(i + "=");
		splitInteger(i, k);		
	}
	void splitInteger(int i, int k)
	{
		if(i == k)
		{
			System.out.println(k);
		} else {
			if(i % k == 0)
			{
				System.out.print(k + "*");
				i = i / k;
				splitInteger(i, k);
			} else {
				splitInteger(i, ++k);
			}
		}
	}
//	5.利用条件运算符的嵌套完成：学习成绩>=90分的同学用A表示，60-89之间的用B表示，60分以下的用C表示。
	@Test
	public void e5() {
		int score = 99;
		System.out.println(score >= 90 ? "A" : (score >= 60 && score <=89 ? "B" : "C"));
	}
//	6.输入两个正整数m和n，求其最大公约数和最小公倍数.
//	算法分析：在循环中，只要除数不等于0，用较大数除以较小数，将小的一个数作为下一轮循环的大数，取得的余数作为下一轮循环较小的数；
//	如此循环直到最小的数为0，返回较大的数，此数即为最大公约数，最小公倍数为两数之积除以最大公约数。
	@Test
	public void e6(){
		int i = 6;
		int j = 9;
		int temp_i = i;
		int temp_j = j;
		while(i > 0)
		{
			int temp = j % i;
			j = i;
			i = temp;
		}
		System.out.println("两数最大公约数为：" + j + "，最小公倍数为：" + temp_i*temp_j/j);		
	}
//	7.输入一行字符，分别统计出其中英文字母、空格、数字和其他字符的个数。
//
//	8.求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+2222(此时共有5个数相加)，几个数相加由键盘输入。
//
//	9.一个数如果恰好等于它的因子之和，这个数就成为“完数”，例如6=1+2+3.编程找出1000以内所有完数。
//
//	10.一球从100米高度自由落下，每次落地后反跳原高度一半，再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？
//
//	11.有1、2、3/4四个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
//
//	12.企业发放的奖金根据利润提成。利润低于或等于10万时，奖金可提10%；利润高于10万元低于20万元时，高于10万元的部分可提成7.5%；利润在20到40万元之间时，高于20万元的部分可提成5%；利润40到60万元时，高于40万元的部分可提成3%；利润60到100万之间时，高出60万部分可提成1.5%；利润高于100万时，高出100万的部分按1%提成。从键盘输入当月利润，求应当发奖金总数多少？
//
//	13.一个整数，它加上100后是完全平方数，再加上168又是一个完全平方数，请问该数是多少？
//
//	14.输入年月日，判断这一天是这一年的第几天？
//
//	15.输入三个整数x,y,z，由小到大输出。
//
//	16.输出9*9乘法口诀
//
//	17.猴子吃桃问题：猴子第一条摘下若干个桃子，当即吃了一半，还不过瘾，又多吃了一个；第二天早上又将剩下的桃子吃了一半，之后又多吃了一个。以后每天早上都吃了前一天剩下的一半并多吃了一个，到第十天早上再想吃时，只剩下一个桃子了。求第一条共摘了多少个？
//
//	18.两个乒乓球队进行比赛，各处三人。甲队a,b,c，乙队x,y,z。已抽签决定比赛名单。有人向队员打听比赛名单。a说他不和x比，c说他不和x,z比，请编程找出三对选手的名单。
//
//	19.打印出如下图案（菱形）
//	![菱形](http://7xsedi.com1.z0.glb.clouddn.com/%E8%8F%B1%E5%BD%A2.jpg)
//
//	20.有一分数序列：2/1,3/2,5/3,8/5,13/8,21/13...求出这个数列前20项之和。
//
//	21.求1+2!+3!+...+20!的和
//
//	22.利用递归方法求5!
//
//	23.有五个人坐在一起，问第五个人有多少岁，他说比第四个人大2岁。问第四个人岁数，他说比第三个人大2岁。问第三个人岁数他说比第二个人大2岁。问第二个人岁数，他说比第一个人大2岁。最后问第一个人他说10岁。问第五个人多大？
//
//	24.给一个不多于5位的正整数，要求：一、求它是第几位数，二、逆序打印出各位数字。
//
//	25.一个5位数，判断它是不是回文数。例如12321是回文数，个位与万位相同，十位与千位相同。
//
//	26.请输入星期几的第一个字母来判断是星期几，如果第一个字母一样，则继续判断第二个字母。
//
//	27.求100以内的素数。
//	//注意：使用sqrt(n)的方法求出的素数不包括2和3.
//
//	28.对10个数进行排序。
//
//	29.求一个3*3矩阵对角线原素之和。
//
//	30.有一个已经排好序的数组。先输入一个数，要求按原来的规律将它插入数组中。
//
//	31.将一个数组逆序输出。
//
//	32.取一个整数从右端开始的4-7位。
//
//	33.打印出杨辉三角形(要求打印出10行如下图)
//	![wangweikui_yanghuisanjiao](http://7xsedi.com1.z0.glb.clouddn.com/wangweikui_yanghuisanjiao.jpg)
//
//	34.输入3个数a,b,c，按大小顺序输出。
//
//	35.输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。
//
//	36.有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数。
//
//	37.有n个人围成一圈，顺序排号。从第一个开始报数(从1-3循环报)，凡报到3的人退出圈子，问最后留下的是原来第几号的那位？
//
//	38.写一个函数，求一个字符串的长度，在main函数中输入字符串，并输出其长度。
//
//	39.编写一个函数，输入n为偶数时，调用函数求1/2+1/4+...+1/n；当输入n为奇数时，调用函数1/1+1/3+...+1/n。
//
//	40.字符串排序
//
//	41.海滩上有一堆桃子，五只猴子来分。第一只猴子把这堆桃子平均分为5份，多了一个，这只猴子把多的一个扔到了海中拿走了一份。第二字猴子把剩下的桃子又平均分成五分，又多了一个，他同样把多的一个扔入海中，拿走了一份。第三、第四、第五只猴子都是这样做的，问海滩上原来多少个桃子？
//
//	42.809*??=800*??+9??，其中??代表两位数，8*??的结果为两位数，9*??的结果为三位数。求??代表的两位数，及809*??后的结果。
//
//	43.求0-7所能组成的奇数个数。
//
//	44.程序证明：一个偶数总能表示为两个素数之和。输入一个偶数输入其等于哪两个素数的和。
//
//	45.判断一个素数能被几个9整除。
//
//	46.程序实现两个字符串连接。
//
//	47.读取7个数(1-50之间)的整数值，每读取一个值，程序打印出改值个数的*。
//
//	48.数据加密：数据是四位的整数，在传递的过程中加密规则如下：每位数字都加上5除以10后用余数代替该数字，再将第一位和第四位交换，第二位和第三位交换。输出加密后的数字
//
//	49.计算字符串中子串出现的次数。
//
//	50.有五个学生，每个学生有3门课的成绩，从键盘输入一下数据（包括学生号，姓名，三门课程成绩），计算出平均成绩，把原有的数据和计算出的平均分数存放在磁盘文件"stud"中。
//


}
