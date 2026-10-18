# Minimum Deletions to Make Array Sharp

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Easy |
| **URL** | [https://leetcode.com/contest/weekly-contest-524/problems/minimum-deletions-to-make-array-sharp/submissions/2174980982/](https://leetcode.com/contest/weekly-contest-524/problems/minimum-deletions-to-make-array-sharp/submissions/2174980982/) |
| **Problem ID** | minimum-deletions-to-make-array-sharp |
| **Language** | Java |
| **Runtime** | 1 ms |
| **Memory** | 45980000 MB |
| **Accepted At** | 2026-10-18T02:34:02.000Z |

## Problem Statement

You are given an integer array `nums`.

You may delete any number of elements from `nums`. The remaining elements keep their original order.

The resulting array `a` is **sharp** if the **bitwise XOR** of every pair of **adjacent** elements is **non-zero**. That is, `a[i] XOR a[i + 1] != 0` for every index `i` such that `0 &lt;= i &lt; a.length - 1`. An array with at most one element is sharp.

Return the **minimum** number of deletions needed to make `nums` sharp.

**Bitwise XOR** compares the corresponding bits of two integers. A bit in the result is 1 if the corresponding bits differ, and 0 otherwise.

&nbsp;

Example 1:**

**Input:** nums = [1,1,2,2,2,3]

**Output:** 3

**Explanation:**

	- The pairs at indices `(0, 1)`, `(2, 3)`, and `(3, 4)` each have an XOR of 0.

	- Deleting one 1 and two 2s leaves `[1, 2, 3]`, where `1 XOR 2 == 3` and `2 XOR 3 == 1` are both non-zero. Therefore, the answer is 3.

Example 2:**

**Input:** nums = [4,4,9,4]

**Output:** 1

**Explanation:**

	- The pair at indices `(0, 1)` has an XOR of 0.

	- Deleting either of these two 4s leaves `[4, 9, 4]`, where `4 XOR 9 == 13` and `9 XOR 4 == 13` are both non-zero.

&nbsp;

**Constraints:**

	- `2 &lt;= nums.length &lt;= 100`

	- `1 &lt;= nums[i] &lt;= 100`

---
