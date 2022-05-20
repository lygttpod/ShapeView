# ShapeView

[![](https://jitpack.io/v/lygttpod/ShapeView.svg)](https://jitpack.io/#lygttpod/ShapeView)
[![API](https://img.shields.io/badge/API-14%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=14)
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-ShapeView-green.svg?style=true)](https://github.com/lygttpod)
[![](https://img.shields.io/github/stars/lygttpod/ShapeView.svg)](https://github.com/lygttpod/ShapeView/stargazers)
[![](https://img.shields.io/github/forks/lygttpod/ShapeView.svg)](https://github.com/lygttpod/ShapeView/network)


## 一、 [**Demo下载地址**](https://www.pgyer.com/fpCD)


## 二、如何使用
### 1、Android Studio导入方法，添加Gradle依赖

先在项目根目录的 build.gradle 的 repositories 添加:
```
     allprojects {
         repositories {
            ...
            maven { url "https://jitpack.io" }
        }
    }
```
然后在dependencies添加:
```
        dependencies {
            implementation 'com.github.lygttpod:ShapeView:VERSION_CODE'
        }
```
> ## 温馨提示：你的项目需要支持kotlin

> ### 注意：VERSION_CODE为[![](https://jitpack.io/v/lygttpod/ShapeView.svg)](https://jitpack.io/#lygttpod/ShapeView)后面的数字，即最新的[release](https://github.com/lygttpod/ShapeView/releases)版本号

### 2、项目中如何使用
#### 2.1、布局中如何使用（示例中只列出部分属性，开发者可根据具体需求使用其他属性）
```
            
        <com.lygttpod.shape.view.ShapeTextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="10dp"
            android:gravity="center"
            android:text="ShapeTextView"
            shape:shapeCornersRadius="20dp"
            shape:shapeSolidColor="@color/colorAccent"
            shape:shapeStrokeColor="@color/colorPrimary"
            shape:shapeStrokeDashGap="10dp"
            shape:shapeStrokeDashWidth="10dp"
            shape:shapeStrokeWidth="2dp" />

```
#### 2.2、代码中如何使用
```
                
   shapeTextView.setShapeType(ShapeType.RECTANGLE)
                    .setShapeSolidColor(getResources().getColor(R.color.red_btn))
                    .setShapeStrokeColor(getResources().getColor(R.color.gray))
                    .setShapeStrokeWidth(2)
                    .setShapeCornersRadius(30f)
                    .into(shapeTextView)
```


#### 2.3、属性说明(以下属性全部可以通过xml文件配置和代码进行设置)

属性名 | 字段 | 描述 | 默认值
----|------|----| ----
shapeType | enum  | rectangle、oval、line、ring | rectangle
shapeSolidColor | color  | 填充色 | 无
shapeSelectorPressedColor | color  | 按下时候的颜色 | 无
shapeSelectorDisableColor | color  | 不可用显示的颜色 | 无
shapeSelectorNormalColor | color  | 正常显示的颜色 | 无
shapeCornersRadius | dimension  | 四个角的圆角半径 | 0dp
shapeCornersTopLeftRadius | dimension  | 左上角的圆角半径 | 0dp
shapeCornersTopRightRadius | dimension  | 右上角的圆角半径 | 0dp
shapeCornersBottomLeftRadius | dimension  | 左下角的圆角半径 | 0dp
shapeCornersBottomRightRadius | dimension  | 右下角的圆角半径 | 0dp
shapeStrokeWidth | dimension  | 边框宽度 | 0dp
shapeStrokeDashWidth | dimension  | 虚线宽度 | 0dp
shapeStrokeDashGap | dimension  | 虚线间隙宽度 | 0dp
shapeStrokeColor | color  | 边框颜色 | 无
shapeGradientAngle | enum  | left_right、bl_tr、bottom_top、br_tl、right_left、tr_bl、top_bottom、tl_br | left_right
shapeGradientStartColor | color  | 渐变开始颜色 | 无
shapeGradientCenterColor | color  | 渐变中间颜色 | 无
shapeGradientEndColor | color  | 渐变结束颜色 | 无
shapeUseSelector | bool  | 是否使用selector | false
shapeGradientType | enum  | linear | false

# 三、[更新日志](https://github.com/lygttpod/ShapeView/releases)

# 四、意见反馈

如果遇到问题或者好的建议，请反馈到：[issue](https://github.com/lygttpod/ShapeView/issues)、[lygttpod@163.com](mailto:lygttpod@163.com) 或者[lygttpod@gmail.com](mailto:lygttpod@gmail.com)

如果觉得对你有用的话，点一下右上的星星赞一下吧!

## 代码是最好的老师，更多详细用法请查看 [demo](https://github.com/lygttpod/ShapeView/tree/master/app):feet:


# License
```
         Copyright 2022 Allen

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
