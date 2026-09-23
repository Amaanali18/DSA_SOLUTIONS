# Minimum Operations to Reduce X to Zero

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/minimum-operations-to-reduce-x-to-zero/submissions/2150564261/?envType=daily-question&envId=2026-09-23](https://leetcode.com/problems/minimum-operations-to-reduce-x-to-zero/submissions/2150564261/?envType=daily-question&envId=2026-09-23) |
| **Problem ID** | minimum-operations-to-reduce-x-to-zero |
| **Language** | Java |
| **Runtime** | 4 ms |
| **Memory** | 102156000 MB |
| **Accepted At** | 2026-09-23T06:39:58.000Z |

## Tags

`Array`, `Hash Table`, `Binary Search`, `Sliding Window`, `Prefix Sum`

## Problem Statement

You are given an integer array `nums` and an integer `x`. In one operation, you can either remove the leftmost or the rightmost element from the array `nums` and subtract its value from `x`. Note that this **modifies** the array for future operations.

Return *the **minimum number** of operations to reduce *`x` *to **exactly*** `0` *if it is possible**, otherwise, return *`-1`.

&nbsp;

Example 1:**

```

**Input:** nums = [1,1,4,2,3], x = 5
**Output:** 2
**Explanation:** The optimal solution is to remove the last two elements to reduce x to zero.

```

Example 2:**

```

**Input:** nums = [5,6,7,8,9], x = 4
**Output:** -1

```

Example 3:**

```

**Input:** nums = [3,2,20,1,1,3], x = 10
**Output:** 5
**Explanation:** The optimal solution is to remove the last three elements and the first two elements (5 operations in total) to reduce x to zero.

```

&nbsp;

**Constraints:**

	- `1 &lt;= nums.length &lt;= 105`

	- `1 &lt;= nums[i] &lt;= 104`

	- `1 &lt;= x &lt;= 109`

---
