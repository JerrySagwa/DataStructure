# DataStructure
DataStructure Learning Note

# Array

***简单时间复杂度分析* O**

1. 忽略常数
2. 描述 n 趋近于无穷的情况



- 添加操作 -- 通常关注最糟糕的情况 O(n)

    - addLast O(1)
    - addFirst O(n)
    - add(index, e) O(n / 2) -- O(n)

- 删除操作

    - removeLast O(1)
    - removeFirst O(n)
    - remove(index, e) O(n/2) -- O(n)

- 修改 -- RandomAccess O(1)

- 查询

    - get(index) O(1)

    - find(e), contains(e) O(n)

        

***resize 复杂度分析***

最差情况 每次添加/删除都 resize -- O(n)

**均摊复杂度**：O(1)

**复杂度震荡**：同时先后进行 addLast 和 removeLast 两次操作都是 O(n)

解决方案：不要让 addLast 和 removeLast 在同一个边界 resize (*Lazy*)



# Stack

> FILO

应用

- undo 操作
- 程序调用的系统栈

# Queue

> FIFO



***循环队列***

- `front == tail` 队列为空
- `(tail + 1) % capacity == front` 队列为满 -- 故意浪费一个空间



# LinkedList

> 真正的动态数据结构
>
> - 最简单的动态数据结构
> - 理解指针
> - 理解递归

*数组 vs 链表*

- 数组 -- 支持快速查询
- 链表 -- 不适用于索引有语义，优点: 动态

技巧: ***虚拟头节点***

> 将对于链表头的操作和普通元素统一起来
