# 🤝 Contributing to Cognizant Technical Interview Preparation

First off, thank you for considering contributing to this repository! 🎉

This project aims to help students and freshers prepare for Cognizant technical interviews. Your contributions make this resource better for everyone in the community.

---

## 📋 Table of Contents

- [Code of Conduct](#code-of-conduct)
- [How Can I Contribute?](#how-can-i-contribute)
- [Getting Started](#getting-started)
- [Contribution Guidelines](#contribution-guidelines)
- [Coding Standards](#coding-standards)
- [Commit Message Guidelines](#commit-message-guidelines)
- [Pull Request Process](#pull-request-process)
- [Adding New Problems](#adding-new-problems)
- [Improving Documentation](#improving-documentation)
- [Reporting Bugs](#reporting-bugs)
- [Feature Requests](#feature-requests)

---

## 📜 Code of Conduct

### Our Pledge

We are committed to providing a welcoming and inspiring community for everyone. Please be respectful and constructive in your interactions.

### Our Standards

**Positive behavior includes:**
- Using welcoming and inclusive language
- Being respectful of differing viewpoints
- Gracefully accepting constructive criticism
- Focusing on what is best for the community
- Showing empathy towards other community members

**Unacceptable behavior includes:**
- Harassment, trolling, or insulting comments
- Public or private harassment
- Publishing others' private information
- Any conduct that could reasonably be considered inappropriate

---

## 🎯 How Can I Contribute?

There are many ways to contribute to this project:

### 1. 📝 Add New Problems
- Submit solutions to recent Cognizant interview questions
- Add problems from different difficulty levels
- Include problems from various topics (Arrays, Strings, DP, etc.)

### 2. 🔧 Improve Existing Solutions
- Optimize time/space complexity
- Add alternative approaches
- Improve code readability
- Add edge case handling

### 3. 📚 Enhance Documentation
- Add detailed problem descriptions
- Include example inputs/outputs
- Add complexity analysis
- Write better explanations

### 4. 🧪 Add Test Cases
- Create comprehensive test cases
- Add edge cases
- Include negative test scenarios
- Add performance benchmarks

### 5. 🐛 Fix Bugs
- Report bugs you find
- Fix reported issues
- Improve error handling

### 6. ✨ Suggest Features
- Propose new categories
- Suggest repository improvements
- Recommend useful resources

---

## 🚀 Getting Started

### Prerequisites

Before you begin, ensure you have:
- ☕ Java JDK 8 or higher installed
- 🔧 Git installed on your system
- 💻 A GitHub account
- 📝 A code editor (VS Code, IntelliJ IDEA, Eclipse)

### Fork and Clone
````bash
# 1. Fork the repository on GitHub
# Click the "Fork" button at the top right of the repository page

# 2. Clone your forked repository
git clone https://github.com/YOUR-USERNAME/CognizantTechnical.git

# 3. Navigate to the project directory
cd CognizantTechnical

# 4. Add the original repository as upstream
git remote add upstream https://github.com/ParasJagdale/CognizantTechnical.git

# 5. Verify the remotes
git remote -v
````

### Keep Your Fork Synchronized
````bash
# Fetch the latest changes from upstream
git fetch upstream

# Checkout your main branch
git checkout main

# Merge upstream changes
git merge upstream/main

# Push to your fork
git push origin main
````

---

## 📐 Contribution Guidelines

### File Naming Convention

Follow these naming conventions for consistency:
````
✅ Good Examples:
- TwoSum.java
- ReverseString.java
- MaximumSubarray.java
- BinarySearchTree.java

❌ Bad Examples:
- problem1.java
- test.java
- abc.java
- temp_solution.java
````

### File Organization

Place your files in the appropriate directory:
````
CognizantTechnical/
├── Root Level Problems/     # Core frequently asked problems
├── InterviewPrep/          # Interview-specific problems
├── ThisYearQueKN/          # Current year questions
├── knacademy/              # Academy practice
├── pratice/                # Additional practice
└── youtubecodes/           # Video tutorial solutions
````

### Problem Template

Use this template when adding new problems:
````java
/**
 * Problem: [Problem Name]
 * 
 * Description:
 * [Brief description of the problem]
 * 
 * Example:
 * Input: [example input]
 * Output: [expected output]
 * Explanation: [how the output is derived]
 * 
 * Constraints:
 * - [constraint 1]
 * - [constraint 2]
 * 
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 * 
 * Difficulty: [Easy/Medium/Hard]
 * Topics: [Array, String, DP, etc.]
 * Asked in: Cognizant [Year/Round]
 */

public class ProblemName {
    
    /**
     * Main solution method
     * @param [parameter description]
     * @return [return value description]
     */
    public static [returnType] solutionMethod([parameters]) {
        // Your solution here
    }
    
    /**
     * Alternative approach (if applicable)
     */
    public static [returnType] alternativeApproach([parameters]) {
        // Alternative solution
    }
    
    /**
     * Main method with test cases
     */
    public static void main(String[] args) {
        // Test case 1
        System.out.println("Test Case 1:");
        // Add test implementation
        
        // Test case 2
        System.out.println("Test Case 2:");
        // Add test implementation
        
        // Edge cases
        System.out.println("Edge Cases:");
        // Add edge case tests
    }
}
````

---

## 💻 Coding Standards

### Java Best Practices

1. **Naming Conventions**
````java
   // Class names: PascalCase
   public class BinarySearch { }
   
   // Method names: camelCase
   public int findMaximum() { }
   
   // Variable names: camelCase
   int arraySize = 10;
   
   // Constants: UPPER_SNAKE_CASE
   final int MAX_SIZE = 100;
````

2. **Code Formatting**
   - Use 4 spaces for indentation (no tabs)
   - Maximum line length: 100-120 characters
   - Add blank lines between logical sections
   - Use meaningful variable names

3. **Comments**
````java
   // Good: Explain why, not what
   // Using binary search because array is sorted
   
   // Bad: Redundant comment
   // Increment i by 1
   i++;
````

4. **Error Handling**
````java
   // Always validate inputs
   if (arr == null || arr.length == 0) {
       return -1; // or throw exception
   }
````

5. **Complexity Analysis**
````java
   /**
    * Time Complexity: O(n log n) - due to sorting
    * Space Complexity: O(1) - constant extra space
    */
````

### Code Quality Checklist

Before submitting, ensure:
- ✅ Code compiles without errors
- ✅ All test cases pass
- ✅ Edge cases are handled
- ✅ Code is properly commented
- ✅ No hardcoded values (use constants)
- ✅ Follows Java naming conventions
- ✅ Includes time/space complexity
- ✅ No redundant code
- ✅ Proper exception handling

---

## 📝 Commit Message Guidelines

### Format
````
<type>(<scope>): <subject>

<body>

<footer>
````

### Types

- **feat**: A new feature/problem solution
- **fix**: A bug fix
- **docs**: Documentation changes
- **style**: Code style changes (formatting)
- **refactor**: Code refactoring
- **test**: Adding or updating tests
- **chore**: Maintenance tasks

### Examples
````bash
# Adding a new problem
git commit -m "feat(arrays): add Two Sum problem solution"

# Fixing a bug
git commit -m "fix(strings): correct palindrome check logic"

# Improving documentation
git commit -m "docs(readme): update installation instructions"

# Optimizing existing code
git commit -m "refactor(sorting): optimize bubble sort implementation"

# Adding test cases
git commit -m "test(arrays): add edge cases for binary search"
````

### Detailed Commit Message Example
````bash
feat(dynamic-programming): add Longest Common Subsequence solution

- Implemented bottom-up DP approach
- Added memoization optimization
- Included 5 test cases with edge cases
- Time complexity: O(m*n)
- Space complexity: O(m*n)

Asked in: Cognizant 2024 Technical Round 2
````

---

## 🔄 Pull Request Process

### Before Creating a PR

1. **Update your fork**
````bash
   git fetch upstream
   git merge upstream/main
````

2. **Create a feature branch**
````bash
   git checkout -b feature/add-problem-name
````

3. **Make your changes**
   - Add your solution
   - Test thoroughly
   - Add documentation

4. **Commit your changes**
````bash
   git add .
   git commit -m "feat(category): add problem description"
````

5. **Push to your fork**
````bash
   git push origin feature/add-problem-name
````

### Creating the Pull Request

1. Go to your fork on GitHub
2. Click "Compare & pull request"
3. Fill out the PR template:
````markdown
## Problem Description
[Brief description of the problem]

## Solution Approach
[Explain your approach]

## Changes Made
- [ ] Added new problem solution
- [ ] Optimized existing code
- [ ] Updated documentation
- [ ] Added test cases

## Test Cases
- Test case 1: [description]
- Test case 2: [description]
- Edge cases: [description]

## Complexity Analysis
- Time Complexity: O(?)
- Space Complexity: O(?)

## Interview Details (if applicable)
- Company: Cognizant
- Year: 2024
- Round: Technical Round [1/2/3]

## Checklist
- [ ] Code compiles successfully
- [ ] All test cases pass
- [ ] Followed coding standards
- [ ] Added proper comments
- [ ] Updated documentation (if needed)
````

### PR Review Process

1. **Automated Checks**: Ensure all checks pass
2. **Code Review**: Wait for maintainer review
3. **Address Feedback**: Make requested changes
4. **Approval**: PR will be merged once approved

### After Your PR is Merged
````bash
# Delete your feature branch
git branch -d feature/add-problem-name
git push origin --delete feature/add-problem-name

# Update your main branch
git checkout main
git pull upstream main
````

---

## ➕ Adding New Problems

### Problem Submission Checklist

- [ ] Problem is relevant to Cognizant interviews
- [ ] Code is well-tested and bug-free
- [ ] Includes detailed problem description
- [ ] Contains multiple test cases
- [ ] Has complexity analysis
- [ ] Follows coding standards
- [ ] Properly commented
- [ ] Uses appropriate file name
- [ ] Placed in correct directory

### Problem Categories

When adding problems, categorize them appropriately:

| Category | Topics |
|----------|--------|
| **Arrays** | Sorting, Searching, Two-pointer, Sliding window |
| **Strings** | Pattern matching, Palindrome, Anagram, Substring |
| **Math** | Number theory, Geometry, Prime numbers |
| **Dynamic Programming** | Memoization, Tabulation, Optimization |
| **Greedy** | Activity selection, Huffman coding |
| **Recursion** | Backtracking, Tree traversal |
| **Data Structures** | Stack, Queue, Tree, Graph, HashMap |
| **Bit Manipulation** | XOR, Masking, Bit operations |

---

## 📖 Improving Documentation

### Documentation Needs

- Problem descriptions
- Approach explanations
- Complexity analysis
- Alternative solutions
- Common pitfalls
- Interview tips

### Documentation Style Guide
````markdown
# Use clear headings
## Problem: Two Sum

# Include examples with formatting
**Input:** arr = [2, 7, 11, 15], target = 9
**Output:** [0, 1]
**Explanation:** arr[0] + arr[1] = 2 + 7 = 9

# Add code blocks with syntax highlighting
```java
public int[] twoSum(int[] nums, int target) {
    // solution
}
```

# Use tables for clarity
| Approach | Time | Space |
|----------|------|-------|
| Brute Force | O(n²) | O(1) |
| Hash Map | O(n) | O(n) |
````

---

## 🐛 Reporting Bugs

### Before Reporting

1. Check if the issue already exists
2. Verify it's actually a bug
3. Test with multiple inputs
4. Note your Java version

### Bug Report Template
````markdown
**Bug Description**
A clear description of the bug

**To Reproduce**
Steps to reproduce the behavior:
1. Compile file '...'
2. Run with input '...'
3. See error

**Expected Behavior**
What you expected to happen

**Actual Behavior**
What actually happened

**Screenshots/Error Logs**
If applicable, add error messages

**Environment**
- Java Version: [e.g., JDK 11]
- OS: [e.g., Windows 10, Ubuntu 20.04]
- IDE: [e.g., IntelliJ IDEA]

**Additional Context**
Any other relevant information
````

---

## 💡 Feature Requests

### Suggesting Features

We welcome feature suggestions! Here's how:

1. **Check existing issues** to avoid duplicates
2. **Be specific** about the feature
3. **Explain the benefit** to the community
4. **Provide examples** if possible

### Feature Request Template
````markdown
**Feature Description**
Clear description of the feature

**Problem It Solves**
What problem does this address?

**Proposed Solution**
How should this work?

**Alternatives Considered**
Any alternative solutions?

**Additional Context**
Screenshots, mockups, or examples

**Benefits**
- Benefit 1
- Benefit 2
````

---

## 🏆 Recognition

### Contributors Wall of Fame

All contributors will be recognized in our README.md file. Significant contributions may also be highlighted in:
- Monthly contributor spotlights
- Special mentions in documentation
- GitHub profile recommendations

### Types of Recognition

- 🌟 **First PR**: Your first merged contribution
- 🔥 **Top Contributor**: 10+ merged PRs
- 📚 **Documentation Hero**: Significant doc improvements
- 🐛 **Bug Hunter**: Finding and fixing critical bugs
- 💡 **Feature Pioneer**: Implementing major features

---

## 📞 Getting Help

### Need Assistance?

- 💬 **GitHub Discussions**: For questions and discussions
- 🐛 **Issues**: For bug reports and feature requests
- 📧 **Maintainer Contact**: Via GitHub profile
- 📖 **Documentation**: Check README.md and Wiki

### Response Time

- Issues: Within 48 hours
- Pull Requests: Within 3-5 days
- Discussions: Within 24-48 hours

---

## ✅ Quick Contribution Checklist

Before submitting your contribution:

- [ ] Read this CONTRIBUTING.md file
- [ ] Forked and cloned the repository
- [ ] Created a feature branch
- [ ] Followed coding standards
- [ ] Added proper comments and documentation
- [ ] Tested your code thoroughly
- [ ] Committed with meaningful messages
- [ ] Updated relevant documentation
- [ ] Created a clear pull request
- [ ] Responded to review feedback

---

## 🎓 Learning Resources

New to open source? Check these out:

- [How to Contribute to Open Source](https://opensource.guide/how-to-contribute/)
- [GitHub Flow](https://guides.github.com/introduction/flow/)
- [Git Basics](https://git-scm.com/book/en/v2/Getting-Started-Git-Basics)
- [Java Best Practices](https://www.oracle.com/java/technologies/javase/codeconventions-introduction.html)

---

## 📜 License

By contributing, you agree that your contributions will be licensed under the same license as the project (MIT License).

---

<div align="center">

## Thank You! 🙏

Your contributions make this project better for everyone preparing for Cognizant interviews.

**Happy Contributing! 🚀**

*Together, we're helping students land their dream jobs!*

</div>

---

**Questions?** Feel free to open an issue or start a discussion!

**Last Updated:** January 2026
