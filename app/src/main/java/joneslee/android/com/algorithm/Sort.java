package joneslee.android.com.algorithm;

/**
 * Description:排序算法
 *
 * @author lizhenhua9@wanda.cn (lzh)
 * @date 16/4/6 09:42
 */
public class Sort {
  private static int[] originArray = new int[] {
      2, 34, 44, 5, 58, 20, 8, 1, 18, 23, 5
  };

  public static void main(String[] args) {
//    bubbleSort(originArray);
//    quickSort(originArray, 0, originArray.length-1);
     printArray(originArray);
  }

  /** 冒泡排序 */
  private static void bubbleSort(int[] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = i + 1; j < array.length; j++) {
        if (array[i] > array[j]) {
          int swap = array[i];
          array[i] = array[j];
          array[j] = swap;
        }
      }
    }
  }

  /** 快选排序 */
  private static void quickSort(int[] array, int start, int end) {
    if (start < end) {
      int i = partition(array, start, end);
      quickSort(array, start, i - 1);
      quickSort(array, i + 1, end);
    }
  }

  private static int partition(int[] array, int start, int end) {
    int i = start, j = end;
    int index = array[i];
    while (i < j) {
      // 从右到左
      while (i < j && array[j] >= index) {
        j--;
      }
      if (i < j) {
        array[i] = array[j];  //右边形成一个新的坑，array[j]（右边）赋值给前面
        i++;
      }

      //从左到右
      while (i < j && array[i] < index) {
        i++;
      }
      if (i < j) {
        array[j] = array[i]; //左边形成一个新的坑，array[i]（左边）赋值给后面
        j--;
      }
    }
    // 退出时，i等于j 将p填到这个坑中。
    array[i] = index;
    return i;
  }

  private static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }
}
