# Maximum Sum Circular Subarray

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/maximum-sum-circular-subarray/submissions/2117996642/](https://leetcode.com/problems/maximum-sum-circular-subarray/submissions/2117996642/) |
| **Problem ID** | maximum-sum-circular-subarray |
| **Language** | Java |
| **Runtime** | 7 ms |
| **Memory** | 50712000 MB |
| **Accepted At** | 2026-08-24T04:36:01.000Z |

## Tags

`Array`, `Divide and Conquer`, `Dynamic Programming`, `Queue`, `Monotonic Queue`

## Problem Statement

Given a **circular integer array** `nums` of length `n`, return *the maximum possible sum of a non-empty **subarray** of *`nums`.

A **circular array** means the end of the array connects to the beginning of the array. Formally, the next element of `nums[i]` is `nums[(i + 1) % n]` and the previous element of `nums[i]` is `nums[(i - 1 + n) % n]`.

A **subarray** may only include each element of the fixed buffer `nums` at most once. Formally, for a subarray `nums[i], nums[i + 1], ..., nums[j]`, there does not exist `i &lt;= k1`, `k2 &lt;= j` with `k1 % n == k2 % n`.

&nbsp;

Example 1:**

```

**Input:** nums = [1,-2,3,-2]
**Output:** 3
**Explanation:** Subarray [3] has maximum sum 3.

```

Example 2:**

```

**Input:** nums = [5,-3,5]
**Output:** 10
**Explanation:** Subarray [5,5] has maximum sum 5 + 5 = 10.

```

Example 3:**

```

**Input:** nums = [-3,-2,-3]
**Output:** -2
**Explanation:** Subarray [-2] has maximum sum -2.

```

&nbsp;

**Constraints:**

	- `n == nums.length`

	- `1 &lt;= n &lt;= 3 * 104`

	- `-3 * 104 &lt;= nums[i] &lt;= 3 * 104`

---
