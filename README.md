# Android Kits Base

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/dev.supasintatiyanupanwong.libraries.android.kits.base/base-core/badge.svg)](https://search.maven.org/search?q=g:dev.supasintatiyanupanwong.libraries.android.kits.base)
[![javadoc](https://javadoc.io/badge2/dev.supasintatiyanupanwong.libraries.android.kits.base/base-core/javadoc.svg)](https://javadoc.io/doc/dev.supasintatiyanupanwong.libraries.android.kits.base/base-core)
[![license](https://img.shields.io/github/license/SupasinTatiyanupanwong/android-kits-base.svg)](https://www.apache.org/licenses/LICENSE-2.0)

Base APIs for libraries in Android Kits collections

## Architecture

The library consists of 3 artifacts; `base-core`, `base-google`, and `base-huawei`.

`base-core` artifact provides an abstraction interface to interact with Base APIs.

`base-google` artifact provides the Google-specific implementation to Base Kit.

`base-huawei` artifact provides the Huawei-specific implementation to Base Kit.

## Declaring dependencies

Add the dependencies for the artifacts you need in the ```build.gradle``` file for your app or module:

```groovy
dependencies {
    // To be used only if the vendor-specific implementation is not need for Base APIs
    implementation 'dev.supasintatiyanupanwong.libraries.android.kits.base:base-core:1.0.0'

    // To use the Google-specific implementation for Base APIs
    implementation 'dev.supasintatiyanupanwong.libraries.android.kits.base:base-google:1.0.0'

    // To use the Huawei-specific implementation for Base APIs
    implementation 'dev.supasintatiyanupanwong.libraries.android.kits.base:base-huawei:1.0.0'
}
```

It should be noted, however, that there is usually no need to explicitly declare dependencies for this.

For more information about dependencies, see [Add build dependencies](https://developer.android.com/studio/build/dependencies).

## Feedback

Your feedback helps make Android Kits Base better. Let us know if you discover new issues or have ideas for improving this library.
Please take a look at the [existing issues](https://github.com/SupasinTatiyanupanwong/android-kits-base/issues) in this library before you create a new one.

## License

```
Copyright (C) 2020 Supasin Tatiyanupanwong

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
