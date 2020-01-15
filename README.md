# ThanosContract 灭霸契约

[![Build Status](https://travis-ci.org/abigail830/ThanosContract.svg?branch=master)](https://travis-ci.org/abigail830/ThanosContract)

## Vision 愿景

#### Background 背景
契约测试让生产者与消费者之间能基于契约而更高效也更高质量地并行开发，减少端到端联调的压力。在依赖关系复杂的系统间尤为重要。现有的契约测试框架SpringCloudContract和Pact提供了基于HTTP+JSON格式的契约测试框架，但现实仍有不少的系统（如银行核心系统）依然徘徊在TCP+定长报文的场景之中

#### Taget 目标
ThanosContract is target to help the systems which still using TCP & Fix-length message to implement Contract Test. 灭霸契约旨在为还在使用TCP+定长报文的系统提供契约测试工具，主要功能包括：

* Provide MockServer for consumer: 为消费者提供挡板服务
* Provider Junit Test Sample for provider: 为生产者提供自动化测试案例

#### Difference 差异化
Different from **SpringCloudContract** & **Pact**, ThanosContract support(& only support) TCP + fix-length messaging.




## Components 系统组件

### Draft diagram 设计草图
<img src="https://plantuml-server.kkeisuke.app/svg/ZLF1JkCm4BtxAsPxM1LfQRHIJtk2ZH2xI0LsqufZDNL6ZOLZH_Qu9KBxxskNbYGj27AnntdlpPldvC8pEWwrXdowlD9Kas4llYWZTIWfE0qLS-D_P9d3xMIjk0ghuCb9QpX29zBMsLD0qrBMQ3H9wTnpg-bSJhCQFPFBv7IPuAWCkKaJ4K9SIhPkd8I-mMWHbr5SSsjygCbv-0htpcvK6VUZCo6ADkhKowid7dE5nlh5xmYVxxU9EiDsHN3Pg6jasc8Bw65BMlVOFsqm9RfsBB-_alDaIpBarj7e39u5n2S_U1tNLZuMv3OxbxFN8ZMymGs-D5Q6eGC2IcbTgSmQs48QsyK6qSPG-V0YaPIab-7x9wSz3fIKZfSLnN3Va2tfck8EOxmxqLxTbzmV4jm4enWAh1jDxth_9yHVqllhwjt0h_dyVgTQtDscf3lG8BbvlaDj5C8UcO2TpcaOHyB7yE6Gf-3bBQbrjOfVMCSQE7hB-8cB0UE1LaMiYHFDEfZzEMxLXtzceevvDD27P751feo_qNy0.svg" width="550" >


## Progress

* Basic MockServer
* Basic ContractService

