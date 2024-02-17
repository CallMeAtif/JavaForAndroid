package Streams_in_java;
import java.util.List;

class PlayerPoints {
    public final String name;
    public final long points;

    public PlayerPoints(String name, long points) {
        this.name = name;
        this.points = points;
    }

    public String toString() {
        return name + ":" + points;
    }

}

//public static long getPoints(final String name){
////    return points;
//}

public class map_reduce_filter_2 {
    public static void main(String[] args) {
        List<PlayerPoints> list = List.of(new PlayerPoints("atif",50),
                new PlayerPoints("faizaan",45),
                new PlayerPoints("abhishek",20),
                new PlayerPoints("parvezmama",60)
                );
        long j = 0;
        PlayerPoints highestPlayer = list.stream().reduce(new PlayerPoints("",0),(s1,s2) -> s1.points > s2.points ? s1 : s2);
        System.out.println(highestPlayer);
//        PlayerPoints highestPlayer =
//                names.stream().map(name -> new PlayerPoints(name, getPoints(name)))
//                        .reduce(new PlayerPoints("", 0),
//                                (s1, s2) -> (s1.points > s2.points) ? s1 : s2);
//
//        System.out.println(highestPlayer);
    }
}
