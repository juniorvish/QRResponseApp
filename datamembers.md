the app is: QRResponseApp

the files we have decided to generate are: MainActivity.kt, ViewModel.kt, Repository.kt, ApiService.kt, AppModule.kt, build.gradle, README.md, index.html (if web-app), styles.css (if web-app)

Shared dependencies:

1. Exported variables:
   - BASE_URL: "https://qrate.live/api"

2. Data schemas:
   - RequestBody: { "url": String }
   - ResponseBody: { "resp": String }

3. ID names of DOM elements (if web-app):
   - input_url
   - submit_button
   - response_text

4. Message names:
   - None

5. Function names:
   - makePostRequest
   - displayResponse
   - onSubmitButtonClick