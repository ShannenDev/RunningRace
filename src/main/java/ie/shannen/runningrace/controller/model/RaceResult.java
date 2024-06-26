package ie.shannen.runningrace.controller.model;


import lombok.*;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RaceResult {
    private String runnerName;
    private double time;

    @Override
    public String toString() {
        return  runnerName + ": " + time + " minutes";
    }
}
