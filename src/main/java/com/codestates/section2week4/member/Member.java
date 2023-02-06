package com.codestates.section2week4.member;

public class Member {
    private Long memberId;
    private String email;
    private String name;
    private String phone;

    // 생성자
    public Member(Long memberId, String email, String name, String phone) {
        this.memberId = memberId;
        this.email = email;
        this.name = name;
        this.phone = phone;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
