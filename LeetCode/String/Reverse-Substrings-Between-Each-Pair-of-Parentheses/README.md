# Reverse Substrings Between Each Pair of Parentheses

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/submissions/2155616247/?envType=daily-question&envId=2026-09-28](https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/submissions/2155616247/?envType=daily-question&envId=2026-09-28) |
| **Problem ID** | reverse-substrings-between-each-pair-of-parentheses |
| **Language** | Java |
| **Runtime** | 3 ms |
| **Memory** | 44128000 MB |
| **Accepted At** | 2026-09-28T05:46:11.000Z |

## Tags

`String`, `Stack`, `Bracket Sequences`

## Problem Statement

You are given a string `s` that consists of lower case English letters and brackets.

Reverse the strings in each pair of matching parentheses, starting from the innermost one.

Your result should **not** contain any brackets.

&nbsp;

Example 1:**

```

**Input:** s = &quot;(abcd)&quot;
**Output:** &quot;dcba&quot;

```

Example 2:**

```

**Input:** s = &quot;(u(love)i)&quot;
**Output:** &quot;iloveu&quot;
**Explanation:** The substring &quot;love&quot; is reversed first, then the whole string is reversed.

```

Example 3:**

```

**Input:** s = &quot;(ed(et(oc))el)&quot;
**Output:** &quot;leetcode&quot;
**Explanation:** First, we reverse the substring &quot;oc&quot;, then &quot;etco&quot;, and finally, the whole string.

```

&nbsp;

**Constraints:**

	- `1 &lt;= s.length &lt;= 2000`

	- `s` only contains lower case English characters and parentheses.

	- It is guaranteed that all parentheses are balanced.

---
