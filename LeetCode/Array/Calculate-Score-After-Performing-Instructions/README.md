# Calculate Score After Performing Instructions

## Problem Information

| Property | Value |
|----------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Medium |
| **URL** | [https://leetcode.com/problems/calculate-score-after-performing-instructions/submissions/2148819753/](https://leetcode.com/problems/calculate-score-after-performing-instructions/submissions/2148819753/) |
| **Problem ID** | calculate-score-after-performing-instructions |
| **Language** | Java |
| **Runtime** | 3 ms |
| **Memory** | 108712000 MB |
| **Accepted At** | 2026-09-21T15:56:22.000Z |

## Tags

`Array`, `Hash Table`, `String`, `Simulation`

## Problem Statement

You are given two arrays, `instructions` and `values`, both of size `n`.

You need to simulate a process based on the following rules:

	- You start at the first instruction at index `i = 0` with an initial score of 0.

	- If `instructions[i]` is `&quot;add&quot;`:
	
		- Add `values[i]` to your score.

		- Move to the next instruction `(i + 1)`.

	
	

	- If `instructions[i]` is `&quot;jump&quot;`:
	
		- Move to the instruction at index `(i + values[i])` without modifying your score.

	
	

The process ends when you either:

	- Go out of bounds (i.e., `i &lt; 0 or i &gt;= n`), or

	- Attempt to revisit an instruction that has been previously executed. The revisited instruction is not executed.

Return your score at the end of the process.

&nbsp;

Example 1:**

**Input:** instructions = [&quot;jump&quot;,&quot;add&quot;,&quot;add&quot;,&quot;jump&quot;,&quot;add&quot;,&quot;jump&quot;], values = [2,1,3,1,-2,-3]

**Output:** 1

**Explanation:**

Simulate the process starting at instruction 0:

	- At index 0: Instruction is `&quot;jump&quot;`, move to index `0 + 2 = 2`.

	- At index 2: Instruction is `&quot;add&quot;`, add `values[2] = 3` to your score and move to index 3. Your score becomes 3.

	- At index 3: Instruction is `&quot;jump&quot;`, move to index `3 + 1 = 4`.

	- At index 4: Instruction is `&quot;add&quot;`, add `values[4] = -2` to your score and move to index 5. Your score becomes 1.

	- At index 5: Instruction is `&quot;jump&quot;`, move to index `5 + (-3) = 2`.

	- At index 2: Already visited. The process ends.

Example 2:**

**Input:** instructions = [&quot;jump&quot;,&quot;add&quot;,&quot;add&quot;], values = [3,1,1]

**Output:** 0

**Explanation:**

Simulate the process starting at instruction 0:

	- At index 0: Instruction is `&quot;jump&quot;`, move to index `0 + 3 = 3`.

	- At index 3: Out of bounds. The process ends.

Example 3:**

**Input:** instructions = [&quot;jump&quot;], values = [0]

**Output:** 0

**Explanation:**

Simulate the process starting at instruction 0:

	- At index 0: Instruction is `&quot;jump&quot;`, move to index `0 + 0 = 0`.

	- At index 0: Already visited. The process ends.

&nbsp;

**Constraints:**

	- `n == instructions.length == values.length`

	- `1 &lt;= n &lt;= 105`

	- `instructions[i]` is either `&quot;add&quot;` or `&quot;jump&quot;`.

	- `-105 &lt;= values[i] &lt;= 105`

---
