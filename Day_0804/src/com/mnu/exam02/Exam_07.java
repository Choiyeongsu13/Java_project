package com.mnu.exam02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// BDto : 기본 정보 (분번, 이름)
// ADto : 성적 정보 (분번, 국어, 영어, 수학)

public class Exam_07 {

	public static void main(String[] args) {

		// key = BDto(기본정보), value = ADto(성적정보)
		Map<BDto, ADto> map = new HashMap<>();

		BDto b = new BDto(1, "Dd");
		ADto a = new ADto(1, 78, 80, 56);
		map.put(b, a);

		b = new BDto(2, "김");
		a = new ADto(2, 98, 78, 45);
		map.put(b, a);

		b = new BDto(3, "강학생");
		a = new ADto(3, 14, 36, 31);
		map.put(b, a);

		// keySet() => Set<BDto> 반환 (키만 모아놓은 Set)
		Set<BDto> keySet = map.keySet();
		for (BDto key : keySet) {
			ADto value = map.get(key); // 키로 값을 꺼낼 땐 map.get(key)
			System.out.println(key.getBun());
			System.out.println(key.getName());
			System.out.println(value.getKor());
			System.out.println(value.getEng());
			System.out.println(value.getMat());
		}

		System.out.println("----------------------------");

		// entrySet() => Set<Map.Entry<K,V>> 반환 (키와 값이 함께 묶인 Set)
		Set<Map.Entry<BDto, ADto>> entrySet = map.entrySet();
		for (Map.Entry<BDto, ADto> entry : entrySet) {
			BDto key = entry.getKey();
			ADto value = entry.getValue();

			System.out.println(key.getBun());
			System.out.println(key.getName());
			System.out.println(value.getKor());
			System.out.println(value.getEng());
			System.out.println(value.getMat());
		}
	}
}