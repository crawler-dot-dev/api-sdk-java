# Changelog

## 0.1.0 (2026-09-08)

Full Changelog: [v0.0.1...v0.1.0](https://github.com/crawler-dot-dev/api-sdk-java/compare/v0.0.1...v0.1.0)

### Features

* **api:** api update ([2286b2d](https://github.com/crawler-dot-dev/api-sdk-java/commit/2286b2d5e95f67e1e521c53ab8ff91b2a6ed9bd2))
* **client:** add connection pooling option ([050bc7f](https://github.com/crawler-dot-dev/api-sdk-java/commit/050bc7fab788e6ddf534474d5f3f1143fe3b5c82))
* **client:** allow configuring dispatcher executor service ([3d4b632](https://github.com/crawler-dot-dev/api-sdk-java/commit/3d4b6322019ca1d31debfa9973090297536cd61f))
* **client:** improve logging ([3162d41](https://github.com/crawler-dot-dev/api-sdk-java/commit/3162d41764e53188c1847871b7168d7920aae85f))
* **client:** send `X-Stainless-Kotlin-Version` header ([7b404b2](https://github.com/crawler-dot-dev/api-sdk-java/commit/7b404b233cba144f364d6e6ec444fd9a1dedffd0))
* **stlc:** configurable CI runner and private-production-repo support in workflow templates ([ed0fc3f](https://github.com/crawler-dot-dev/api-sdk-java/commit/ed0fc3f6b6982d782a6e8441da65cb830e7beaae))


### Bug Fixes

* **client:** disallow coercion from float to int ([5ed8f10](https://github.com/crawler-dot-dev/api-sdk-java/commit/5ed8f10012865d7475fa9b5d34ede68997cc50ef))
* **client:** fully respect max retries ([56e6732](https://github.com/crawler-dot-dev/api-sdk-java/commit/56e6732cbb6adf2f711cabd01b25fe0a11b5d26c))
* **client:** preserve time zone in lenient date-time parsing ([f6f2773](https://github.com/crawler-dot-dev/api-sdk-java/commit/f6f277385338dfb00dae73beafc6ff2122cabba6))
* **client:** send retry count header for max retries 0 ([56e6732](https://github.com/crawler-dot-dev/api-sdk-java/commit/56e6732cbb6adf2f711cabd01b25fe0a11b5d26c))
* date time deserialization leniency ([8c2293a](https://github.com/crawler-dot-dev/api-sdk-java/commit/8c2293a9e33e0a2fc1b351eacbec24c2b4d3946c))
* deserialization order ([82465b2](https://github.com/crawler-dot-dev/api-sdk-java/commit/82465b206e6eed2989a2e8595fefaca52bd79fb8))


### Chores

* **ci:** skip uploading artifacts on stainless-internal branches ([76e116f](https://github.com/crawler-dot-dev/api-sdk-java/commit/76e116fe552fb6e7d9ad61ae67464f63a00b65d3))
* **ci:** upgrade `actions/github-script` ([eaa5cec](https://github.com/crawler-dot-dev/api-sdk-java/commit/eaa5cec85168b7dd92e005bc81ff7c1ef34214d6))
* **ci:** upgrade `actions/setup-java` ([60797d4](https://github.com/crawler-dot-dev/api-sdk-java/commit/60797d4b14d5a36bcf3568479a7e3aee84baf819))
* configure new SDK language ([501b18a](https://github.com/crawler-dot-dev/api-sdk-java/commit/501b18ad736c9f96556e37f4df72a7c65bdcf0c5))
* drop apache dependency ([8f1f657](https://github.com/crawler-dot-dev/api-sdk-java/commit/8f1f657d97dde31036f00b3707b9defae26af7be))
* **internal:** allow passing args to `./scripts/test` ([e382e98](https://github.com/crawler-dot-dev/api-sdk-java/commit/e382e985e64a54af23edd088cd76a61c703397c8))
* **internal:** bump palantir-java-format ([70487f3](https://github.com/crawler-dot-dev/api-sdk-java/commit/70487f3c2d8ad42c17517af3bc6636585f9c989f))
* **internal:** clean up maven repo artifact script and add html documentation to repo root ([748059b](https://github.com/crawler-dot-dev/api-sdk-java/commit/748059be990abd395baa1bb3535011dc752bbcc2))
* **internal:** codegen related update ([3bc4a00](https://github.com/crawler-dot-dev/api-sdk-java/commit/3bc4a00cebbca821bfca890c6eaa2eded99cd7e2))
* **internal:** codegen related update ([c94b26c](https://github.com/crawler-dot-dev/api-sdk-java/commit/c94b26c441448e080aedd4495408a401330dc103))
* **internal:** codegen related update ([ae3004e](https://github.com/crawler-dot-dev/api-sdk-java/commit/ae3004ee1c281cadc1489a007fa3bdd1bd658dfa))
* **internal:** codegen related update ([bee7195](https://github.com/crawler-dot-dev/api-sdk-java/commit/bee71956bd8ecd089a59b86295c877b664c4f8e6))
* **internal:** codegen related update ([7d05b20](https://github.com/crawler-dot-dev/api-sdk-java/commit/7d05b205bc6b596ca5c15efb0bb960501e2373af))
* **internal:** codegen related update ([2d1ad23](https://github.com/crawler-dot-dev/api-sdk-java/commit/2d1ad23b8546f257090293340e2f15647097ceb7))
* **internal:** codegen related update ([1c45683](https://github.com/crawler-dot-dev/api-sdk-java/commit/1c45683f44bb67acc99ec13b8f922a5ce2594e62))
* **internal:** codegen related update ([0bb6337](https://github.com/crawler-dot-dev/api-sdk-java/commit/0bb63370d6a273b31ab2eb5433a7f9ecec539e20))
* **internal:** codegen related update ([e62a5b7](https://github.com/crawler-dot-dev/api-sdk-java/commit/e62a5b742c0e4e188169b7636b78c6a93526e9f3))
* **internal:** codegen related update ([3ab850a](https://github.com/crawler-dot-dev/api-sdk-java/commit/3ab850abcd3e0a28ed4786fdf0da37b3e9fb0c43))
* **internal:** codegen related update ([e8caa7f](https://github.com/crawler-dot-dev/api-sdk-java/commit/e8caa7f9550a02f207e322c437b6c9af92d3e14b))
* **internal:** codegen related update ([82b611f](https://github.com/crawler-dot-dev/api-sdk-java/commit/82b611f2abec3a54f82ab315b8d0a5d1761bcc7e))
* **internal:** codegen related update ([416e514](https://github.com/crawler-dot-dev/api-sdk-java/commit/416e51493138c36c95f6613d66df3a152d139a78))
* **internal:** codegen related update ([ed0db4c](https://github.com/crawler-dot-dev/api-sdk-java/commit/ed0db4c70febd4af3f31c5e67a3e081d2e4bd55e))
* **internal:** codegen related update ([70775dd](https://github.com/crawler-dot-dev/api-sdk-java/commit/70775dde46ad7da213d6522c5816a3796dc44772))
* **internal:** codegen related update ([4930db8](https://github.com/crawler-dot-dev/api-sdk-java/commit/4930db87a692ba1492f5cb41b0407db19d6a1b8f))
* **internal:** codegen related update ([d858083](https://github.com/crawler-dot-dev/api-sdk-java/commit/d858083ed82fab4b4c1b932c5359ca0e78ba6898))
* **internal:** correct cache invalidation for `SKIP_MOCK_TESTS` ([0994631](https://github.com/crawler-dot-dev/api-sdk-java/commit/09946316bb69897e3216af740415385c48b72a5f))
* **internal:** depend on packages directly in example ([56e6732](https://github.com/crawler-dot-dev/api-sdk-java/commit/56e6732cbb6adf2f711cabd01b25fe0a11b5d26c))
* **internal:** expand imports ([ec09514](https://github.com/crawler-dot-dev/api-sdk-java/commit/ec095148e4eb25cc0f3c7899e89ee775daf2b572))
* **internal:** improve maven repo docs ([3f06a77](https://github.com/crawler-dot-dev/api-sdk-java/commit/3f06a774d68103583b141c96685374bf7a57e409))
* **internal:** make `OkHttp` constructor internal ([561ece7](https://github.com/crawler-dot-dev/api-sdk-java/commit/561ece706274754c466fa165d3ef47ced1dd1cd1))
* **internal:** remove mock server code ([b6ab667](https://github.com/crawler-dot-dev/api-sdk-java/commit/b6ab667d3818220b65734ec8c966f25a02321c4e))
* **internal:** support uploading Maven repo artifacts to stainless package server ([a9d30e4](https://github.com/crawler-dot-dev/api-sdk-java/commit/a9d30e41c623b9896fcd186f271c21b1829793cc))
* **internal:** update `actions/checkout` version ([021ca69](https://github.com/crawler-dot-dev/api-sdk-java/commit/021ca69d9aaba033e6dcc85cf001b0c91a3ecf98))
* **internal:** update `TestServerExtension` comment ([d77236a](https://github.com/crawler-dot-dev/api-sdk-java/commit/d77236ae447226355ce904b867a84b4cca4a2682))
* **internal:** update maven repo doc to include authentication ([bc9352d](https://github.com/crawler-dot-dev/api-sdk-java/commit/bc9352dc7cada5a8e71b17b334fa37a2c154045a))
* **internal:** upgrade AssertJ ([b568ad9](https://github.com/crawler-dot-dev/api-sdk-java/commit/b568ad9156f2ed4fecd861faa29c1f0fdf3ffa14))
* make `Properties` more resilient to `null` ([c432c75](https://github.com/crawler-dot-dev/api-sdk-java/commit/c432c755439eb66f5ce57ede50966e897a6cae4f))
* sync repo ([6903b38](https://github.com/crawler-dot-dev/api-sdk-java/commit/6903b388b407309adc3830c03ee37868d2c61576))
* test on Jackson 2.14.0 to avoid encountering FasterXML/jackson-databind[#3240](https://github.com/crawler-dot-dev/api-sdk-java/issues/3240) in tests ([8c2293a](https://github.com/crawler-dot-dev/api-sdk-java/commit/8c2293a9e33e0a2fc1b351eacbec24c2b4d3946c))
* update mock server docs ([f7a667e](https://github.com/crawler-dot-dev/api-sdk-java/commit/f7a667ec96b76abeca9167a8232e79d4e744bd3e))
* update placeholder string ([7b50029](https://github.com/crawler-dot-dev/api-sdk-java/commit/7b500292474721c7eb709c5ee9ed3344cac10b5e))
* update SDK settings ([096f7d7](https://github.com/crawler-dot-dev/api-sdk-java/commit/096f7d7c05ac31be5195e15807334ea39556180e))
* update SDK settings ([1067a88](https://github.com/crawler-dot-dev/api-sdk-java/commit/1067a88b19676ef843f5991077b57ed4140e6450))
