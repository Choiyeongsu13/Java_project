package com.mnu.exam01;

import java.util.List;
import com.mnu.examDT_model.MemberDAO;
import com.mnu.examDT_model.MemberDTO;

public class Exam_3_2 {
    public static void main(String[] args) {

        MemberDAO mbdo1 = MemberDAO.getInstacne();

        List<MemberDTO> list = mbdo1.memberList2();

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