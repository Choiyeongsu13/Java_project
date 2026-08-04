package com.mnu.exam04;

import java.util.List;
import java.util.Scanner;

import com.mnu.exam04.model.EmpDAO;
import com.mnu.exam04.model.EmpDTO;
import com.mnu.exam04.model.commDTO;

public class Exam_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//키보드 입력
		Scanner scn = new Scanner(System.in);
		String na = scn.next().toUpperCase();
		
		
		EmpDAO dao = EmpDAO.getInstance();
		List<EmpDTO> list = dao.nameList(na);   

		System.out.println("사원번호\t이름\t임금\t입사일\t업무\t커미션\t매니저\t부서번호");
		for (EmpDTO dto : list) {
			System.out.print(dto.getEno() + "\t");
			System.out.print(dto.getEname() + "\t");
			System.out.print(dto.getSalary() + "\t");
			System.out.print(dto.getHiredate() + "\t");
			System.out.print(dto.getJob() + "\t");
			System.out.print(dto.getCommission() + "\t");
			System.out.print(dto.getManager() + "\n");
			System.out.print(dto.getDno() + "\n");
		
		}

	}

}
