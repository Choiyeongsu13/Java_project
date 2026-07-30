package com.mnu.exam02;

import java.util.List;

import com.mnu.model.Goods_DAO;
import com.mnu.model.Goods_DTO;

public class GoodsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods_DAO gdo = Goods_DAO.getInstance();
		
		List<Goods_DTO> list = gdo.Goodslist();
		
		System.out.println("상품코드\t상품이름\t상품가격\t재고");
		if(!list.isEmpty()) {
			for(Goods_DTO gto : list) {
				System.out.print(gto.getPcode()+ "\t");
				System.out.print(gto.getPname()+ "\t");
				System.out.print(gto.getPcost()+ "\t");
				System.out.print(gto.getStock()+ "\n");
			
		}
	}

}
}