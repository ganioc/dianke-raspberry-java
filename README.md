# dianke-raspberry-java

<<<<<<< HEAD
### Run as a jar file on Raspberry Pi 4
=======
### Run as a jar file
Failed. Exception in thread "main" java.lang.NoClassDefFoundError: org/springframework/context/ApplicationContext

>>>>>>> master
```shell
/usr/bin/java -Dfile.encoding=UTF-8 -jar  \
/home/pi/Documents/project/dianke-raspberry-java/out/artifacts/packjava_jar/packjava.jar

```
### Use gradlew run

```shell
./gradlew run --args="in"  // 入车
./gradlew run --args="checkIn" // 查看入车总量
./gradlew run --args="out" // 出车
./gradlew run --args="pay" // 支付
```
### Test Env
- Raspberry Pi 4
- OpenJDK 11.0
