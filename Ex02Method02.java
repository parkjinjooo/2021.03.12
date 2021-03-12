package day0312;
// call by value vs call by reference

// 우리가 메소드에 파라미터로 기본형 변수와 참조형 변수를 넣으면 무슨 일이 벌어질까?

// 자바에서는 파라미터로 기본형 변수 혹은 기본형 값이 넘어갈 때와, 참조형 변수 혹은 참조형 값이 넘어갈 때 차이가 존재한다.
// 기본형 데이터타입이 파라미터로 넘어갈 경우 " 값에 의한 호출(call by value) 가 일어나고
// 실제 변수가 파라미터로 들어가는 것이 아니라 변수의 저장된 값이 복사되서 넘어간다.

// 참조형 데이터타입이 파라미터로 넘어갈 경우 "참조에 의한 호출(call by reference) 가 일어나고
// 해당 참조형 데이터타입의 주소값이 넘어가기 때문에 원본이 넘어간다고 볼수도 있다.

// 즉 call by value 의 경우, 원본의 값이 변경되지 않지만
//    call by reference의 경우, 원본의 값이 변경된다.
public class Ex02Method02 {
    public static void main(String[] args) {
        int a = 3;
        int[] arr = new int[3];

        System.out.println(a);
        System.out.println(arr[0]);
        
        increase(a);
        
        increase(arr);

        System.out.println(a);
        System.out.println(arr[0]);

    }

    public static int increase(int number) {
        number += 3;
        return number;
    }

    public static void increase(int[] ary) {
        ary[0] = 100;
    }

}
