# 2. EC2에 설치된 Jenkins와 Github 연동하기

이번 시간엔 EC2에 설치된 Jenkins와 Github연동을 진행하겠습니다.

## 2-1. SSH 키 생성 및 등록

Github 연동을 **ID & Password 방식으로 하면 보안에 취약**하기 때문에 ssh 키로 연동 하겠습니다.  
Jenkins가 설치된 EC2에서 아래 명령어로 키를 생성합니다.

```bash
ssh-keygen -t rsa -f id_rsa
```

(여기서 ```Enter passphrase```는 바로 엔터를 누르시면 됩니다.)  
  
2개의 키(```id_rsa```, ```id_rsa.pub```)가 생성됩니다.  
  
![github1](./images/github1.png)

Jenkins 페이지로 다시 이동하셔서 **Credentials/System**로 이동합니다.

![github2](./images/github2.png)

Global credentials를 클릭

![github3](./images/github3.png)

**Add Credentials**를 클릭하면 인증키를 입력할 수 있는 화면이 나옵니다.  
여기서 Kind를 **SSH Username with private key**를 선택합니다.

![github4](./images/github4.png)

여기서 Private Key 영역에 **id_rsa** 값을 넣습니다.  
Jenkins가 설치된 EC2에서 ```cat id_rsa```로 코드를 확인합니다.

![github5](./images/github5.png)

이 코드를 **전체 복사**해서 Key 영역에 추가합니다.  

![github6](./images/github6.png)

비공개키는 이제 등록이 되었습니다.  
남은 공개키를 Github에 등록하겠습니다.  

![github7](./images/github7.png)

![github8](./images/github8.png)

![github9](./images/github9.png)

![github10](./images/github10.png)

![github11](./images/github11.png)

![github12](./images/github12.png)

```bash
http://젠킨스도메인/github-webhook/
```

![github13](./images/github13.png)

## 2-2. Jenkins Item 등록

![github14](./images/github14.png)

![github15](./images/github15.png)

![github16](./images/github16.png)

![github17](./images/github17.png)

![github18](./images/github18.png)

![github19](./images/github19.png)

![github20](./images/github20.png)

![github21](./images/github21.png)






