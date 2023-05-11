package zzyzzy.springboot.semiprojectv5.dao;

import zzyzzy.springboot.semiprojectv5.model.Member;

public interface MemberDAO {
    int selectLogin(Member m);
}
