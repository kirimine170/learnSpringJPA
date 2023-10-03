# Spring JPA学習用
## 概要
Spring JPA学習用のリポジトリ  

## 環境
- Java17
- Gradle 8
- SpringBoot 3
- Spring JPA
- H2DB

あとはよしなに

## 使い方
```bash
$ gradle bootRun
```

ビルドされてなかったら`gradle build`してね

## メモ的なやつ
Spring JPAってHibernateで実装されてるっぽい。  
Spring FrameworkにHibernate向けにSessionFactoryが実装されてたけど、5系で更新止めてるっぽい：[参考](https://docs.spring.io/spring-framework/reference/data-access/orm/hibernate.html)  
Spring JPAはHibernate6系を使ってるので、特段理由がなければこっちを使うのが賢そう？：[参考](https://github.com/spring-projects/spring-data-jpa/blob/main/pom.xml)    