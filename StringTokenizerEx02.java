package java0521;

import java.util.StringTokenizer;

public class StringTokenizerEx02 {
    public static void main(String[] args) {
        double avg = 0;
        String text = "100,90,80,70,60";
        StringTokenizer st = new StringTokenizer(text,",");

        double sum = 0;
        int cnt = st.countTokens();
        while (st.hasMoreTokens()){
            double jumsu = Double.parseDouble(st.nextToken());
            sum += jumsu;
        }
        System.out.println("합계 : "+ sum + ",평균 : " + sum/cnt);
        }
    }

