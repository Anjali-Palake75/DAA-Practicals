# 📚 Data Structures & Algorithms in Java – Lab Programs

This repository contains six core Data Structures & Algorithms implementations in Java.  
Each program runs independently with a `main()` method and demonstrates practical use of classical algorithms.

---

## 🧾 Table of Contents
- [Programs Overview](#programs-overview)
- [Execution Guide](#execution-guide)
- [Topics Covered](#topics-covered)
- [Requirements](#requirements)
- [About](#about)

---

## ✅ Programs Overview

### 1️⃣ Binary Search on Dictionary Words
**File:** `BinarySearchApp.java`  
**Concept:** Binary Search  
**Description:**  
Searches for a word in a sorted list using manual binary search logic.

**Algorithm Steps:**

1.Sort the array (if not already sorted).

2.Initialize low = 0, high = n - 1.

3.Repeat until low > high:

 Find the middle index.

 Compare with the target element.

 Move either to the left or right half based on comparison.

4.Return the index if found, otherwise return -1.

**Complexity:**
•	Time Complexity: O(log n)
•	Space Complexity:
   o	Iterative: O(1)
   o	Recursive: O(log n)


**Applications:**
Applications:
1.	Dictionary Word(Implemented)
2.	Searching in sorted arrays
3.	Finding first/last occurrence or closest match in a sorted array
4.	Database indexing 
5.	File systems & libraries 
6.	Gaming/graphics 
7.	Optimization problems & competitive programming 


**Key Highlights**
- Uses `String.compareTo()`
- No built-in binary search functions
- Demonstrates mid-index logic

---

### 2️⃣ Quick Sort on Records (Objects)  Merge Sort on Records (Objects)
**File:** `QuickSortRecords.java`  
**Concept:** Quick Sort (Divide & Conquer)  
**Description:**  
Sorts records (name, age) based on age using Quick Sort.

**Algorithm Steps**

- Choose a pivot element from the array.

- Partition the array into two subarrays:

- Left subarray → elements ≤ pivot

- Right subarray → elements > pivot

- Recursively apply the same steps to both subarrays.

- Combine results to form a sorted array.

**Complexity**
Time Complexity:
•	Best: O(n log n)
•	Average: O(n log n)
•	Worst: O(n²)
Space Complexity: O(log n)
 
**Key Highlights**
- Object-based comparison
- Partition logic implemented manually
- Recursive in-place sorting
{"variant":"standard","id":"60129","title":"Merge Sort on Records (Objects) with Markdown Styling"}

**Applications**
1.	Fast Sorting:
•	Used to sort arrays quickly.
2.	Databases:(Implemented)
•	Sort rows or index data.
3.	Embedded Systems:
•	Uses less memory (in-place).
4.	Search Engines:
•	Sort search results fast.

# Merge Sort on Records (Objects)

**File:** `MergeSortBigArray .java`  
**Concept:** *Merge Sort (Divide & Conquer)*  
**Description:**  
*Sorts records (name, age) based on age using Merge Sort.*
---

**Algorithm Steps**

- Divide the array into two halves.

- Recursively apply Merge Sort to both halves.

- Merge the two sorted halves into one sorted array.

**Complexity**
Time Complexity:
•	Best: O(n log n)
•	Average: O(n log n)
•	Worst: O(n log n)
Space Complexity: O(n)

**Key Highlights**
- Object-based comparison*  
- Merging logic implemented manually*  
- Recursive and stable sorting*   

**Applications**
1.	Sorting Big Files:(Implemented)
•	Used when data is too large to fit in memory.
2.	Linked List Sorting:
•	Works well with linked lists (better than quicksort).
3.	Stable Sorting:
•	Keeps the original order of equal elements.
4.	Used in Databases:
•	Helps with sorting and merging large datasets.
```
---
```

### 3️⃣ Fractional Knapsack – Greedy Method
**File:** `GreedyKnapsack.java`  
**Concept:** Greedy Algorithm  
**Description:**  
Maximizes profit by picking items based on highest value-to-weight ratio.

**Algorithm Steps**

- Calculate profit/weight ratio (Pi/Wi) for each item.

- Sort items in descending order of this ratio.

- Initialize totalProfit = 0, remainingCapacity = W.

- For each item:

   If it fits completely → take it.

   Else → take the fractional part and stop.

- Return totalProfit.

**Complexity**

Time Complexity: O(n log n) — (sorting step dominates)

Space Complexity: O(1) — (in-place sorting)

**Key Highlights**
- Sorts items by profit/weight ratio
- Fractional selection supported
- Classic greedy strategy demonstration

**Applications:**
•	Cargo Loading – Take parts of items to fill a truck.
•	Stock Investment – Invest money in parts of stocks.
•	Ad Scheduling – Show highest-paying ads in limited time.
•	Relief Supplies – Pack most useful items in limited space.
•	Resource Allocation – Give CPU/memory to best tasks. (All Implemented)

---

### 4️⃣ Optimal Task Scheduling – Min Heap
**File:** `TaskScheduling.java`  
**Concept:** Min-Heap / Optimal Merge Pattern  
**Description:**  
Uses a priority queue to combine tasks with minimum total time.

**Algorithm Steps**

1. Insert all file sizes into a Min Heap.

2. Initialize totalCost = 0.

3. While heap size > 1:

   - Extract the two smallest file sizes, x and y.

   - Compute cost = x + y.

   - Add cost to totalCost.

   - Insert the merged file (size = x + y) back into the heap.

4. When one file remains, return totalCost.

**Complexity:**
•	Time: O(n log n)
•	Space: O(n)

**Key Highlights**
- Java `PriorityQueue`
- Greedy + heap optimization
- Similar to Huffman cost minimization

**Applications:**
1.	File Merging
o	Merge sorted files with minimum total cost (used in log files, data processing).
2.	Huffman Coding
o	Used in data compression (like ZIP, PNG) to create efficient binary codes.
3.	Task Scheduling(Implemented)
o	Combine tasks with least total time (used in job processors, cloud tasks).

---

### 5️⃣ Road Network using Minimum Spanning Tree (MST)
**File:** `RoadNetworkMST.java`  
**Concepts:** Prim’s Algorithm & Kruskal’s Algorithm  
**Description:**  
Builds the minimum-cost connection between cities.

**Algorithm Steps**

1. Start with any vertex (include it in MST).

2. Find the smallest edge that connects MST to a new vertex.

3. Add this vertex and edge to MST.

4. Repeat until all vertices are included.

**Complexity:**
Time Complexity: O(V²)
Space Complexity: O(V)

**Applications of Minimum Cost Spanning Tree (MST)**
1.	Network design – Connects computers, cities, or stations with minimum cable or wire cost.
2.	Road Network Optimization(Implemented)
3.	Electrical and water supply systems – Minimizes installation cost.
4.	Cluster analysis – Groups similar data points in data science.
5.	Image segmentation – Used in computer vision to separate image regions.
6.	Telecommunication networks – Connects towers or routers efficiently.


**Key Highlights**
- Graph adjacency representation
- Union-Find (Disjoint Set) in Kruskal
- Greedy tree construction

---

### 6️⃣ GPS Navigation using Dijkstra's Algorithm
**File:** `GPSNavigationSystem.java`  
**Concept:** Single Source Shortest Path  
**Description:**  
Simulates GPS shortest path between multiple nodes.

**Algorithm Steps:**

1. Initialize all distances as ∞ (infinity) except the source vertex = 0.
2. Mark all vertices as unvisited.
3. Choose the unvisited vertex with the smallest distance.
4. For each adjacent vertex v of current vertex u:
   If dist[u] + weight(u, v) < dist[v], update dist[v].
5. Mark vertex u as visited.
6. Repeat until all vertices are visited.
7. Output the shortest distances from the source.

**Complexity**
Time Complexity: O(V²) or O(E log V) using a priority queue.
Space Complexity: O(V).

**Applications:**
1.	GPS Navigation – Find shortest driving routes between locations.(Implemented)
2.	Network Routing – Compute least-cost paths in data networks.
3.	Telecommunication – Optimize signal or data transfer paths.
4.	Flight Scheduling – Find shortest or cheapest flight routes.
5.	Robot Path Planning – Determine minimum-cost movement in robotics.

**Key Highlights**
- Adjacency matrix
- Distance relaxation logic
- Real-world route analogy

---

## 🛠️ Execution Guide

### Compile Program

javac FileName.java

### Run Program
java FileName

Example
javac GPSNavigationSystem.java
java GPSNavigationSystem

## 🖥️ Requirements

- Java JDK 8 or higher

- Works on Terminal / Command Prompt / VS Code / IntelliJ / NetBeans

## 📂 Repository Structure

DAA_Practicals/
│── Ex 1_BinarySearch/
│   └── BinarySearchApp.java
│── Ex 2_QuickSort/
│   └── QuickSortRecords.java
│── Ex 3_GreedyKnapsack/
│   └── GreedyKnapsack.java
│── Ex 4_MinHeapTaskScheduling/
│   └── TaskScheduling.java
│── Ex 5_MST_RoadNetwork/
│   └── RoadNetworkMST.java
│── Ex 6_Dijkstra_GPS/
│   └── GPSNavigationSystem.java
└── README.md   <-- (this file)


## 🧪 How to Run Programs

### Requirements:
- JDK 8 or newer installed

### Steps to Run:
1. Navigate to the specific experiment folder :
   cd "Ex 1 - BinarySearch"

2. Compile the Java file :
   javac BinarySearchApp.java

3. Run the Java program :
   java BinarySearchApp


## 🎯 Learning Outcomes

- Apply fundamental DSA techniques (searching, sorting, greedy, graphs).
- Implement real algorithms in Java without relying on built-ins.
- Understand time/space complexity through practical examples.
- Use data structures like arrays, heaps, and graphs effectively.
- Translate theoretical concepts into working, executable programs.


## 👤 Author
- Name: Anjali Vaibhav Palake
- Roll No : 25143075  
- Class : SYIT(Batch-I4)
- Course: Information Technology
- Subject: Design and Analysis of Algorithms