package com.mnu.exam04;

import java.util.List;
import java.util.Scanner;

import com.mnu.exam04.model.EmpDAO;
import com.mnu.exam04.model.commDTO;

public class Exam_02 {

	public static void main(String[] args) {

		// 키보드입력
		Scanner sc = new Scanner(System.in);
		System.out.print("부서번호 입력: ");
		int custno = sc.nextInt();

		// 부서번호 부서명 사원번호 이름 입사일 급여 출력
		EmpDAO dao = EmpDAO.getInstance();
		List<commDTO> list = dao.deptList(custno);   

		System.out.println("부서번호\t부서명\t사원번호\t이름\t입사일\t급여");
		for (commDTO dto : list) {
			System.out.print(dto.empDTO.getDno() + "\t");
			System.out.print(dto.deptDTO.getDname() + "\t");
			System.out.print(dto.empDTO.getEno() + "\t");
			System.out.print(dto.empDTO.getEname() + "\t");
			System.out.print(dto.empDTO.getHiredate() + "\t");
			System.out.print(dto.empDTO.getSalary() + "\n");
		}

		
	}

}