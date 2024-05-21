package java0521;

import java.util.StringTokenizer;

public class StringTokenizerEx {
    public static void main(String[] args) {
       // StringTokenizer st = new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐","/");
        StringTokenizer st = new StringTokenizer("홍길동=장화=홍련;콩쥐;팥쥐","=;");
        System.out.println("토큰의 갯수 :" + st.countTokens());
        while(st.hasMoreTokens())
            System.out.println(st.nextToken());
       // System.out.println("토큰의 갯수 :" + st.countTokens());
    }
}
