# Max Consecutive Ones III

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/max-consecutive-ones-iii/submissions/2125596987/](https://leetcode.com/problems/max-consecutive-ones-iii/submissions/2125596987/) |
| **Problem ID** | max-consecutive-ones-iii |
| **Language** | Java |
| **Runtime** | 3 ms |
| **Memory** | 51980000 MB |
| **Accepted At** | 2026-08-31T02:43:56.000Z |

## Tags

`Array`, `Binary Search`, `Sliding Window`, `Prefix Sum`

## Problem Statement

Given a binary array `nums` and an integer `k`, return *the maximum number of consecutive *`1`*&#39;s in the array if you can flip at most* `k` `0`&#39;s.

&nbsp;

Example 1:**

```

**Input:** nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
**Output:** 6
**Explanation:** [1,1,1,0,0,**1**,1,1,1,1,**1**]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
```

Example 2:**

```

**Input:** nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
**Output:** 10
**Explanation:** [0,0,1,1,**1**,**1**,1,1,1,**1**,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

```

&nbsp;

**Constraints:**

	- `1 &lt;= nums.length &lt;= 105`

	- `nums[i]` is either 0 or 1.

	- `0 &lt;= k &lt;= nums.length`

---
