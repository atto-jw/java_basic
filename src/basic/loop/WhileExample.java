package basic.loop;

public class WhileExample {

    public static void main(String[] args) {

        // 반복문의 필수 3요소 (begin - end - step)

        int count = 0; // begin

        while (count < 10) { // end
            System.out.println("안녕하세요!");
            count++; // step
        }

        // for (begin; end; step)
        for (int i = 0; i < 10; i++) {
            System.out.println("안녕하세요!");
        }

        System.out.println("============================");

        // 특정 값이 소수인지, 소수가 아닌지 판별 문제
        int num = 23;
        int k = 1;
        int count1 = 0;

        while (k <= num) {
            if(num % k == 0){
                count1++;
            }
            k++;
        }
        if (count1 == 2) {
            System.out.println("소수입니다.");
        } else {
            System.out.println("소수가 아닙니다.");
        }

    }
}
