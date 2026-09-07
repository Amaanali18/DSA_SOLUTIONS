# Final Element After Subarray Deletions

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/final-element-after-subarray-deletions/submissions/2133940628/](https://leetcode.com/problems/final-element-after-subarray-deletions/submissions/2133940628/) |
| **Problem ID** | final-element-after-subarray-deletions |
| **Language** | Java |
| **Runtime** | 1 ms |
| **Memory** | 114068000 MB |
| **Accepted At** | 2026-09-07T13:44:58.000Z |

## Tags

`Array`, `Math`, `Brainteaser`, `Game Theory`

## Problem Statement

You are given an integer array `nums`.

Two players, Alice and Bob, play a game in turns, with Alice playing first.

	- In each turn, the current player chooses any **subarray** `nums[l..r]` such that `r - l + 1 &lt; m`, where `m` is the **current length** of the array.

	- The selected **subarray is removed**, and the remaining elements are **concatenated** to form the new array.

	- The game continues until **only one** element remains.

Alice aims to **maximize** the final element, while Bob aims to **minimize** it. Assuming both play optimally, return the value of the final remaining element.

&nbsp;

Example 1:**

**Input:** nums = [1,5,2]

**Output:** 2

**Explanation:**

One valid optimal strategy:

	- Alice removes `[1]`, array becomes `[5, 2]`.

	- Bob removes `[5]`, array becomes `[2]`​​​​​​​. Thus, the answer is 2.

Example 2:**

**Input:** nums = [3,7]

**Output:** 7

**Explanation:**

Alice removes `[3]`, leaving the array `[7]`. Since Bob cannot play a turn now, the answer is 7.

&nbsp;

**Constraints:**

	- `1 &lt;= nums.length &lt;= 105`

	- `1 &lt;= nums[i] &lt;= 105`

---
