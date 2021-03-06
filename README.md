# DiabeTracker (Work in Progress)
DiabeTracker is an android app created for people with diabetics to facilitate in management of diabetes and ensure a healthy balanced life.

## Features
- Logging of carbs intake, blood glucose level and medication / insulin
- Data analytics and visual reporting
- Easy information sharing with consultant / doctor
- Smart calculator to measure insulin dose or carbs intake when target glucose level is not achieved

## Preview
<img src="images/navigation_menu.png" alt="Dashboard" width="250" style="float: left; margin-right: 10px" /> <img src="images/dashboard.png" alt="Dashboard" width="250" style="float: left; margin-right: 10px" /> <img src="images/logbook.png" alt="Dashboard" width="250" style="float: left; margin-right: 10px" />

## Architecture
The app uses Clean Architecture based on MVVM and Repository patterns. It follows architecture principles recommended by Google in their [Guide to app architecture](https://developer.android.com/jetpack/docs/guide).
![App Architecture](images/arch.png)

## Built With
- [Kotlin](https://developer.android.com/kotlin) - Android Development
- [Android Architecture Components](https://developer.android.com/topic/libraries/architecture/) - Room, LiveData, Lifecycles, ViewModel and Navigation
- [RxJava](https://github.com/ReactiveX/RxJava), [RxAndroid](https://github.com/ReactiveX/rxandroid) - Reactive Extensions
- [Dagger](https://github.com/google/dagger) - Dependency Injection
- [Material Design](https://material.io/design/) - App Design, Theming and Styling
- [ThreeTenAbp](https://github.com/JakeWharton/ThreeTenABP) - Date Time Utils
- [Clean Architecture](https://blog.cleancoder.com/uncle-bob/2012/08/13/the-clean-architecture.html) - App Architecture
- [Ramotion Fluid Slider](https://github.com/Ramotion/fluid-slider), [ShapeOfView](https://github.com/florent37/ShapeOfView), [PageIndicatorView](https://github.com/romandanylyk/PageIndicatorView) - Custom UI Components
- [MpAndroidChart](https://github.com/PhilJay/MPAndroidChart) - Graphs and Charts
- [Espresso](https://developer.android.com/training/testing/espresso) - UI Testing
- [Mockito](https://github.com/mockito/mockito), [JUnit](https://junit.org/) - Unit Testing

## Getting Started
The app is written entirely in Kotlin and uses the Gradle build system.

To build the app, use the `gradlew` build command or use "Import Project" in Android Studio. A canary or stable version >= 3.4 of Android Studio is required and may be downloaded [here](https://developer.android.com/studio/).

## License
```
Copyright 2019 Arslan Shoukat

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
