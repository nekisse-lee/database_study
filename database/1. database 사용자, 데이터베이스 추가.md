# {괄호를 안의 내용 입력}

#### 사용자 추가
- mysql> CREATE USER {'username'@'localhost'} IDENTIFIED BY {'userpassword'};

#### 데이터베이스 추가
- mysql>CREATE DATABASE {dbname};

#### 사용자 권한 설정
- mysql>GRANT ALL ON {dbname.*} TO {'username'@'localhost'} WITH GRANT OPTION;


#### 서버 재시작 없이 추가 내용 업데이트
- mysql> flush privileges;  

#### 서버 종료
- mysql> quit;

#### 만든 사용자 계정으로 접속
- mysql -u {username} -p

#### 로그인한 사용자 계정의 권한을 가진? 데이터베이스 목록보기
- mysql> show databases;


#### DB목록중 사용할 DB선택 
- mysql> use {dbname};



