package com.dinu;

import java.util.ArrayList;

public class FindMissingChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "I am Dinobandhu Chakraborty";
		ArrayList<Character> list= findAll(s);
		for(Character c:list) {
			System.out.print(c);
		}

	}
	
	static ArrayList<Character> findAll(String s){
		ArrayList<Character> list=new ArrayList<>();
		int total=26;
		boolean[] present=new boolean[total];
		for (int i = 0; i < s.length(); i++) {
			if('A'<=s.charAt(i) && 'Z'>=s.charAt(i)) {
				present[s.charAt(i) - 'A']=true;
			}
			else if('a'<=s.charAt(i) && 'z'>=s.charAt(i)) {
				present[s.charAt(i) - 'a']=true;
			}
			
		}
		for (int i = 0; i < present.length; i++) {
			if(present[i]==false)
				list.add((char) ('a'+i));
		}
		
		
		
		
		return list;
	}

}
