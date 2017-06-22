# Food Recognition from images using Calorie Mama AI API

## What is Calorie Mama API?

*Calorie Mama uses machine learning to identify over one hundred thousand foods, drinks, and packaged goods. It covers many local and global foods.*

Find out more here at [http://www.caloriemama.ai](http://www.caloriemama.ai)

## Running the example

You need an access token to use our Calorie Mama API. Obtain one by creating a free developer account at [https://developers.caloriemama.ai](https://developers.caloriemama.ai)

Clone the project from GitHub

```
git clone https://github.com/azumio/see_food_recognition_with_calorie_mama.git
```

Now import project to Android Studio and create a file under resources: `res/values/secrets.xml`
```xml
<resources>
    <string name="caloriemama_token">YOUR TOKEN HERE</string>
</resources>
```

You can run the app. 

If you'd like to use Android Emulator and a WebCam read the next section.

### End Result

![end result](https://storage.googleapis.com/rendulic_public_images/food_recognition_example.png "End Result")

## Setup Android Studio to use a WebCam

1. Tools -> Android -> AVD Manager
2. Create AVD if it doesn't exist or edit existing
3. Show advanced settings
4. In Camera section select from dropdown Webcam0
5. Restart Emulator if needed

