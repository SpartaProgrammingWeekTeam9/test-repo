package chapter2;

public class Lesson1 {
    public static void main(String[] args) {
        int stop = 10_000_000;

        long startTime1 = System.nanoTime();
        int sum1 = 0;
        for (int i = 0; i < stop; i++) {
            sum1 += i;  // 기본형 연산
        }
        long endTime1 = System.nanoTime();
        long primitiveTime = endTime1 - startTime1;

        long startTime2 = System.nanoTime();
        Car sum3 = new Car (0.0);
        for(int i= 0; i < stop; i++){
            sum3 = sum3.add(new Car(i * 1.1));
        }
        long endTime2 = System.nanoTime();
        long wrapperTime = endTime2 - startTime2;

        System.out.println("기본형(int) 연산 시간: " + primitiveTime + " ns");
        System.out.println("래퍼 클래스(Integer) 연산 시간: " + wrapperTime + " ns");
        System.out.println("성능 차이 (배수): " + (double) wrapperTime / primitiveTime);
    }
}
