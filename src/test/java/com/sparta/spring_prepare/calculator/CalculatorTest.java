package com.sparta.spring_prepare.calculator;

import com.sparta.spring_prepare.calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


// 계산기 테스트를 위한 클래스

// JUnit은 테스트 실행 환경을 가지고 있기 때문에 따로 main()메서드를 실행하거나 서버를 실행시키지 않아도 이렇게 각각의 메서드
// 혹은 기능별로 테스트 코드를 작성하여 실행시킬 수 있음.



class CalculatorTest {
    @Test
    @DisplayName("더하기 테스트")
    void test1() {
        Calculator calculator = new Calculator();
        Double result = calculator.operate(8, "+", 2);
        System.out.println("result = " + result);

        Assertions.assertEquals(10, result);
    }

    @Test
    @DisplayName("나누기 테스트")
    void test2() {
        Calculator calculator = new Calculator();
        Double result = calculator.operate(8, "/", 2);
        System.out.println("result = " + result);

        Assertions.assertEquals(4, result);
    }
}