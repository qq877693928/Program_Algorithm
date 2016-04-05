package joneslee.android.com.algorithm;

/**
 * Description:随机打乱一个数组
 * Reference：http://www.cnblogs.com/Wayou/p/fisher_yates_shuffle.html
 *
 * @author lizhenhua9@wanda.cn (lzh)
 * @date 16/4/5 16:07
 */
public class Random_Shuffle {
  private static String[] originalArray = new String[] {
      "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
      "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"
  };

  public static void main(String args[]) {
      randomShuffle(originalArray);
      for(int i = 0; i < originalArray.length-1; i++){
          System.out.print(originalArray[i] + ", ");
      }
      System.out.print(originalArray[originalArray.length-1]);
  }

  private static void randomShuffle(String[] array) {
      if(array.length <= 1){
          return;
      }
      for(int i = array.length - 1; i > 0; i--){
          //从后往前遍历，随机产生一个index，交换当前的i与index的数据
          int index = (int)(Math.random() * Integer.MAX_VALUE % (i-1));
          String swap = array[i];
          array[i] = array[index];
          array[index] = swap;
      }
  }
}
