# Sandbox
====

## 起動方法

1. 当プロジェクトをIntelliJ IDEAにGradleProjectとしてclone  
1. GradleタスクよりbootRun(`:micro-api -> Tasks -> application -> bootRun`)
1. GradleタスクよりbootRun(`:micro-web -> Tasks -> application -> bootRun`)

## 停止方法

1. bootRunの停止  
        
## 構成

Gradleのマルチプロジェクト構成をとっています。

```
sandbox                               … rootプロジェクト
- gradle                              … 
- micro-api                           … Apiプロジェクト
- micro-web                           … Viewプロジェクト
- build.gradle                        … Gradle プロジェクト定義
- gradle.properties                   … Gradle プロジェクト定義
- settings.gradle                     … Gradle プロジェクト設定
```    

## Endpoints

[Actuator][]

## 環境

### Middleware

| name              | version
| :---------------- | :-------
| OpenJdk           | 11
| Gradle            | 5.0 

### Library

| name               | version
| :----------------- | :------
| SpringBoot         | 2.1.x

### Port

| name              | version
| :---------------- | :-------
| micro-api         | 8085
| micro-web         | 8081

[Actuator]: http://localhost:8085/SandboxApi/actuator     "Actuator"
