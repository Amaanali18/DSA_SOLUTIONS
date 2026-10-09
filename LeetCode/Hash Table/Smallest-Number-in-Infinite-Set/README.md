# Smallest Number in Infinite Set

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/smallest-number-in-infinite-set/submissions/2167271589/](https://leetcode.com/problems/smallest-number-in-infinite-set/submissions/2167271589/) |
| **Problem ID** | smallest-number-in-infinite-set |
| **Language** | Java |
| **Runtime** | 10 ms |
| **Memory** | 47552000 MB |
| **Accepted At** | 2026-10-09T12:26:14.000Z |

## Tags

`Hash Table`, `Design`, `Heap (Priority Queue)`, `Ordered Set`

## Problem Statement

You have a set which contains all positive integers `[1, 2, 3, 4, 5, ...]`.

Implement the `SmallestInfiniteSet` class:

	- `SmallestInfiniteSet()` Initializes the **SmallestInfiniteSet** object to contain **all** positive integers.

	- `int popSmallest()` **Removes** and returns the smallest integer contained in the infinite set.

	- `void addBack(int num)` **Adds** a positive integer `num` back into the infinite set, if it is **not** already in the infinite set.

&nbsp;

Example 1:**

```

**Input**
[&quot;SmallestInfiniteSet&quot;, &quot;addBack&quot;, &quot;popSmallest&quot;, &quot;popSmallest&quot;, &quot;popSmallest&quot;, &quot;addBack&quot;, &quot;popSmallest&quot;, &quot;popSmallest&quot;, &quot;popSmallest&quot;]
[[], [2], [], [], [], [1], [], [], []]
**Output**
[null, null, 1, 2, 3, null, 1, 4, 5]

**Explanation**
SmallestInfiniteSet smallestInfiniteSet = new SmallestInfiniteSet();
smallestInfiniteSet.addBack(2);    // 2 is already in the set, so no change is made.
smallestInfiniteSet.popSmallest(); // return 1, since 1 is the smallest number, and remove it from the set.
smallestInfiniteSet.popSmallest(); // return 2, and remove it from the set.
smallestInfiniteSet.popSmallest(); // return 3, and remove it from the set.
smallestInfiniteSet.addBack(1);    // 1 is added back to the set.
smallestInfiniteSet.popSmallest(); // return 1, since 1 was added back to the set and
                                   // is the smallest number, and remove it from the set.
smallestInfiniteSet.popSmallest(); // return 4, and remove it from the set.
smallestInfiniteSet.popSmallest(); // return 5, and remove it from the set.

```

&nbsp;

**Constraints:**

	- `1 &lt;= num &lt;= 1000`

	- At most `1000` calls will be made **in total** to `popSmallest` and `addBack`.

## Constraints

- 1 &lt;= num &lt;= 1000

---
