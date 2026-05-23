Person 2: Student Result Management System
THIS IS IN DEV BARNCH 
Create a Java program to manage student academic results.

Attributes Required

Create a Student class with the following attributes:

studentId
studentName
rollNumber
department
semester
section
subject1Name
subject2Name
subject3Name
subject4Name
subject5Name
subject1Marks
subject2Marks
subject3Marks
subject4Marks
subject5Marks
totalMarks
averageMarks
grade
resultStatus
attendancePercentage
internalMarks
externalMarks
rank
Requirements
Store details of minimum 5 students.
Calculate total marks of each student.
Calculate average marks of each student.
Assign grade based on average.
Check pass or fail status.
Student fails if any subject mark is below 35.
Student fails if attendance is below 75%.
Calculate rank based on total marks.
Display full result report of all students.
Display topper student.
Display failed students.
Search student by roll number.
Update marks of a student.
Recalculate grade and result after update.
Display department-wise result summary.
Grade Rules
Average >= 90 : A+
Average >= 80 : A
Average >= 70 : B
Average >= 60 : C
Average >= 50 : D
Average >= 35 : E
Below 35 : Fail
Conditions
Marks should be between 0 and 100.
Attendance should be between 0 and 100.
Student ID and roll number should be unique.
Rank should be calculated based on total marks.
If two students have same total marks, they can have same rank.
Internal and external marks should be validated separately.
Mandatory Concepts to Use
Classes and Objects
Arrays
Methods
Constructor
Nested if-else
Loops
Exception Handling
Custom Exception
Packages
Sorting Logic
Clean Code
Custom Exceptions

Create and use these exceptions:

InvalidMarksException
InvalidAttendanceException
StudentNotFoundException
DuplicateRollNumberException