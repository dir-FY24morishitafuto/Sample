package sample;

public class ForSample {

    public static void main(String[] args) {
       for (int i = 1; i <= 10; i ++) {
        if (i == 5) {
            //5の場合はこのインテレーションをスキップ
            continue;
        }
        if (i == 8) {
            //8に到達したらループから脱出
            break;
        }
        System.out.println(i);
        }
        }
       }
