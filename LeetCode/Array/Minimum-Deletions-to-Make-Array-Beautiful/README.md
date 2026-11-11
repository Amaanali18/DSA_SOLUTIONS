# Minimum Deletions to Make Array Beautiful

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Easy |
| **URL** | [https://leetcode.com/problems/minimum-deletions-to-make-array-beautiful/solutions/1887031/javacpython-o1-greedy-solution-with-expl-qouv/](https://leetcode.com/problems/minimum-deletions-to-make-array-beautiful/solutions/1887031/javacpython-o1-greedy-solution-with-expl-qouv/) |
| **Problem ID** | minimum-deletions-to-make-array-beautiful |
| **Language** | java |
| **Runtime** | 0 ms |
| **Memory** | 0 MB |
| **Accepted At** | 2026-11-11T04:21:46.516Z |

## Tags

`Array`, `Stack`, `Greedy`

## Problem Statement

You are given a **0-indexed** integer array `nums`. The array `nums` is **beautiful** if:

	- `nums.length` is even.

	- `nums[i] != nums[i + 1]` for all `i % 2 == 0`.

Note that an empty array is considered beautiful.

You can delete any number of elements from `nums`. When you delete an element, all the elements to the right of the deleted element will be **shifted one unit to the left** to fill the gap created and all the elements to the left of the deleted element will remain **unchanged**.

Return *the **minimum** number of elements to delete from *`nums`* to make it **beautiful.*

&nbsp;

OriginalJavaExample 1:**

```
**Input:** nums = [1,1,2,3,5]
**Output:** 1
**Explanation:** You can delete either `nums[0]` or `nums[1]` to make `nums` = [1,2,3,5] which is beautiful. It can be proven you need at least 1 deletion to make `nums` beautiful.

```

Example 2:**

```
**Input:** nums = [1,1,2,2,3,3]
**Output:** 2
**Explanation:** You can delete `nums[0]` and `nums[5]` to make nums = [1,2,2,3] which is beautiful. It can be proven you need at least 2 deletions to make nums beautiful.

```

&nbsp;

**Constraints:**

	- `1 &lt;= nums.length &lt;= 105`

	- `0 &lt;= nums[i] &lt;= 105`

---
