# Conventions

## Type
* **[Feat]** : 새로운 기능 구현 
* **[UI]** : UI 작업 
* **[Fix]** : 버그 및 오류 해결 
* **[Merge]** : 다른 브랜치와의 merge
* **[Refactor]** : 코드 리팩토링 (기능에는 변화 없지만 코드 구조를 개선할 때)
* **[Chore]** : 버전 코드 수정, 패키지 구조 변경, 타입 및 변수명 변경 등의 작은 작업 
* **[Docs]** : 코드 변경 없이 문서(README, Wiki 등)만 수정할 때

## Branch
<img width="680" alt="스크린샷 2025-01-07 오후 8 45 55" src="https://github.com/user-attachments/assets/c3bc45a2-8d00-429f-b1c0-32ef3b2ee492" />

Git Flow

1. 구현하고자 하는 기능에 대한 이슈를 생성한다.
2. develop 브랜치를 기준으로 한 feature 브랜치를 따서 작업을 진행한다.
3. 작업이 완료된 feature 브랜치는 PR을 올린 후, 팀원의 동의 하에 develop 브랜치로 병합한다.

`main` : 제품 출시 버전을 관리하는 메인 브랜치

`develop` : 개발 진행 중인 브랜치. 해당 브랜치에서 작업을 진행한다.

`feat` : 특정 기능 개발을 위한 브랜치

`release` : 배포 전 코드 최종 점검 및 수정하는 브랜치

`hotfix` : 배포 후 긴급 버그 수정을 위한 브랜치

## Commit
[#이슈번호] 유형: 내용 (예: [#4] UI: 홈페이지 화면 구현) 

## Issue
[유형] issue에 올릴 내용

## Pull Request
[유형/#이슈번호] PR에 올릴 내용 (예: [Feat/#3] 로그인 기능 구현)

- 기능 구현 설명 자세하게 적을 것!
- 팀원 한명 이상 approve 시 머지 가능

# Setting
- Minimum SDK : 24 (Android 7.0)
- Target : 35
- 테스트 에뮬레이터(AVD) : Pixel 8 (API 35)


