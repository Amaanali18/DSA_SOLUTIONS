# Number of Sub-arrays With Odd Sum

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/number-of-sub-arrays-with-odd-sum/submissions/2196395526/?envType=daily-question&envId=2026-11-15](https://leetcode.com/problems/number-of-sub-arrays-with-odd-sum/submissions/2196395526/?envType=daily-question&envId=2026-11-15) |
| **Problem ID** | number-of-sub-arrays-with-odd-sum |
| **Language** | Java |
| **Runtime** | 8 ms |
| **Memory** | 81560000 MB |
| **Accepted At** | 2026-11-15T04:51:32.000Z |

## Tags

`Array`, `Math`, `Dynamic Programming`, `Prefix Sum`

## Problem Statement

Given an array of integers `arr`, return *the number of subarrays with an **odd** sum*.

Since the answer can be very large, return it modulo `109 + 7`.

&nbsp;

Example 1:**

```

**Input:** arr = [1,3,5]
**Output:** 4
**Explanation:** All subarrays are [[1],[1,3],[1,3,5],[3],[3,5],[5]]
All sub-arrays sum are [1,4,9,3,8,5].
Odd sums are [1,9,3,5] so the answer is 4.

```

Example 2:**

```

**Input:** arr = [2,4,6]
**Output:** 0
**Explanation:** All subarrays are [[2],[2,4],[2,4,6],[4],[4,6],[6]]
All sub-arrays sum are [2,6,12,4,10,6].
All sub-arrays have even sum and the answer is 0.

```

Example 3:**

```

**Input:** arr = [1,2,3,4,5,6,7]
**Output:** 16

```

&nbsp;

**Constraints:**

	- `1 &lt;= arr.length &lt;= 105`

	- `1 &lt;= arr[i] &lt;= 100`

---
