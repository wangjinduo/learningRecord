## Linux部署.jar项目
#### 上传项目到服务器
在这我以我的项目为例，首先我们先cd到/data/app/目录下，创建一个文件夹（merchant-garbage），命令如下：
`mkdir merchant-garbage`
然后把我们的项目使用rz命令，上传到这个文件夹下面，但让你耶可以使用其他的上传工具，只要能把这个项目jar包上传上来就行。
#### 编写启动脚本
我们先来看一下启动脚本：
```shell
#!/bin/bash
logPath="log"
if [ ! -d "$logPath" ]; then
  mkdir "$logPath"
fi
nohup java -jar -Xms512m -Xmx1024m  beicai-garbage.jar --spring.profiles.active=prod >/dev/null 2>log/error.out &
echo $! > beicai-garbage.pid
```
大致的意思就是，运行这个脚本以后，先判断是否存在log这个文件夹，如果不存在就创建它，然后使用nohup启动jar包，同时设置初始堆大小为512m和最大堆大小1024m，并且指定使用prod配置文件加载，最后就是将错误信息输出到log/error.out文件中，&就是后台运行的意思。而最后一句话的意思是，将启动后的java进程Id存储到这个文件中，为什么存储到这个文件中呢？我们来看退出脚本。
#### 编写退出脚本
来看一下脚本：
```shell
#!/bin/sh
PID=$(cat beicai-garbage.pid)
kill -9 $PID
```
看到这个地方是不是已经恍然大悟了？是的，其实刚才那个beicai-garbage.pid就可以理解为用来存储java进程Id的，我们来分析一下这个脚本的内容，首先通过$(cat ***.pid)查找到对应的进程Id，然后通过kill命令，杀掉进程。
#### 启动项目
最后我们运行命令来启动项目：
`sh start.sh`
这样就可以了！！！
> 服务器层面的知识，本人也是小白，如有错误，请大佬细心指出，感谢🙏。