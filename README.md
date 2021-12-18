# CMS Fetch Message

该程序从 CMS 文档 **中提取消息，无需验证** 个签名和证书。 通过使用本程序，您将承担因接受和处理本程序结果而产生的所有风险。 该程序是为研究目的而创建的。 程序员不对程序的结果及其使用的所有后果负责。 

This program extracts message from CMS document **WITHOUT VERIFICATION** of signature and certificates. 
By using this program, you assume all the risks arising from the acceptance and processing of the result of this program as it is. 
The program was created for research purposes. The programmer is not responsible for the result of the program and all the consequences of its use. 

## Requirements

 * Java 1.8
 * Maven (for building)

## Build

```mvn install```

## Launch

```java -jar cms-fetch-message.jar path/to/cms-base64-document```

 it outputs the message to console

 
