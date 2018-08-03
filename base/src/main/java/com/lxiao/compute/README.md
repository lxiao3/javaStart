### sort相关

#### 1、comparator 与 comparable的区别，作用，使用方法

##### comparable
  实现comparable接口的类可以自己和自己比较，也可以依赖`compaeTo` 方法的实现和另一个实现了`comparable`接口的类对象进行比较。

  + 对象本身是比较的一个参数，compareTo方法只有一个参数作为另一个比较对象
  
  比较结果判断，一般负数为前者小于后者 ，0 则相等，正数则前者大于后者，如:
```java
a.compare(b) < 0 ; // a小于b
a.compare(b) = 0 ; // a等于b
a.compare(b) > 0 ; // a大于b 
```


