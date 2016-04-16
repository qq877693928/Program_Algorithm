package joneslee.android.com.algorithm;

/**
 * Description:字符串的全排列
 *
 * @author lizhenhua9@wanda.cn (lzh)
 * @date 16/4/16 17:28
 */
public class Permutation {
    private void swap(String arr[], int indexOld, int indexNew){
        String temp = arr[indexOld];
        arr[indexOld] = arr[indexNew];
        arr[indexNew] = temp;
    }

    public static void main(String[] args){
        String array[] = new String[]{"a", "b", "c"};
        Permutation test = new Permutation();
        test.permutationArray(array, 0, 3);
    }

    public void permutationArray(String arr[], int index, int size){
        if(index == size){
            for(int i = 0; i < size; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        for(int i = index; i < size; i++){
            swap(arr, i, index);
            permutationArray(arr, index + 1, size);
            swap(arr, i, index);
        }
    }
}
