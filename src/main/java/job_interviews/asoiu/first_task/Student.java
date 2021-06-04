package job_interviews.asoiu.first_task;

public class Student {
  private final String name;
  private final double midtermScore;
  private final double quizScore;
  private final double finalScore;
  private final double totalScore;

  Student(String name, double midtermScore, double quizScore, double finalScore) {
    this.name = name;
    this.midtermScore = midtermScore;
    this.quizScore = quizScore;
    this.finalScore = finalScore;
    this.totalScore = midtermScore + quizScore + finalScore;
  }

  public String getName() {
    return name;
  }

  public double getMidtermScore() {
    return midtermScore;
  }

  public double getQuizScore() {
    return quizScore;
  }

  public double getFinalScore() {
    return finalScore;
  }

  public double getTotalScore() {
    return totalScore;
  }

  public String showNameAndTotalScore() {
    return String.format("Name is: %s and total score is: %.2f", this.getName(), this.totalScore);
  }
}