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



# Recursion

> 链表与递归

*递归*: 将原问题转换为同类型的更小问题

`Sum(arr[0...n-1]) = arr[0] + Sum(arr[1...n-1])`

```java
public class Sum {
    public static int sum(int[] arr) {
        return sum(arr, 0);
    }

    // sum(arr[l...n-1]) 宏观语义
    public static int sum(int[] arr, int l) {
      	// 最基本的问题(不可分割)
        if (l >= arr.length)
            return 0;
      	// 原问题转化成更小问题
        return arr[l] + sum(arr, l + 1);
    }
}
```



# BST

树结构存储：高效地解决算法问题

- 二分搜索树
- 平衡二叉树 AVL 红黑树
- 堆 并查集
- 线段树 Trie(字典树，前缀树)

二叉树

```java
class Node {
  int val;
  Node left;
  Node right;
}
```

- 具有唯一的根结点
- 每个节点最多有两个孩子
- 叶子节点左右孩子都为空
- 每个节点最多有一个父节点 (根结点没有父节点)
- 天然的递归结构 -- 每个节点的左 / 右子树也是二叉树

*满二叉树*：除了叶子节点所有的节点左右孩子都不为空

*BST* : 每个节点的值都大于左子树的所有节点的值，小于右子树的所有节点的值 -- 每一棵子树也是二分搜索树













