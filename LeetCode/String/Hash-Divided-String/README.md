# Hash Divided String

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/hash-divided-string/submissions/2109863426/](https://leetcode.com/problems/hash-divided-string/submissions/2109863426/) |
| **Problem ID** | hash-divided-string |
| **Language** | Java |
| **Runtime** | 2 ms |
| **Memory** | 46580000 MB |
| **Accepted At** | 2026-08-17T07:59:09.000Z |

## Tags

`String`, `Simulation`

## Problem Statement

You are given a string `s` of length `n` and an integer `k`, where `n` is a **multiple** of `k`. Your task is to hash the string `s` into a new string called `result`, which has a length of `n / k`.

First, divide `s` into `n / k` **substrings**, each with a length of `k`. Then, initialize `result` as an **empty** string.

For each **substring** in order from the beginning:

	- The **hash value** of a character is the index of that character in the **English alphabet** (e.g., `&#39;a&#39; &rarr; 0`, `&#39;b&#39; &rarr; 1`, ..., `&#39;z&#39; &rarr; 25`).

	- Calculate the *sum* of all the **hash values** of the characters in the substring.

	- Find the remainder of this sum when divided by 26, which is called `hashedChar`.

	- Identify the character in the English lowercase alphabet that corresponds to `hashedChar`.

	- Append that character to the end of `result`.

Return `result`.

&nbsp;

Example 1:**

**Input:** s = &quot;abcd&quot;, k = 2

**Output:** &quot;bf&quot;

**Explanation:**

First substring: `&quot;ab&quot;`, `0 + 1 = 1`, `1 % 26 = 1`, `result[0] = &#39;b&#39;`.

Second substring: `&quot;cd&quot;`, `2 + 3 = 5`, `5 % 26 = 5`, `result[1] = &#39;f&#39;`.

Example 2:**

**Input:** s = &quot;mxz&quot;, k = 3

**Output:** &quot;i&quot;

**Explanation:**

The only substring: `&quot;mxz&quot;`, `12 + 23 + 25 = 60`, `60 % 26 = 8`, `result[0] = &#39;i&#39;`.

&nbsp;

**Constraints:**

	- `1 &lt;= k &lt;= 100`

	- `k &lt;= s.length &lt;= 1000`

	- `s.length` is divisible by `k`.

	- `s` consists only of lowercase English letters.

---
