# Minimum Operations to Sort a String

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/minimum-operations-to-sort-a-string/submissions/2177747340/?envType=daily-question&envId=2026-10-21](https://leetcode.com/problems/minimum-operations-to-sort-a-string/submissions/2177747340/?envType=daily-question&envId=2026-10-21) |
| **Problem ID** | minimum-operations-to-sort-a-string |
| **Language** | Java |
| **Runtime** | 11 ms |
| **Memory** | 46552000 MB |
| **Accepted At** | 2026-10-21T08:04:04.000Z |

## Tags

`String`

## Problem Statement

You are given a string `s` consisting of lowercase English letters.

In one operation, you can select any **substring** of `s` that is **not** the entire string and **sort** it in **non-descending alphabetical** order.

Return the **minimum** number of operations required to make `s` sorted in **non-descending** order. If it is not possible, return -1.

&nbsp;

Example 1:**

**Input:** s = &quot;dog&quot;

**Output:** 1

**Explanation:**​​​​​​​

	- Sort substring `&quot;og&quot;` to `&quot;go&quot;`.

	- Now, `s = &quot;dgo&quot;`, which is sorted in ascending order. Thus, the answer is 1.

Example 2:**

**Input:** s = &quot;card&quot;

**Output:** 2

**Explanation:**

	- Sort substring `&quot;car&quot;` to `&quot;acr&quot;`, so `s = &quot;acrd&quot;`.

	- Sort substring `&quot;rd&quot;` to `&quot;dr&quot;`, making `s = &quot;acdr&quot;`, which is sorted in ascending order. Thus, the answer is 2.

Example 3:**

**Input:** s = &quot;gf&quot;

**Output:** -1

**Explanation:**

	- It is impossible to sort `s` under the given constraints. Thus, the answer is -1.

&nbsp;

**Constraints:**

	- `1 &lt;= s.length &lt;= 105`

	- `s` consists of only lowercase English letters.

---
