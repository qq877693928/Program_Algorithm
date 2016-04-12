package joneslee.android.com.algorithm;

import java.util.ArrayList;
import java.util.Map;

/**
 * Description:合并两个有序数组
 *
 * @author lizhenhua9@wanda.cn (lzh)
 * @date 16/4/12 19:21
 */
public class Combination_Array {

  public static void main(String[] args) {
    int[] a = new int[] {2, 4, 7, 10, 45};
    int[] b = new int[] {3, 5, 8, 9, 19, 22};

    Object[] obj = combSortArray(a, b);
    for(int i = 0; i < obj.length; i++){
      System.out.print(obj[i] + " ");
    }
  }

  private static Object[] combSortArray(int[] array1, int[] array2) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    int i = 0;
    int j = 0;
    while (i < array1.length && j < array2.length) {
      if (array1[i] < array2[j]) {
        arrayList.add(array1[i]);
        i++;
      } else {
        arrayList.add(array2[j]);
        j++;
      }
    }

    while (i < array1.length){
      arrayList.add(array1[i++]);
    }
    while (j < array2.length){
      arrayList.add(array2[j++]);
    }
    return arrayList.toArray();
  }
}
