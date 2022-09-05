
<h1 align="center">ProProfs Chat SDK for Android</h1>

## Step 1. Integration

#### Using Gradle

The recommended way to install the library for Android is with build system like Gradle.

Simply add the `com.github.ProProfs-Workflow:chat_android_sdk:Tag` dependency to your app's `build.gradle` file:

```javascript
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
	dependencies {
	        implementation 'com.github.ProProfs-Workflow:chat_android_sdk:Tag'
	}
```
## Step 2. Code Integration
#### Initialize the Client
In order to be able to use  SDK you need to add chat bubble inside a layout
Eg.
```kotlin
class MainActivity : AppCompatActivity() {
        private var siteId: String = "<your-site-id>"
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val layout = findViewById<LinearLayout>(R.id.layout_id)
            val bubble = ProProfsChat(this, siteId).init()
                layout.addView(bubble)
            }
        }        
```

