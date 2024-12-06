/*
Используя Reflection API, напишите программу, которая выводит
на экран все методы класса String.
*/

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;


public class Default_HW {

        public static void main(String[] args) throws NoSuchMethodException {

            String base = "";

            Class<?> cl = String.class;
// консруктор как метод
            Constructor<?>[] constructors = cl.getDeclaredConstructors();

// methods
            Method[] methods = cl.getDeclaredMethods();


            Field[] fields = cl.getDeclaredFields();



            System.out.println("\nFields:\n-------------------------------------");
            Arrays.stream(fields).forEach(System.out::println);
            System.out.println("\nConstructors:\n-------------------------------------");
            Arrays.stream(constructors).forEach(System.out::println);
            System.out.println("\nMethods:\n-------------------------------------");
            Arrays.stream(methods).forEach(System.out::println);

        }
    }



