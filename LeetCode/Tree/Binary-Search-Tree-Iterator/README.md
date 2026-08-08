# Binary Search Tree Iterator

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/binary-search-tree-iterator/submissions/2099075636/?envType=problem-list-v2&envId=binary-search-tree](https://leetcode.com/problems/binary-search-tree-iterator/submissions/2099075636/?envType=problem-list-v2&envId=binary-search-tree) |
| **Problem ID** | binary-search-tree-iterator |
| **Language** | Java |
| **Runtime** | 19 ms |
| **Memory** | 50144000 MB |
| **Accepted At** | 2026-08-08T12:19:58.000Z |

## Tags

`Stack`, `Tree`, `Design`, `Binary Search Tree`, `Binary Tree`, `Iterator`

## Problem Statement

Implement the `BSTIterator` class that represents an iterator over the **in-order traversal** of a binary search tree (BST):

	- `BSTIterator(TreeNode root)` Initializes an object of the `BSTIterator` class. The `root` of the BST is given as part of the constructor. The pointer should be initialized to a non-existent number smaller than any element in the BST.

	- `boolean hasNext()` Returns `true` if there exists a number in the traversal to the right of the pointer, otherwise returns `false`.

	- `int next()` Moves the pointer to the right, then returns the number at the pointer.

Notice that by initializing the pointer to a non-existent smallest number, the first call to `next()` will return the smallest element in the BST.

You may assume that `next()` calls will always be valid. That is, there will be at least a next number in the in-order traversal when `next()` is called.

&nbsp;

Example 1:**

```

**Input**
[&quot;BSTIterator&quot;, &quot;next&quot;, &quot;next&quot;, &quot;hasNext&quot;, &quot;next&quot;, &quot;hasNext&quot;, &quot;next&quot;, &quot;hasNext&quot;, &quot;next&quot;, &quot;hasNext&quot;]
[[[7, 3, 15, null, null, 9, 20]], [], [], [], [], [], [], [], [], []]
**Output**
[null, 3, 7, true, 9, true, 15, true, 20, false]

**Explanation**
BSTIterator bSTIterator = new BSTIterator([7, 3, 15, null, null, 9, 20]);
bSTIterator.next();    // return 3
bSTIterator.next();    // return 7
bSTIterator.hasNext(); // return True
bSTIterator.next();    // return 9
bSTIterator.hasNext(); // return True
bSTIterator.next();    // return 15
bSTIterator.hasNext(); // return True
bSTIterator.next();    // return 20
bSTIterator.hasNext(); // return False

```

&nbsp;

**Constraints:**

	- The number of nodes in the tree is in the range `[1, 105]`.

	- `0 &lt;= Node.val &lt;= 106`

	- At most `105` calls will be made to `hasNext`, and `next`.

&nbsp;

**Follow up:**

	- Could you implement `next()` and `hasNext()` to run in average `O(1)` time and use&nbsp;`O(h)` memory, where `h` is the height of the tree?

## Constraints

- The number of nodes in the tree is in the range [1, 105].
- 0 &lt;= Node.val &lt;= 106
- At most 105 calls will be made to hasNext, and next.

---
