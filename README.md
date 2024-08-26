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

### 3. 게시글 작성
 <img src="https://github.com/user-attachments/assets/eda3f001-d725-45e7-a9cd-622d91e8c961" width="80%" height="60%">
  <br><br><br>

 

게시글 작성 필드는 작성자,비밀번호,제목,내용,이미지 업로드란으로 구성이 되어 있습니다.<br>
이미지 업로드 같은경우, 최대 3장까지만 업로드가 가능 합니다.<br>
이미지 저장 스토리지 서버는 구글 클라우드를 사용 했습니다.<br>
사용자가 브라우저에서 업로드할 이미지 파일을 선택 후 "확인" 버튼을 클릭하면,<br>
선택한 파일 객체를 백엔드 서버에 API를 요청하여 백엔드 서버에서 구글스토리지에 파일을 저장하고<br>
스토리지에서는 파일을 저장한 결과로 사진주소를 백엔드 서버에 리턴 해줍니다.<br>
백엔드 서버에서 다시, 반환받은 이미지 주소를 브라우저에게 전달 해주는 프로세스로 구현 했습니다.
<br><br>

### 4. 게시글 상세보기
 <img src="https://github.com/user-attachments/assets/1f05ce1e-5e61-4784-988b-53d489bcf132" width="100%" height="60%">
  <br><br><br>


게시글 상세보기는 작성자,작성날짜,내용,제목,목록버튼,수정버튼,삭제버튼으로 구성되어 있습니다.<br>
게시글 리스트 화면에서 해당 게시글을 클릭하면 클릭한 게시글에 대한 상세내용을 확인 할 수 있습니다.<br>
목록버튼이나 수정버튼 같은경우, 게시글 리스트화면에서 게시글을 클릭했을때, 클릭한 게시글의 ID를 Recoil에 저장하고,<br>
백엔드 API로 Recoil에 저장되어 있는 게시글ID를 파라미터로 넘겨, 해당 게시글의 작성자의 이름과 현재 로그인한 사용자의 이름이 같다면,<br>
수정하기 버튼과 삭제하기 버튼을 노출 합니다.
<br><br>

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






