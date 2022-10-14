package javatest.wangdao.czy;
import java.util.Scanner;

/**
 * data: 1 3 4 5 7 8 10
 *每一趟只能确定将一个数归位。即第一趟只能确定将末位上的数归位，第二趟只能将倒数第 2 位上的数归位，依次类推下去。如果有 n 个数进行排序，
 * 只需将 n-1 个数归位，也就是要进行 n-1 趟操作。而 “每一趟 ” 都需要从第一位开始进行相邻的两个数的比较，将较大的数放后面，
 * 比较完毕之后向后挪一位继续比较下面两个相邻的两个数大小关系，重复此步骤，直到最后一个还没归位的数
 */

public class Sort {

    public static void BubbleSort(){
        Scanner input = new Scanner(System.in);
        int sort[] = new int[10];
        int temp;
        System.out.println("请输入10个需要排序的数据");
        for (int i = 0; i < sort.length; i++) {
            sort[i] = input.nextInt();
        }
        for (int i = 0; i < sort.length; i++) {
            for (int j = 0; j < sort.length - i - 1; j++) {
                if (sort[j] < sort[j+1]){
                    temp = sort[j];
                    sort[j] = sort[j+1];
                    sort[j+1] = temp;
                }
            }
        }
        System.out.println("排序后的顺序为:");
        for (int i = 0; i < sort.length; i++) {
            if (i == sort.length -1 )
                System.out.println(sort[i]);
            else
                System.out.print(sort[i]+",");
        }
    }

    public static void main(String[] args) {
        BubbleSort();

    }
}

