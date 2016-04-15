package test;

import simplex.LinearProgram;

/**
 * @author Administrator 单纯形法
 * 
 *         第一行第一个数字为1代表求目标函数的最大值，-1代表求目标函数的最小值； 第二个数字代表约束条件的个数； 第三个数字代表变量个数；
 *         第四、五、六个数字分别代表≤的约束条件个数，=的约束条件个数，≥的约束条件个数；
 *         接下来输入约束条件的系数矩阵和右端项，注意按照≤，=，≥的顺序； 最后按照变量下标顺序输入目标函数的价值系数；
 * 
 *         -1 3 3 1 1 1 1 -2 1 11 -2 0 1 1 -4 1 2 3 -3 1 1
 * 
 *         代表：
 * 
 *         (x1)-2(x2)+(x3)<=11 -2(x1) +(x3)=1 -4(x1)+(x2)+2(x3)>=3
 * 
 *         min z=-3(x1)+(x2)+(x3)
 *
 */
public class LinearProgram_Test {

	/**
	 * @param args
	 *            线性规划 单纯型法
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a[][] = { { 1, -2, 1, 11 }, { -2, 0, 1, 1 }, { -4, 1, 2, 3 } };// 系数矩阵
		int x[] = { -3, 1, 1 };// 目标函数的价值系数
		LinearProgram lp = new LinearProgram(-1, 3, 3, 1, 1, 1, a, x);
		lp.solve();
	}
}
