
# FastScanCode

Very fast scan code project(support-qrcode-and-barcode)

Can well support the following situations,barcodes folded ,the light is dark ,Distance is far and there still have a very impressive speed.


The effect：

<img src="https://github.com/fanrunqi/FastScanCode/blob/master/Screenshot/Screenshot_20171108-165435.png" width = "360" height = "640"  />
<img src="https://github.com/fanrunqi/FastScanCode/blob/master/Screenshot/Screenshot_20171108-165526.png" width = "360" height = "640"  />

# Usage

## dependency

add [leoscanlibrary.aar](https://github.com/fanrunqi/FastScanCode/tree/master/app/libs) in your library folder.

add below Configuration in your build.gradle(Module:app)

```
repositories {
    flatDir {
        dirs 'libs'
    }
}
dependencies {
    ......
    compile(name: 'leoscanlibrary', ext: 'aar')
}
```
## in your activity 

```
public class xxxActivity extends CaptureActivity {


......
@Override
    public void handleScanDecode(String result) {
        Toast.makeText(this,result, Toast.LENGTH_SHORT).show();
    }

}
```

## activity layout file

```
......

<include
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        layout="@layout/capture" />
        
........
```

> you can download this project demo to click detail information.


# License
> Copyright 2017 fanrunqi

> Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

  >  http://www.apache.org/licenses/LICENSE-2.0

> Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
