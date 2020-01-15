package test.main;

import java.util.Stack;
/*
 * [ Stack ]
 * 
 * - 선입 후출의 구조로 데이터를 관리 하고 싶을때 사용한다.
 * - 순서가 있는 데이터이다(인덱스가 있음)
 * - 주로 push(), pop() 메소드만 사용한다.
 */

public class MainClass09 {
	public static void main(String[] args) {
		Stack<String> stack1=new Stack<String>();
		Stack<String> stack2=new Stack<String>();
		stack1.push("사각형 그림");
		stack1.push("원형 그림");
		stack1.push("삼각형 그림");
		System.out.println("stack1 size : "+stack1.size());
		System.out.println("stack2 size : "+stack2.size());
		//stack1에서 데이터를 pop()해서 stack2에 push() 하기
		stack2.push(stack1.pop());
		System.out.println("--- stack1에서 pop() 한 이후 ---");
		System.out.println("stack1 size : "+stack1.size());
		System.out.println("stack2 size : "+stack2.size());		
	}
}
