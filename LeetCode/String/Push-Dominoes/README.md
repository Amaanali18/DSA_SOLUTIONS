# Push Dominoes

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/push-dominoes/submissions/2110837073/](https://leetcode.com/problems/push-dominoes/submissions/2110837073/) |
| **Problem ID** | push-dominoes |
| **Language** | Java |
| **Runtime** | 28 ms |
| **Memory** | 48328000 MB |
| **Accepted At** | 2026-08-18T03:44:49.000Z |

## Tags

`Two Pointers`, `String`, `Dynamic Programming`

## Problem Statement

There are `n` dominoes in a line, and we place each domino vertically upright. In the beginning, we simultaneously push some of the dominoes either to the left or to the right.

After each second, each domino that is falling to the left pushes the adjacent domino on the left. Similarly, the dominoes falling to the right push their adjacent dominoes standing on the right.

When a vertical domino has dominoes falling on it from both sides, it stays still due to the balance of the forces.

For the purposes of this question, we will consider that a falling domino expends no additional force to a falling or already fallen domino.

You are given a string `dominoes` representing the initial state where:

	- `dominoes[i] = &#39;L&#39;`, if the `ith` domino has been pushed to the left,

	- `dominoes[i] = &#39;R&#39;`, if the `ith` domino has been pushed to the right, and

	- `dominoes[i] = &#39;.&#39;`, if the `ith` domino has not been pushed.

Return *a string representing the final state*.

&nbsp;

Example 1:**

```

**Input:** dominoes = &quot;RR.L&quot;
**Output:** &quot;RR.L&quot;
**Explanation:** The first domino expends no additional force on the second domino.

```

Example 2:**

```

**Input:** dominoes = &quot;.L.R...LR..L..&quot;
**Output:** &quot;LL.RR.LLRRLL..&quot;

```

&nbsp;

**Constraints:**

	- `n == dominoes.length`

	- `1 &lt;= n &lt;= 105`

	- `dominoes[i]` is either `&#39;L&#39;`, `&#39;R&#39;`, or `&#39;.&#39;`.

---
