# Online Voting System

This is a simple command-line based online voting system implemented in Java. It allows users to add candidates, display them, vote for candidates, and display the final voting results.

## Features

- Add candidates: Users can add candidates to the voting system.
- Display candidates: Shows the list of candidates along with their index numbers.
- Vote for candidates: Users can cast their votes for their preferred candidate.
- Display results: Shows the final voting results after all the votes have been cast.

## Usage

1. Clone the repository:

   ```
   git clone <repository-url>
   ```

2. Compile the Java files:

   ```
   javac OnlineVotingSystem.java
   ```

3. Run the program:

   ```
   java OnlineVotingSystem
   ```

4. Follow the on-screen instructions to add candidates, vote, and view results.

## Example

```
$ java OnlineVotingSystem
Candidates:
1. Candidate 1
2. Candidate 2
3. Candidate 3
Enter the number of the candidate to vote (or 0 to exit): 1
Your vote has been casted
Candidates:
1. Candidate 1
2. Candidate 2
3. Candidate 3
Enter the number of the candidate to vote (or 0 to exit): 2
Your vote has been casted
Candidates:
1. Candidate 1
2. Candidate 2
3. Candidate 3
Enter the number of the candidate to vote (or 0 to exit): 1
Your vote has been casted
Candidates:
1. Candidate 1
2. Candidate 2
3. Candidate 3
Enter the number of the candidate to vote (or 0 to exit): 0                 // 0 to view results
Final Results:
Candidate 1: 2 votes
Candidate 2: 1 votes
Candidate 3: 0 votes
```

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, feel free to open an issue or create a pull request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
