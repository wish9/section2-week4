package com.codestates.section2week4;

public class SingletonService {
    private static final  SingletonService instance = new SingletonService(); // 인스턴스 한개를 미리 생성

    public static  SingletonService getInstance() { // getInstance() 메서드를 통해서만 객체 인스터스를 조회할 수 있도록 제한
        return instance;
    } // 이 메서드를 호출하면 항상 같은 static instance를 호출

    private SingletonService() {} // 외부에서 new 키워드로 객체를 생성할 수 없도록 제한
}
