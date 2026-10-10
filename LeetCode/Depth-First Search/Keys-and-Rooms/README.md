# Keys and Rooms

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/keys-and-rooms/submissions/2167835728/](https://leetcode.com/problems/keys-and-rooms/submissions/2167835728/) |
| **Problem ID** | keys-and-rooms |
| **Language** | Java |
| **Runtime** | 3 ms |
| **Memory** | 46448000 MB |
| **Accepted At** | 2026-10-10T05:13:27.000Z |

## Tags

`Depth-First Search`, `Breadth-First Search`, `Graph Theory`

## Problem Statement

There are `n` rooms labeled from `0` to `n - 1`&nbsp;and all the rooms are locked except for room `0`. Your goal is to visit all the rooms. However, you cannot enter a locked room without having its key.

When you visit a room, you may find a set of **distinct keys** in it. Each key has a number on it, denoting which room it unlocks, and you can take all of them with you to unlock the other rooms.

Given an array `rooms` where `rooms[i]` is the set of keys that you can obtain if you visited room `i`, return `true` *if you can visit **all** the rooms, or* `false` *otherwise*.

&nbsp;

Example 1:**

```

**Input:** rooms = [[1],[2],[3],[]]
**Output:** true
**Explanation:** 
We visit room 0 and pick up key 1.
We then visit room 1 and pick up key 2.
We then visit room 2 and pick up key 3.
We then visit room 3.
Since we were able to visit every room, we return true.

```

Example 2:**

```

**Input:** rooms = [[1,3],[3,0,1],[2],[0]]
**Output:** false
**Explanation:** We can not enter room number 2 since the only key that unlocks it is in that room.

```

&nbsp;

**Constraints:**

	- `n == rooms.length`

	- `2 &lt;= n &lt;= 1000`

	- `0 &lt;= rooms[i].length &lt;= 1000`

	- `1 &lt;= sum(rooms[i].length) &lt;= 3000`

	- `0 &lt;= rooms[i][j] &lt; n`

	- All the values of `rooms[i]` are **unique**.

## Constraints

- n == rooms.length
- 2 &lt;= n &lt;= 1000
- 0 &lt;= rooms[i].length &lt;= 1000
- 1 &lt;= sum(rooms[i].length) &lt;= 3000
- 0 &lt;= rooms[i][j] &lt; n

---
