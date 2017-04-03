# Solved Algorithms 

Solved algorithms is a collection of computing problems and their respective solutions through algorithms. It's made
to help myself (and you now) review and practice stuff you no longer see in your daily routine but recruiters
 may ask you in their interviewing processes. 

## Questions

* Write an algorithm that Bubble sort the set (30, 15, 40, 1, 3, 4, 50, 2, 12)

* Write an algorithm that Select sort the set (30, 15, 40, 1, 3, 4, 50, 2, 12)

* Write an algorithm that Insert sort the set (30, 15, 40, 1, 3, 4, 50, 2, 12)

* Write the insertion sort algorithm, which takes an array of employee and sorts them in order of their employee number. Write a class tdd.Employee, which represents an employee in a company. The employee has a employeeNumber (9 digit number), firstName, lastName and emailId as member variables. Create a few employee objects and store them in an array.

* Write an algorithm which checks if there are duplicate characters in a string. The method signature would look something like public boolean hasDuplicateChars(String s) . If we pass "anaconda" the method should return true (repeated char 'a'). If we pass 'great', the method should return false, because there are no duplicate characters in the string. What is the time complexity of this algorithm? If we know that the string contains ONLY ASCII characters, can we improve the algorithm?

* Write an algorithm that takes two strings and returns a boolean value indicating if the strings are anagrams. If you don't know what an anagram is, search for the word (not the algorithm) online. What is the time complexity of this algorithm?

* Write a function that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.

* Find Equilibrium index

A zero-indexed array A consisting of N integers is given. An equilibrium index of this array is any integer P such that 0 ≤ P < N and the sum of elements of lower indices is equal to the sum of elements of higher indices, i.e.

A[0] + A[1] + ... + A[P−1] = A[P+1] + ... + A[N−2] + A[N−1].

tdd.Sum of zero elements is assumed to be equal to 0. This can happen if P = 0 or if P = N−1.

For example, consider the following array A consisting of N = 8 elements:

A[0] = -1 A[1] = 3 A[2] = -4 A[3] = 5 A[4] = 1 A[5] = -6 A[6] = 2 A[7] = 1

P = 1 is an equilibrium index of this array, because:

- A[0] = −1 = A[2] + A[3] + A[4] + A[5] + A[6] + A[7]

P = 3 is an equilibrium index of this array, because:

- A[0] + A[1] + A[2] = −2 = A[4] + A[5] + A[6] + A[7]

P = 7 is also an equilibrium index, because:

- A[0] + A[1] + A[2] + A[3] + A[4] + A[5] + A[6] = 0

and there are no elements with indices greater than 7.

P = 8 is not an equilibrium index, because it does not fulfill the condition 0 ≤ P < N.

Write a function:

class Solution { public int solution(int[] A); }

that, given a zero-indexed array A consisting of N integers, returns any of its equilibrium indices. The function should return −1 if no equilibrium index exists.

For example, given array A shown above, the function may return 1, 3 or 7, as explained above.

Assume that:

- N is an integer within the range [0..100,000];
- each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].

Complexity:

- expected worst-case time complexity is O(N);
- expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).

Elements of input arrays can be modified.

* Let a to z be the first 26 prime numbers. Let A to Z be 2 to the power of a to z (i.e. A=2^a, B=2^b ... Z=2^z). What is the numerical value of the following expression: (A - T) * (B - T) * (C - T) * ... * (Z - T).


