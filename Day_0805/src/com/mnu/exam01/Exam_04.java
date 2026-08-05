package com.mnu.exam01;

import java.util.List;
import java.util.Scanner;

import com.mnu.examDT_model.MemberDAO;
import com.mnu.examDT_model.MemberDTO;

public class Exam_04 {

    public static void main(String[] args) {

        MemberDAO mbdo3 = MemberDAO.getInstacne();

        Scanner scn = new Scanner(System.in);
        System.out.println("회원검색(전화번호뒤 4자리)");
        String phone = scn.next();          // 먼저 입력받고

        List<MemberDTO> list = mbdo3.memberPhone(phone);   // 그 다음 조회

        for (MemberDTO mdto1 : list) {
            System.out.print(mdto1.getCustno() + "\t");
            System.out.print(mdto1.getCustname() + "\t");
            System.out.print(mdto1.getPhone() + "\t");
            System.out.print(mdto1.getGender() + "\t");
            System.out.print(mdto1.getJoindate() + "\t");
            System.out.print(mdto1.getGrade() + "\t");
            System.out.print(mdto1.getCityname() + "\n");
        }
    }
}