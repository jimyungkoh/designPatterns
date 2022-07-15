package naiveSingleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

class AppTest {

    @Test
    void testNaiveSingleton() {
        //given
        NaiveSingleton instance = NaiveSingleton.getInstance();

        //when
        NaiveSingleton newInstance = NaiveSingleton.getInstance();

        //then, 두 인스턴스의 '동일성(같은 인덱스 값인지)' 검증
        assertSame(instance, newInstance);
    }
}