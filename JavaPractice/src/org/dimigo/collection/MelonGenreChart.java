package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MelonGenreChart {

	public static void main(String[] args) {
		
		List<Music> dlist = new ArrayList<Music>();
		List<Music> blist = new ArrayList<Music>();
		Map<String, List<Music>> map = new HashMap<String, List<Music>>();
		
		blist.add(new Music("팔레트", "아이유"));
		map.put("발라드", blist);
		
		dlist.add(new Music("I LUV IT", "PSY"));
		dlist.add(new Music("맞지?", "언니쓰"));
		map.put("댄스", dlist);

	
		System.out.println("--<< 멜론 장르별 챠트 >>--");
		printMap(map);
		System.out.println();

		System.out.println("--<< 댄스 2위 곡 변경 >>--");
		dlist.set(1, new Music("SIGNAL", "트와이스"));
		printMap(map);
		System.out.println();

		System.out.println("--<< 댄스 1위 곡 삭제 >>--");
		dlist.remove(0);
		printMap(map);
		System.out.println();

		System.out.println("--<< 전체 리스트 삭제 >>--");
		map.clear();
		printMap(map);
	}

	public static void printMap(Map<String, List<Music>> map) {
		for (String key : map.keySet()) {
			System.out.println("[" + key + "]");
			for (int i = 0; i < map.get(key).size(); i++) {
				System.out.println((i + 1) + ". " + map.get(key).get(i));
			}
		}
	}


}