package Java240814;

import java.io.InputStream;
import java.io.*;

public class FileReadHangulSuccess {
    public static void main(String[] args) {
        InputStreamReader in = null;
        FileInputStream fin = null;
        try{
            fin = new FileInputStream("/Users/ueown/IdeaProjects/Javaclass/src/Java240814/Hangul.txt");
            in = new InputStreamReader(fin,"UTF-8");
            int c;

            System.out.println("인코딩 문자 집합은 " + in.getEncoding());
            while((c = in.read())!= -1){
                System.out.println((char)c);
            }
            in.close();
            fin.close();
        }catch (IOException e){
            System.out.println("입출력 오류");
        }
    }
}
