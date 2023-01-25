import java.util.Objects;

//public class SoccerTeam extends Team {
//    private int totalGoals;
//
//    public SoccerTeam(String name, int size, int totalGoals) {
//        super(name, size);
//        this.totalGoals = totalGoals;
//    }
//    @Override
//    public int hashCode() {
//        return Objects.hash(super.hashCode(), this.totalGoals);
//    }
//
////
//    public boolean equals(Object o){
//        if (o == null)
//            return false;
//        if (o.getClass() != this.getClass())
//            return false;
//
//        boolean result = true;
//
//        SoccerTeam t = (SoccerTeam) o;
//        return super.equals(t) && totalGoals == t.totalGoals;
////    }
//
//    public boolean equals(Object o) {
//        if (o instanceof SoccerTeam) {
//            SoccerTeam t = (SoccerTeam) o;
//            return super.equals(o) && totalGoals == t.totalGoals;
//        }
//        return false;
//    }
//}