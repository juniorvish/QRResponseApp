# QRResponseApp

An Android app built in Kotlin, Jetpack Compose with MVVM architecture and dependency injection done using Hilt. The app has an input box which takes in a URL and then on clicking the submit button will make a POST request at the endpoint `/generate-response` of an API whose base URL is `https://qrate.live/api`. It will return a JSON `{"resp": }` and this response is then shown below the input box.

## How to run the project

1. Clone the repository:

```
git clone https://github.com/juniorvish/QRResponseApp.git
```

2. Open the project in Android Studio.

3. Sync the project with Gradle files.

4. Run the app on an emulator or a connected Android device.

## Project structure

- `MainActivity.kt`: The main activity of the app.
- `ui/QRResponseScreen.kt`: The UI screen containing the input box, submit button, and response display.
- `viewmodel/QRResponseViewModel.kt`: The ViewModel responsible for handling the app's logic.
- `repository/QRResponseRepository.kt`: The Repository responsible for making API calls.
- `api/QRResponseApi.kt`: The API interface for making POST requests.
- `di/AppModule.kt`: The AppModule for dependency injection.
- `di/NetworkModule.kt`: The NetworkModule for providing network-related dependencies.
- `di/RepositoryModule.kt`: The RepositoryModule for providing repository-related dependencies.
- `di/ViewModelModule.kt`: The ViewModelModule for providing ViewModel-related dependencies.
- `app/src/main/res/layout/activity_main.xml`: The layout file for the main activity.
- `app/build.gradle`: The app-level build.gradle file.
- `build.gradle`: The project-level build.gradle file.