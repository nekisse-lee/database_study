## 행 개수 구하기 - count

```
집계합수 

COUNT(집합)
SUM(집합)
AVG(집합)
MIN(집합)
MAX(집합)
```


### 1. COUNT로 행 개수 구하기
```
select count(열명(컬럼명)) from 테이블명 where 조건;
```
- ex) 행 개수 구하기 
  -  select * from ttable;

| no   | name | quantity |
|------|------|---------:|
|    1 | A    |        1 |
|    2 | A    |        2 |
|    3 | B    |       10 |
|    4 | C    |        3 |
|    5 | NULL |     NULL |
    
  -  select count(*) from ttable;
  -  select count(*) as allcount from ttable;  ( 별칭사용 가능)
  
     | count(*) |
     |---|
     |        5 |
     

- ex) where 구 지정하기  
name 컬럼이 A인것 count 
  - select * from ttable where name='A';


    | no   | name | quantity |
    |------|------|---------:|
    |    1 | A    |        1 |
    |    2 | A    |        2 | 
    
  - select count(*) from ttable where name='A';
  
    | count(*) |
    |---------:|
    |        2 |  
    
### `select 구는 where 구보다 나중에 처리된다`.
- select * from ttable;

| no   | name | quantity |
|------|------|---------:|
|    1 | A    |        1 |
|    2 | A    |        2 |
|    3 | B    |       10 |
|    4 | C    |        3 |
|    5 | NULL |     NULL |

  - ttable의 name컬럼이 A그리고 B인 quantity를 모두 더해서 출력한다.  
  select sum(quantity) from ttable where name='A' or name='B';
    
    | sum(quantity) |
    |---------------|
    |            13 |
    
    1. where name='A' or name ='B';
    2. name= A인 quantity    1 , 2
    3. name= B인 quantity  10
    4. select SUM(quantity)   = 1, 2, 10 
    5. 13
    
### 2. 집계함수와 NULL값
count의 인수로 열명을 지정할 수 있다.  
집계함수는 집합 안에 `null 값이 있을 경우 이를 제외`하고 처리한다.

- ex) select * from ttable;

| no   | name | quantity |
|------|------|----------|
|    1 | A    |        1 |
|    2 | A    |        2 |
|    3 | B    |       10 |
|    4 | C    |        3 |
|    5 | NULL |     NULL |

  - no열(컬럼) 과 name열(컬럼) count
  - select count(no), count(name) from ttable;
    
    | count(no) | count(name) |
    |-----------|-------------|
    |         5 |           4 |
    
  - name 의 null은  count에서 제외.