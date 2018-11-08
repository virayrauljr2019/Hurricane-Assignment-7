import java.lang.Math;

public class Main {

 public static double r = 6371;


 public static void main(String[] args) {

  double Distance, day1to2, day2to3, day3to4, day4to5, day5to6, day6to7, day7to8, day8to9, day9to10, day10to11, day11to12, day12to13, totdistance;
  day1to2 = calcDistance(25, 15, 23, 20);
  day2to3 = calcDistance(23, 20, 21, 24);
  day3to4 = calcDistance(21, 24, 20, 27);
  day4to5 = calcDistance(20, 27, 19, 35);
  day5to6 = calcDistance(19, 35, 21, 46);
  day6to7 = calcDistance(21, 46, 23, 56);
  day7to8 = calcDistance(23, 56, 25, 65);
  day8to9 = calcDistance(25, 65, 28, 70);
  day9to10 = calcDistance(28, 70, 32, 73);
  day10to11 = calcDistance(32, 73, 34, 74);
  day11to12 = calcDistance(34, 74, 36, 74);
  day12to13 = calcDistance(36, 74, 39, 74);
  Distance = calcDistance(48.8567, 2.3508, 37.783333, -122.41667);

  System.out.printf("The Distance traveled from " + "Paris " + "to" + " Sanfrancisco" + " is  %.1f km",Distance);

  totdistance = day1to2 + day2to3 + day3to4 + day4to5 + day5to6 + day6to7 + day7to8 + day8to9 + day9to10 + day10to11 + day11to12 + day12to13;
  System.out.printf("\nThe Total distance traveled by Hurricane Gloria is %.1f km", totdistance);

 }

 public static double calcDistance(double daylata, double daylonga, double daylatb, double daylongb) {
  double rlatitude, rlatitude2, rlongitude, rlongitude2, a, c, dist;
  rlatitude = Math.toRadians(daylata);
  rlongitude = Math.toRadians(daylonga);
  rlatitude2 = Math.toRadians(daylatb);
  rlongitude2 = Math.toRadians(daylongb);
  a = Math.pow(Math.sin((rlatitude - rlatitude2) / 2), 2) + Math.cos(rlatitude) * Math.cos(rlatitude2) * Math.pow(Math.sin((rlongitude - rlongitude2) / 2), 2);
  c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
  dist = r * c;
  return dist;
 }
}