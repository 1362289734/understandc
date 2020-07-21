## class 的访问权限修饰
public 能够被其他包下的类使用（声明变量，作为方法的参数或者返回值的数据类型）

不写，不能够被其他包路径下的类使用

## 判断两个类是否是相同包路径
通过类文件中的package，如果package相同则是相同包路径。


## 全限定类名
使用包路径分割最后加上类名字  club.banyuan.animal.Elephant


## 类路径
运行java程序的时候需要指定类路径，以便让jvm找到类。jvm会从类路径出发寻找指定路径下的类。如果类是定义在包路径下，则从类路径触发沿着包路径的文件夹依次向下找到这个类



## 类的定义
定义类的字段和方法，可以使用访问权限修饰符修饰private或public，public的字段或方法可以被任意的类使用

private的字段和方法仅限于当前类中才能使用

如果没有访问修饰符，则只能被同包下的类使用