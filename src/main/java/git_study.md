# git이란?
- 파일 버전관리 툴

##  git명령어
로컬환경 셋팅
1. 내 프로젝트를 git이 추적하게 만드는 것 - git init
2. 현재 작업자의 서명 등록
- git config --global user.name 내 아이디
- git config --global user.email 내 이메일
---


내컴퓨터에서 코드 작업(코드 변경)을 함(로컬) -> 원격 레포지토리에 게시
1. 변경사항에 대해서 저장한다( = 스테이징 영역에 올린다)  - git add
2. add를 여러번해서 한 화물차에 많은 짐을 싣게 된다 -git add
3. 화물차 문을 닫고, 출발 준비 (=스테이징된 변경사항을 하나의 버전으로 포장) -git commit -m"커밋메시지:
4. 준비된 화물차들을 원격레포지토리로 보낸다 ( = 로컬 커밋을 원격저장소에 게시한다 ) - git push

//git add -> git commit -> git push

---
최초 로컬 <>원격 레포지토리 연결(git push 바로 직전에 수행)

1. 본사 창고 주소를 등록한다(= 원격 저장소 등록)
git remote add origin 레포지토리(https://github.com)
2. 최초 push시에만 , git push -u origin main


git init은 git시작


