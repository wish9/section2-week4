package com.codestates.section2week4;
import com.codestates.section2week4.coffee.CoffeeRepository;
import com.codestates.section2week4.coffee.CoffeeService;
import com.codestates.section2week4.member.MemberRepository;
import com.codestates.section2week4.member.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


    @Configuration
    @ComponentScan
    public class DependencyConfig {
//        @Bean
//        public MemberService memberService() {
//            return new MemberService(memberRepository());
//        }
//        @Bean
//        public MemberRepository memberRepository() {
//            return new MemberRepository();
//        }
//        @Bean
//        public CoffeeService coffeeService() {
//            return new CoffeeService(coffeeRepository());
//        }
//        @Bean
//        public CoffeeRepository coffeeRepository() {
//            return new CoffeeRepository();
//        }
    }