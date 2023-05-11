package zzyzzy.springboot.semiprojectv5.service;

import zzyzzy.springboot.semiprojectv5.model.Member;

import javax.servlet.http.HttpSession;

public interface MemberService {
    boolean checkLogin(Member m, HttpSession sess);
}
