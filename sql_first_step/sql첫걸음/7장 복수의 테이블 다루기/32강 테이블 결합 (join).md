## 테이블 결합 (join)

1.  곱집합과 교차집합
곱집합은 합집합이나 교집합처럼 집합의 연산 방법 중 하나다.

- 교차결합(cross join)
  - select 명령에서 from구에 테이블을 두 개 지정하면 이들은 곱집합으로 계산된다.
  
  ```
  - 교차결합
  select * from 테이블명1, 테이블명2
  ```
  
- ex) sample72_x와 sample72_y
  - select * from sample72_x;
    
    | x    |
    |------|
    | A    |
    | B    |
    | C    |
    
  - select * from sample72_y;
    
    | y    |
    |------|
    |    1 |
    |    2 |
    |    3 |
    
  - select * from sample72_x, sample72_y;
     - 같은 결과
     - select * from sample72_x cross join sample72_y;
      
    | x    | y    |
    |------|------|
    | A    |    1 |
    | B    |    1 |
    | C    |    1 |
    | A    |    2 |
    | B    |    2 |
    | C    |    2 |
    | A    |    3 |
    | B    |    3 |
    | C    |    3 |
    