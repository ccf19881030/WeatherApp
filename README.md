### 基于MVVM框架的高德天气APP：
-------

### 功能点实现说明：
- [高德天气API：](https://lbs.amap.com/api/webservice/guide/api/weatherinfo/)
- Get&Post方式可以正常返回查询高德天气数据并UI显示；
- 解析存储本地存储高德adcode和城市信息对照表，用于本地天气动态查询api调用；
- [RecyclerView](https://www.jianshu.com/p/4f9591291365)：Android推荐控件，优于ListView，处理不同类型的ItemView封装使用；
- [CardView](https://blog.csdn.net/u013651026/article/details/79000205)：Android推荐控件，优于List item，实现卡片式设计；
- 自定义实现公共控件CommonUI，用于控件复用；


-------
### MVVM框架和组件实现：
框架说明：借助[Android架构组件(Android Architecture Components)：](https://github.com/tangmin1010/appcomponent)可实现MVVM应用框架。 
- [Lifecycle components](https://developer.android.google.cn/topic/libraries/architecture/lifecycle)： 生命周期管理，该组件是其它组件的基础，可由于跟踪UI的（Activity和Fragment）的生命周期
- [ViewModels](https://developer.android.google.cn/topic/libraries/architecture/viewmodel)： 一种可以被观察的以及可以感知生命周期的数据容器。
- [LiveData](https://developer.android.google.cn/topic/libraries/architecture/livedata) ：它是UI，例如Activity、Fragment,与数据之间的桥梁；可以在其内部处理数据业务逻辑,例如从网络层或者数据持久层获取数据、更新数据等。
- [Room](https://developer.android.google.cn/topic/libraries/architecture/room)：一个简单好用的对象映射层；其对SqliteDatabase进行了封装，简化开发者对于数据持久层的开发工作量
- [WorkManager](https://developer.android.google.cn/topic/libraries/architecture/workmanager/) ：可以轻松地指定可延迟的异步任务以及它们应该在何时运行。
- [Data-binding](https://developer.android.google.cn/topic/libraries/data-binding//) ：使用xml声明格式(而不是编程方式)将布局中的UI组件绑定到应用程序中的数据源。
- [Paging](https://developer.android.google.cn/topic/libraries/architecture/paging/)：分页库使您能够更容易地在应用程序的RecyclerView中逐步、优雅地加载数据。
- [Navigation](https://developer.android.google.cn/topic/libraries/architecture/navigation/)：导航是应用程序设计的关键部分。通过导航，您可以设计交互，允许用户在应用程序的不同内容区域之间来回移动。

![Android 应用程序的基础架构](https://developer.android.google.cn/topic/libraries/architecture/images/final-architecture.png)

-------
### 网络应用框架和组件实现：
- [Retrofit 2.0 使用教程](https://blog.csdn.net/carson_ho/article/details/73732076)：热门的Android网络请求库
- [OkHttp3 使用教程](https://blog.csdn.net/xx326664162/article/details/77714126)：Http第三方库，Retrofit底层通过OkHttp实现网络请求 
- [RxJava Android使用教程](https://gank.io/post/560e15be2dca930e00da1083)：异步网络请求任务处理
- [xutils3 使用教程](https://blog.csdn.net/carson_ho/article/details/73732076)：文件下载&断点续传管理
- [Glide 使用教程](https://www.jianshu.com/p/7ce7b02988a4)：Android推荐的热门图片加载库 备注：三大主流库ImageLoader,Picasso,Glide
- [AdMob](https://developers.google.com/admob/android/quick-start?hl=zh-CN#import_the_mobile_ads_sdk)：实现Google广告载入
- [Firebase](https://developers.google.com/firebase/docs/android/setup?hl=zh-CN)：移动应用后台服务端管理

-------
### 扩展功能实现：
- 异步任务（不同场景）的解决方案选择：
- 应用常驻&应用保活：
- 应用热更新&插件式更新：


-------
### Android AdMob document：
- [AdMob（Google移动广告）SDK指南](https://developers.google.com/admob/android/quick-start?hl=zh-CN#import_the_mobile_ads_sdk)
- [Banner(横幅广告)](https://developers.google.com/admob/android/banner?hl=zh-CN)
- [Interstitial（插页广告）](https://developers.google.com/admob/android/interstitial?hl=zh-CN)
- [Native（原生广告）](https://developers.google.com/admob/android/native-unified?hl=zh-CN)
- [Rewarded Video（应用内购买广告）](https://developers.google.com/admob/android/rewarded-video?hl=zh-CN)


-------

### Android Firebase document：
- [Firebase 集成指南](https://developers.google.com/firebase/docs/android/setup?hl=zh-CN)
- [Analytics(分析)](https://firebase.google.com/docs/analytics/?hl=zh-CN)
- [Crash Report(报错上报)](https://firebase.google.com/docs/crashlytics/?hl=zh-CN)
- [Remote Config(远程配置)](https://firebase.google.com/docs/cloud-messaging/?hl=zh-CN)
- [Cloud Message(云消息)](https://firebase.google.com/docs/remote-config/?hl=zh-CN)
- [Auth(身份认证)](https://firebase.google.com/docs/auth/?hl=zh-CN)


-------
### Screenshots：
![](https://github.com/caobaokang419/WeatherApp/blob/master/screenshots/admob_banner_screenshot.bmp)

-------
### License
部分业务机制借鉴网络资源，不能用于商业用途，转载请注明出处，谢谢！ 
