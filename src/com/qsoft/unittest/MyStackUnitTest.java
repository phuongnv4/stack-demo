package com.qsoft.unittest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import com.qsoft.MyStack;

public class MyStackUnitTest {

	// 1. tạo được 1 stack, kiểm tra size() thấy số phần tử trong stack là 0.
	@Test
	public void checkMyStackSize() {
		assertEquals(0, new MyStack().checkSize());
	}

	// 2. cho 1 stack rỗng, push() một phần tử, thấy số phần tử trong stack giờ
	// là 1
	@Test
	public void pushOneElement() {
		assertEquals(1, new MyStack().pushOneValue("phuongnv"));
	}

	// 3. cho 1 stack hiện có k phần tử, push một phần tử, thấy số phần tử tăng
	// lên k+1
	@Test
	public void pushKElement() {
		assertEquals(4, new MyStack().pushKElement(new String[] { "Java", "is",
				"Cool" }, "addOne"));
	}

	// 4. cho 1 stack rỗng, kết quả top() trả về null.
	@Test
	public void checkNull() {
		assertTrue(new MyStack().checkNull() == null);
	}

	// 5. cho 1 stack rỗng, push một phần tử, kết quả top() trả về chính phần tử
	// vừa được push.

	@Test
	public void pushOneElementAndShowIt() {
		assertEquals("phuongnv2",
				new MyStack().pushOneElementAndShowIt("phuongnv2"));
	}

	// 6. cho 1 stack rỗng, pop() một phần tử, thấy exception
	// StackEmptyException được ném ra.

	@Test
	public void popOneElement() {
		try {
			assertEquals("StackEmptyException", new MyStack().popOneElement());
		} catch (Exception e) {
			assertEquals(true, "StackEmptyException".equals(e.getMessage()));
		}

	}

}
