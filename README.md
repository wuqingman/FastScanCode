
# FastScanCode

Very fast scan code project(support-qrcode-and-barcode)


The effect：

<img src="https://github.com/fanrunqi/FastScanCode/blob/master/Screenshot/Screenshot_20171108-165435.png" width = "360" height = "640"  />
<img src="https://github.com/fanrunqi/FastScanCode/blob/master/Screenshot/Screenshot_20171108-165526.png" width = "360" height = "640"  />

# Usage

## dependency

> Gradle
```
compile 'cn.fanrunqi:avatarimageviewlibrary:1.0.1'
```
> Maven 
```
<dependency>
  <groupId>cn.fanrunqi</groupId>
  <artifactId>avatarimageviewlibrary</artifactId>
  <version>1.0.1</version>
  <type>pom</type>
</dependency>
```

## layout

```
<cn.fanrunqi.avatarimageviewlibrary.AvatarImageView
            android:layout_width="100dp"
            android:layout_height="100dp"
            android:background="@drawable/oval_shape"
            <!--android:background="@drawable/bg_a"-->
            android:src="@drawable/c"
            />
```

> "android:background" attribute is Use to define the shape of the image.

> you can use the shape.xml

```
<?xml version="1.0" encoding="utf-8"?>
<shape
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:shape="oval"
    android:useLevel="false">
    <solid android:color="#fff"/>
    <size android:width="100dp"
          android:height="100dp"/>

</shape>
```

> or ,use a picture like [xxx.png](https://github.com/fanrunqi/AvatarImageView/blob/master/app/src/main/res/drawable/bg_a.png)

> "android:src" attribute is Use to define the picture you want to show.

# License
> Copyright 2016 fanrunqi

> Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

  >  http://www.apache.org/licenses/LICENSE-2.0

> Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
