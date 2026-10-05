# Score of Parentheses

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/score-of-parentheses/submissions/2163289793/?envType=daily-question&envId=2026-10-05](https://leetcode.com/problems/score-of-parentheses/submissions/2163289793/?envType=daily-question&envId=2026-10-05) |
| **Problem ID** | score-of-parentheses |
| **Language** | Java |
| **Runtime** | 1 ms |
| **Memory** | 42840000 MB |
| **Accepted At** | 2026-10-05T15:40:17.000Z |

## Tags

`String`, `Stack`, `Bracket Sequences`

## Problem Statement

Given a balanced parentheses string `s`, return *the **score** of the string*.

The **score** of a balanced parentheses string is based on the following rule:

	- `&quot;()&quot;` has score `1`.

	- `AB` has score `A + B`, where `A` and `B` are balanced parentheses strings.

	- `(A)` has score `2 * A`, where `A` is a balanced parentheses string.

&nbsp;

Example 1:**

```

**Input:** s = &quot;()&quot;
**Output:** 1

```

Example 2:**

```

**Input:** s = &quot;(())&quot;
**Output:** 2

```

Example 3:**

```

**Input:** s = &quot;()()&quot;
**Output:** 2

```

&nbsp;

**Constraints:**

	- `2 &lt;= s.length &lt;= 50`

	- `s` consists of only `&#39;(&#39;` and `&#39;)&#39;`.

	- `s` is a balanced parentheses string.

---
