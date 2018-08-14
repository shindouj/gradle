## New and noteworthy

Here are the new features introduced in this Gradle release.

<!--
IMPORTANT: if this is a patch release, ensure that a prominent link is included in the foreword to all releases of the same minor stream.
Add-->

<!--
### Example new and noteworthy
-->

### Incremental build uses less memory

Memory usage for up-to-date checking has been improved.
For the gradle/gradle build, heap usage dropped by 60 MB to 450 MB, that is a 12% reduction.

## Promoted features

Promoted features are features that were incubating in previous versions of Gradle but are now supported and subject to backwards compatibility.
See the User guide section on the “[Feature Lifecycle](userguide/feature_lifecycle.html)” for more information.

The following are the features that have been promoted in this Gradle release.

<!--
### Example promoted
-->

## Fixed issues

## Deprecations

Features that have become superseded or irrelevant due to the natural evolution of Gradle become *deprecated*, and scheduled to be removed
in the next major Gradle version (Gradle 5.0). See the User guide section on the “[Feature Lifecycle](userguide/feature_lifecycle.html)” for more information.

The following are the newly deprecated items in this Gradle release. If you have concerns about a deprecation, please raise it via the [Gradle Forums](https://discuss.gradle.org).

<!--
### Example deprecation
-->

## Potential breaking changes

### Changes to previously deprecated APIs

 - The `org.gradle.plugins.signing.Signature` methods `getToSignArtifact()` and `setFile(File)` are removed. 
 - Removed `DirectoryBuildCache.targetSizeInMB`.
 - Removed the methods `dependsOnTaskDidWork` and `deleteAllActions` from `Task`.
 - Removed the methods `execute`, `getExecuter`, `setExecuter`, `getValidators` and `addValidator` from `TaskInternal`.
 - Removed the methods `stopExecutionIfEmpty` and `add` from `FileCollection`.
 - Removed the ability to cast (Groovy `as`) `FileCollection` to `File[]` and `File`.
 - Removed the class `SimpleFileCollection`.
 - Removed the method `getBuildDependencies` from `AbstractFileCollection`. 

## External contributions

We would like to thank the following community members for making contributions to this release of Gradle.

<!--
 - [Some person](https://github.com/some-person) - fixed some issue (gradle/gradle#1234)
-->

We love getting contributions from the Gradle community. For information on contributing, please see [gradle.org/contribute](https://gradle.org/contribute).

- [Jonathan Leitschuh](https://github.com/JLLeitschuh) - Switch Jacoco plugin to use configuration avoidance APIs (gradle/gradle#6245)
- [Jonathan Leitschuh](https://github.com/JLLeitschuh) - Switch build-dashboard plugin to use configuration avoidance APIs (gradle/gradle#6247)

## Known issues

Known issues are problems that were discovered post release that are directly related to changes made in this release.
