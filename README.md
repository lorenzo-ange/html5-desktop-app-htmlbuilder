# HTML5 Desktop App with HTMLBuilder
This is an alternative version of the [HTML5 Desktop App](https://github.com/lorenzo-ange/html5-desktop-app) that takes great advantage of [HTMLBuilder](https://github.com/lorenzo-ange/htmlbuilder) Kotlin library to generate typesafe HTML.

![App screenshot](screenshots/screenshot-1.png?raw=true "App screenshot")

## Usage
Download a jar file from this repo [Github Releases](https://github.com/lorenzo-ange/html5-desktop-app-htmlbuilder/releases).

Start the app: (Java 8 required)
```bash
java -jar html5-desktop-app-htmlbuilder-0.1-all.jar
```

## Build from source
Download the repo:
```bash
git clone https://github.com/lorenzo-ange/html5-desktop-app-htmlbuilder
cd html5-desktop-app-htmlbuilder
```

Run the app:
```bash
./gradlew run
```

Package a redistributable fat jar:
 ```bash
 ./gradlew shadowJar
 ```
 You can find the jar file at `$APP_DIR/build/libs/html5-desktop-app-htmlbuilder-0.1-all.jar`