# JavaBase
Java基础相关的demo

1. ⚫ 熟悉JAVA，对面向对象思想有一定的理解，了解面向切面编程及实现方式； 
    * [抽象](抽象)、[封装]()、[继承]()、[多态]()
    * [对象头]()。[类型指针]()
    * [Java关键字]()
        1. interface. 接口
        2. extends 继承
        3. Throw/throws。异常处理
        4. transient。序列化时忽视
        5. Implement  实现
        6. instanceof 
    * java Object 类  hashcode()方法、equals()方法  
    * [Java虚拟机](https://www.cnblogs.com/czwbig/p/11127124.html): 
    * [线程]()
        * 五种状态
            * New  创建后尚未启动执行
            * Runnable  可运行状态 包括正在执行或是就绪状态等待时间片轮转
            * Waiting 不会被分配时间片时间，需要其他线程显示的唤醒
                * Thread.join();无参
                * Object.wait();无参
                * LockedSupport.park();
            * Timed waiting 设置有超时时间，会自动唤醒
                * Thread.sleep();
                * Thread.join(); 设置超时时间
                * Object.wait();设置超时时间
                * LockedSupport.parkNanos()方法;
                * LockedSupport.parkUntil()方法;
            * Blocked 表示线程被阻塞，阻塞和等待状态下都不会获得时间片
                * synchronized io阻塞
                * 获取到锁或io完成。恢复运行
            * Terminated 终止运行
    * [java虚拟机概述]( https://www.bilibili.com/video/BV1rE411o7b8?p=4  )
        * 类加载器子系统： 
            * 
        * 运行时数据区：方法区 堆  本地方法栈 虚拟机栈 程序计数器 
            * 方法区 （Hotspot使用永久代实现方法区）
                * 存放被虚拟机加载的类信息
                * 常量
                * 静态变量
                * 即时编译器编译后的代码
                    * spring 使用ioc或aop创建bean时，或使用cglib、反射的形式动态生成class信息
                    * jdk6时 string 对象存储在方法区、7以后移至堆中
            * 堆 oom时打印堆栈信息。便于内存分析
                * 本地线程缓冲 TLAB 每个线程拥有独立的内存空间
                * 对象头
                    * 运行时数据
                    * 
            * 本地方法栈
                * 
            * 虚拟机栈
                * 局部变量 对象的引用
                * 操作数栈 
                * 动态链接
                * 方法出口
            * 程序计数器
        * []执行引擎：JIT即时编译器/GC 垃圾回收器
            * []垃圾回收算法：根搜索算法判定是否存活 
                * 根搜索算法：两次标记，第一次判断是否执行finalize方法
                * 引用计数算法
                * 对象引用：1.2之后对引用类型进行划分，分为强引用、软引用、弱引用、虚引用
                    * StringReference 强引用：StringBuilder sb = new StringBuilder();
                        * sb为强饮用，存储对象的引用
                        * 不会被垃圾回收清理
                        * 
                    * SoftReference 软引用:
                        * 只要内存够用，就不会被回收
                    * WeakReference 弱引用：
                        * 正常垃圾回收
                    * PhantomReference 虚引用：
                        * 
                * 堆垃圾回收
                    * 
                * 方法区垃圾回收
                    * 常量回收
                    * 类回收
                        1. 满足条件
                            1. 该类的所有实例已经被回收
                            2. 加载该类的ClassLoader已经被回收
                            3. 该类对应的java.lang.Class对象没有在任何地方被引用，无法在任何地方通过反射访问该类的方法
                        2. 
                * []标记-清除算法（Mark-Sweep）
                    * 缺点：
                        1. 效率问题：老年代
                        2. 空间问题：标记清除后会产生大量不连续的内存碎片，导致以后在为大对象分配内存时无法找到足够大的连续内存空间，从而触发另一次垃圾回收
                * []复制算法 （Copy）将内存划分为大小相同的两块区域，每次只使用一块，当用满1块时执行垃圾回收，将存活对象复制到空的一部分，清理旧的区域。 多用于新生代
                * []标记-整理算法。多用于老年代
                * []分代收集算法
        * []本地方法库：

    * []算法
        * []排序算法
            * []冒泡排序
            * []插入排序
            * []选择排序
        * []查找算法
            * []二分查找
            * []顺序查找
        * []哈希：最高效，O(1),hash冲突，JDK1.8里边HashMap:链表+数组
        * []bfs&dfs ：图论里的遍历
        * []平衡树
        * []B+树
        * []B-Tree
        * []RTree
        * []红黑树
        * []二叉搜索树

    * 动态查找树的生命历程
        * 平衡二叉树    树节点存储的数据大小有限，在海量数据场景下二叉树查找退化成线性查找 ->降低树的高度
        * 平衡多路查找树  

    * []JAVA  数据结构:
        * []List：由于数据结构的不同
            1. ArrayList 随机查找元素效率高
                * 数组结构，扩容为当前大小1.5倍
                    * 数组申请连续的内存空间，创建时需初始化数组大小
            2. LinkedList 插入元素效率高
                1. 双向链表实现
                2. 每个节点保存当前节点的数据，前后指针
            3. Vector 
        * Set 独一无二 存储无序数据 值不能重复。对象相等需重写HashCode 和equals方法
            * HashSet。hash表 通过调用对象的hashcode方法获取hash值 ，特殊情况需要重写hashcode和equals方法
                * 底层实现
                    * hashmap
            * TreeSet。二叉树原理对新加入的对象按照指定的顺序排序，有序结构
                * 自定义类需实现comparable接口 覆写相应的compareto方法 小于等于大于。分别返回-1 0 +1
                * 底层实现
                    * Treemap
            * LinkedHashSet。hashset + linkedhashmap. 底层使用linkedhashmap保存数据
                * 
        * []Node:
            * []Tree: 树的删除、插入、遍历（前序遍历、中序遍历、后序遍历）
                * [x]二叉树
                    * 前序遍历 根左右
                        * 递归方式
                        * 非递归
                    * 中序遍历 左根右
                        * 递归方式
                        * 非递归
                    * 后序遍历 左右根。可将前序遍历方式。根右左 逆向输出
                        * 递归方式
                        * 非递归
                * []红黑树
                    * 左旋
                    * 右旋
                * []B树 多路平衡查找树
                * []B+树
            * 
        * []Hash:
        * []Array: 需要初始化大小，大小不可变  数据结构  内存连续
        * []queue 队列
            * Deque :双向队列
            * PriorityQueue优先级队列
        * []图形
                        
                        
        * []Map: 又称关联数组 map扩容 当initialCapacity设置为0时，初始大小为1 数据插入时需要扩容
            * [x]HashMap 1.8红黑树特性
                * 存储结构为数组+链表（红黑树）。Node<K,V>[] 
                    * 数组长度 达到64后 且 单个链表长度达到8时链表拓展为红黑树
                    * MIN_TREEIFY_CAPACITY、TREEIFY_THRESHOLD
                    * 初始化大小16
                    * 加载因子0.75f
                        * 
                * 定义过程：四种构造方法 初始化时指定容量
                * 初始化HashMap时，对输入的容量大小进行或运算，大小为2次幂，
            * []ConcurrentHashMap   
                * 不允许 key 或者value为null
                * 当key
            * HashTable
                * Key不允许为null
                * 线程安全

初始化：Map接口的put方法，HashMap的实现->初始化容量->putval()方法->判断是否为空->初始化大小

        * []String:
        * []StringBuilder:
            * 线程不安全
        * []StringBuffer:
            * 线程安全
    * 排序算法
        * 冒泡
        * 选择
        * 插入排序
    * 查找算法
        * 二分查找：有序排列
        * 
    * []JAVA 运算符
        * []
    * JAVA IO
        * 发展历史
            * Jdk 1.4之前是基于阻塞的io
            * 1.4发布后的Nio提供了selector多路复用的机制以及channel和buffer
            * 1.7的NIO升级提供了真正的异步api
            * MINA和Netty
        * 基本概念
            * 同步synchronous、异步asynchronous、阻塞blocking、非阻塞non-blocking
        * 用户空间（用户态）和内核空间（内核态）
            1. 服务器的网络驱动接收到消息，去内核上申请空间；并等待完整的数据包到达（有可能分组传送，没传完...），复制到内核空间；
            2. 数据从内核空间拷贝到用户空间
            3. 用户程序进行处理
        * 多路复用io 非阻塞io.   epoll 零拷贝。基于事件驱动
            * 特点
                1. 基于缓冲区的双向管道，Channel和Buffer
                2. IO多路复用器Selector
                3. 更为易用的API
            * 核心组件
                * channel
                    * 读：channel -> buffer
                    * 写：buffer -> channel
                    * Channel 类型
                        * FileChannel  到文件中读取数据
                        * DatagramChannel   可以读取并在通过UDP网络写入数据。
                        * SocketChannel  可以读取和通过TCP网络写入数据。
                        * ServerSocketChannel
                * buffer
                    * ByteBuffer
                    * CharBuffer
                    * DoubleBuffer
                    * FloatBuffer
                    * IntBuffer
                    * LongBuffer
                    * ShortBuffer
                * selecter
            * 直接缓冲区 
        * BIO  基于线程驱动
            * 
        * 非阻塞IO
            * 
 
    * Java锁
        * 锁的分类
            * 可重入锁 synchronized 和ReentrantLook
                * 针对线程
            * 可中断锁 ReentrantLook 显示锁
                * 可通过lockInterruptibly 方法中断显示锁
            * 读写锁
                * 数据库事务隔离性特点
            * 公平锁
                * 按照先后顺序获取
        * 乐观锁------读多写少 
            * 在写数据时先读取当前版本号然后再加锁操作 CAS 
            * ABA 错误
        * 悲观锁
            * Synchronized 独占式。可重入锁 非公平锁
                * 作用范围
                    * 作用于方法时，锁住的是对象的实例
                    * 作用于静态方法时，锁住的是class实例，全局锁，对所有调用该方法的线程生效
            * RetreenLock 默认使用非公平锁。可通过构造器设置使用公平锁
                * 先尝试乐观锁，获取不到转换为悲观锁
                * 公平锁会考虑同步队列中第一个线程是否为当前线程，是则返回true
                * 非公平锁不考虑队列
        * 自旋锁 如果持有锁的线程能在很短的时间内释放锁资源，呢么那些等待竞争锁的线程就不需要做内核态和用户态之间切换
            * 1.6引入适应性自旋锁 -XX:UseSpinning开启自旋锁 -XX:PreBlockSpin=10为自旋次数
            * 1.7之后自旋次数由jvm控制
        * 偏向锁
        * 
    * Java新特性
        * lambdas 表达式
        * 函数式接口 四大函数式接口
            * Consumer 《T》：消费型接口，有参无返回值
            * Supplier 《T》：供给型接口，无参有返回值
            * Function 《T,R》：:函数式接口，有参有返回值
            * Predicate《T》： 断言型接口，有参有返回值，返回值是boolean类型
        * 方法引用::和构造器调用
        * Stream API
        * 接口中的静态方法和默认方法
        * 新时间api
        * Hashmap 红黑树变形

异常：
设计模式：
内部类：
关键字：


1. []⚫ 熟悉TCP/IP。 UDP协议相关知识； 

    * []7层网络模型:
        1. 物理层
        2. 数据链路层
        3. 网络层
        4. 传输层
        5. 会话层
        6. 表示层
        7. 应用层

    * [x]TCP的三次握手和四次挥手：
        * 三次握手
        * 四次挥手
            * 客户端发送请求断开连接
            * 

    * []socket通讯：

    * [x]HTTP/HTTPS区别：
        * ssl

    * []长链接和短链接
        * 
            

* ⚫ 熟悉Linux常用命令，能够根据需要编写shell脚本； 
    * 
* ⚫ 熟练使用Tomcat、Nginx、WebLogic常用容器； 
    * Nginx:  增加修改机器时需要修改配置重启，不利于运维
        * []正向代理
        * []反向代理
    * Tomcat:

* ⚫ 熟悉Redis操作及适用场景；  
    * redis的5种基本数据类型：string list hash set zset 
    * 源码实现  底层数据结构    
    * redis常用命令: 
        * String 类型：长度最大为512m
            1. SET  value [EX seconds] [PX milliseconds] [NX 必须不存在|XX 必须存在]
                1. Set port 6379 EX 1 NX 设置一秒过期。不存在时设置成功
                2. Set host 127.0.0.1 PX 1000 NX
                3. Set 不加过期时间重新设置后 失效时间失效，
                4. SETEX/SETNX/PSETEX 为原子操作同一时间完成 redis锁 避免死锁。成功时返回OK
            2. Get 只能取字符串类型
            3. TTL/PTTL 获取失效时间
            4. del 删除
            5. mset key value [key value……]。原子性操作
            6. MSETNX KEY VALUE [KEY VALUE……] 只有所有键都不存在时才会设置成功 原子性操作。 成功返回1 不成功返回0
            7. mget key……
            8. Getset
            9. dbsize
            10. 
            11. exists
            12. expire
            13. INCR 为目标键值加1 如果不能转换为数字则报错。64位有符号数字.  001不能转换为数字
            14. Incrby key value 同上 value 为增量
            15. Incrbyfloat key increment 只保留小数点后17位
            16. decr 
            17. Decrby key value 同上。value为变量
            18. strlen 获取字符串长度，键值不存在时返回0
            19. APPEND key value 将value值追加到已有的值尾部
            20. SETRANGE key offset value 从目标位置开始替换字符串 数据为空时补零字节
            21. GETRANGE KEY START END 获取起始位置的字符串 ， 不支持回绕
            22. 
        * List:  底层实现数据结构   被用作队列
            1. lpush 2.4 版本之前只能单个元素输入  原子操作
            2. Lrange key start end  数据逆序输出
            3. Lpushx key value [value……] 将数据插入list 表头。和lpush的区别在于list不存在时不做任何操作. 
            4. Rpush 将数据插入list右边，
            5. Rpushx key value 将数据插入右边
            6. Lpop key 移除头元素
            7. Rpop 移除尾元素
            8. Rpoplpush source Destination. 将源队列队尾元素弹出插入目标队列队头。源队列与目标队列相同时
            9. lrem key count value 移除 value元素。count >0从头开始。count=0删除所有 count<0从队尾开始
            10. Llen key 获取list的长度，如果目标键值不为list 则返回错误
            11. lindex key index 返回指定位置上的数据
            12. Linsert key before|after pivot value
            13. Lset key index value 
            14. Ltrim key start end 保留区间范围内的数据
            15. Blpop key [key……] timeout。阻塞时弹出队列 直到key 中有数据可以弹出。 多个客户端设置时 按照先阻塞先服务
            16. Brpop key [key……] timeout
        * Set:
            1. sadd key member [member……]
            2. Smenbers key 获取set中所有的元素.  引起服务器阻塞
            3. sismember key member 判断value 值在不在set中
            4. Spop key 弹出一个随机元素
            5. srandmember key count. 随即返回元素，不删除set中的元素
            6. srem key value  返回被成功移除的元素数量
            7. smove src destination value 将源集合数据删除插入到目标集合
            8. scard key 返回集合中的基数
            9. del key 
            10. sscan 
            11. sinter key [key……] 获取集合的交集，共同好友，朋友圈的实现
            12. sinterstore destination key [key……] 将交集存储到目标集合中 直接覆盖
            13. sunion key [key……]求并集
            14. sunionstore destination key [key……] 
            15. sdiff。求差集
            16. sdiffstore destination key [key……]
            17. 
        * zset:
            1. zadd key [NK|XX] [CH] [INCR] score member [score member]
            2. zscore key value 返回该value的score。 string型
            3. zrange key start end [withscore]. 返回该有序集合
            4. zincrby key incrment member
            5. zcard key 
            6. zscan
            7. zcount key min max 获取区间范围内符合的总数
            8. zrevrange key start end [withscore]  逆序
            9.  zrangebyscort key min max [withscore] [limit offset count].  min 和max 可以是-inf 或者+inf.  (min (max 使用(符号为开区间
            10. zrevrangebyscore 
            11. zrank key value
            12. zrevrank key value
            13. zrem key member [member……]
            14. zremrangebyrank key start end
            15. zremrangebyscore key min max. 根据
            16. zrangebylex key [|(min [|(max  成员分值相同的集合
            17. zlexcount key min max.  成员分值相同的集合
            18. zremrangebylex key min max 成员分值相同
            19. zscan key couror [MATCH pattern] [COUNT count ]
            20. zunionstore destination nums key [key……] [WEIGHTS index number] [AGGREGATE SUM|MIN|MAX]
            21. zinterstore destination nums key [key……] [WEIGHTS index number] [AGGREGATE SUM|MIN|MAX]
        * HASH。 
            1. HSET KEY FIELD VALUE [FIELD VALUE……]. 创建新field时返回1 覆盖旧值返回0.  每秒处理7.5万请求 单个4ms
            2. HSETNX KEY FIELD VALUE [FIELD VALUE……] 设置成功返回1 给定域存在时返回0
            3. HGET KEY FIELD
            4. HEXISTS KEY FIELD
            5. HDEL KEY FIELD  [field……] 在2.4 版本以下只能删除单个文件
                1. 在Redis2.4以下的版本里， HDEL 每次只能删除单个域，如果你需要在一个原子时间内删除多个域，请将命令包含在 MULTI / EXEC 块内。
            6. HGETALL  获取 key对应的所有的field 和value
            7. HLEN 获取 hash 表下阈值的数量
            8. HSTRLEN key field  获取阈值对应数据的长度
            9. HMSET KEY FIELD VALUE [FIELD VALUE……]
            10.  HINCRBY KEY FIELD. 同string型
            11. HINCRBYFLOAT KEY increment 
            12. HMSET   每秒处理7.1 万请求。单个5ms。 4.0开始弃用。
            13. HMGET 
            14. HKEYS。获取所有的field
            15. HVALS 获取所有的值
            16. HSCAN 作用未知
        * hyperloglog.  计算基数
            * pfadd
            * pfcount
        * 地理位置
        * stream
            * 
        * 全局命令
            * exists key 
            * rename key newkey
            * renamenx key newkey
            * randomkey
            * dbsize
            * keys pattern
                * keys *
                * keys h?llo     单个字符匹配
                * keys h*llo 多个字符匹配
                * keys h[ae]llo 匹配 hello 和 hallo
                * 
    * 严禁使用的命令。对危险命令重命名
        * Keys * 生产环境严禁使用，当数据量较大时容易引起阻塞,
            * 时间复杂度为O(n)  
            * 使用scan相关命令替代
        * Flushdb 删除Redis中当前所在数据库中的所有记录
            * 原子性，不会执行失败，不可撤销
        * flushall  删除所有数据库中的记录
            * 原子性，不会中止执行，
        * config 客户端可修改配置
            * 避免恶意或意外篡改配置信息
        *  smembers 引起服务器阻塞
            * 返回set中所有的元素/
        *  a
        *  add
    * 字符串容量. 512kb
    * r
    * 缓存模式
    * 集群之间复制 主从复制。实现读写分离，提高服务器的负载能力 主数据库负责写 从数据库负责读取数据
        * 
    * 控制redis事务
    * 哨兵需要几个实例保证自己的健壮性


* ⚫ 熟悉MySQL、Oracle数据库使用以及相关编程； 
    * Mysql
        * 数据库引擎
            * Innondb 默认
                * 支持事务
                * 支持数据缓存
                * 支持外键
                * 不支持全文索引
                * 支持行级锁
            * myisam  插入或者更新表数据时需要锁表，效率低
                * 不支持事务
                * 不支持数据缓存
                * 不支持外键
                * 不支持行级锁
                * 支持全文索引
                * 顺序存储，读取速度较快
            * Memory 使用内存创建表
                * 访问速度快
                * 支持散列索引和B树索引，B树索引可以使用部分查询和通配查询
                * 
            * 如果
            * 
        * 索引
            * 索引类型
                * 全文索引 FULLTEXT
                    * 只有myisam引擎支持，针对文本类型的模糊查询
                * HASH
                    * 一次定位，查找速度比较快，只有查询条件为=、in 时高效
                * BTREE
                    * B+TREE
                        * mysql常用索引类型
                * RTREE
                    * 仅支持geometry数据类型
            * 索引种类
                * 普通索引
                * 唯一索引
                    * 值唯一
                * 主键索引
                * 组合索引
                    * 告警日志。系统+日期
                * 全文索引
                * 聚簇索引（聚集索引）
                    1. 一个索引节点直接对应实际数据记录的存储
                    2. 主键缺省使用它？
                    3. 索引项排序和数据行主键的存储排序完全一致
                    4. 一个表只能有一个聚簇索引（一个表只能有一个主键）
                * 非聚簇索引
            * 索引原则：
                * 唯一性索引
                * 经常需要排序、分组和联合操作的字段建立索引
                * 为经常作为查询条件的字段建立索引
                * 限制索引的数目。索引越多 表更新越慢
                * 尽量使用数据量少的索引
                * 尽量使用前缀索引。使用值的前缀索引
                * 删除不再使用或很少使用的索引
                * 
        * 事务 ACID
            * 原子性
                * 事务为一整体，不可分割
            * 一致性
            * 隔离型
            * 持久性
        * 事务的并发问题
            * 脏读
                * 事务A读取了事务B更新的数据，然后B回滚操作，那么A读取到的数据是脏数据
            * 幻读
                * 系统管理员A将数据库中所有学生的成绩从具体分数改为ABCDE等级，但是系统管理员B就在这个时候插入了一条具体分数的记录，当系统管理员A改结束后发现还有一条记录没有改过来，就好像发生了幻觉一样，这就叫幻读。
            * 不可重复度
                * 事务 A 多次读取同一数据，事务 B 在事务A多次读取的过程中，对数据作了更新并提交，导致事务A多次读取同一数据时，结果 不一致。
            * 小结：不可重复读侧重于修改，幻读侧重于新增或删除。解决不可重复读的问题只需锁住满足条件的行，解决幻读需要锁表
        * 隔离级别
            * 读未提交
                * 可以读取到已修改但未提交的数据。脏读 幻读 不可重复度
            * 不可重复读
                * 
            * 可重复读
                * 
            * 串行化
        * 并发控制
            * 乐观锁
                * 
            * 悲观锁
                * 拍他锁（写锁）和共享锁（读锁）
            * 时间戳
        * 锁
            * 行级锁 
                * 更新表数据时自动加锁
                * select for update语句允许一次锁定多行
                * commit或rollback语句释放锁
            * 表级锁
                * 表共享读锁
                * 表独占写锁
            * 页级锁
        * 数据结构
        * 解析器：mysql优化 select <col> from table  where ?=? group by  <group_by_list> having <> order by <>
            * 解析器顺序
                1. From<table>
                2. Where <>
                3. Group by
                4. having
                5. Select <>
                6. Order by 
            * 优化
                * 尽量少用 *  增加开销，避免扫描全表 
                * 尽量少使用嵌套查询。 耗费CPU资源
                * 避免使用耗费资源的操作。
                    * Distinct 
                    * Union   union all 减法运算
                    * Order by
                    * Minus  加法运算
                    * intersect。交集
                * 有多个or 建议拆分成多个查询 用union all 连接起来
                * 合理使用索引
                * explain 执行计划
                    * type 显示查询使用了何种类型
                        * Const 查询索引字段 主键。一行
                        * eq_ref 搜索时使用primary key 或unique类型的索引
                        * Ref 根据索引查找一个或多个值非唯一索引
                * 尽量使用
            * 主从节点
                * 
    * 视图
    * 

        * 

* ⚫ 会使用Mybatis、Hibernate常用持久层框架 
    * Jdbc :
        * 执行步骤
            1. 加载数据库驱动
            2. 创建并获取数据库连接
            3. 创建jdbc statement对象
            4. 设置sql语句
            5. 设置sql语句中的参数
            6. 执行SQL
            7. 处理查询到的数据
            8. 释放资源
        * 缺点：
            1. 频繁建立/关闭数据库连接，造成资源浪费，影响性能
            2. SQL硬编码 不利于系统维护，参数设置硬编码
            3. 结果集遍历
    * Mybatis 
        * 执行过程 非spring boot
            1. 配置mybatis配置文件 sqlmapconfig.xml
            2. 通过配置文件夹在mybatis运行环境，创建sqlsessionfactory 单例方式
            3. 通过SQLsessionfactory创建SQLsession。非线程安全
            4. 调用SQLsession 操作数据。事务需要执行commit()方法
            5. 释放资源
        * 查询：
            * 输入映射
            * 输出映射
            * 动态SQL
            * 内连接
            * 外连接
            * 延迟加载
        * 缓存
            * 一级缓存
            * 二级缓存
            * 
    * Hibernate 
        * 


* ⚫ zookeeper: 从设计模式角度来看是一个基于观察者模式设计的分布式服务管理框架
                        主从节点
                        leader-follower
    1. zookeeper ： 一个领导者 多个跟随者
    2. 集群中只要有半数以上节点存活，zookeeper就能正常服务
    3. 全局数据一致：每个server保存一份相同的数据副本，无论连接到那个server 数据都是一致的
    4. 更新请求顺序执行，来自同一个client的更新请求按其发送顺序依次执行
    5. 数据更新原子性，一次数据更新要么成功，要么失败
    6. 实时性，在一定时间范围内，client能读到最新数据
    7. 
    * []文件系统的数据结构：每个节点称做一个znode 每个节点能够默认存储1mb数据
        * []
    * []事件监听机制（通知机制）
        * []watcher 
    * 应用场景
        * 统一命名服务。分布式文件系统命名服务
        * 统一配置管理。分布式应用微服务场景下配置统一管理，（可用Apollo）
        * 统一集群管理。
        * 服务器节点动态上下线。实现服务注册与发现功能
        * 软负载均衡
        * 等
    * 操作命令
    * zookeeper内部原理
        1. 节点类型
            * 持久化节点 create /node data   一旦创建永久存在
            * 临时节点 create -e /tempnode data   session超时，会被服务器删除
            * 持久化顺序节点
            * 临时顺序节点。
            * 容器节点   当没有子节点时，未来会被服务器删除
            * TLT节点
            * 
        2. stat结构体
            * cZxid 
            * ctime
            * mZxid
            * mtime
            * pZxid
            * cversion
            * dataversion
            * aclversion
            * ephemeralOwner
            * datalength
            * Numchildren
        3. 监听器原理 Z A B协议
            * 
        4. paxos算法 ：一种基于消息传递且具有高度容错性的一致性算法
            * 
        5. 选举机制
            * 启动时无leader  节点为looking状态
            * 第一次启动时 按照myid判断投票
                * 
        6. 写数据流程。连接请求转发至leader-》leader产生一个事务，分配标识符称为会话ID zxid
            1. client向zk的server写数据，发送一个写请求
            2. server将请求转发给leader
            3. leader将写请求广播给各个server
            4. server将写请求加入待写队列返回状态
            5. 一半以上的同意，发出写指令
    * server启动流程  启动类
        * 单机模式
        * 伪分布式模式
        * 分布式模式(集群模式)
            * zkServer.sh / zkServer.cmd 脚本调用QuorumPeerMain.main()方法。
    * 选举算法：
        * LeaderElection
        * AuthFastLeaderElection
        * FastLeaderElection
                
* ⚫ Apollo ：分布式配置管理中心
    * 描述：分布式配置管理中心
    * 原理：http长链接
    * 数据存储
    * 源码：
        * admin 
        * config 
        * portal 管理端
        * 
* ⚫ Kafka : 基于发布-订阅模型的消息系统

* ⚫ 了解Spring、Spring MVC、Spring Boot ，对spring cloud有一定了解； 
    * EJB
    * 目的：解决企业开发复杂性问题
    * 功能：JavaBean
    * 组成：
        * 轻量级的核心框架
        * 通用的事务管理抽象层
    * 范围：
    * spring原理：特点
    * Spring dao中常用类
        * 
    * Spring与hibernate集成
        * 
    * 实现aop代理时，使用哪种代理
        * Jdk 动态代理。目标为接口时
        * cglib
    * Spring整合hibernate时对象注入顺序
        * Datasource->session factory->Dao 
    * beanfactory的实现类
        * BeanFactory的子接口有如下：
            * ApplicationContext, 
            * AutowireCapableBeanFactory, 
            * ConfigurableApplicationContext, 
            * ConfigurableBeanFactory, 
            * ConfigurableListableBeanFactory, 
            * ConfigurablePortletApplicationContext, 
            * ConfigurableWebApplicationContext, 
            * HierarchicalBeanFactory, 
            * ListableBeanFactory,
        * WebApplicationContext 
            * AbstractApplicationContext, 
            * AbstractAutowireCapableBeanFactory, 
            * AbstractBeanFactory, 
            * AbstractRefreshableApplicationContext, 
            * AbstractRefreshableConfigApplicationContext, 
            * AbstractRefreshablePortletApplicationContext, 
            * AbstractRefreshableWebApplicationContext, 
            * AbstractXmlApplicationContext, 
            * AnnotationConfigApplicationContext, 
            * AnnotationConfigWebApplicationContext, 
            * ClassPathXmlApplicationContext, 
            * DefaultListableBeanFactory, 
            * FileSystemXmlApplicationContext, 
            * GenericApplicationContext, 
            * GenericWebApplicationContext, 
            * GenericXmlApplicationContext, 
            * ResourceAdapterApplicationContext, 
            * SimpleJndiBeanFactory, 
            * StaticApplicationContext, 
            * StaticListableBeanFactory, 
            * StaticPortletApplicationContext, 
            * StaticWebApplicationContext, 
            * XmlBeanFactory, 
            * XmlPortletApplicationContext, 
            * XmlWebApplicationContext 
    * Spring核心模块的作用
    * aop的理解正确的是
        * 
    * Spring中使用事务的方法
    * 织入weaving什么时候执行
        * 
    * Spring配置文件名称
    * 包装hibernate之后关于merge方法
        * 
    * ioc自动装载方法
        * 
    * Spring包装hibernate之后。dao继承那个类？
    * 
    * 什么是Javabean？
        * 
    * spring bean的作用域：
        * singleton\prototype\
    * spring bean的生命周期：
        * 创建 new 
        * 初始化（实例化）
            * populateBean  属性赋值
            * AutowiredAnnotationBeanPostProcessor 后置处理器 处理@Autowired 和 @Value
                * @Value
                    * postProcessPropertyValues() 5.1后为postProcessProperties()
                * @Autowired
        * 使用
        * 销毁 
    * 依赖注入的方式
        * 构造方法注入
        * 属性注入
    * SpEL表达式：
        * ${}
        * #{}
    * springmvc原理
        * 流程
            * 用户发送请求至前端控制器 dispatcherservlet
            * 
    * springboot原理
    * 后处理器：每个bean在创建完成之前都会有一个后处理过程，即再加工
    * Spring对事务的处理
        * 什么是事务？
        * 如何控制事务
    * Aop 
        * 专业术语
        * 通知类型
            * 前置通知 before. 
                * 在某连接点之前通知
            * 返回后通知 after returning
            * 抛出异常后通知 after throwing
            * 后通知 after
            * 环绕通知 around
    * 微服务简介
        * 边车模式
        * 


* ⚫ 对多线程，线程池以及IO/NIO 有一定了解； 
    * []什么是jmm(Java memory model)？内存模型
        * 目的：
            * 为了保证共享内存的正确性，内存模型定义了共享内存系统中多线程程序读写操作的规范，与处理器有关、缓存有关、并发、编译器有关。
        * [x]硬件内存架构
            * 主内存-高速缓存-处理器核心。 多cpu多核 多线程
        * [x]Java虚拟机屏蔽了硬件底层和操作系统的差异，Java内存模型屏蔽了访问内存的差异
            * 
        * [x]主内存 堆/方法区
            * 
        * []缓存/内存一致性协议  保证高速缓存中数据的有效性 嗅探机制
            * []MSI
            * []MESI
        * 两种解决方法
            * 限制处理器优化
            * 使用内存屏障
                * Volatile 
        * [x]工作内存：Java内存模型中的线程的工作内存（working memory）是cpu的寄存器和高速缓存的抽象描述。而JVM的静态内存储模型（JVM内存模型）只是一种对内存的物理划分而已，它只局限在内存，而且只局限在JVM的内存
        * []Linux 与 进程的内存关系
            * []
        * [x]从主内存中获取数据的步骤
            * Lock->read->load->use>assign->store->write->unlock
        * [x]Volatile :volatile的特殊规则保证了新值能立即同步到主内存，以及每个线程在每次使用volatile变量前都立即从主内存刷新。因此我们可以说volatile保证了多线程操作时变量的可见性，而普通变量则不能保证这一点。
            * 加入volatile关键字时，会多出一个lock前缀指令，lock前缀指令实际上相当于一个内存屏障（也成内存栅栏）
                1. 它确保指令重排序时不会把其后面的指令排到内存屏障之前的位置，也不会把前面的指令排到内存屏障的后面；即在执行到内存屏障这句指令时，在它前面的操作已经全部完成；
                2. 它会强制将对缓存的修改操作立即写入主存；
                3. 如果是写操作，它会导致其他CPU中对应的缓存行无效。
        * Synchronized. 1.6加入锁优化 （偏向锁、轻量级锁、自旋锁、重量级锁）
            * 底层实现：monitorenter monitorexit 
                * 同步方法
                * 同步代码块
            * 原理
                * 
            * 实现可见性原理
                * 
            * JIT的锁优化、锁消除
                * 
        * CAS算法F
    * [x]ThreadLocal  ==  ThreadLocalVariable
        * 创建对象副本
        * ThreadLocal的使用通常由private static修饰，适用于对象/方法间跨层传递，或实现变量在多线程之间的隔离，并非解决多线程同步问题。常用于保存Session、DB连接等。
    * 线程的上下文切换
        * 
对多线程的理解

    * 线程的创建：
        * 继承Thread 类
        * 实现Runnable接口
        * 实现Callable
线程池的创建：
Netty :
    * JVM参数中使用 -server  开启锁优化
    



* ⚫ 具有高并发、高性能分布式产品开发经验，参与过多个项目交付； 非必须  需了解内存模型
    * 分布式锁：
        * 特点
            1. 能够实现数据共享
            2. 保证数据唯一
        * 实现
            * redis
            * mencached
            * zookeeper
            * 数据库
    * 服务流控实现：
        * esb应用 网关
            * 计数器法
            * 漏桶算法
            * 令牌桶算法
* ⚫ 设计模式
    1. 开闭原则
    2. 里氏替换原则
    3. 依赖倒转原则
    4. 单一职责原则
    5. 接口隔离原则
    6. 迪米特法则
    7. 合成复用原则
    8. 
    9. 简单工厂模式
        1. 
    10. 工厂方法模式
        1. 
    11. 抽象工厂模式
        1. 
    12. 策略模式
    13. 
    14. 
    15. 原型模式
        1. 浅克隆。实现cloneable 接口
            * 
        2. 深克隆
            * 
* 创建型模式的特点和分类
    * 单例
        * 拓展有限多例模式
    * 原型
        * 将一个对象作为原型，通过复制克隆出多个和原型相似的
    * 工厂方法：类创建模式
    * 抽象工厂
    * 建造者
⚫ 微服务架构

适合大规模团队开发、数据库扩容、横向扩容、应用扩容，提高资源利用率

事务问题，无法通过Spring本地事务管理。 分布式事务

Nacos  比 eureka 强大 

Nacos 服务端
Nacos 客户端是怎么注册的？
Nacos 原理：心跳任务

Sentinel : 服务端
                客户端
            滑动时间窗口算法

降级操作
Redis 限流

微服务项目启动客户端


2    5    8    10
Na1 +3(0+1)





git config --global user.name "FangCheng233"
git config --global user.email "fangcheng828@gmail.com"
ssh-keygen -t rsa -C "fangcheng828@gmail.com”
cat .ssh/id_rsa.pub