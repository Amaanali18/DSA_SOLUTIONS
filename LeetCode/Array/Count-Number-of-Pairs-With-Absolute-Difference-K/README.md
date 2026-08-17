# Count Number of Pairs With Absolute Difference K

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Easy |
| **URL** | [https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/submissions/2109583602/](https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/submissions/2109583602/) |
| **Problem ID** | count-number-of-pairs-with-absolute-difference-k |
| **Language** | Java |
| **Runtime** | 7 ms |
| **Memory** | 45104000 MB |
| **Accepted At** | 2026-08-17T02:33:34.000Z |

## Tags

`Array`, `Hash Table`, `Counting`

## Problem Statement

Given an integer array `nums` and an integer `k`, return *the number of pairs* `(i, j)` *where* `i &lt; j` *such that* `|nums[i] - nums[j]| == k`.

The value of `|x|` is defined as:

	- `x` if `x &gt;= 0`.

	- `-x` if `x &lt; 0`.

&nbsp;

Example 1:**

```

**Input:** nums = [1,2,2,1], k = 1
**Output:** 4
**Explanation:** The pairs with an absolute difference of 1 are:
- [**1**,**2**,2,1]
- [**1**,2,**2**,1]
- [1,**2**,2,**1**]
- [1,2,**2**,**1**]

```

Example 2:**

```

**Input:** nums = [1,3], k = 3
**Output:** 0
**Explanation:** There are no pairs with an absolute difference of 3.

```

Example 3:**

```

**Input:** nums = [3,2,1,5,4], k = 2
**Output:** 3
Explanation: The pairs with an absolute difference of 2 are:
- [**3**,2,**1**,5,4]
- [**3**,2,1,**5**,4]
- [3,**2**,1,5,**4**]

```

&nbsp;

**Constraints:**

	- `1 &lt;= nums.length &lt;= 200`

	- `1 &lt;= nums[i] &lt;= 100`

	- `1 &lt;= k &lt;= 99`

---
