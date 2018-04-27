# Jenkins로 AWS Beanstalk & Gradle Multi Module 배포하기

모든 코드는 [Github](https://github.com/jojoldu/jenkins-beanstalk-multi-module)에 있습니다.

## 1. Jenkins 설치

### 1-1. IAM Role 생성

![iam1](./images/iam1.png)

![iam2](./images/iam2.png)

![iam3](./images/iam3.png)

![iam4](./images/iam4.png)

![iam5](./images/iam5.png)

### 1-2. EC2 생성

![ec1](./images/ec1.png)

### 1-3. Jenkins 설치

```bash
sudo yum update
```

[Java 8 설치](http://jojoldu.tistory.com/261)

```bash
sudo yum install git
```

jenkins 설정 파일을 받습니다.

```bash
sudo wget -O /etc/yum.repos.d/jenkins.repo https://pkg.jenkins.io/redhat-stable/jenkins.repo
```

key를 import 합니다.

```bash
sudo rpm --import https://pkg.jenkins.io/redhat-stable/jenkins.io.key
```

jenkins를 설치합니다.

```bash
sudo yum install jenkins
```

