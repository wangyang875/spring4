import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class ex {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int[] arrA=parseInts(br.readLine().split(" "));
        int[] arrB=parseInts(br.readLine().split(" "));
        solution(arrA,arrB);
    }
    private static void solution(int[] array1,int[] array2){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < array1.length; i++) {
            boolean bContained = false;
            for(int j = 0; j < array2.length; ++j) {
                if (array1[i] == array2[j]) {
                    bContained = true;
                    break;
                }
            }
            if (!bContained) {
                list.add(array1[i]);
            }
        }

        for (int i=0;i<list.size();i++){
        System.out.print(list.get(i)+" ");}
    }
    private static int[] parseInts(String[] strArr){
        if (strArr==null||strArr.length==0){
            return new int[0];
        }
        int[] intArr=new int[strArr.length];
        for (int i =0;i<intArr.length;i++){
            intArr[i]=Integer.parseInt(strArr[i]);
        }
        return intArr;
    }


}
