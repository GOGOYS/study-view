# interface argument
* 생성자, method를 설계할때 interface가 있는 type으로 argument를 작성하면 클래스와 클래스간의
결합도를 낮추어 프로젝트가 커졌을때 많은 장점을 얻을 수 있다.
* 다음과 같이 클래스를 매개변수로 갖는 method를 설계 할때와
```public void method(ArrayList<Integer>list){}```
* 다음과 같이 인터페이스를 매개변수로 갖는 method를 설계할때와의 차이가 뭘까용?
``` public void method(List<Integer> list){}```
* 첫번째 코드에서는 다음과 같은 코드로 method를 사용할 수 밖에 다.
``` 
ArrayList<Integer> list = new ArrayList<Integer>();
	obj.method(list);
```
* 하지만 두번째 코드에서는 다음과 같이 유연한 방법으로 method를 사용할 수 있다.
```
List<Integer> list1 = new ArraysList<>();
List<Integer> list2 = new LinkedList<>();

obj.method(list1);
obj.method(list2);
```

# Dependency Inject 디자인 패턴
* 의존성 주입
* 클래스에서 사용하는 ```데이터 객체```, 또는 ```서비스 객체``` 등을 
클래스 코드에서 직접 초기화하지 않고, 생성자, setter() method등을 통하여 주입받는 방식
* 클래스코드에서 다른 클래스의 객체를 직접 생성하여 사용하는 코드는
클래스와 클래스의 결합도르 높여 프로젝트가 커졌을때, 유지보수에서 많은 불편함을 야기할 수 있다.
* 의존성 주입 패턴을 사용하면 한개의 클래스를 다양한 기능으로 업그레이드하기 쉬워진다.
* 코드의 재사용이 (매우)증가한다.
* 리팩토링(코드변경)이 수월해진다.
* 보일러코드(비슷한, 유사한 유형의 코드)가 줄어든다.
* 프로젝트의 테스트가 용이해진다.
