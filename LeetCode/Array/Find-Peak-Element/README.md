# Find Peak Element

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/find-peak-element/submissions/2197700448/](https://leetcode.com/problems/find-peak-element/submissions/2197700448/) |
| **Problem ID** | find-peak-element |
| **Language** | Java |
| **Runtime** | 1 ms |
| **Memory** | 43612000 MB |
| **Accepted At** | 2026-11-17T03:37:56.000Z |

## Tags

`Array`, `Binary Search`

## Problem Statement

A peak element is an element that is strictly greater than its neighbors.

Given a **0-indexed** integer array `nums`, find a peak element, and return its index. If the array contains multiple peaks, return the index to **any of the peaks**.

You may imagine that `nums[-1] = nums[n] = -&infin;`. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.

You must write an algorithm that runs in `O(log n)` time.

&nbsp;

Example 1:**

```

**Input:** nums = [1,2,3,1]
**Output:** 2
**Explanation:** 3 is a peak element and your function should return the index number 2.
```

Example 2:**

```

**Input:** nums = [1,2,1,3,5,6,4]
**Output:** 5
**Explanation:** Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.
```

&nbsp;

**Constraints:**

	- `1 &lt;= nums.length &lt;= 1000`

	- `-231 &lt;= nums[i] &lt;= 231 - 1`

	- `nums[i] != nums[i + 1]` for all valid `i`.

---
