# Design HashSet

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Easy |
| **URL** | [https://leetcode.com/problems/design-hashset/submissions/2109643869/](https://leetcode.com/problems/design-hashset/submissions/2109643869/) |
| **Problem ID** | design-hashset |
| **Language** | Java |
| **Runtime** | 1509 ms |
| **Memory** | 53172000 MB |
| **Accepted At** | 2026-08-17T04:16:16.000Z |

## Tags

`Array`, `Hash Table`, `Linked List`, `Design`, `Hash Function`

## Problem Statement

Design a HashSet without using any built-in hash table libraries.

Implement `MyHashSet` class:

	- `void add(key)` Inserts the value `key` into the HashSet.

	- `bool contains(key)` Returns whether the value `key` exists in the HashSet or not.

	- `void remove(key)` Removes the value `key` in the HashSet. If `key` does not exist in the HashSet, do nothing.

&nbsp;

Example 1:**

```

**Input**
[&quot;MyHashSet&quot;, &quot;add&quot;, &quot;add&quot;, &quot;contains&quot;, &quot;contains&quot;, &quot;add&quot;, &quot;contains&quot;, &quot;remove&quot;, &quot;contains&quot;]
[[], [1], [2], [1], [3], [2], [2], [2], [2]]
**Output**
[null, null, null, true, false, null, true, null, false]

**Explanation**
MyHashSet myHashSet = new MyHashSet();
myHashSet.add(1);      // set = [1]
myHashSet.add(2);      // set = [1, 2]
myHashSet.contains(1); // return True
myHashSet.contains(3); // return False, (not found)
myHashSet.add(2);      // set = [1, 2]
myHashSet.contains(2); // return True
myHashSet.remove(2);   // set = [1]
myHashSet.contains(2); // return False, (already removed)
```

&nbsp;

**Constraints:**

	- `0 &lt;= key &lt;= 106`

	- At most `104` calls will be made to `add`, `remove`, and `contains`.

---
