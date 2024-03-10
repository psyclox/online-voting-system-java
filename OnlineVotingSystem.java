import java.util.*;

class Mates {
    private String var;
    private int votes;

    public Mates(String var) {
        this.var = var;
        this.votes = 0;
    }
    public String get() {
        return var;
    }
    public int getVo() {
        return votes;
    }
    public void vote() {
        votes++;
    }
}

public class OnlineVotingSystem {
    private List<Mates> candidates;

    public OnlineVotingSystem() {
        candidates = new ArrayList<>();
    }

    public void addCandidate(String var) {
        candidates.add(new Mates(var));
    }

    public void displayCandidates() {
        System.out.println("Candidates:");
        for (int i = 0; i < candidates.size(); i++) {
            System.out.println((i + 1) + ". " + candidates.get(i).get());
        }
    }

    public void voteEm(int candidateIndex) {
        if (candidateIndex >= 1 && candidateIndex <= candidates.size()) {
            candidates.get(candidateIndex - 1).vote();
            System.out.println("Your vote has been casted");
        } else {
            System.out.println("Invalid candidate selection");
        }
    }

    public void displayResults() {
        System.out.println("Final Results:");
        for (Mates candidate : candidates) {
            System.out.println(candidate.get() + ": " + candidate.getVo() + " votes");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        OnlineVotingSystem voteSys = new OnlineVotingSystem();

        voteSys.addCandidate("Candidate 1");
        voteSys.addCandidate("Candidate 2");
        voteSys.addCandidate("Candidate 3");

        while (true) {
            voteSys.displayCandidates();
            System.out.print("Enter the number of the candidate to vote : ");         //  or 0 to exit/view final Result   
            int let=sc.nextInt();
            if (let == 0) 
            {
                break;
            }
            voteSys.voteEm(let);
        }

        voteSys.displayResults();
        sc.close();
    }
}
