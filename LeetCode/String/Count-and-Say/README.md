# Count and Say

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/count-and-say/submissions/2152531062/](https://leetcode.com/problems/count-and-say/submissions/2152531062/) |
| **Problem ID** | count-and-say |
| **Language** | Java |
| **Runtime** | 2 ms |
| **Memory** | 42960000 MB |
| **Accepted At** | 2026-09-25T02:19:33.000Z |

## Tags

`String`

## Problem Statement

The **count-and-say** sequence is a sequence of digit strings defined by the recursive formula:

	- `countAndSay(1) = &quot;1&quot;`

	- `countAndSay(n)` is the run-length encoding of `countAndSay(n - 1)`.

Run-length encoding (RLE) is a string compression method that works by replacing each maximal group of consecutive identical characters with the concatenation of the length of the group followed by the character itself. For example, to compress the string `&quot;3322251&quot;` we replace `&quot;33&quot;` with `&quot;23&quot;`, replace `&quot;222&quot;` with `&quot;32&quot;`, replace `&quot;5&quot;` with `&quot;15&quot;`, and replace `&quot;1&quot;` with `&quot;11&quot;`. Thus the compressed string becomes `&quot;23321511&quot;`.

Given a positive integer `n`, return *the *`nth`* element of the **count-and-say** sequence*.

&nbsp;

Example 1:**

**Input:** n = 4

**Output:** &quot;1211&quot;

**Explanation:**

```

countAndSay(1) = &quot;1&quot;
countAndSay(2) = RLE of &quot;1&quot; = &quot;11&quot;
countAndSay(3) = RLE of &quot;11&quot; = &quot;21&quot;
countAndSay(4) = RLE of &quot;21&quot; = &quot;1211&quot;

```

Example 2:**

**Input:** n = 1

**Output:** &quot;1&quot;

**Explanation:**

This is the base case.

&nbsp;

**Constraints:**

	- `1 &lt;= n &lt;= 30`

&nbsp;
**Follow up:** Could you solve it iteratively?

## Constraints

- 1 &lt;= n &lt;= 30

---
