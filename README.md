# DataStructure
DataStructure Learning Note

## Array

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
