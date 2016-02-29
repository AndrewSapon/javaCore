package compareTo;

/**
 * Created by Andrew on 20.02.2016.


 import java.util.Comparator;

 Collections.sort(list);//Comparable
 Arrays.sort(vector);//Comparable

 public class Car  implements Comparable<Car>{
 private int nomer;
 @Override
 public int compareTo(Car car) {
 return this.nomer - car.getNomer();
 }
 }

 car1.compareTo(car2)
 Comparable: String, Integer, Double, Character, Date, GregorianCalendar
  ************************************************
 Collections.sort(list, new NumberSortCar());//Comparator
 Arrays.sort(vector, new NumberSortCar());//Comparator

 public class NumberSortCar implements Comparator<Car>
 {
 @Override
 public int compare(Car car1, Car car2) {
 ...
 }
 }
  ************************************************
 public class Car  implements Comparable{
 private int nomer;
 @Override
 public int compareTo(Object obj) {
 Car car = (Car)(obj);
 return this.nomer - car.getNomer();
 }
 }
 public class Car  implements Comparable<Car>{
 private int nomer;
 @Override
 public int compareTo(Car car) {
 return this.nomer - car.getNomer();
 }
 }
 */
