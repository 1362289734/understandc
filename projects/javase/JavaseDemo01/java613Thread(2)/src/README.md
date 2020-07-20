```java
/**
###   Lock 锁  和 synchronized  对比 
###   1. synchronized内置java关键字在jvm层,lock是个java类 是 jdk层的
###   2. synchronized无法判断是否获取锁的状态,lock可以判断是否获取锁
###   3. synchronized会自动释放锁,lock必须手动释放锁(unlock()在finally释放) 否则会造成死锁
###   4. 使用synchronized的两个线程A和B 如果线程A 获得了锁,那么B一定在等待中.如果线程A阻塞了,则线程B
###    会一直等待下去,lock不一定会等待，如果尝试回去不到锁,线程不会等待,直接结束
###   5.synchronized的锁可重入,不可中断,而lock锁可重入，可中断
###   6.synchronized适合少量的代码同步,Lock比较适合大量的同步代码的问题 
*/
```