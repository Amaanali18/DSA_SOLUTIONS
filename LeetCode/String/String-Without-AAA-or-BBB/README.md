# String Without AAA or BBB

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/string-without-aaa-or-bbb/submissions/2174543620/](https://leetcode.com/problems/string-without-aaa-or-bbb/submissions/2174543620/) |
| **Problem ID** | string-without-aaa-or-bbb |
| **Language** | Java |
| **Runtime** | 2 ms |
| **Memory** | 42120000 MB |
| **Accepted At** | 2026-10-17T12:20:04.000Z |

## Tags

`String`, `Greedy`

## Problem Statement

Given two integers `a` and `b`, return **any** string `s` such that:

	- `s` has length `a + b` and contains exactly `a` `&#39;a&#39;` letters, and exactly `b` `&#39;b&#39;` letters,

	- The substring `&#39;aaa&#39;` does not occur in `s`, and

	- The substring `&#39;bbb&#39;` does not occur in `s`.

&nbsp;

Example 1:**

```

**Input:** a = 1, b = 2
**Output:** &quot;abb&quot;
**Explanation:** &quot;abb&quot;, &quot;bab&quot; and &quot;bba&quot; are all correct answers.

```

Example 2:**

```

**Input:** a = 4, b = 1
**Output:** &quot;aabaa&quot;

```

&nbsp;

**Constraints:**

	- `0 &lt;= a, b &lt;= 100`

	- It is guaranteed such an `s` exists for the given `a` and `b`.

---
