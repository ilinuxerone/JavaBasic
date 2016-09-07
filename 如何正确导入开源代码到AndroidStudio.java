/*如何正确导入下载的开源项目？

我们经常会在 GitHub 发现一些优秀的开源项目，然后想要下载学习，然而第一步一般都是把源码导入到 AS 里，然后运行起来看下效果，
但是经常会运行失败，这里我来给大家说下导入开源项目的正确姿势：

下载一个Demo，先打开每个 module下的 gradle 文件，
即 app 目录下的 build.gradle 以及各个 library 下的 build.gradle ,
首先查看 compileSdkVersion 和 buildToolsVersion，
因为有些时候你本地的版本和下载的版本不一致，那么就会导致失败。

然后就是检查 gradle-wrapper ，
Google 有些时候要求不同的 AS 支持不同的 gradle 版本。
比如 AS 1.0 的时候要求必须使用 gradle 1.x 的版本，等到 AS 2.0 的时候，Google 不支持 gradle1.x 的版本，
这个时候你必须手动更新下 android gradle plugin 的版本，然后重新同步下。

检查以上两个地方基本就可以导入并运行了，
如果还有其他问题，那可能就是环境或者项目本身的问题了。
*/
