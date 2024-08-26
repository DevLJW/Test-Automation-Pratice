<!-- Improved compatibility of back to top link: See: https://github.com/othneildrew/Best-README-Template/pull/73 -->
<a id="readme-top"></a>
<!--
*** Thanks for checking out the Best-README-Template. If you have a suggestion
*** that would make this better, please fork the repo and create a pull request
*** or simply open an issue with the tag "enhancement".
*** Don't forget to give the project a star!
*** Thanks again! Now go create something AMAZING! :D
-->







<!-- ABOUT THE PROJECT -->
## 테스트 자동화 연습
![소통 메인](https://github.com/user-attachments/assets/6a8c83e5-5d15-4c99-9999-1c4591956306)
<br>


## 설명 
테스트 자동화에서 많이 사용하는 Selenium을 공부하기 위해 공부한 코드들을 작성 하였습니다.<br>
테스트 자동화 기초 코드 입니다.
<br>
<br>

## 공부기간
2024.08.01 ~ 2024.08.26
<br>
<br>


## 기술 스택

<div>
<img src="https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=Selenium&logoColor=white">
<img src="https://img.shields.io/badge/JAVA-3178C6?style=for-the-badge&logo=Java&logoColor=white">

</div>

<br>
<br>

## 공부한 내용 소개
### 1. 어노테이션 이해 
 <img src="https://github.com/user-attachments/assets/089e63cb-d3f5-4584-a6fd-2e3500c0484d" width="100%" height="60%">
 <br><br><br>
@BeforeMethod,@Test,@AfterMethod를 어노테이션의 의미와 사용법에 대해서 공부했습니다.<br>
@BeforeMethod 어노테이션에서는, 크롬 드라이버 사용경로를 설정하고,<br>
드라이버 인스턴스 초기화,get 메소드를 통한 주소 사이트를 오픈하는 코드를 작성 하였습니다.<br>
@Test 어노테이션에서는 접속 후 사이트에서 자동화할 내용 작성,<br>
@AfterMethod 어노테이션에서는 드라이버 종료 코드를 작성 했습니다.

<br><br>






### 2. 엘리먼트 찾기 및 엘리먼트 대기
 <img src="https://github.com/user-attachments/assets/890ca0dc-cd72-45b4-be05-fd2373b08c3f" width="100%" height="60%">
  <br><br><br>
HTML의 id나 class name 등을 통해 웹페이지에서 원하는 엘리먼트를 찾는 방법을 공부하고,<br>
로딩중인 웹 엘리먼트를 로딩후에 찾는 방법에 대해 공부 하였다.<br>
묵시적 대기시간은 WebDriver.Timeouts 인터페이스를 통하여 적용하고 공부 하였으며,<br>
명시적 대기 시간은 ExpectedCondition 인터페이스를 통하여 적용하고 공부 하였다.<br>
<br>
<br>

### 3. 복합액션
 <img src="https://github.com/user-attachments/assets/eda3f001-d725-45e7-a9cd-622d91e8c961" width="80%" height="60%">
  <br><br><br>
  사용자가 액션을 여러 개 연결해서 순차적으로 실행하는 복합적인 과정에 대하여<br>
  액션을 공부 하였습니다. (EX : Ctrl + 마우스 클릭 / 클릭 + 드래그 앤 드롭)<br>
  Actions 클래스를 사용하면 사용자 동작을 하나의 복합 액션으로 만들 수 있어서,<br>
  Actions 클래스를 사용하였고, 복합 액션을 실행하는 perform() 메소드를 사용하여 실행 하였습니다.
  <br>
  <br>
  

### 4. 자동 스크린샷 캡쳐
 <img src="https://github.com/user-attachments/assets/1f05ce1e-5e61-4784-988b-53d489bcf132" width="100%" height="60%">
 스크린샷 기능을 통해 테스트가 실패한 당시의 상황을 남길 수 있어서 스크린샷 구현에 대해 공부 하였습니다.<br>
 웹드라이버 라이브러리의 TakesScreenShot 인터페이스는 모든 웹드라이버의 구현체에서 사용이 가능하여 이 인터페이스로 공부 하였습니다.<br>
 실패 시, 스크린샷을 찍고, target 폴더 하위에 파일을 복사하여 저장하는 형식으로 구현 하였습니다.
 
 
  <br><br><br>


### 5. 게시글 수정하기
 <img src="https://github.com/user-attachments/assets/24750247-1a84-49e1-83c1-e1b9073be04f" width="100%" height="60%">
  <br><br><br>

게시글 수정하기는 게시글 상세화면에서 클릭한 게시글의 ID를 백엔드 API에 파라미터로 넘겨<br> 해당 게시글의 정보를 가져와 화면에 출력 합니다.<br>
작성자란은 추후, 비활성화 할 예정이며, 수정없이 수정하기 버튼을 클릭 시, 에러 메세지를 발생 합니다.<br>
수정하기 버튼을 클릭하면 입력한 데이터들이 백엔드 API를 호출하여 파라미터로 전달되고, DB에 업데이트되는 방식으로 구현 했습니다.

<br><br>

### 6. 게시글 삭제하기
게시글 삭제하기는 게시글 상세화면에서 클릭한 게시글의 ID를 백엔드 API에 파라미터로 넘겨 해당 게시글을 삭제 합니다.<br>
삭제 시, 리렌더가 적용되어 게시글 리스트 페이지 화면에 바로 업데이트 됩니다.
<br><br>

### 7. 페이징네이션
 <img src="https://github.com/user-attachments/assets/ce895209-a1fa-485d-8033-40f67e585156" width="100%" height="100%">
  <br><br><br>
페이징네이션은 페이지당 10개의 게시글로 구성이 되어 있습니다.<br>
1~10번 게시글은 1페이지, 11~20번의 게시글은 2번페이지로 구성이 되어 있습니다.<br>
3번 페이지 클릭시, 백엔드 Refetch API에 30 + 1로 시작값이 설정이되고, 40번까지의 게시글 값을 가져오게 됩니다.
<br><br>


### 8. 댓글 작성 ~ 댓글 삭제
 <img src="https://github.com/user-attachments/assets/cf13e26e-8757-4626-9af6-4e3ca54b38f4" width="100%" height="60%">


  <br><br><br>
댓글작성과 수정은 최대 100자까지 입력이 가능하며, 입력하기 버튼시, 입력데이터가 백엔드API 파라미터로 전달되며,<br>
백엔드에서 TypeORM을 통해 DB에 저장시켜 줍니다. 수정 같은경우, 기존작성했던내용과 동일해선 안됩니다.<br>
댓글 삭제하기는 게시글 상세화면에서 삭제아이콘을 클릭한 게시글의 댓글 ID를 백엔드 API에 파라미터로 넘겨 해당 댓글을 삭제 합니다.<br>
삭제 시, 리렌더가 적용되어 게시글 상세 페이지 화면에 바로 업데이트 됩니다.

<br><br>






