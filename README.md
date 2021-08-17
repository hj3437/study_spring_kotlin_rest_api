## 소개  
Spring Boot, Kotlin, MySql, Mybatis 를 사용하여 만든 REST API 입니다.   


## 사용방법
1. IntelliJ로 프로젝트를 불러옵니다.
  
2. src/main/kotlin/resouces 안에 있는 application.properties를 적절하게 변경하시면 됩니다.  
spring.datasource.url = jdbc:mysql://localhost:3306/testdb?useUnicode=true&characterEncoding=utf8&serverTimezone=Asia/Seoul&autoReconnect=True  
spring.datasource.username = testuser  
spring.datasource.password = testuser!@#  
localhost:3306 는 db 접속 경로입니다. 
(만약 카페24를 사용하신다면 카페24아이디.cafe24.com이 되겠습니다.)   
  
testdb는 db이름입니다.  
(카페24일경우 디비 이름이 아이디이므로 카페24아이디.cafe24.com:3306/카페24아이디?useUnicode....)  

testuser는 mysql유저 이름 입니다. 카페24인경우 카페24 아이디 입니다.
  
testuser!@#은 mysql비밀번호 입니다. 카페24인경우 카페24 가입시 FTP 비밀번호와 동일합니다. 

3. Run 실행

4. 브라우저에서 접속 하여 주소 변경

## 사용한 DB정보  
접속 URL: localhost:3306  
아이디: testuser  
비밀번호: testuser!@#  
  
## 테이블 생성 쿼리문  
create table userinfo(
	id varchar(50) primary key,
    name varchar(50),
    memo varchar(50)
);    
  

## 조회방법
postman 또는 크롬의 talend api tester를 사용하면 됩니다.   
  
전체 조회 (GET)  
http://localhost:8080/user/all
  
아이디별로 조회 (GET)  
http://localhost:8080/user/all
  
유저 추가 (PUT) 
http://localhost:8080/user/1?name=테스트1&memo=2021년 입사자 

유저 삭제 (DELETE)  
http://localhost:8080/user/2 


## 학습경로 
감사하게도 아래 유튜브를 보고 학습하였습니다.   
https://youtu.be/QzHkJsALmyw
