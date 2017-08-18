import java.util.Scanner;

/**
 * Created by apple on 2017/6/18.
 * 题目描述
 有一个大水缸，里面水的温度为T单位，体积为C升。另有n杯水（假设每个杯子的容量是无限的），每杯水的温度为t[i]单位，体积为c[i]升。
 现在要把大水缸的水倒入n杯水中，使得n杯水的温度相同，请问这可能吗？并求出可行的最高温度，保留4位小数。
 注意：一杯温度为t1单位、体积为c1升的水与另一杯温度为t2单位、体积为c2升的水混合后，温度变为(t1*c1+t2*c2)/(c1+c2)，体积变为c1+c2。

 输入描述:
 第一行一个整数n, 1 ≤ n ≤ 10^5
 第二行两个整数T，C,其中0 ≤ T ≤ 10^4, 0 ≤ C ≤ 10^9
 接下来n行每行两个整数t[i]，c[i]
 0 ≤ t[i], c[i] ≤ 10^4


 输出描述:
 如果非法，输出“Impossible”（不带引号)否则第一行输出“Possible"（不带引号），第二行输出一个保留4位小数的实数表示答案。

 样例解释：往第二杯水中倒0.5升水
 往第三杯水中到1升水
 三杯水的温度都变成了20

 输入例子:
 3
 10 2
 20 1
 25 1
 30 1

 输出例子:
 Possible
 20.0000
 */
public class Water {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int t = sc.nextInt();
        int v = sc.nextInt();
        int[] tlist = new int[100000];
        int[] vlist = new int[100000];
        int t1;
        int v1;
        int tag = 0;
        int top = 0;

        t1 = sc.nextInt();
        v1 = sc.nextInt();
        tlist[0] = t1;
        vlist[0] = v1;
        if (t1 > t) {
            tag = 1;
        } else if (t1 < t) {
            tag = -1;
        }
        top = t1;
        int i = 1;
        while (i < n) {
            t1 = sc.nextInt();
            v1 = sc.nextInt();

            tlist[i] = t1;
            vlist[i] = v1;

            if (tag > 0) {
                if (t1 < top) {
                    top = t1;
                }
                if (t1 - t <= 0) {
                    break;
                }
            } else if (tag < 0) {
                if (t1 > top) {
                    top = t1;
                }
                if (t1 - t >= 0) {
                    break;
                }
            } else {
                if (t1 != t) {
                    break;
                }
            }
            i++;

        }
        if (i < n) {
            System.out.println("Impossible");
            return;
        }
        double sum = 0;
        long sum1 = 0;
        for (int j = 0; j < n; j++) {
            sum += (float)(tlist[j] - t) * vlist[j]/(float)(top - t) - vlist[j];
            sum1 += vlist[j];
        }

        if (tag > 0) {
            if (sum <= v) {
                System.out.println("Possible");
                System.out.println(top + ".0000");
            } else {
                System.out.println("Impossible");
            }
        } else if (tag < 0){
            double result = 0;
            if (sum < v) {
                result = (float) (top - t) * sum1 / (float)(v - sum + sum1) + t;
            }
            System.out.println("Possible");
            System.out.println(String.format("%.4f",result));
        } else {
            System.out.println("Possible");
            System.out.println(top + ".0000");
        }


    }
}
