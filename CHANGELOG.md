# Changelog

## 0.1.0 (2026-09-04)

Full Changelog: [v0.0.1...v0.1.0](https://github.com/crawler-dot-dev/api-sdk-java/compare/v0.0.1...v0.1.0)

### Features

* **api:** api update ([2286b2d](https://github.com/crawler-dot-dev/api-sdk-java/commit/2286b2d5e95f67e1e521c53ab8ff91b2a6ed9bd2))
* **client:** add connection pooling option ([83b7f97](https://github.com/crawler-dot-dev/api-sdk-java/commit/83b7f97a5d51f5d9822ddb93b1f9b847842d792d))
* **client:** allow configuring dispatcher executor service ([28fb430](https://github.com/crawler-dot-dev/api-sdk-java/commit/28fb430627272cdfa9e1bea5fa7b85a104dfe854))
* **client:** improve logging ([50caaf2](https://github.com/crawler-dot-dev/api-sdk-java/commit/50caaf2d38bbc6b8cb3cffadae39192881c63cfe))
* **client:** send `X-Stainless-Kotlin-Version` header ([f2cb0b6](https://github.com/crawler-dot-dev/api-sdk-java/commit/f2cb0b6f1c4f22c40d99b550d7c04b352f09d9e1))
* **stlc:** configurable CI runner and private-production-repo support in workflow templates ([94fd8e1](https://github.com/crawler-dot-dev/api-sdk-java/commit/94fd8e1b9f7ef15c19cfe1b35881675007dd7563))


### Bug Fixes

* **client:** disallow coercion from float to int ([c816f95](https://github.com/crawler-dot-dev/api-sdk-java/commit/c816f9535151c0025c729992ae25dd4c92b7f08c))
* **client:** fully respect max retries ([0563057](https://github.com/crawler-dot-dev/api-sdk-java/commit/0563057ed7140f033ea8443980dee7cc6b7614a6))
* **client:** preserve time zone in lenient date-time parsing ([bf6ad54](https://github.com/crawler-dot-dev/api-sdk-java/commit/bf6ad548afd48011a0554e1e7e7daaec77143fc7))
* **client:** send retry count header for max retries 0 ([0563057](https://github.com/crawler-dot-dev/api-sdk-java/commit/0563057ed7140f033ea8443980dee7cc6b7614a6))
* date time deserialization leniency ([610f47c](https://github.com/crawler-dot-dev/api-sdk-java/commit/610f47c2dbad474167151faaccb6cb7b4f9dab44))
* deserialization order ([56f707b](https://github.com/crawler-dot-dev/api-sdk-java/commit/56f707b82ba22a633bebfdce367164230b456555))


### Chores

* **ci:** skip uploading artifacts on stainless-internal branches ([e06214e](https://github.com/crawler-dot-dev/api-sdk-java/commit/e06214e7bd4e3576397b9422e34b0300b84757cc))
* **ci:** upgrade `actions/github-script` ([4669831](https://github.com/crawler-dot-dev/api-sdk-java/commit/46698313ec81efea8bf925ed9f6712b6f586de3b))
* **ci:** upgrade `actions/setup-java` ([dfbf19b](https://github.com/crawler-dot-dev/api-sdk-java/commit/dfbf19bd4c6bfff29cfc589e9876165715e2a46b))
* configure new SDK language ([501b18a](https://github.com/crawler-dot-dev/api-sdk-java/commit/501b18ad736c9f96556e37f4df72a7c65bdcf0c5))
* drop apache dependency ([5eb53ba](https://github.com/crawler-dot-dev/api-sdk-java/commit/5eb53ba58c7dcd47c40467b4a3006baf186c7343))
* **internal:** allow passing args to `./scripts/test` ([d4d5c3b](https://github.com/crawler-dot-dev/api-sdk-java/commit/d4d5c3be5ee5a575a0b3685f05d2a372662dc05b))
* **internal:** bump palantir-java-format ([4e7ac96](https://github.com/crawler-dot-dev/api-sdk-java/commit/4e7ac967a7e6d4de3ad246efc97f0fedb3675f29))
* **internal:** clean up maven repo artifact script and add html documentation to repo root ([dc42af3](https://github.com/crawler-dot-dev/api-sdk-java/commit/dc42af3bdeb074add3d6988bc2d8e9357eda0695))
* **internal:** codegen related update ([6b45368](https://github.com/crawler-dot-dev/api-sdk-java/commit/6b45368b9391232cfc72f8cf509acac17b4e89b2))
* **internal:** codegen related update ([6214769](https://github.com/crawler-dot-dev/api-sdk-java/commit/6214769316684ec69d9a4042f39de598c5a8fe11))
* **internal:** codegen related update ([2002121](https://github.com/crawler-dot-dev/api-sdk-java/commit/20021217e92bc5771a19d1eeea1dec4f1f85f44d))
* **internal:** codegen related update ([b3db383](https://github.com/crawler-dot-dev/api-sdk-java/commit/b3db383b59cf6a592900dfa78cf48a860088f833))
* **internal:** codegen related update ([a21f7e3](https://github.com/crawler-dot-dev/api-sdk-java/commit/a21f7e3e6194b71e0593eb0ceb9fe374caacbc23))
* **internal:** codegen related update ([1257822](https://github.com/crawler-dot-dev/api-sdk-java/commit/12578229c7d4e4f7ca8078e1795c878f4f30f5da))
* **internal:** codegen related update ([f1847b3](https://github.com/crawler-dot-dev/api-sdk-java/commit/f1847b3b691c904a0afbc475d24a9ffa25316865))
* **internal:** codegen related update ([08bb6bc](https://github.com/crawler-dot-dev/api-sdk-java/commit/08bb6bc35ea008621e87887b7a28acd4f8e24211))
* **internal:** codegen related update ([86abf48](https://github.com/crawler-dot-dev/api-sdk-java/commit/86abf484284146700df3a3e3c09fdd703f4eb921))
* **internal:** codegen related update ([f4312fe](https://github.com/crawler-dot-dev/api-sdk-java/commit/f4312fe1746b88f279768b9e9b5ab143f56590cb))
* **internal:** codegen related update ([9799b62](https://github.com/crawler-dot-dev/api-sdk-java/commit/9799b623bec937f9abcef92b280c8212749d817b))
* **internal:** codegen related update ([47a8566](https://github.com/crawler-dot-dev/api-sdk-java/commit/47a8566536a03d356524ab065003dd873e52ae1b))
* **internal:** codegen related update ([f378107](https://github.com/crawler-dot-dev/api-sdk-java/commit/f378107f3070958989dbf509240807b9daf18c27))
* **internal:** codegen related update ([18f486d](https://github.com/crawler-dot-dev/api-sdk-java/commit/18f486d51cd725fa1050154d53ba4bdda381c342))
* **internal:** codegen related update ([15e2281](https://github.com/crawler-dot-dev/api-sdk-java/commit/15e2281efc25c691377713ce1301caad40b881d2))
* **internal:** codegen related update ([a720dbe](https://github.com/crawler-dot-dev/api-sdk-java/commit/a720dbe46f0ca1b26feb468f92671554c593585e))
* **internal:** codegen related update ([432b1d0](https://github.com/crawler-dot-dev/api-sdk-java/commit/432b1d080d85b218a1bfa4c082f0050110faf7f4))
* **internal:** correct cache invalidation for `SKIP_MOCK_TESTS` ([cac7146](https://github.com/crawler-dot-dev/api-sdk-java/commit/cac71467d1765705dc192e8145f9ebfa2eda1b24))
* **internal:** depend on packages directly in example ([0563057](https://github.com/crawler-dot-dev/api-sdk-java/commit/0563057ed7140f033ea8443980dee7cc6b7614a6))
* **internal:** expand imports ([cdf11f2](https://github.com/crawler-dot-dev/api-sdk-java/commit/cdf11f237a086f5592f7c69e8bf634aa9eef6a4c))
* **internal:** improve maven repo docs ([ff4085d](https://github.com/crawler-dot-dev/api-sdk-java/commit/ff4085d7b43c2ee4a74ff6bbb966ea220bb4aacc))
* **internal:** make `OkHttp` constructor internal ([d6919c2](https://github.com/crawler-dot-dev/api-sdk-java/commit/d6919c2de679b8b874b2517702fd41334cb45e57))
* **internal:** remove mock server code ([2a203d2](https://github.com/crawler-dot-dev/api-sdk-java/commit/2a203d2be422ac922c9368098a72c9517d6e5fa8))
* **internal:** support uploading Maven repo artifacts to stainless package server ([1281f6f](https://github.com/crawler-dot-dev/api-sdk-java/commit/1281f6fdcc3a87a6d2bfd43ed9be6277524cabfe))
* **internal:** update `actions/checkout` version ([56dcc55](https://github.com/crawler-dot-dev/api-sdk-java/commit/56dcc550aa8846d566e3cb04009f6f0788cabe71))
* **internal:** update `TestServerExtension` comment ([f294648](https://github.com/crawler-dot-dev/api-sdk-java/commit/f294648ce20fdd3b8abc236371a13a8188055bc7))
* **internal:** update maven repo doc to include authentication ([520fa14](https://github.com/crawler-dot-dev/api-sdk-java/commit/520fa14a26eafe8763bbce4a9b54d0d0d6c28f2c))
* **internal:** upgrade AssertJ ([167117b](https://github.com/crawler-dot-dev/api-sdk-java/commit/167117b1ea347c8a29c2173798b2326e8751e764))
* make `Properties` more resilient to `null` ([30d5ea9](https://github.com/crawler-dot-dev/api-sdk-java/commit/30d5ea9caaf3036a62455609dc614fc5d7dc85fe))
* sync repo ([82c797a](https://github.com/crawler-dot-dev/api-sdk-java/commit/82c797a45eeb5a3912a85919fa8622d4825d5dd5))
* test on Jackson 2.14.0 to avoid encountering FasterXML/jackson-databind[#3240](https://github.com/crawler-dot-dev/api-sdk-java/issues/3240) in tests ([610f47c](https://github.com/crawler-dot-dev/api-sdk-java/commit/610f47c2dbad474167151faaccb6cb7b4f9dab44))
* update mock server docs ([b98cf0c](https://github.com/crawler-dot-dev/api-sdk-java/commit/b98cf0cd56a38a212565168283d0c0e56cd07f0f))
* update placeholder string ([c4aa230](https://github.com/crawler-dot-dev/api-sdk-java/commit/c4aa2303673d93176428d53d000728519e0e51b2))
* update SDK settings ([7232b25](https://github.com/crawler-dot-dev/api-sdk-java/commit/7232b256906edfe39d1f4439b79e4b02859fec9b))
* update SDK settings ([1067a88](https://github.com/crawler-dot-dev/api-sdk-java/commit/1067a88b19676ef843f5991077b57ed4140e6450))
