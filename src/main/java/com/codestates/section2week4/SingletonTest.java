package com.codestates.section2week4;

import com.codestates.section2week4.member.MemberService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SingletonTest {
//    static DependencyConfig dependencyConfig = new DependencyConfig();   // <<이런식으로 (DI 컨테이너만 사용) 하면
//    static MemberService memberService1 = dependencyConfig.memberService();  // memberService1,2가 각각 다른 주소값을 갖음
//    static MemberService memberService2 = dependencyConfig.memberService(); // 수 많은 객체를 생성하게 되니 메모리 낭비가 심함

    static AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(DependencyConfig.class);
    static MemberService memberService1 = ac.getBean("memberService", MemberService.class);
    static MemberService memberService2 = ac.getBean("memberService", MemberService.class);

    public static void main(String[] args) {
        System.out.println("memberService1 = " + memberService1);
        System.out.println("memberService2 = " + memberService2);
    }
}
