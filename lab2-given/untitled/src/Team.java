//import java.util.Objects;
//
//public class Team {
//    private String name;
//    private int size;
//
//    public Team(String name, int size) {
//        this.name = name;
//        this.size = size;
//    }
//
//    public int hashCode() {
//        int hash = 1;
//
//        hash = hash * 31 + name.hashCode();
//        hash = hash * 31 + size;
//
//        return hash;
//    }
//
//    public int hashCode() {
//        int hash = 1;
//
//        hash = hash * 31 + ((name == null) ? 0 : name.hashCode());
//        hash = hash * 31 + size;
//
//        return hash;
//    }
//    public boolean equals(Object o)
//    {
//        if (o == null)
//            return false;
//        if (o.getClass() != this.getClass())
//            return false;
//
//        boolean result = true;
//
//        Team t = (Team) o;
//        return Objects.equals(name, t.name) && size == t.size;
//
//
//    }
//
//
//
//    public static void main(String[] args) {
//        Team t1 = new Team("CoolTeam", 10);
//        Team t2 = new SoccerTeam("CoolTeam", 10, 5);
//        Team t3 = new Team("CoolTeam", 10);
//        System.out.println(t1.equals(t2));
//        System.out.println(t2.equals(t1));
//
//        System.out.println(t1.equals(t3));
//    }
//}