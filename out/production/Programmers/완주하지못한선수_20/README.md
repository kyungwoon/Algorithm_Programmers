# 완주하지 못한 선수

## 문제

수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다. 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열
completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

## 제한사항

- 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
- completion의 길이는 participant의 길이보다 1 작습니다.
- 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
- 참가자 중에는 동명이인이 있을 수 있습니다.

## 입출력

|participant|completion|return|
|------|---|----|
|["leo", "kiki", "eden"]|["eden", "kiki"]|"leo"|
|["marina", "josipa", "nikola", "vinko", "filipa"]|["josipa", "filipa", "marina", "nikola"]|"vinko"|
|["mislav", "stanko", "mislav", "ana"]|["stanko", "ana", "mislav"]|    "mislav"|

## 입출력 예 설명

- 입출력 예 #1

```
"leo"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.
```

- 입출력 예 #2

```
"vinko"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.
```

- 입출력 예 #3

```
"vinko"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.

```

# 풀이 과정

1. HashMap을 사용해서 key는 각 배열의 선수 이름으로 한다.
2. value 값은 participant에 있는 선수(key)에 +1을 해준다.
3. completion에 있는 완주한 선수(key)에 -1을 해준다.
4. keyset을 사용하여 전체 key의 배열을 가져오고 get으로 value를 반환한다.<br>
4-1. 2,3번 과정으로 참여자 명단, 완주자 명단에 key값이 있는 경우 해당 value값은 0이 되므로
value값이 1인 key값을 answer에 담아준다.
* 동명이인이 있을 수 있다는 제한 사항으로 getOrDefault(player, 0)을 사용해 줘야한다. <br>
  * 초기 value값을 1로 세팅을 하게되면 동명이인이 2명인 경우에도 value값은 1이 된다. 