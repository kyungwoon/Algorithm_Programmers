# 핸드폰 번호 가리기

## 문제

프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다. 전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로
가린 문자열을 리턴하는 함수, solution을 완성해주세요.

## 제한사항

- s는 길이 4 이상, 20이하인 문자열입니다.

## 입출력

|phone_number|	return|
|------|---|
|"01033334444"|"*******4444"|
|"027778888"|"*****8888"|

## 입출력 예 설명

```
없음
```

# 풀이 과정

1. 뒷 4자리를 제외한 숫자를 마스킹 하므로 받아오는 phone_number의 길이에서 4를 뺴준 만큼 "*" 로 answer에 담아준다.
2. 나머지 4자리는 String(문자열)으로 받아오는 phone_number을 Character(문자로) 변환해주는 charAt()을 사용해서 그대로 answer에 담아준다.