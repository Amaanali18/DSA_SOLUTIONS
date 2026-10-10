# Relative Sort Array

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Easy |
| **URL** | [https://leetcode.com/problems/relative-sort-array/submissions/2167832703/](https://leetcode.com/problems/relative-sort-array/submissions/2167832703/) |
| **Problem ID** | relative-sort-array |
| **Language** | Java |
| **Runtime** | 5 ms |
| **Memory** | 43904000 MB |
| **Accepted At** | 2026-10-10T05:08:58.000Z |

## Tags

`Array`, `Hash Table`, `Sorting`, `Counting Sort`, `Quicksort`, `Bubble Sort`

## Problem Statement

Given two arrays `arr1` and `arr2`, the elements of `arr2` are distinct, and all elements in `arr2` are also in `arr1`.

Sort the elements of `arr1` such that the relative ordering of items in `arr1` are the same as in `arr2`. Elements that do not appear in `arr2` should be placed at the end of `arr1` in **ascending** order.

&nbsp;

Example 1:**

```

**Input:** arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
**Output:** [2,2,2,1,4,3,3,9,6,7,19]

```

Example 2:**

```

**Input:** arr1 = [28,6,22,8,44,17], arr2 = [22,28,8,6]
**Output:** [22,28,8,6,17,44]

```

&nbsp;

**Constraints:**

	- `1 &lt;= arr1.length, arr2.length &lt;= 1000`

	- `0 &lt;= arr1[i], arr2[i] &lt;= 1000`

	- All the elements of `arr2` are **distinct**.

	- Each&nbsp;`arr2[i]` is in `arr1`.

## Constraints

- 1 &lt;= arr1.length, arr2.length &lt;= 1000
- 0 &lt;= arr1[i], arr2[i] &lt;= 1000

---
