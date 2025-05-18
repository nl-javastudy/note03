# Deque
------

### 1. 개념
- 자료의 입출력을 양 끝에서 할 수 있는 자바 인터페이스
- deque 인터페이스를 구현한 대표적인 클래스는 ***ArrayDeque, LinkedList*** 등이 있음
- deque은 앞쪽과 뒤쪽 모두에서 삽입과 삭제가 가능하므로 stack이나 queue로 사용이 가능

---

### 2. 기능 

| 기능 구분       | 주요 메서드                        | 설명                                          | 비고                          |
| -------------- | --------------------------------- | --------------------------------------------- | ----------------------------- |
| 요소 추가      | `addFirst(E e)`, `addLast(E e)`   | 덱의 앞 또는 뒤에 요소 추가 (실패 시 예외)    |                               |
|                | `offerFirst(E e)`, `offerLast(E e)`| 덱의 앞 또는 뒤에 요소 추가 (실패 시 false)   |                               |
| 요소 조회      | `getFirst()`, `getLast()`          | 앞/뒤 요소 조회 (비어있으면 예외 발생)         |                               |
|                | `peekFirst()`, `peekLast()`        | 앞/뒤 요소 조회 (비어있으면 null 반환)         |                               |
| 요소 제거      | `removeFirst()`, `removeLast()`    | 앞/뒤 요소 제거 및 반환 (비어있으면 예외)       |                               |
|                | `pollFirst()`, `pollLast()`        | 앞/뒤 요소 제거 및 반환 (비어있으면 null)       |                               |
| 상태 확인     | `size()`, `isEmpty()`, `contains(Object o)` | 크기 조회, 비어있는지 확인, 특정 요소 포함 여부 |                               |

---

### 3. LinkedList 
- LinkedList는 이중 연결 리스트 기반의 Deque 구현체
- 각 노드가 앞/뒤 노드를 참조하는 구조 → 삽입/삭제에 유리
- null 요소 저장 가능
- 노드마다 포인터 필요하기에 메모리 사용량이 ArrayDeque보다 더 많음

```
import java.util.Deque;
import java.util.LinkedList;

public class DequeList {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.addFirst("A");
        deque.addLast("B");
        System.out.println(deque);
    }
}
```

---

### 4. ArrayDeque
- ArrayDeque는 배열 기반으로 구현된 Deque 구현체 
- Collections.synchronizedDeque으로 감싸면 스레드의 요청을 순차적으로 처리하여 thread-safe하게 사용할 수 있음.
- null 요소 추가 불가 (넣으려 하면 NullPointerException 발생)
- Deque 인터페이스의 가장 일반적이고 빠른 구현체 (Deque를 사용할 때 대부분 ArrayDeque를 사용)

```import java.util.ArrayDeque;
import java.util.Deque;

public class DequeArray {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("A");
        deque.addLast("B");
        System.out.println(deque); // [A, B]
    }
}
```