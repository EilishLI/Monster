package ex10;
import java.util.*;

public class Book {
	public static void main(String[] args) {
		Map<String, ArrayList<String>> book = new HashMap<>();
		book.put("ISBN0001",new ArrayList<>(Arrays.asList("ISBN0001","C语言程序设计","45.00","中国铁路出版社")))	;
		book.put("ISBN0002",new ArrayList<>(Arrays.asList("ISBN0002","计算机组成与结构","35.00","清华大学出版社")));
		book.put("ISBN0003",new ArrayList<>(Arrays.asList("ISBN0003","python程序设计基础","45.00","中国铁路出版社")));
		book.put("ISBN0004",new ArrayList<>(Arrays.asList("ISBN0004","高等数学","39.80","高等教育出版社")));
		for(String keys : book.keySet()) {
			for(String val:book.get(keys)) {
				System.out.println(val+" ");
			}
			System.out.println();
		}
	}
	
		
}
