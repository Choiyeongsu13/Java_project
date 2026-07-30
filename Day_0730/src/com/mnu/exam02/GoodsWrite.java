package com.mnu.exam02;

import java.util.Scanner;

import com.mnu.model.Goods_DAO;
import com.mnu.model.Goods_DTO;

public class GoodsWrite {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("상품코드");
		String pcode = scn.next().toUpperCase();
		System.out.println("상품이름");
		String pname = scn.next();
		System.out.println("상품 가격");
		int pcost = scn.nextInt();
		System.out.println("재고");
		int stock = scn.nextInt();
		
		
		Goods_DAO gdo = Goods_DAO.getInstance();
		Goods_DTO gto = new Goods_DTO();
		
		gto.setPcode(pcode);
		gto.setPname(pname);
		gto.setPcost(pcost);
		gto.setStock(stock);
		
		int row = gdo.GoodsWrite(gto);
		if(row==1) {
			System.out.println("기입성공");
		}else {
			System.out.println("실패");
		}
		
	}

}
