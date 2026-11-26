# Find Occurrences of an Element in an Array

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/find-occurrences-of-an-element-in-an-array/submissions/2203677713/](https://leetcode.com/problems/find-occurrences-of-an-element-in-an-array/submissions/2203677713/) |
| **Problem ID** | find-occurrences-of-an-element-in-an-array |
| **Language** | Java |
| **Runtime** | 5 ms |
| **Memory** | 165504000 MB |
| **Accepted At** | 2026-11-26T05:54:25.000Z |

## Tags

`Array`, `Hash Table`

## Problem Statement

You are given an integer array `nums`, an integer array `queries`, and an integer `x`.

For each `queries[i]`, you need to find the index of the `queries[i]th` occurrence of `x` in the `nums` array. If there are fewer than `queries[i]` occurrences of `x`, the answer should be -1 for that query.

Return an integer array `answer` containing the answers to all queries.

&nbsp;

Example 1:**

**Input:** nums = [1,3,1,7], queries = [1,3,2,4], x = 1

**Output:** [0,-1,2,-1]

**Explanation:**

	- For the 1st query, the first occurrence of 1 is at index 0.

	- For the 2nd query, there are only two occurrences of 1 in `nums`, so the answer is -1.

	- For the 3rd query, the second occurrence of 1 is at index 2.

	- For the 4th query, there are only two occurrences of 1 in `nums`, so the answer is -1.

Example 2:**

**Input:** nums = [1,2,3], queries = [10], x = 5

**Output:** [-1]

**Explanation:**

	- For the 1st query, 5 doesn&#39;t exist in `nums`, so the answer is -1.

&nbsp;

**Constraints:**

	- `1 &lt;= nums.length, queries.length &lt;= 105`

	- `1 &lt;= queries[i] &lt;= 105`

	- `1 &lt;= nums[i], x &lt;= 104`

---
