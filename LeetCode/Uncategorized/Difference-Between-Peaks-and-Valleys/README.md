# Difference Between Peaks and Valleys

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Easy |
| **URL** | [https://leetcode.com/contest/biweekly-contest-194/problems/difference-between-peaks-and-valleys/submissions/2180533040/](https://leetcode.com/contest/biweekly-contest-194/problems/difference-between-peaks-and-valleys/submissions/2180533040/) |
| **Problem ID** | difference-between-peaks-and-valleys |
| **Language** | Java |
| **Runtime** | 2 ms |
| **Memory** | 45768000 MB |
| **Accepted At** | 2026-10-24T14:44:10.000Z |

## Problem Statement

You are given an integer array `nums` of length `n`.

An index `i` is called a **peak** if **all** of the following conditions hold:

	- `0 &lt; i &lt; n - 1`

	- `nums[i] &gt; nums[i - 1]`

	- `nums[i] &gt; nums[i + 1]`

An index `i` is called a **valley** if **all** of the following conditions hold:

	- `0 &lt; i &lt; n - 1`

	- `nums[i] &lt; nums[i - 1]`

	- `nums[i] &lt; nums[i + 1]`

Return an integer denoting the **difference** between the sum of all peak values and the sum of all valley values.

&nbsp;

Example 1:**

**Input:** nums = [1,5,2,4,1,3,0]

**Output:** 9

**Explanation:**

	- The peak values are `nums[1] = 5`, `nums[3] = 4`, and `nums[5] = 3`.

	- The valley values are `nums[2] = 2` and `nums[4] = 1`.

	- The difference between the sum of the peak values and the sum of the valley values is `(5 + 4 + 3) - (2 + 1) = 9`. Hence, the answer is 9.

Example 2:**

**Input:** nums = [-5,-6,-1,-2,5,3,2]

**Output:** 12

**Explanation:**

	- The peak values are `nums[2] = -1` and `nums[4] = 5`.

	- The valley values are `nums[1] = -6` and `nums[3] = -2`.

	- The difference between the sum of the peak values and the sum of the valley values is `(-1 + 5) - (-6 + (-2)) = 12`. Hence, the answer is 12.

Example 3:**

**Input:** nums = [6,5,2,5,5,3,6]

**Output:** -5

**Explanation:**

	- There are no peak values in the array.

	- The valley values are `nums[2] = 2` and `nums[5] = 3`.

	- The difference between the sum of the peak values and the sum of the valley values is `(0) - (2 + 3) = -5`. Hence, the answer is -5.

&nbsp;

**Constraints:**

	- `3 &lt;= n == nums.length &lt;= 100`

	- `-100 &lt;= nums[i] &lt;= 100`

---
