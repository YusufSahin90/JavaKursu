package Gun34.tasks.task1;

import java.util.ArrayList;

public class Student {

    String name;
    int maxAlabilecegiDersSaatMiktarı;
    ArrayList<Lesson> studentLessons = new ArrayList<>();



    public static Student createStudent(String name, int maxAlabilecegiDersSaatMiktarı) {

        Student ogr1 = new Student();

        ogr1.name = name;
        ogr1.maxAlabilecegiDersSaatMiktarı = maxAlabilecegiDersSaatMiktarı;

        return ogr1;
    }



    public void lessonadd(Lesson lesson1) {

        int toplamDersSaati = 0;

        for (Lesson ders : studentLessons) {

            toplamDersSaati = toplamDersSaati + ders.hour;
        }

            if (toplamDersSaati + lesson1.hour < maxAlabilecegiDersSaatMiktarı) {

                studentLessons.add(lesson1);

            } else {

                System.out.println(name + " " + lesson1.hour + " max alabileceginiz ders miktarı doldu");

            }
        }


        public void printLessons () {

            System.out.println(name + " isimli öğrencinin aldığı dersler");

            int aldigiToplamSaat = 0;

            for (Lesson lesson : studentLessons) {

                System.out.println(lesson.name + " " + lesson.hour);

                aldigiToplamSaat = aldigiToplamSaat + lesson.hour;
            }
            System.out.println("aldigiToplamSaat = " + aldigiToplamSaat);
        }
    }


