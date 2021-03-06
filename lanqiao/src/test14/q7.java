package test14;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class q7 {
    private static List<String> ans = new ArrayList<>();
    public static void main(String[] args) {
        char[] arr = {'A', 'A', '2', '2', '3', '3', '4', '4'};
        dfs(0, arr);
        for (String an : ans) {
            System.out.println(an);
        }
        //排序
        Arrays.sort(ans.toArray());
        System.out.print(ans.size());
    }

    /**
     * 深度遍历
     * @param sub 开始位置
     * @param arr 便利字符串
     */
    private static void dfs(int sub, char[] arr) {
        //TODO: 深度遍历,注意有很多重复的
        int A1 = getIndex(0, 'A', arr);
        int A2 = getIndex(A1 + 1, 'A', arr);
        int two1 = getIndex(0, '2', arr);
        int two2 = getIndex(two1 + 1, '2', arr);
        int three1 = getIndex(0, '3', arr);
        int three2 = getIndex(three1 + 1, '3', arr);
        int four1 = getIndex(0, '4', arr);
        int four2 = getIndex(four1 + 1, '4', arr);
        if (A2 - A1 == 2 && two2 - two1 == 3 && three2 - three1 == 4 && four2 - four1 == 5) {
            //解决重复问题
            if (!ans.contains(Arrays.toString(arr))){
                ans.add(Arrays.toString(arr));
            }
        }

        for (int i = sub; i < arr.length; i++) {
            char temp = arr[i];
            arr[i] = arr[sub];
            arr[sub] = temp;
            dfs(sub + 1, arr);

            temp = arr[i];
            arr[i] = arr[sub];
            arr[sub] = temp;
        }
    }

    /**
     * 获取下标
     * @param start 搜索开始位置
     * @param flag 搜索结束标志
     * @param arr 搜索的字符串
     * @return 字符所在下标
     */
    private static int getIndex(int start, char flag, char[] arr) {
        for (int i = start; i < arr.length; i++) {
            if (arr[i] == flag) {
                return i;
            }
        }
        return 0;
    }
}

