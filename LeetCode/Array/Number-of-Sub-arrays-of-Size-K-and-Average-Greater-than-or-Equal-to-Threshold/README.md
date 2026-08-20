# Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/submissions/2113397666/](https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/submissions/2113397666/) |
| **Problem ID** | number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold |
| **Language** | Java |
| **Runtime** | 3 ms |
| **Memory** | 71380000 MB |
| **Accepted At** | 2026-08-20T03:46:00.000Z |

## Tags

`Array`, `Sliding Window`

## Problem Statement

Given an array of integers `arr` and two integers `k` and `threshold`, return *the number of sub-arrays of size *`k`* and average greater than or equal to *`threshold`.

&nbsp;

Example 1:**

```

**Input:** arr = [2,2,2,2,5,5,5,8], k = 3, threshold = 4
**Output:** 3
**Explanation:** Sub-arrays [2,5,5],[5,5,5] and [5,5,8] have averages 4, 5 and 6 respectively. All other sub-arrays of size 3 have averages less than 4 (the threshold).

```

Example 2:**

```

**Input:** arr = [11,13,17,23,29,31,7,5,2,3], k = 3, threshold = 5
**Output:** 6
**Explanation:** The first 6 sub-arrays of size 3 have averages greater than 5. Note that averages are not integers.

```

&nbsp;

**Constraints:**

	- `1 &lt;= arr.length &lt;= 105`

	- `1 &lt;= arr[i] &lt;= 104`

	- `1 &lt;= k &lt;= arr.length`

	- `0 &lt;= threshold &lt;= 104`

---
