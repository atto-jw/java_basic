package basic.constate;

public class SwitchExample {

    public static void main(String[] args) {

        String gender = "v";

        // if문처럼 논리형 조건식이 들어가는 것이 아니라, 분기를 나눌 기준값이 괄호 안에 들어감.
        // (문자열, 정수만 가능)
        switch (gender){
            // java 14버전 이후 개선된 case문
            case "M", "m", "남":
                System.out.println("남성입니다.");
                break; // 해당 케이스만 실행하고 switch문 종료

            case "F", "f", "여":
                System.out.println("여성입니다.");
                break;

            default: // case를 설정하지 않은 값들은 모두 default로 빠짐.
                System.out.println("잘못된 입력입니다.");
        }
    }
}
