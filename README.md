# spring-mvc-core

----

#### 서블릿과 JSP 의 한계

- 서블릿으로 개발할 때는 뷰를 만드는 화면이 자바 코드에 섞여서 복잡하다.
- JSP 로 개발할 때는 JSP 가 너무 많은 역할을 갖는다.

#### MVC 패턴의 등장
- 비즈니스 로직은 서블릿 처럼 다른곳에서 처리하고, JSP 는 목적에 맞게 HTML에 집중한다.

##### WEB-INF 폴더
- 항상 서블릿을 거쳐서 호출한다는 약속된 폴더

## 프론트 컨트롤러 패턴
> 공통의 관심사를 처리하는 프로세스를 컨트롤러 앞 단에 두는 패턴

- 프론트 컨트롤러 서블릿 하나로 클라이언트의 요청을 다 받는다.
- 프론트 컨트롤러가 요청에 맞는 컨트롤러를 찾아서 호출한다.
- 입구를 하나로..
- 공통 처리가 쉬워진다.
- 프론트 컨트롤러를 제외한 나머지 컨트롤러는 서블릿에 대해 몰라도 된다.

<b> 스프링 웹 MVC 의 핵심은 DispatcherServlet 이며, DispatcherServlet 은 프론트 컨트롤러의 패턴으로 활용하여 구현되었다. </b>  

### 프론트 컨트롤러 도입 v1

1. 서블릿과 비슷한 모양의 컨트롤러 인터페이스를 도입
2. 매핑 정보를 가진 FrontControllerV1 을 만들고 그 안에서 다형성을 활용해 매핑해줬다.

### 프론트 컨트롤러 도입 v2

### 프론트 컨트롤러 도입 v3

### 프론트 컨트롤러 도입 v4

### 프론트 컨트롤러 도입 v5
