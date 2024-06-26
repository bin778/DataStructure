// Queue는 front와 rear의 위치로 데이터의 삽입과 삭제를 처리하므로 시간 복잡도는 O(1)이다.
// enqueue로 가장 끝쪽에 데이터를 삽입하며 dequeue로 가장 먼저 들어온 데이터를 추출한다.
// 자바스크립트 Array에서 push()와 shift() 메서드를 사용하면 큐와 같은 동작 구현이 가능하다.
// 그러나 shift() 함수는 맨 앞 데이터를 추출하고 정리하기 때문에 O(N)의 시간 복잡도를 가진다.
// 따라서 시간 복잡도를 줄이려면 다음과 같이 구현하는 것이 좋다.
class Queue {
  constructor() {
    this.storage = new Object();
    this.front = 0;
    this.rear = 0;
  }

  size() {
    return this.rear - this.front;
  }

  enqueue(element) {
    this.storage[this.rear] = element;
    this.rear++;
  }

  dequeue() {
    let removed = this.storage[this.front];
    delete this.storage[this.front];
    this.front++;

    if (this.front === this.rear) {
      this.front = 0;
      this.rear = 0;
    }
    return removed;
  }
}
