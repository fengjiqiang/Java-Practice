自定义异常

需求描述：

自定义一个异常类NoThisSoundException和Player类，在Player类的play()方法中使用自定义异常，要求如下：

1.NoThisSoundException继承自Exception类，类中有一个无参和一个接收一个string类型参数的构造方法，构造方法中都是用super关键字调用父类的构造方法。

2.Player类中定义一个play(int index)方法，方法接收一个int类型的参数，表示播放歌曲的索引，当index>10时，play()方法用throw关键字抛出
NoThisSoundException异常，创建一场对象时，调用的有参构造方法，传入“您播放的歌曲不存在”。

3.在测试类中创建Player对象，并调用play()方法测试自定义的NoThisSoundException异常，使用try...catch语句捕获异常，调用NoThisSoundException的
getMessage()方法打印异常提示信息。
