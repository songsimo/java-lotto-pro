# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

---
## 요구사항 분석
* 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.
* 로또 1장의 가격은 1000원이다.

---
## (추가적인) 기능 요구사항
* 구입금액 입력값 검증 -> IllegalArgumentException 던지기
  * 숫자 입력만 가능
  * null 혹은 빈값
  * 음수값 입력

* 로또 번호 검증 -> IllegalArgumentException 던지기
  * 1~45 사이의 숫자만 입력 가능

* 당첨 통계
  * 일치하는 숫자 개수별 당첨금 통계
  * 수익률 계산

* 당첨 번호
  * 입력은 ``,``로 구분
  * 당첨 번호 6개 입력 검증 -> IllegalArgumentException 던지기

---
## 기능 목록

- [x] 로또 번호 검증
  - [x] 로또 번호 범위는 1-45까지다.
- [x] 당첨 통계
  - [x] 두 로또를 비교한다.
  - [x] 수익률을 계산한다.
- [x] 로또 번호를 자동으로 만든다.
- [x] 구입금액 입력값 검증
  - [x] 숫자 입력만 가능하다
  - [x] null 혹은 빈값을 가질 수 없다
  - [x] 음수는 입력할 수 없다
- [x] 당첨 번호 입력
  - [x] 당첨 번호는 6개를 입력해야 한다.
  - [x] 숫자를 중복 입력했는지 검증한다.


## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)
