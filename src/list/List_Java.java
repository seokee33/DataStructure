package list;

import java.util.ArrayList;
import java.util.List;

public class List_Java {
    public static void main(String[] args) {
        //배열 선언
        int[] iArr = {1, 2, 3, 4, 5};
        int[] iArr2 = new int[5];

        //ArrayList
        /*
            List와 ArrayList의 차이
            List : interface
            AbstractList : List를 정의한 클래스
            ArrayList : AbstractList를 상속받은 클래스

            List를 사용하려면
            import java.util.List를 해야한다!!
         */

        List<String> sArr = new ArrayList<>();
        ArrayList<String> sArr2 = new ArrayList<>();

    }
}
