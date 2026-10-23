# Satisfiability of Equality Equations

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/satisfiability-of-equality-equations/submissions/2179807848/](https://leetcode.com/problems/satisfiability-of-equality-equations/submissions/2179807848/) |
| **Problem ID** | satisfiability-of-equality-equations |
| **Language** | Java |
| **Runtime** | 1 ms |
| **Memory** | 43108000 MB |
| **Accepted At** | 2026-10-23T16:11:22.000Z |

## Tags

`Array`, `String`, `Union-Find`, `Graph Theory`

## Problem Statement

You are given an array of strings `equations` that represent relationships between variables where each string `equations[i]` is of length `4` and takes one of two different forms: `&quot;xi==yi&quot;` or `&quot;xi!=yi&quot;`.Here, `xi` and `yi` are lowercase letters (not necessarily different) that represent one-letter variable names.

Return `true`* if it is possible to assign integers to variable names so as to satisfy all the given equations, or *`false`* otherwise*.

&nbsp;

Example 1:**

```

**Input:** equations = [&quot;a==b&quot;,&quot;b!=a&quot;]
**Output:** false
**Explanation:** If we assign say, a = 1 and b = 1, then the first equation is satisfied, but not the second.
There is no way to assign the variables to satisfy both equations.

```

Example 2:**

```

**Input:** equations = [&quot;b==a&quot;,&quot;a==b&quot;]
**Output:** true
**Explanation:** We could assign a = 1 and b = 1 to satisfy both equations.

```

&nbsp;

**Constraints:**

	- `1 &lt;= equations.length &lt;= 500`

	- `equations[i].length == 4`

	- `equations[i][0]` is a lowercase letter.

	- `equations[i][1]` is either `&#39;=&#39;` or `&#39;!&#39;`.

	- `equations[i][2]` is `&#39;=&#39;`.

	- `equations[i][3]` is a lowercase letter.

---
