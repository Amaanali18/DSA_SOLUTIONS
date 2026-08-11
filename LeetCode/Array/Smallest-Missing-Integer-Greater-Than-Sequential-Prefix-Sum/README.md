# Smallest Missing Integer Greater Than Sequential Prefix Sum

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Easy |
| **URL** | [https://leetcode.com/problems/smallest-missing-integer-greater-than-sequential-prefix-sum/submissions/2103116114/?envType=daily-question&envId=2026-08-11](https://leetcode.com/problems/smallest-missing-integer-greater-than-sequential-prefix-sum/submissions/2103116114/?envType=daily-question&envId=2026-08-11) |
| **Problem ID** | smallest-missing-integer-greater-than-sequential-prefix-sum |
| **Language** | Java |
| **Runtime** | 2 ms |
| **Memory** | 43792000 MB |
| **Accepted At** | 2026-08-11T16:23:17.000Z |

## Tags

`Array`, `Hash Table`, `Sorting`

## Problem Statement

You are given a **0-indexed** array of integers `nums`.

A prefix `nums[0..i]` is **sequential** if, for all `1 &lt;= j &lt;= i`, `nums[j] = nums[j - 1] + 1`. In particular, the prefix consisting only of `nums[0]` is **sequential**.

Return *the **smallest** integer* `x` *missing from* `nums` *such that* `x` *is greater than or equal to the sum of the **longest** sequential prefix.*

&nbsp;

Example 1:**

```

**Input:** nums = [1,2,3,2,5]
**Output:** 6
**Explanation:** The longest sequential prefix of nums is [1,2,3] with a sum of 6. 6 is not in the array, therefore 6 is the smallest missing integer greater than or equal to the sum of the longest sequential prefix.

```

Example 2:**

```

**Input:** nums = [3,4,5,1,12,14,13]
**Output:** 15
**Explanation:** The longest sequential prefix of nums is [3,4,5] with a sum of 12. 12, 13, and 14 belong to the array while 15 does not. Therefore 15 is the smallest missing integer greater than or equal to the sum of the longest sequential prefix.

```

&nbsp;

**Constraints:**

	- `1 &lt;= nums.length &lt;= 50`

	- `1 &lt;= nums[i] &lt;= 50`

---
