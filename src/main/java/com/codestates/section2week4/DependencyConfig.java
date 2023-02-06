package com.codestates.section2week4;
import com.codestates.section2week4.coffee.CoffeeRepository;
import com.codestates.section2week4.coffee.CoffeeService;
import com.codestates.section2week4.member.MemberRepository;
import com.codestates.section2week4.member.MemberService;
public class DependencyConfig {

    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    public MemberRepository memberRepository() {
        return new MemberRepository();
    }

    public CoffeeService coffeeService() {
        return new CoffeeService(coffeeRepository());
    }

    public CoffeeRepository coffeeRepository() {
        return new CoffeeRepository();
    }
}