LuceneForAndroid
================================================

这个项目的主要目的是在将[Lucene5.5.0](http://archive.apache.org/dist/lucene/java/5.5.0/)这个版本移植到Android平台使用。

具体开发过程以及使用参见[LuceneForAndroid](https://gwyve.github.io/project/2016/12/19/LuceneForAndroid.html)


Quick Start
-----------

To build the JARs, use the commands:

```bash
cd lucene
ant -Dmobilejars=../build/<destination> clean mobile-build-modules-without-test
```

Where `<destination>` is a directory of your choice. The prefix `../build/`
is a trick to gather JARs to a unified folder under `lucene/build/`

Currently, the original Lucene tests don't run with this fork. Many `ant`
tasks are also potentially broken.

相关
-----------
主要参考[mobilelucene](https://github.com/lukhnos/mobilelucene)

特别感谢[Lukhnos Liu](https://github.com/lukhnos/)