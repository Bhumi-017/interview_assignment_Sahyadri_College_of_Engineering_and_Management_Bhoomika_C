
# 📑 Company Interview Assessment

This repository contains solutions for the **technical assessment**, which includes:

1. **Two Java array-based problems (with test results)**  
2. **UI design in Figma for an Attendance Management System**

---

## ✨ Contents

### 1. Java Array Problems
Two problems were implemented in **Java** with clean, tested solutions.  

#### Problem 1: Find Second Largest Number in an Array
- Input: An integer array  
- Output: The second largest element  
- Approach: Iterated through the array keeping track of max and second max.  

✅ **Test Cases**  
- `[10, 20, 4, 45, 99]` → `45`  
- `[5, 1, 2, 5, 5]` → `2`  

---

#### Problem 2: Reverse an Array In-place
- Input: An integer array  
- Output: Array elements reversed without using extra space  
- Approach: Two-pointer technique (swap start and end until they meet).  

✅ **Test Cases**  
- `[1, 2, 3, 4, 5]` → `[5, 4, 3, 2, 1]`  
- `[10, 20]` → `[20, 10]`  

---

### 2. UI Design – Attendance Management System
A **basic Figma design** was created for an Attendance Management System.  

#### 🎨 Features in UI:
- **Login Page** (Admin & Employee login)  
- **Dashboard** (Overview of daily attendance, summary)  
- **Mark Attendance** (In/Out tracking)  
- **Employee List** (View & search employees with attendance status)  
- **Reports Section** (Download or view monthly attendance report)  

📌 The Figma file link is included here:  
👉 [Figma Design Link](https://www.figma.com/design/DchYjbbRcynNe2U57PJvuB/Attendance-Management-System--BELC-?node-id=0-1&t=abBrDLNFPJG9Z4gl-1)  

---

## ⚙️ How to Run Java Programs

1. Navigate to the `java_problems/` folder  
2. Compile a file, for example:  
   ```bash
   javac SecondLargest.java
   ````

3. Run the program:

   ```bash
   java SecondLargest
   ```

---

## ✅ Test Results

Unit tests were written to verify correctness.

Example (JUnit output):

  ```
  Tests run: 4, Failures: 0, Errors: 0, Skipped: 0
  BUILD SUCCESS
  ```

---

## 📦 Tech Used

* **Java 17** for array problems
* **JUnit** for testing
* **Figma** for UI/UX design

---

## 📄 Notes

* This project is for **interview assessment purposes**.
* Solutions are optimized for clarity and readability.
* UI design is a **conceptual prototype** for demonstrating design skills.

---
