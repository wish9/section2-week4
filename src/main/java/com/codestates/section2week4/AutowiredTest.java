package com.codestates.section2week4;

import com.codestates.section2week4.member.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.lang.Nullable;

import java.util.Optional;

public class AutowiredTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(TestBean.class);
    }

    static class TestBean {

        @Autowired(required = false) // 옵션처리, 수정자 메서드 자체가 호출되지 않게 됨
        public void setNoBean1(Member noBean1) {
            System.out.println("noBean1 = " + noBean1);
        }

        @Autowired
        public void setNoBean2(@Nullable Member noBean2) { // 자동 주입할 대상이 없으면 null이 입력
            System.out.println("noBean2 = " + noBean2);
        }

        @Autowired
        public void setNoBean3(Optional<Member> noBean3) { // 자동 주입할 대상이 없으면 Optional.empty가 입력
            System.out.println("noBean3 = " + noBean3);
        }
    }
}
