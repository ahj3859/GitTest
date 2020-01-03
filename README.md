# GitTest [![Build Status](https://travis-ci.com/ahj3859/GitTest.svg?branch=master)](https://travis-ci.com/ahj3859/GitTest)
Test environment for cupid

**troubleshooting**
@Handlebas(0.2.x) 사용 시 gradle 통해 라이브러리 추가 안되는 문제 (springboot 2.2.x 버전 문제)
 => implementation 'pl.allegro.tech.boot:handlebars-spring-boot-starter:0.3.1'를 deendencies에 추가함

@Java-11로 개발 중 1.8밖에 지원하지 않는 플랫폼으로 포팅 시
Could not target platform: 'Java SE 11' using tool chain: 'JDK 8 (1.8) 에러 발생
 => 
 1. https://m.blog.naver.com/PostView.nhn?blogId=sipzirala&logNo=221309127198&categoryNo=0&proxyReferer=&proxyReferer=https%3A%2F%2Fwww.google.com%2F
 참고하여 인텔리제이 Java 버전 변경
 2. 그래도 동일 에러 발생하여 추가 확인 
  => build.gradle에 sourceCompatibility = '11'를 1.8로 변경

@Slack-Travis 연동 시
travis encrypt "" --add notifications.slack 시 
repository not known to https://api.travis-ci.com/ 에러 발생
 => travis encrypt "" --add notifications.slack -r accountName/repoName 를 해줘야함