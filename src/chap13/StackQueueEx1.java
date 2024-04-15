package chap13;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * Stack : LIFO(Last in, First out). 넣은 순서와 빼는 순서가 다를 때
 *   Stack 클래스 : Vector 하위클래스
 *   주요 메서드
 *   	push(Object) : 객체를 Stack에 추가
 *   	Object pop() : Stack에 저장된 객체를 꺼냄. 제거
 *   	Object peek(): Stack에 저장된 객체를 꺼냄. 조회
 *   	
 * Queue : FIFO(First in, First out). 넣은 순서와 빼는 순서가 같을 때
 * 	 Queue 인터페이스 : LinkedList가 구현클래스임.
 *   주요 메서드
 *   	offer(object) : 객체를 Queue에 추가
 *   	Object poll() : Queue에 저장된 객체를 꺼냄. 제거 
 *   	Object peek(): Stack에 저장된 객체를 꺼냄. 조회
 */
public class StackQueueEx1 {
	public static void main(String[] args) {
		String[] subject = {"Java", "SQL", "JSP", "HTML", "CSS", "JavaScript", "Spring"};
		Stack<String> stack = new Stack<>();
		Queue<String> queue = new LinkedList<>();
		for (String s : subject) {
			stack.push(s); // 객체 추가
			queue.offer(s); // 객체 추가
		}
		System.out.println(stack);
		System.out.println(queue);
		System.out.println("stack에 저장된 요소의 갯수:"+stack.size()); //7
		System.out.println("stack의 조회 대상 객체:"+stack.peek()); // 가장 마지막에 들어간 Spring
		System.out.println("stack에 저장된 요소의 갯수:"+stack.size()); //7
		System.out.println("stack의 조회 대상 객체 제거:"+stack.pop()); // Spring
		System.out.println("stack에 저장된 요소의 갯수:"+stack.size()); //6
		System.out.println("stack의 조회 대상 객체 제거:"+stack.pop()); // JavaScript
		System.out.println("stack에 저장된 요소의 갯수:"+stack.size()); //5
		System.out.println();
		
		System.out.println("queue에 저장된 요소의 갯수:"+queue.size()); //7
		System.out.println("queue의 조회 대상 객체:"+queue.peek()); // 가장 처음에 들어간 Java
		System.out.println("queue에 저장된 요소의 갯수:"+queue.size()); //7
		System.out.println("queue의 조회 대상 객체 제거:"+queue.poll()); // Java
		System.out.println("queue에 저장된 요소의 갯수:"+queue.size()); //6
		System.out.println("queue의 조회 대상 객체 제거:"+queue.poll()); // SQL
		System.out.println("queue에 저장된 요소의 갯수:"+queue.size()); //5
	}
}
