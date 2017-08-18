
import sun.misc.GC;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis() + 10 * 60 * 1000 + "-");
        System.out.println(System.currentTimeMillis() + 40 * 60 * 1000);
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        sc.nextLine();
//        int[] list = new int[100005];
//        int[] mark = new int[100005];
//        TreeSet<Integer> set = new TreeSet<Integer>();
//
//        int i = 0;
//        String m;
//        int num;
//        while (i < n) {
//
//            m = sc.next();
//
//
//            if (!m.equals("?")) {
//                num = sc.nextInt();
//
//                mark[num] = i;
//                if (m.equals("O")) {
//                    list[num] -= 1;
//                    if (list[num] < 0) {
//                        try {
//                            if (set.lower(mark[num]) == null) {
//                                break;
//                            }
//                            set.remove(mark[num]);
//                        } catch (Throwable e) {
//                            break;
//                        }
//
//                    }
//
//                } else {
//                    list[num] += 1;
//                    if (list[num] > 1) {
//                        try {
//                            set.lower(mark[num]);
//                            set.remove(mark[num]);
//                        } catch (Throwable e) {
//                            break;
//                        }
//
//                    }
//
//                }
//
//            } else {
//                set.add(i);
//            }
//
//            i++;
//        }
//
//        i++;
//
//        if (i > n) {
//            System.out.println(-1);
//        }else {
//            System.out.println(i);
//        }


    }

}