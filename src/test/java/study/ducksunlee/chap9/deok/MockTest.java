package study.ducksunlee.chap9.deok;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.mockito.Mockito.*;

/**
 * Created by LSD on 2017-11-07.
 */
public class MockTest {

    // @Mock 어노테이션 선언
    @Mock
    AuthDao dao;
    // @Mock 어노테이션이 붙은 목 객체를 자신의 멤버 클래스와 일치 시 주입
    @InjectMocks
    AuthService service;

    // 특정 조건 지정
    @Test
    public void mock_test() {
        // given
        List mockedList = mock(List.class);
        String expected = "one";

        // when
        when(mockedList.get(0)).thenReturn("one");

        // then
        Assert.assertEquals(expected, mockedList.get(0)); //success
    }

    //예외를 발생할 때
    @Test(expected = IllegalArgumentException.class)
    public void mock_doThrow() {
        // given
        List mockedList = mock(List.class);

        // when
        doThrow(new IllegalArgumentException()).when(mockedList).add(eq("one"));

        // then
        mockedList.add("one");
    }

    // 테스트에서 제외처리
    @Test
    public void mock_doNothing() {
        // given
        List mockedList = mock(List.class);

        // when
        doNothing().when(mockedList).add(anyString());

        // then
        mockedList.add("one");
        verify(mockedList).add(anyString());
    }

    // 특정구문이 호출되었는지 체크
    @Test
    public void mock_verify() {
        // given
        List mockedList = mock(List.class);

        // when
        mockedList.add("one");

        // then
        // n번 호출했는지 체크
        verify(mockedList, times(1)).add(any(String.class));

        // 호출 안했는지 체크
        verify(mockedList, never()).get(0);
//        verify(mockedList, never()).add(eq("one"));
        verify(mockedList, never()).add(eq("two"));

        // 최소한 1번 이상 호출했는지 체크
        verify(mockedList, atLeastOnce()).add(any(String.class));

        // 2번 이하 호출 했는지 체크
        verify(mockedList, atMost(2)).add(any(String.class));

        // 2번 이상 호출 했는지 체크
//        verify(mockedList, atLeast(2)).add(any(String.class));

        // 지정된 시간(millis)안으로 메소드를 호출 했는지 체크
        verify(mockedList, timeout(100)).add(any(String.class));

        // 지정된 시간(millis)안으로 1번 이상 메소드를 호출 했는지 체크
        verify(mockedList, timeout(100).atLeast(1)).add(any(String.class));
    }

    @Test
    public void mock_object() {
        MockitoAnnotations.initMocks(this);
        when(dao.isLogin(eq("LSD"))).thenReturn(true);
        Assert.assertTrue(service.isLogin("LSD") == true);
        Assert.assertTrue(service.isLogin("ETC") == false);
    }


}
