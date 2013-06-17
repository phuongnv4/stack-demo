package com.qsoft;

import java.util.ArrayList;

public class MyStack {
	ArrayList<String> arr = new ArrayList<String>();

	public int checkSize() {
		int arrSize = arr.size();
		return arrSize;
	}

	public int pushOneValue(String str) {

		arr.add(str);
		int arrSize = arr.size();
		return arrSize;
	}

	public Object pushKElement(String[] str, String addOne) {
		int strLength = str.length;
		for (int i = 0; i < strLength; i++) {
			arr.add(str[i]);
		}
		arr.add(addOne);
		int arrSize = arr.size();
		return arrSize;
	}

	public String checkNull() {
		String top = "";
		if (arr.size() == 0) {
			top = null;
		}
		return top;
	}

	public String pushOneElementAndShowIt(String str) {
		arr.add(str);
		String result = arr.get(0);
		return result;
	}

	public String popOneElement() {
		try {
			arr.remove(1);
		} catch (Exception e) {
			throw new RuntimeException("StackEmptyException");
		}
		return null;
	}
}
