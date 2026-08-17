# Partition String 

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/partition-string/submissions/2109682419/](https://leetcode.com/problems/partition-string/submissions/2109682419/) |
| **Problem ID** | partition-string |
| **Language** | Java |
| **Runtime** | 258 ms |
| **Memory** | 89856000 MB |
| **Accepted At** | 2026-08-17T04:57:09.000Z |

## Tags

`Hash Table`, `String`, `Trie`, `Simulation`

## Problem Statement

Given a string `s`, partition it into **unique segments** according to the following procedure:

	- Start building a segment beginning at index 0.

	- Continue extending the current segment character by character until the current segment has not been seen before.

	- Once the segment is unique, add it to your list of segments, mark it as seen, and begin a new segment from the next index.

	- Repeat until you reach the end of `s`.

Return an array of strings `segments`, where `segments[i]` is the `ith` segment created.

&nbsp;

Example 1:**

**Input:** s = &quot;abbccccd&quot;

**Output:** [&quot;a&quot;,&quot;b&quot;,&quot;bc&quot;,&quot;c&quot;,&quot;cc&quot;,&quot;d&quot;]

**Explanation:**

	
		
			Index
			Segment After Adding
			Seen Segments
			Current Segment Seen Before?
			New Segment
			Updated Seen Segments
		
		
			0
			&quot;a&quot;
			[]
			No
			&quot;&quot;
			[&quot;a&quot;]
		
		
			1
			&quot;b&quot;
			[&quot;a&quot;]
			No
			&quot;&quot;
			[&quot;a&quot;, &quot;b&quot;]
		
		
			2
			&quot;b&quot;
			[&quot;a&quot;, &quot;b&quot;]
			Yes
			&quot;b&quot;
			[&quot;a&quot;, &quot;b&quot;]
		
		
			3
			&quot;bc&quot;
			[&quot;a&quot;, &quot;b&quot;]
			No
			&quot;&quot;
			[&quot;a&quot;, &quot;b&quot;, &quot;bc&quot;]
		
		
			4
			&quot;c&quot;
			[&quot;a&quot;, &quot;b&quot;, &quot;bc&quot;]
			No
			&quot;&quot;
			[&quot;a&quot;, &quot;b&quot;, &quot;bc&quot;, &quot;c&quot;]
		
		
			5
			&quot;c&quot;
			[&quot;a&quot;, &quot;b&quot;, &quot;bc&quot;, &quot;c&quot;]
			Yes
			&quot;c&quot;
			[&quot;a&quot;, &quot;b&quot;, &quot;bc&quot;, &quot;c&quot;]
		
		
			6
			&quot;cc&quot;
			[&quot;a&quot;, &quot;b&quot;, &quot;bc&quot;, &quot;c&quot;]
			No
			&quot;&quot;
			[&quot;a&quot;, &quot;b&quot;, &quot;bc&quot;, &quot;c&quot;, &quot;cc&quot;]
		
		
			7
			&quot;d&quot;
			[&quot;a&quot;, &quot;b&quot;, &quot;bc&quot;, &quot;c&quot;, &quot;cc&quot;]
			No
			&quot;&quot;
			[&quot;a&quot;, &quot;b&quot;, &quot;bc&quot;, &quot;c&quot;, &quot;cc&quot;, &quot;d&quot;]
		
	

Hence, the final output is `[&quot;a&quot;, &quot;b&quot;, &quot;bc&quot;, &quot;c&quot;, &quot;cc&quot;, &quot;d&quot;]`.

Example 2:**

**Input:** s = &quot;aaaa&quot;

**Output:** [&quot;a&quot;,&quot;aa&quot;]

**Explanation:**

	
		
			Index
			Segment After Adding
			Seen Segments
			Current Segment Seen Before?
			New Segment
			Updated Seen Segments
		
		
			0
			&quot;a&quot;
			[]
			No
			&quot;&quot;
			[&quot;a&quot;]
		
		
			1
			&quot;a&quot;
			[&quot;a&quot;]
			Yes
			&quot;a&quot;
			[&quot;a&quot;]
		
		
			2
			&quot;aa&quot;
			[&quot;a&quot;]
			No
			&quot;&quot;
			[&quot;a&quot;, &quot;aa&quot;]
		
		
			3
			&quot;a&quot;
			[&quot;a&quot;, &quot;aa&quot;]
			Yes
			&quot;a&quot;
			[&quot;a&quot;, &quot;aa&quot;]
		
	

Hence, the final output is `[&quot;a&quot;, &quot;aa&quot;]`.

&nbsp;

**Constraints:**

	- `1 &lt;= s.length &lt;= 105`

	- `s` contains only lowercase English letters.

---
