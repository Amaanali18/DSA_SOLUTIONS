# Circle and Rectangle Overlapping

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/circle-and-rectangle-overlapping/submissions/2146216207/?envType=daily-question&envId=2026-09-19](https://leetcode.com/problems/circle-and-rectangle-overlapping/submissions/2146216207/?envType=daily-question&envId=2026-09-19) |
| **Problem ID** | circle-and-rectangle-overlapping |
| **Language** | Java |
| **Runtime** | 0 ms |
| **Memory** | 42336000 MB |
| **Accepted At** | 2026-09-19T02:13:49.000Z |

## Tags

`Math`, `Geometry`

## Problem Statement

You are given a circle represented as `(radius, xCenter, yCenter)` and an axis-aligned rectangle represented as `(x1, y1, x2, y2)`, where `(x1, y1)` are the coordinates of the bottom-left corner, and `(x2, y2)` are the coordinates of the top-right corner of the rectangle.

Return `true`* if the circle and rectangle are overlapped otherwise return *`false`. In other words, check if there is **any** point `(xi, yi)` that belongs to the circle and the rectangle at the same time.

&nbsp;

Example 1:**

```

**Input:** radius = 1, xCenter = 0, yCenter = 0, x1 = 1, y1 = -1, x2 = 3, y2 = 1
**Output:** true
**Explanation:** Circle and rectangle share the point (1,0).

```

Example 2:**

```

**Input:** radius = 1, xCenter = 1, yCenter = 1, x1 = 1, y1 = -3, x2 = 2, y2 = -1
**Output:** false

```

Example 3:**

```

**Input:** radius = 1, xCenter = 0, yCenter = 0, x1 = -1, y1 = 0, x2 = 0, y2 = 1
**Output:** true

```

&nbsp;

**Constraints:**

	- `1 &lt;= radius &lt;= 2000`

	- `-104 &lt;= xCenter, yCenter &lt;= 104`

	- `-104 &lt;= x1 &lt; x2 &lt;= 104`

	- `-104 &lt;= y1 &lt; y2 &lt;= 104`

---
