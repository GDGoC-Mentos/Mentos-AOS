# Conventions

|Type|설명|
|--|--|
|`Feat`|새로운 기능 구현|
|`UI`|UI 작업|
|`Fix`|버그 및 오류 해결|
|`Merge`|다른 브랜치와의 merge|
|`Refactor`|코드 리팩토링 (기능에는 변화 없지만 코드 구조를 개선할 때)|
|`Chore`|버전 코드 수정, 패키지 구조 변경, 타입 및 변수명 변경 등의 작은 작업|
|`Docs`|코드 변경 없이 문서(README, Wiki 등)만 수정할 때|

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


# Android-Style-Guide
### 1. Layout

* **xml 파일명 : snake_case** `[WHAT]_[WHERE]`
 
    (ex: activity_main , fragment_home)

|prefix|설명|
|--|--|
|`activity_`|Activity에서 쓰이는 layout|
|`fragment_`|Fragment에서 쓰이는 layout|
|`dialog_`|Dialog에서 쓰이는 layout|
|`view_`|CustomView에서 쓰이는 layout|
|`item_`|RecyclerView, GridView, ListView등에서 ViewHolder에 쓰이는 layout|

### 2. ID

* **View ID :** `[파일 이름]_[설명]_[뷰 약자]` 중간 설명은 camelCase로 작성

    (ex. MainActivity의 요소라면, main_albumlmg_iv)

|View Type|View 약자|
|--|--|
|`TextView`|tv|
|`EditText`|et|
|`RecyclerView`|rv|
|`ImageView`|iv|
|`Button` `ImageButton`|btn|
|`ScrollView`|sv|
|`TabLayout`|tl|
|`ViewPager`|vp|
|`ToolBar`|tb|
|`CardView`|cv|
|`Linearlayout`|ll|
|`FrameLayout`|fl|
|`CheckBox`|cb|
|`RadioButton`|rb|
|`BottomNavigationView`|bnv|
|`FragmentContainerView`|fcv|
|`View(밑줄, 경계선, 라인)`|view|

### 3. Drawable

* `<WHAT>(_<WHERE>)_<DESCRIPTION>`
* 이미지가 여러군데에서 활용될 경우, `<WHERE>`는 생략 가능

**What**

| Prefix | 설명 |
| ------------- | ------------- |
| `btn_` | 버튼으로 쓰이는 이미지 |
| `ic_` | 버튼이 아닌 화면에 보여지는 이미지 |
| `bg_` | background로 사용 |
  

# Setting
- Kotlin
- Android Studio
- Minimum SDK : 24 (Android 7.0)
- Target SDK : 35
- 테스트 에뮬레이터(AVD) : Pixel 8 (API 35)

