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

**Key Highlights**
- Uses `String.compareTo()`
- No built-in binary search functions
- Demonstrates mid-index logic

---

### 2️⃣ Quick Sort on Records (Objects)
**File:** `QuickSortRecords.java`  
**Concept:** Quick Sort (Divide & Conquer)  
**Description:**  
Sorts records (name, age) based on age using Quick Sort.

**Key Highlights**
- Object-based comparison
- Partition logic implemented manually
- Recursive in-place sorting

---

### 3️⃣ Fractional Knapsack – Greedy Method
**File:** `GreedyKnapsack.java`  
**Concept:** Greedy Algorithm  
**Description:**  
Maximizes profit by picking items based on highest value-to-weight ratio.

**Key Highlights**
- Sorts items by profit/weight ratio
- Fractional selection supported
- Classic greedy strategy demonstration

---

### 4️⃣ Optimal Task Scheduling – Min Heap
**File:** `TaskScheduling.java`  
**Concept:** Min-Heap / Optimal Merge Pattern  
**Description:**  
Uses a priority queue to combine tasks with minimum total time.

**Key Highlights**
- Java `PriorityQueue`
- Greedy + heap optimization
- Similar to Huffman cost minimization

---

### 5️⃣ Road Network using Minimum Spanning Tree (MST)
**File:** `RoadNetworkMST.java`  
**Concepts:** Prim’s Algorithm & Kruskal’s Algorithm  
**Description:**  
Builds the minimum-cost connection between cities.

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